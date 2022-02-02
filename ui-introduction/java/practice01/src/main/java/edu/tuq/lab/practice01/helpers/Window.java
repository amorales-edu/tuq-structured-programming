package edu.tuq.lab.practice01.helpers;

import java.io.IOException;

import edu.tuq.lab.practice01.App;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class Window<T>{
	private FXMLLoader loader;
	private String fxml;
	private Parent parent;
	public Window(String fxml) throws IOException {
		this.loader =  new FXMLLoader();
		this.fxml = fxml;
    	this.parent = this.loader.load(App.class.getResource(fxml + ".fxml").openStream());
	}
	public Parent getParent(){
		return this.parent;
	}
	public T getController() {
		return (T)loader.getController();
	}
	
}

