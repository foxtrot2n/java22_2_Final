package kr.kmu.ims.controllers;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import kr.kmu.ims.InventoryApplication;
import kr.kmu.ims.models.EmployeeView;
import kr.kmu.ims.repositories.EmployeeRepository;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class EmployeeListController  {

    @FXML TextField idSearchTextField;
    @FXML TextField nameSearchTextField;
    @FXML TextField designSearchTextField;

    @FXML
    private TableView tableView;
    @FXML
    private TableColumn<EmployeeView, Integer>  empIdColumn;
    @FXML
    private TableColumn<EmployeeView, String>  empNameColumn;
    @FXML
    private TableColumn<EmployeeView, String>  departmentNameColumn;
    @FXML
    private TableColumn<EmployeeView, String>  designationNameColumn;
    @FXML
    private TableColumn<EmployeeView, Date>  hiringDateColumn;

    //For MultiThreading
    private Executor exec;

    //Initializing the controller class.
    //This method is automatically called after the fxml file has been loaded.

    @FXML
    private void initialize () {
        /*
        The setCellValueFactory(...) that we set on the table columns are used to determine
        which field inside the Employee objects should be used for the particular column.
        The arrow -> indicates that we're using a Java 8 feature called Lambdas.
        (Another option would be to use a PropertyValueFactory, but this is not type-safe

        We're only using StringProperty values for our table columns in this example.
        When you want to use IntegerProperty or DoubleProperty, the setCellValueFactory(...)
        must have an additional asObject():
        */


        //For multithreading: Create executor that uses daemon threads:
        exec = Executors.newCachedThreadPool((runnable) -> {
            Thread t = new Thread(runnable);
            t.setDaemon(true);
            return t;
        });

        empIdColumn.setCellValueFactory(new PropertyValueFactory<>("EmployeeId"));
        empNameColumn.setCellValueFactory(new PropertyValueFactory<>("EmployeeName"));
        departmentNameColumn.setCellValueFactory(new PropertyValueFactory<>("DepartmentName"));
        designationNameColumn.setCellValueFactory(new PropertyValueFactory<>("DesignationName"));
        hiringDateColumn.setCellValueFactory(new PropertyValueFactory<>("HiringDate"));
        hiringDateColumn.setCellFactory(column -> {
            TableCell<EmployeeView, Date> cell = new TableCell<>() {
                private SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");

                @Override
                protected void updateItem(Date item, boolean empty) {
                    super.updateItem(item, empty);
                    if (empty || item==null ) {
                        setText("");
                    } else {
                        this.setText(format.format(item));

                    }
                }
            };

            return cell ;
        });

        tableView.setRowFactory( tv -> {
            TableRow<EmployeeView> row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (event.getClickCount() == 2 && (! row.isEmpty()) ) {
                    EmployeeView rowData = row.getItem();

                    System.out.println(rowData.getEmployeeId());

                        showDetail(rowData.getEmployeeId());

                }
            });
            return row ;
        });
    }



    //Search all employees
    @FXML
    private void searchEmployees(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        try {
            //Get all Employees information
            ObservableList<EmployeeView> empData = EmployeeRepository.searchEmployees(idSearchTextField.getText(), nameSearchTextField.getText(), designSearchTextField.getText());
            //Populate Employees on TableView
            populateEmployees(empData);
        } catch (SQLException e){
            System.out.println("Error occurred while getting employees information from DB.\n" + e);
            throw e;
        }
    }

    //Populate Employees for TableView
    @FXML
    private void populateEmployees (ObservableList<EmployeeView> empData) throws ClassNotFoundException {
        //Set items to the employeeTable
        tableView.setItems(empData);
    }
    public void showDetail(int id) {

        EmployeeDetailController controller = (EmployeeDetailController) InventoryApplication.Instance.rootController.showDetailTab("employees/employee-detail-view.fxml", "Employee :" + id);

        controller.load(String.valueOf(id));

    }

    public void newEmployee(ActionEvent actionEvent) {
        EmployeeDetailController controller = (EmployeeDetailController) InventoryApplication.Instance.rootController.showDetailTab("employees/employee-detail-view.fxml", "New Employee detail");

    }
}
