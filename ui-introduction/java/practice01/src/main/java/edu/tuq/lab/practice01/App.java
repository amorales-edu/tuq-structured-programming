package edu.tuq.lab.practice01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import edu.tuq.lab.practice01.components.CustomerIcon;
import edu.tuq.lab.practice01.helpers.Window;
import edu.tuq.lab.practice01.helpers.stack.generic.Stack;
import edu.tuq.lab.practice01.model.Customer;
import edu.tuq.lab.practice01.helpers.stack.generic.Stack;
import edu.tuq.lab.practice01.model.Customer;
/**
 * JavaFX App
 */
public class App extends Application {
	
	private static Stack<CustomerIcon> customers;
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
    	customers = new Stack<CustomerIcon>();
        scene = new Scene(loadFXML("customer/turnView"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    static Stack<CustomerIcon> getCustomers(){
    	return customers;
    }
    static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
    static <W> Window<W> getWindow(String fxml) throws IOException {
    	Window<W> window = new Window<W>(fxml);
    	return window;
    }

 
    
    public static void main(String[] args) {
        launch();
    }

}