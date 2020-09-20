package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import java.util.Objects;

public class Main extends Application {

    public static void main(String[] args) {
        try {launch(args); }
        catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERRO!!!");
            alert.setHeaderText(null);
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(
                this.getClass().getClassLoader().getResource("views/home.fxml")));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}