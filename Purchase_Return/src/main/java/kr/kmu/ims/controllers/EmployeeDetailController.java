package kr.kmu.ims.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import kr.kmu.ims.models.Department;
import kr.kmu.ims.models.Designation;
import kr.kmu.ims.models.EmployeeView;
import kr.kmu.ims.repositories.EmployeeRepository;

import java.text.SimpleDateFormat;
import java.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class EmployeeDetailController {


    @FXML
    private TextField idText;
    @FXML
    private TextField nameText;
    @FXML
    private  ComboBox<Designation>  designationComboBox;

    @FXML
    private ComboBox<Department> departmentComboBox;
    @FXML
    private TextField hiringDateTextFiled;
    @FXML
    private CheckBox isActiveCheckBox;
     @FXML
     private Label resultArea;

    boolean isNew=true;
    //For MultiThreading
    private Executor exec;

    //Initializing the controller class.
    //This method is automatically called after the fxml file has been loaded.

    @FXML
    private void initialize () {
        /*
        The setCellValueFactory(...) that we set on the table columns are used to determine
        which field inside the EmployeesEntity objects should be used for the particular column.
        The arrow -> indicates that we're using a Java 8 feature called Lambdas.
        (Another option would be to use a PropertyValueFactory, but this is not type-safe

        We're only using StringProperty values for our table columns in this example.
        When you want to use IntegerProperty or DoubleProperty, the setCellValueFactory(...)
        must have an additional asObject():
        */

        //For multithreading: Create executor that uses daemon threads:
        exec = Executors.newCachedThreadPool((runnable) -> {
            Thread t = new Thread (runnable);
            t.setDaemon(true);
            return t;
        });

        var designations=EmployeeRepository.getDesignationList();
        designationComboBox.setItems(designations);
        designationComboBox.valueProperty().addListener((obs, oldval, newval) -> {
            if(newval != null)
                System.out.println("Selected designation: " + newval.getDesignationName()
                        + ". ID: " + newval.getDesignationId());
        });
//        designationComboBox.setConverter(new StringConverter<Designations>() {
//
//
//            @Override
//            public String toString(Designations object) {
//                return ""+object.getDesignationId();
//            }
//
//            @Override
//            public Designations fromString(String id) {
//                return designationComboBox.getItems().stream().filter(x ->
//                        ""+x.getDesignationId()==id).findFirst().orElse(null);
//            }
//        });

        var departments=EmployeeRepository.getDepartmentList();
        departmentComboBox.setItems(departments);


    }


    //Search an employee

    public void load(String id)  {

        //Get Employee information
        EmployeeView emp = EmployeeRepository.getEmployee(id);
        //Populate Employee on TableView and Display on TextArea
        if (emp.getEmployeeId()>0){
            isNew=false;
            idText.setDisable(true);
        }
        showEmployee(emp);

    }
    private void showEmployee(EmployeeView emp){
        if (emp!=null) {
            idText.setText(""+emp.getEmployeeId());
            nameText.setText(emp.getEmployeeName());

            //set designation combobox value from databae
            if (emp.getDesignationId()!=null) {
                Optional<Designation> selectedDesign = designationComboBox.getItems().stream().filter(x -> x.getDesignationId() == emp.getDesignationId()).findFirst();
                if (selectedDesign.isPresent())
                    designationComboBox.setValue(selectedDesign.get());
            }

            //set department combobox value from databae
            if (emp.getDepartmentId()!=null) {
                Optional<Department> selectedDept = departmentComboBox.getItems().stream().filter(x -> x.getDepartmentId() == emp.getDepartmentId()).findFirst();
                if (selectedDept.isPresent())
                    departmentComboBox.setValue(selectedDept.get());
            }
            if (emp.getHiringDate()!=null)
                hiringDateTextFiled.setText(new SimpleDateFormat("YYYY.MM.dd").format(emp.getHiringDate()));
            isActiveCheckBox.setSelected(emp.getActive());
        }

    }
    //Update employee's email with the email which is written on newEmailText field


    @FXML
    private void saveEmployee(ActionEvent actionEvent){
        Designation ds=designationComboBox.getValue();
        System.out.println(ds.getDesignationId());
        if (isNew)
            insertEmployee(actionEvent)                    ;
        else
            updateEmployee(actionEvent);
    }

    @FXML
    private void updateEmployee (ActionEvent actionEvent)  {
        try {
            EmployeeRepository.updateEmployee(idText.getText(),
                    nameText.getText(),
                    designationComboBox.getValue().getDesignationId(),
                    departmentComboBox.getValue().getDepartmentId(),
                    hiringDateTextFiled.getText(),
                    isActiveCheckBox.isSelected()?1:0
                    );
            resultArea.setText("updated, employee id: " + idText.getText() + "\n");
        } catch (Exception e) {
            resultArea.setText("Problem occurred while updating email: " + e);
        }
    }

    //Insert an employee to the DB
    @FXML
    private void insertEmployee (ActionEvent actionEvent)  {
        try {
            //add new employee
            EmployeeRepository.insertEmp(
                    idText.getText(),
                    nameText.getText(),
                    designationComboBox.getValue().getDesignationId(),
                    departmentComboBox.getValue().getDepartmentId(),
                    hiringDateTextFiled.getText(),
                    isActiveCheckBox.isSelected()?1:0
            );
            resultArea.setText("Employee inserted! \n");

            //reload all records
            load(idText.getText());
        } catch (Exception e) {
            resultArea.setText("Problem occurred while inserting employee " + e);

        }
    }

    //Delete an employee with a given employee Id from DB
    @FXML
    private void deleteEmployee (ActionEvent actionEvent)  {
        try {
            EmployeeRepository.deleteEmpWithId(idText.getText());
            resultArea.setText("Employee deleted! Employee id: " + idText.getText() + "\n");
        } catch (Exception e) {
            resultArea.setText("Problem occurred while deleting employee " + e);
        }
    }
}
