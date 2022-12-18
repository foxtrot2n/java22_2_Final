package kr.kmu.ims.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import kr.kmu.ims.models.*;
import kr.kmu.ims.repositories.EmployeeRepository;
import kr.kmu.ims.repositories.PurchaseReturnRepository;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class PurchaseReturnDetailController {

    @FXML
    private TextField PO_Txt;

    @FXML
    private ComboBox<Supplier> supplierComboBox;

    @FXML
    private TextField contactName;

    @FXML
    private TextField contactTitle;

    @FXML
    private TextField remarks;

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
            Thread t = new Thread(runnable);
            t.setDaemon(true);
            return t;
        });

        var suppliers = PurchaseReturnRepository.getSupplierList();
        supplierComboBox.setItems(suppliers);
        supplierComboBox.valueProperty().addListener((obs, oldval, newval) -> {
            if (newval != null)
                System.out.println("Selected Supplier: " + newval.getCompanyName()
                        + ". ID: " + newval.getSupplierId());
        });
    }

    //Search an PurchaseReturnDetails

    public void load(String id)  {

        //Get Employee information
//        try {
//            ObservableList<PurchaseReturnDetail> prd = PurchaseReturnRepository.getPurchaseReturnDetailList(id);
//            //Populate Employee on TableView and Display on TextArea
//            if (prd.getEmployeeId()>0){
//                isNew=false;
//                idText.setDisable(true);
//            }
//            showEmployee(prd);
//        } catch (SQLException e){
//            System.out.println("Error occurred while getting employees information from DB.\n" + e);
//            throw e;
//        }


    }


}
