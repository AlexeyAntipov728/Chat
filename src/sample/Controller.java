package sample;


import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextField textField;
    public javafx.scene.control.TextArea textArea;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void SendMess() {
        String out = textField.getText();
        textArea.appendText(getTime() + ": " + out + "\n");
        textField.clear();
    }

    public String getTime() {
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }

    public void Enter(KeyEvent keyEvent) {
        if (keyEvent.getCode().equals(KeyCode.ENTER)) {
            SendMess();
        }
    }

    public void Send(ActionEvent actionEvent) {
        SendMess();
    }

    public void showAbout(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setHeaderText(null);
        alert.setContentText("LiTe chat ver. 1.0.\nI think that it's beginning of something great.");
        alert.showAndWait();
    }

    public void Exit(ActionEvent actionEvent) {
        System.exit(0);
    }
}


