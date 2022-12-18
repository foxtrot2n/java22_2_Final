package kr.kmu.ims.repositories;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import kr.kmu.ims.models.Department;
import kr.kmu.ims.models.Designation;
import kr.kmu.ims.models.EmployeeView;
import kr.kmu.ims.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
//import com.sun.rowset.CachedRowSetImpl;
//import javax.sql.rowset.*;

public class EmployeeRepository {

    //*******************************
    //SELECT an Employee
    //*******************************
    public static EmployeeView getEmployee(String empId)  {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM employees_view WHERE employee_id="+empId;

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsEmp = DBUtil.dbExecuteQuery(selectStmt);

            //Send ResultSet to the getEmployeeFromResultSet method and get employee object
            EmployeeView employee = getEmployeeFromResultSet(rsEmp);

            //Return employee object
            return employee;
        } catch (SQLException e) {
            System.out.println("While searching an employee with " + empId + " id, an error occurred: " + e);
            //Return exception

        } catch (ClassNotFoundException e) {
            System.out.println("While searching an employee with " + empId + " id, an error occurred: " + e);
        }
        return new EmployeeView();
    }

    //Use ResultSet from DB as parameter and set Employee Object's attributes and return employee object.
    private static EmployeeView getEmployeeFromResultSet(ResultSet rs) throws SQLException
    {
        EmployeeView emp = null;
        if (rs.next()) {
            emp = new EmployeeView();
            emp.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
            emp.setEmployeeName(rs.getString("EMPLOYEE_NAME"));
            emp.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
            emp.setDesignationId(rs.getInt("DESIGNATION_ID"));
            emp.setDepartmentName(rs.getString("DEPARTMENT_NAME"));
            emp.setDesignationName(rs.getString("DESIGNATION_NAME"));
            emp.setHiringDate(rs.getTimestamp("HIRING_DATE"));
            emp.setActive(rs.getInt("IS_ACTIVE")>0);

        }
        return emp;
    }

    //*******************************
    //SELECT Employees
    //*******************************
    public static ObservableList<EmployeeView> searchEmployees (
            String id, // although id is number, but we need to make select statement, so it is okay keep it string
            String name,
            String design
            ) throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM employees_view";
        String filter="";
        if (!id.isEmpty())
            filter +="employee_id=" + id;

        if (!name.isEmpty())
            filter += (filter.isEmpty()?"":" AND ") + "employee_name like '%" + name + "%' "+" collate binary_ai " ;

        if (!design.isEmpty())
            filter += (filter.isEmpty()?"":" AND ") +"designation_name like '%" + design + "%' "+" collate binary_ai " ;


        if (!filter.isEmpty())
            filter =" WHERE " + filter ;

        //if filter is not empty then add the filter to select statement.
        selectStmt += filter;

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsEmps = DBUtil.dbExecuteQuery(selectStmt);

            //Send ResultSet to the getEmployeeList method and get employee object
            ObservableList<EmployeeView> empList = getEmployeeList(rsEmps);

            //Return employee object
            return empList;
        } catch (SQLException e) {
            System.out.println("SQL select operation has been failed: " + e);
            //Return exception
            throw e;
        }
    }

    //Select * from employees operation
    private static ObservableList<EmployeeView> getEmployeeList(ResultSet rs) throws SQLException, ClassNotFoundException {
        //Declare a observable List which comprises Employee objects


        ObservableList<EmployeeView> empList = FXCollections.observableArrayList();


        while (rs.next()) {
            EmployeeView emp = new EmployeeView();
            emp.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
            emp.setEmployeeName(rs.getString("EMPLOYEE_NAME"));
            emp.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
            emp.setDesignationId(rs.getInt("DESIGNATION_ID"));
            emp.setDepartmentName(rs.getString("DEPARTMENT_NAME"));
            emp.setDesignationName(rs.getString("DESIGNATION_NAME"));
            emp.setHiringDate(rs.getTimestamp("HIRING_DATE"));
            emp.setActive(rs.getInt("IS_ACTIVE")>0);
            //Add employee to the ObservableList
            empList.add(emp);
        }
        //return empList (ObservableList of Employees)
        return empList;
    }
    public static ObservableList<Designation> getDesignationList() {

        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM DESIGNATIONS";
        ObservableList<Designation> list = FXCollections.observableArrayList();

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rs = DBUtil.dbExecuteQuery(selectStmt);

            //Declare a observable List which comprises Employee objects
            while (rs.next()) {
                Designation item = new Designation();
                item.setDesignationId(rs.getInt("DESIGNATION_ID"));
                item.setDesignationName(rs.getString("DESIGNATION_NAME"));
                //Add to the ObservableList
                list.add(item);
            }
            //return empList (ObservableList of Employees)
            return list;

        } catch (Exception e) {
            System.out.println("SQL select operation has been failed: " + e);
            //Return exception
        }

        return list;
    }
    public static ObservableList<Department> getDepartmentList() {

        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM DEPARTMENTS";
        ObservableList<Department> list = FXCollections.observableArrayList();

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rs = DBUtil.dbExecuteQuery(selectStmt);

            //Declare a observable List which comprises Employee objects
            while (rs.next()) {
                Department item = new Department();
                item.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
                item.setDepartmentName(rs.getString("DEPARTMENT_NAME"));
                //Add to the ObservableList
                list.add(item);
            }
            //return empList (ObservableList of Employees)
            return list;

        } catch (Exception e) {
            System.out.println("SQL select operation has been failed: " + e);
            //Return exception
        }

        return list;
    }
    //*************************************
    //UPDATE an employee's email address
    //*************************************
    public static void updateEmployee (String id, String name, int designationId, int departmentId, String hiringDate, int isActive) throws SQLException, ClassNotFoundException {
        //Declare a UPDATE statement
        //(EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, JOB_ID)
        String updateStmt =
                "BEGIN\n" +
                        "UPDATE employees\n" +
                        "SET " +
                        "  EMPLOYEE_NAME = '" + name + "',\n" +
                        "  DESIGNATION_ID  = " + designationId + ",\n" +
                        "  DEPARTMENT_ID  = " + departmentId + ",\n" +
                        "  HIRING_DATE  = TO_DATE('"+hiringDate+"', 'YYYY.MM.dd'),\n" +
                        "  IS_ACTIVE  = " + isActive + "\n" +
                        "WHERE EMPLOYEE_ID = " + id + ";\n" +
                        "   COMMIT;\n" +
                        "END;";

        //Execute UPDATE operation
        try {
            System.out.println(updateStmt);
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while UPDATE Operation: " + e);
            throw e;
        }
    }

    //*************************************
    //DELETE an employee
    //*************************************
    public static void deleteEmpWithId (String empId)  {
        //Declare a DELETE statement
        String updateStmt =
                "BEGIN\n" +
                        "   DELETE FROM employees\n" +
                        "         WHERE employee_id ="+ empId +";\n" +
                        "   COMMIT;\n" +
                        "END;";

        //Execute UPDATE operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (Exception e) {
            System.out.print("Error occurred while DELETE Operation: " + e);

        }
    }

    //*************************************
    //INSERT an employee
    //*************************************
    public static void insertEmp (String id, String name, int designationId, int departmentId, String hiringDate, int isActive)  {
        //Declare a DELETE statement
        String updateStmt =
                "BEGIN\n" +
                        "INSERT INTO employees\n" +
                        "(EMPLOYEE_ID, " +
                        "EMPLOYEE_NAME," +
                        "DESIGNATION_ID," +
                        "DEPARTMENT_ID,\n" +
                        "HIRING_DATE,\n" +
                        "IS_ACTIVE)\n" +
                        "VALUES\n" +
                        "("
                        + id + ", '"
                        + name +"',"
                        + designationId +","
                        + departmentId +","
                        +"TO_DATE('"+hiringDate+"', 'YYYY.MM.dd')',"
                        + isActive
                        +");\n" +
                        "END;";

        //Execute DELETE operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (Exception e) {
            System.out.print("Error occurred while INSERT Operation: " + e);

        }
    }
}
