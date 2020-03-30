package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Stage stage=new Stage(StageStyle.UTILITY);
        stage.setTitle("我来问问你");
        stage.setMinHeight(300);
        stage.setMinWidth(500);
        stage.setScene(new Scene(root, 500, 200, Color.WHITE));
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
