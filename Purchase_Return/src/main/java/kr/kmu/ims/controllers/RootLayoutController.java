package kr.kmu.ims.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class RootLayoutController {

    //Reference to the main application
    private Stage stage;

    @FXML
    private TabPane rootTabPane;


    private final String viewPath="/kr/kmu/ims/views/";
    //Is called by the main application to give a reference back to itself.
    public void setStage (Stage stage) {
        this.stage = stage;
    }

    //Exit the program
    public void handleExit(ActionEvent actionEvent) {
        System.exit(0);
    }

    //Help Menu button behavior
    public void handleHelp(ActionEvent actionEvent) {
        Alert alert = new Alert (Alert.AlertType.INFORMATION);
        alert.setTitle("Program Information");
        alert.setHeaderText("This is a sample JAVAFX application for SWTESTACADEMY!");
        alert.setContentText("You can search, delete, update, insert a new employee with this program.");
        alert.show();
    }

//    @FXML
//    private void printAction(ActionEvent actionEvent){
//        Task<Void> = new Task<Void>(){
//            JasperPrint jp= JasperFillManager.fillReport("report/report01.jasper", params, ));
//        }
//
//    }

    //Shows the employee operations view inside the root layout.
    public void showEmployeeView() throws IOException {

        showTab("employees/employee-list-view.fxml", "Employee Tab");

    }
    public void showHelloView() throws IOException {

            showTab("hello-view.fxml", "Hello Tab");

    }
    public void showDialog(final String viewName, String title) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(viewPath+viewName));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.DECORATED);
            stage.setTitle(title);
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void showTab(String viewName, String title) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(viewPath + viewName));
            AnchorPane ctl = (AnchorPane) fxmlLoader.load();
            var controller = fxmlLoader.getController();
            System.out.println(controller);
            Tab tab = new Tab();
            tab.setContent(ctl);
            tab.setText(title);
            tab.setClosable(true);

            rootTabPane.getTabs().add(0, tab);
            rootTabPane.getSelectionModel().select(0);
        } catch (Exception exception) {
            System.out.println("error occurred " + exception.getMessage());
        }
    }

    public void showHelloDialog(ActionEvent actionEvent) {
        showDialog("hello-view.fxml", "Hello window Dialog");
    }

    public void poButtonClick(ActionEvent actionEvent) throws IOException {
        showTab("employee-view.fxml",      "Hello window Dialog");

    }


    public void empButtonClick(ActionEvent actionEvent) throws IOException {
        showTab("employees/employee-list-view.fxml",      "Employee Search");
    }

    public void showBrandView(ActionEvent actionEvent) throws IOException {
        showTab("core/brand-list-view.fxml",      "Brands Search");

    }

    public void PurchaseReturnButtonClick(ActionEvent actionEvent) throws IOException {
        showTab("PurchaseReturn/PurchaseReturn_List.fxml",      "Purchase Return");

    }

    public Object showDetailTab(String viewName, String title) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(viewPath + viewName));
            AnchorPane ctl = (AnchorPane) fxmlLoader.load();
            var controller = fxmlLoader.getController();
//            controller.setId(id);
            System.out.println("controller");
            System.out.println(controller);
            Tab tab = new Tab();
            tab.setContent(ctl);
            tab.setText(title);
            tab.setClosable(true);

            rootTabPane.getTabs().add(0, tab);
            rootTabPane.getSelectionModel().select(0);
            return controller;
        } catch (Exception exception) {
            System.out.println("error occurred " + exception.getMessage());
        }
        return null;
    }
}
