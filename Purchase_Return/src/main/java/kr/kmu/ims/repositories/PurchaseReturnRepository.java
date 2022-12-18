package kr.kmu.ims.repositories;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import kr.kmu.ims.models.*;
import kr.kmu.ims.util.DBUtil;


import java.sql.ResultSet;
import java.sql.SQLException;

public class PurchaseReturnRepository {

    //*******************************
    //SELECT a PurchaseReturn
    //*******************************
    public static PurchaseReturn getPurchaseReturn(String PO_Id)  {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM Purchase_Returns WHERE Purchase_Order_ID="+PO_Id;

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rs_PR = DBUtil.dbExecuteQuery(selectStmt);

            //Send ResultSet to the getEmployeeFromResultSet method and get employee object
            PurchaseReturn PR = getPurchaseReturnFromResultSet(rs_PR);

            //Return employee object
            return PR;
        } catch (SQLException e) {
            System.out.println("While searching an PurchaseReturn with " + PO_Id + " id, an error occurred: " + e);
            //Return exception

        } catch (ClassNotFoundException e) {
            System.out.println("While searching an PurchaseReturn with " + PO_Id + " id, an error occurred: " + e);
        }
        return new PurchaseReturn();
    }

    //Use ResultSet from DB as parameter and set Employee Object's attributes and return employee object.
    private static PurchaseReturn getPurchaseReturnFromResultSet(ResultSet rs) throws SQLException
    {
        PurchaseReturn purchaseReturn = null;
        if (rs.next()) {
            purchaseReturn = new PurchaseReturn();
            purchaseReturn.setPurchaseReturnId(rs.getInt("PURCHASE_RETURN_ID"));
            purchaseReturn.setPurchaseOrderId(rs.getInt("PURCHASE_ORDER_ID"));
            purchaseReturn.setSupplierId(rs.getInt("SUPPLIERID"));
            purchaseReturn.setContactName(rs.getString("CONTACT_NAME"));
            purchaseReturn.setContactTitle(rs.getString("CONTACT_TITLE"));
            purchaseReturn.setRemarks(rs.getString("REMARKS"));
            purchaseReturn.setShipMethod(rs.getString("SHIP_METHOD"));
            purchaseReturn.setNetAmount(rs.getObject("NET_AMOUNT"));
            purchaseReturn.setCreatedBy(rs.getInt("CREATED_BY"));
            purchaseReturn.setCreatedOn(rs.getTimestamp("CREATED_ON"));
            purchaseReturn.setLastUpdatedBy(rs.getInt("LAST_UPDATED_BY"));
            purchaseReturn.setLastUpdatedOn(rs.getTimestamp("LAST_UPDATED_ON"));
            purchaseReturn.setStatus(rs.getString("STATUS"));
            purchaseReturn.setStatusDate(rs.getTimestamp("STATUS_DATE"));
            purchaseReturn.setStatus(rs.getString("DESIGNATION_NAME"));
            purchaseReturn.setFinalized(rs.getInt("IS_FINALIZED")>0);
            purchaseReturn.setFinalizedBy(rs.getInt("FINALIZED_BY"));
            purchaseReturn.setFinalizedOn(rs.getTimestamp("FINALIZED_ON"));

        }
        return purchaseReturn;
    }

    //*******************************
    //SELECT purchaseReturn
    //*******************************
    public static ObservableList<PurchaseReturn> searchPurchaseReturns (
            String id, // although id is number, but we need to make select statement, so it is okay keep it string
            String name,
            String tile
    ) throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM Purchase_Returns";
        String filter="";
        if (!id.isEmpty())
            filter +="PURCHASE_ORDER_ID =" + id;

        if (!name.isEmpty())
            filter += (filter.isEmpty()?"":" AND ") + "CONTACT_NAME like '%" + name + "%' "+" collate binary_ai " ;

        if (!tile.isEmpty())
            filter += (filter.isEmpty()?"":" AND ") +"CONTACT_TITLE like '%" + tile + "%' "+" collate binary_ai " ;


        if (!filter.isEmpty())
            filter =" WHERE " + filter ;

        //if filter is not empty then add the filter to select statement.
        selectStmt += filter;

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rs_PR = DBUtil.dbExecuteQuery(selectStmt);

            //Send ResultSet to the getEmployeeList method and get employee object
            ObservableList<PurchaseReturn> PR_List = getPurchaseReturnList(rs_PR);

            //Return employee object
            return PR_List;
        } catch (SQLException e) {
            System.out.println("SQL select operation has been failed: " + e);
            //Return exception
            throw e;
        }
    }

    //Select * from employees operation
    private static ObservableList<PurchaseReturn> getPurchaseReturnList(ResultSet rs) throws SQLException, ClassNotFoundException {
        //Declare a observable List which comprises PurchaseReturn objects


        ObservableList<PurchaseReturn> PR_List = FXCollections.observableArrayList();


        while (rs.next()) {
            PurchaseReturn purchaseReturn = new PurchaseReturn();
            purchaseReturn.setPurchaseReturnId(rs.getInt("PURCHASE_RETURN_ID"));
            purchaseReturn.setPurchaseOrderId(rs.getInt("PURCHASE_ORDER_ID"));
            purchaseReturn.setSupplierId(rs.getInt("SUPPLIERID"));
            purchaseReturn.setContactName(rs.getString("CONTACT_NAME"));
            purchaseReturn.setContactTitle(rs.getString("CONTACT_TITLE"));
            purchaseReturn.setRemarks(rs.getString("REMARKS"));
            purchaseReturn.setShipMethod(rs.getString("SHIP_METHOD"));
            purchaseReturn.setNetAmount(rs.getObject("NET_AMOUNT"));
            purchaseReturn.setCreatedBy(rs.getInt("CREATED_BY"));
            purchaseReturn.setCreatedOn(rs.getTimestamp("CREATED_ON"));
            purchaseReturn.setLastUpdatedBy(rs.getInt("LAST_UPDATED_BY"));
            purchaseReturn.setLastUpdatedOn(rs.getTimestamp("LAST_UPDATED_ON"));
            purchaseReturn.setStatus(rs.getString("STATUS"));
            purchaseReturn.setStatusDate(rs.getTimestamp("STATUS_DATE"));
            purchaseReturn.setStatus(rs.getString("DESIGNATION_NAME"));
            purchaseReturn.setFinalized(rs.getInt("IS_FINALIZED")>0);
            purchaseReturn.setFinalizedBy(rs.getInt("FINALIZED_BY"));
            purchaseReturn.setFinalizedOn(rs.getTimestamp("FINALIZED_ON"));
            //Add purchaseReturn to the ObservableList
            PR_List.add(purchaseReturn);
        }
        //return PR_List (ObservableList of purchaseReturn)
        return PR_List;
    }

    //*************************************
    //UPDATE an PurchaseReturn
    //*************************************
    public static void updatePurchaseReturn (String id, String supplier, String contact_name, String contact_title, String last_update, String remarks, int isFin) throws SQLException, ClassNotFoundException {
        //Declare a UPDATE statement
        //(EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, JOB_ID)
        String updateStmt =
                "BEGIN\n" +
                        "UPDATE Purchase_Returns\n" +
                        "SET " +
                        "  SUPPLIERID = '" + supplier + "',\n" +
                        "  CONTACT_NAME  = " + contact_name + ",\n" +
                        "  CONTACT_TITLE  = " + contact_title + ",\n" +
                        "  REMARKS  = " + remarks + "\n" +
                        "  LAST_UPDATED_ON  = TO_DATE('"+last_update+"', 'YYYY.MM.dd'),\n" +
                        "  IS_FINALIZED  = " + isFin + "\n" +
                        "WHERE Purchase_Return_id = " + id + ";\n" +
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
    //DELETE an PurchaseReturn
    //*************************************
    public static void deletePRWithId (String PR_Id)  {
        //Declare a DELETE statement
        String updateStmt =
                "BEGIN\n" +
                        "   DELETE FROM Purchase_Returns\n" +
                        "         WHERE Purchase_Returns_id ="+ PR_Id +";\n" +
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
    //INSERT an PurchaseReturn
    //*************************************
    public static void insertPR (String PR_id,
                                 String PRD_id, String supplier, String contact_name, String contact_title,
                                 String remark, String shipping, double net_amount, String createdBY,
                                 String createdON, String last_update_By, String last_update_on, String status,
                                 String status_date, int isFin, String fin_By, String fin_On)  {
        //Declare a INSERT statement
        String updateStmt =
                "BEGIN\n" +
                        "INSERT INTO Purchase_Returns\n" +
                        "(PURCHASE_RETURN_ID, " +
                        "PURCHASE_ORDER_ID," +
                        "SUPPLIERID," +
                        "CONTACT_NAME,\n" +
                        "CONTACT_Title,\n" +
                        "REMARKS\n" +
                        "SHIP_METHOD\n" +
                        "NET_AMOUNT\n" +
                        "CREATED_BY\n" +
                        "CREATED_ON\n" +
                        "LAST_UPDATED_BY\n" +
                        "LAST_UPDATED_ON\n" +
                        "STATUS\n" +
                        "STATUS_DATE\n" +
                        "IS_FINALIZED\n" +
                        "FINALIZED_BY\n" +
                        "FINALIZED_ON\n" +
                        "("
                        + PR_id + ", '"
                        + PRD_id + ", '"
                        + supplier + ", '"
                        + contact_name + ", '"
                        + contact_title + ", '"
                        + remark + ", '"
                        + shipping + ", '"
                        + net_amount + ", '"
                        + createdBY + ", '"
                        + createdON +"',"
                        + last_update_By +","
                        +"TO_DATE('"+last_update_on+"', 'YYYY.MM.dd')',"
                        + status +","
                        +"TO_DATE('"+status_date+"', 'YYYY.MM.dd')',"
                        + isFin +","
                        + fin_By +","
                        +"TO_DATE('"+fin_On+"', 'YYYY.MM.dd')');\n" +
                        "END;";

        //Execute DELETE operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (Exception e) {
            System.out.print("Error occurred while INSERT Operation: " + e);

        }
    }

    public static ObservableList<Supplier> getSupplierList() {

        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM Suppliers";
        ObservableList<Supplier> list = FXCollections.observableArrayList();

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rs = DBUtil.dbExecuteQuery(selectStmt);

            //Declare a observable List which comprises Employee objects
            while (rs.next()) {
                Supplier item = new Supplier();
                item.setSupplierId(rs.getInt("SUPPLIER_ID"));
                item.setCompanyName(rs.getString("COMPANY_NAME"));
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

//    public static ObservableList<PurchaseReturnDetail> getPurchaseReturnDetailList(String PRD_id) throws SQLException, ClassNotFoundException {
//        //Declare a observable List which comprises PurchaseReturn objects
//
//        //Declare a SELECT statement
//        String selectStmt = "SELECT * FROM Purchase_Return_Details";

        //Execute SELECT statement
//        try {
//            //Get ResultSet from dbExecuteQuery method
//            ResultSet PRD_list = DBUtil.dbExecuteQuery(selectStmt);
//
//            //Send ResultSet to the getEmployeeFromResultSet method and get employee object
//            PurchaseReturnDetail PRD = get(rsEmp);
//
//            //Return employee object
//            return employee;
//        } catch (SQLException e) {
//            System.out.println("While searching an employee with " + empId + " id, an error occurred: " + e);
//            //Return exception
//
//        } catch (ClassNotFoundException e) {
//            System.out.println("While searching an employee with " + empId + " id, an error occurred: " + e);
//        }
//        return new EmployeeView();
//
//        ObservableList<PurchaseReturnDetail> PRD_List = FXCollections.observableArrayList();
//
//        while (rs.next()) {
//            PurchaseReturnDetail purchaseReturnDetail = new PurchaseReturnDetail();
//            purchaseReturnDetail.setPurchaseReturnId(rs.getInt("PURCHASE_RETURN_ID"));
//            purchaseReturnDetail.setPurchaseReturnDetailId(rs.getInt("PURCHASE_RETURN_DETAIL_ID"));
//            purchaseReturnDetail.setPolineNumber(rs.getInt("POLINE_NUMBER"));
//            purchaseReturnDetail.setItemId(rs.getInt("ITEM_ID"));
//            purchaseReturnDetail.setManufacturerPartNo(rs.getString("MANUFACTURER_PART_NO"));
//            purchaseReturnDetail.setUom(rs.getString("UOM"));
//            purchaseReturnDetail.setOrderQty(rs.getObject("ORDER_QTY"));
//            purchaseReturnDetail.setUnitPrice(rs.getObject("UNIT_PRICE"));
//            purchaseReturnDetail.setNetAmount(rs.getObject("NET_AMOUNT"));
//            //Add purchaseReturn to the ObservableList
//            PRD_List.add(purchaseReturnDetail);
//        }
//        //return PR_List (ObservableList of purchaseReturn)
//        return PRD_List;
//    }

//        //Declare a SELECT statement
//        String selectStmt = "SELECT * FROM Purchase_Returns";
//
//
//        //Execute SELECT statement
//        try {
//            //Get ResultSet from dbExecuteQuery method
//            ResultSet rs_PR = DBUtil.dbExecuteQuery(selectStmt);
//
//            //Send ResultSet to the getEmployeeList method and get employee object
//            ObservableList<PurchaseReturn> PR_List = getPurchaseReturnList(rs_PR);
//
//            //Return employee object
//            return PR_List;
//        } catch (SQLException e) {
//            System.out.println("SQL select operation has been failed: " + e);
//            //Return exception
//            throw e;
//        }


//
//    public static ObservableList<Department> getDepartmentList() {
//
//        //Declare a SELECT statement
//        String selectStmt = "SELECT * FROM DEPARTMENTS";
//        ObservableList<Department> list = FXCollections.observableArrayList();
//
//        //Execute SELECT statement
//        try {
//            //Get ResultSet from dbExecuteQuery method
//            ResultSet rs = DBUtil.dbExecuteQuery(selectStmt);
//
//            //Declare a observable List which comprises Employee objects
//            while (rs.next()) {
//                Department item = new Department();
//                item.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
//                item.setDepartmentName(rs.getString("DEPARTMENT_NAME"));
//                //Add to the ObservableList
//                list.add(item);
//            }
//            //return empList (ObservableList of Employees)
//            return list;
//
//        } catch (Exception e) {
//            System.out.println("SQL select operation has been failed: " + e);
//            //Return exception
//        }
//
//        return list;
//    }

}
