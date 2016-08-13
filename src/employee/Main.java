package employee;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by ozankoyuncu on 13.8.2016.
 */
public class Main extends Application {
    private Stage primaryStage;
    private BorderPane mainlayout;

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

    private void showMainItems() throws IOException {
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/MainItems.fxml"));
        BorderPane mainItems=loader.load();
        mainlayout.setCenter(mainItems);
    }
}
