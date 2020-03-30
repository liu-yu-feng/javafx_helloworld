package sample;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Screen;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private TextField textf;
    @FXML
    private BorderPane borderpane;
    @FXML
    private void clickBtn1(){
        System.out.println("你点击了第一个按钮！");
    }

    @FXML
    private void clickBtn2(){
        System.out.println("你点击了第二个按钮！");

        textf.setFont(Font.font(17));
        textf.setText("哈哈，我就知道你喜欢我，不喜欢也不行，不信你试试！！！");
    }
    @FXML
    private void enterBtn1(){
        System.out.println("窗口重新定位");
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();

        double maxX = bounds.getMaxX();
        double maxY = bounds.getMaxY();
        borderpane.getScene().getWindow().setX(Math.random()*(maxX-500));
        borderpane.getScene().getWindow().setY(Math.random()*(maxY-300));

    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
