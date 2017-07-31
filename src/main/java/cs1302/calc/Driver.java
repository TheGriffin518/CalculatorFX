package cs1302.calc;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Driver extends Application {

    
    public static void main(String[] args) {
        launch(args);
    } // main
    
    @Override
    public void start(Stage primaryStage) {
	
	Calculator calc = new Calculator();
	Scene scene = new Scene(calc);

        primaryStage.setTitle("CalcFX!");
	primaryStage.setScene(scene);
        primaryStage.show();

    } // start

} // Driver


