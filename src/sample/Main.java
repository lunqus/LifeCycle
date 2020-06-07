package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        System.out.println("2. Start begins");

        primaryStage.setTitle("Life Cycle");

        FlowPane root = new FlowPane(Orientation.VERTICAL, 5 ,5);

        Scene scene = new Scene(root, 700, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void init() throws Exception {
        super.init();
        System.out.println("1. Init begins");
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("3. Stop invoked");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
