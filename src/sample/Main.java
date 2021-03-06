package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.InputStream;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("LiTe Chat");
        InputStream icon = getClass().getResourceAsStream("/Images/chatIcon.png");
        Image image = new Image(icon);
        primaryStage.getIcons().add(image);
        primaryStage.setScene(new Scene(root, 550, 750));
        primaryStage.show();
        primaryStage.setResizable(false);
    }
}
