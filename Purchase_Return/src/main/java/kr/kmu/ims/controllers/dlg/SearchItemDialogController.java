//package kr.kmu.ims.controllers.dlg;
//
//import javafx.collections.ObservableList;
//import javafx.concurrent.Task;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.control.TableColumn;
//import javafx.scene.control.TableView;
//import javafx.scene.control.TextField;
//import kr.kmu.ims.kr.kmu.ims.kr.kmu.ims.models.Item;
//import kr.kmu.ims.repositories.ItemRepository;
//
//import java.sql.SQLException;
//import java.util.List;
//import java.util.concurrent.Executor;
//import java.util.concurrent.Executors;
//
//
//public class SearchItemDialogController {
//
//    //search fields
////    @FXML
////    private TextField empIdText;
////    @FXML
////    private TextArea resultArea;
////    @FXML
////    private TextField newEmailText;
//
//    @FXML
//    private TextField idText;
//    @FXML
//    private TextField codeText;
//    @FXML
//    private TextField nameText;
//
////    @FXML
////    private TextField emailText;
////    @FXML
////    private TextField jobText;
//    @FXML
//    private TableView table;
//    @FXML
//    private TableColumn<Item, Integer> idColumn;
//    @FXML
//    private TableColumn<Item, String> codeColumn;
//    @FXML
//    private TableColumn<Item, String> nameColumn;
//
//
//    //For MultiThreading
//    private Executor exec;
//
//    //Initializing the controller class.
//    //This method is automatically called after the fxml file has been loaded.
//
//    @FXML
//    private void initialize() {
//        /*
//        The setCellValueFactory(...) that we set on the table columns are used to determine
//        which field inside the Item objects should be used for the particular column.
//        The arrow -> indicates that we're using a Java 8 feature called Lambdas.
//        (Another option would be to use a PropertyValueFactory, but this is not type-safe
//
//        We're only using StringProperty values for our table columns in this example.
//        When you want to use IntegerProperty or DoubleProperty, the setCellValueFactory(...)
//        must have an additional asObject():
//        */
//
//        //For multithreading: Create executor that uses daemon threads:
//        exec = Executors.newCachedThreadPool((runnable) -> {
//            Thread t = new Thread(runnable);
//            t.setDaemon(true);
//            return t;
//        });
//
//        idColumn.setCellValueFactory(cellData -> {
//            Integer itemid = cellData.getValue().getITEMID();
//            return itemid;
//        });
//        nameColumn.setCellValueFactory(cellData -> cellData.getValue().NAME());
//
//    }
//
//
//    //Search all employees
//    @FXML
//    private void search(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
//        try {
//            //Get all Items information
//            ObservableList<Item> empData = ItemRepository.searchItems();
//            //Populate Items on TableView
//            populate(empData);
//        } catch (SQLException e) {
//            System.out.println("Error occurred while getting employees information from DB.\n" + e);
//            throw e;
//        }
//    }
//
//    //Populate Items for TableView with MultiThreading (This is for example usage)
//    private void fillTable(ActionEvent event) throws SQLException, ClassNotFoundException {
//        Task<List<Item>> task = new Task<List<Item>>() {
//            @Override
//            public ObservableList<Item> call() throws Exception {
//                return ItemRepository.searchItems();
//            }
//        };
//
//        task.setOnFailed(e -> task.getException().printStackTrace());
//        task.setOnSucceeded(e -> employeeTable.setItems((ObservableList<Item>) task.getValue()));
//        exec.execute(task);
//    }
//
//    //Populate Items for TableView
//    @FXML
//    private void populate(ObservableList<Item> empData) throws ClassNotFoundException {
//        //Set items to the employeeTable
//        employeeTable.setItems(empData);
//    }
//
//}
//
