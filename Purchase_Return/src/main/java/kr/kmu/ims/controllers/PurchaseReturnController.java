package kr.kmu.ims.controllers;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import kr.kmu.ims.InventoryApplication;
import kr.kmu.ims.models.PurchaseReturn;
import kr.kmu.ims.repositories.EmployeeRepository;
import kr.kmu.ims.repositories.PurchaseReturnRepository;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class PurchaseReturnController {
    @FXML TextField searchPurchaseOrderID;
    @FXML TextField searchContactName;
    @FXML TextField searchContactTile;
    @FXML
    private TableView PurchaseReturnTableView;
    @FXML
    private TableColumn<PurchaseReturn, Integer> searchResultNum;
    @FXML
    private TableColumn<PurchaseReturn, Integer> PONumColumn;
    @FXML
    private TableColumn<PurchaseReturn, Integer> SupplierIDColumn;
    @FXML
    private TableColumn<PurchaseReturn, String> ContactNameColumn;
    @FXML
    private TableColumn<PurchaseReturn, String> ContactTileColumn;
    @FXML
    private TableColumn<PurchaseReturn, Date> OrderDateColumn;
    @FXML
    private TableColumn<PurchaseReturn, String> StatusColumn;
    @FXML
    private TableColumn<PurchaseReturn, Double> NetAmountColumn;


    //For MultiThreading
    private Executor exec;

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

        PONumColumn.setCellValueFactory(new PropertyValueFactory<>("PurchaseOrderId"));
        SupplierIDColumn.setCellValueFactory(new PropertyValueFactory<>("SupplierId"));
        ContactNameColumn.setCellValueFactory(new PropertyValueFactory<>("ContactName"));
        ContactTileColumn.setCellValueFactory(new PropertyValueFactory<>("ContactTitle"));
        StatusColumn.setCellValueFactory(new PropertyValueFactory<>("Status"));
        NetAmountColumn.setCellValueFactory(new PropertyValueFactory<>("NetAmount"));
        OrderDateColumn.setCellValueFactory(new PropertyValueFactory<>(""));
        OrderDateColumn.setCellFactory(column -> {
            TableCell<PurchaseReturn, Date> cell = new TableCell<>() {
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

        PurchaseReturnTableView.setRowFactory( tv -> {
            TableRow<PurchaseReturn> row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (event.getClickCount() == 2 && (! row.isEmpty()) ) {
                    PurchaseReturn rowData = row.getItem();

                    System.out.println(rowData.getPurchaseReturnId());

                    showDetail(rowData.getPurchaseReturnId());

                }
            });
            return row ;
        });
    }



    //Search all purchase return
    @FXML
    private void searchPurchaseReturn(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        try {
            //Get all Employees information
            ObservableList<PurchaseReturn> PR_Data = PurchaseReturnRepository.searchPurchaseReturns(searchPurchaseOrderID.getText(), searchContactName.getText(), searchContactTile.getText());
            //Populate Employees on TableView
            populatePurchaseReturns(PR_Data);
        } catch (SQLException e){
            System.out.println("Error occurred while getting employees information from DB.\n" + e);
            throw e;
        }
    }

    //Populate PurchaseReturns for TableView
    @FXML
    private void populatePurchaseReturns (ObservableList<PurchaseReturn> PR_Data) throws ClassNotFoundException {
        
        //Set items to the PurchaseReturn Table
        PurchaseReturnTableView.setItems(PR_Data);
    }
    public void showDetail(int id) {

        PurchaseReturnDetailController controller = (PurchaseReturnDetailController) InventoryApplication.Instance.rootController.showDetailTab("PurchaseReturn/PurchaseReturnDetail.fxml", "PurchaseReturn :" + id);

        //controller.load(String.valueOf(id));

    }

    public void newPurchaseReturn(ActionEvent actionEvent) {
        PurchaseReturnDetailController controller = (PurchaseReturnDetailController) InventoryApplication.Instance.rootController.showDetailTab("PurchaseReturn/PurchaseReturnDetail.fxml", "New PurchaseReturn detail");

    }


}
