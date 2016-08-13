package employee;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by ozankoyuncu on 13.8.2016.
 */
public class Main extends Application {
    private static Stage primaryStage;
    private static BorderPane mainlayout;

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage=primaryStage;
        this.primaryStage.setTitle("Employee App");
        showMainView();
        showMainItems();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private void showMainView() throws IOException {
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/MainView.fxml"));
        mainlayout=loader.load();
        Scene scene=new Scene(mainlayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void showMainItems() throws IOException {
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/MainItems.fxml"));
        BorderPane mainItems=loader.load();
        mainlayout.setCenter(mainItems);
    }
    public static void showElectricalScreen() throws IOException{
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(Main.class.getResource("electrical/ElectricalDepartment.fxml"));
        BorderPane electricalDepartment=loader.load();
        mainlayout.setCenter(electricalDepartment);
    }

    public static void showMechanicalScreen() throws IOException{
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(Main.class.getResource("mechanical/MechanicalDepartment.fxml"));
        BorderPane mechanicalDepartment=loader.load();
        mainlayout.setCenter(mechanicalDepartment);
    }
    public static void showAddStage() throws IOException{
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/AddNewEmployee.fxml"));
        BorderPane addNewEmployee=loader.load();
        Stage addDialogStage=new Stage();
        addDialogStage.setTitle("Add new Employee");
        addDialogStage.initModality(Modality.WINDOW_MODAL);
        addDialogStage.initOwner(primaryStage);
        Scene scene=new Scene(addNewEmployee);
        addDialogStage.setScene(scene);
        addDialogStage.showAndWait();
    }
}

