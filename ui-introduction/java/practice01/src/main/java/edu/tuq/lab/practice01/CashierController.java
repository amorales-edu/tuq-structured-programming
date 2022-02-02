package edu.tuq.lab.practice01;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import edu.tuq.lab.practice01.components.CustomerIcon;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class CashierController implements Initializable  {
	private GraphicsContext  gc;
	@FXML
    private Canvas canvas;

	@FXML
	private void poll() throws IOException {
		CustomerIcon customer = App.getCustomers().poll();
		if(customer !=null) {
			remove(customer,gc);
		}
	}
	  
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		refresh();
	}
	//Logic canvas
	public void refresh() {
		gc = canvas.getGraphicsContext2D();
		clear(gc);
		drawCustomers(gc);
		
	}
	private void drawCustomers(GraphicsContext gc) {
	    
		var iterator = App.getCustomers().iterator();
    	int count = 1;
		while(iterator.hasNext()) {
    	      CustomerIcon element = iterator.next();
    	      element.setX(80);
    	      element.setY(50*count);
    	      element.setW(40);
    	      element.setH(40);
    	      element.setTurn(count);
    	      gc.drawImage(element.getImage(),element.getX(),element.getY(),element.getW(), element.getH());
    	      gc.strokeText(Integer.toString(count), 100, element.getY()+20);
    	      count++;
    	      System.out.println(element);
    	}
    	  
	 }
	 private void remove(CustomerIcon customer,GraphicsContext gc) {
		 gc.clearRect(customer.getX(),customer.getY() , customer.getW(), customer.getH());
	 }
	 private void clear(GraphicsContext gc) {
		 gc.clearRect(0,0 , 180, 1000);
	 }



}
