import cs3331.lab0.helper.HelloWorldFrame;
import javafx.application.Application;
import javafx.stage.Stage;


public class Hello extends Application{
    public void start(Stage stage){
        new HelloWorldFrame(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}