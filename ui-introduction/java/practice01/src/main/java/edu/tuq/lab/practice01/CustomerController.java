package edu.tuq.lab.practice01;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import edu.tuq.lab.practice01.components.CustomerIcon;
import edu.tuq.lab.practice01.helpers.Window;
import edu.tuq.lab.practice01.helpers.stack.generic.Stack;
import edu.tuq.lab.practice01.model.Customer;

public class CustomerController implements Initializable {

	private Stack<CustomerIcon> list;
	SimpleObjectProperty customerList;
	CashierController cashierController;
	private boolean isCashierWindowActive;
	
    @FXML
    private void takeTurn() throws IOException {
    	list.add(new CustomerIcon());
    	if(!isCashierWindowActive) {
    		buildCashierPanel();
    	}else {
    		cashierController.refresh();
    	}
    }

    private void buildCashierPanel() throws IOException {
    	Stage cashierStage = new Stage();
    	Window<CashierController> window = App.getWindow("cashier/recordView");
    	cashierController =  window.getController();
    	Scene scene= new Scene(window.getParent());
    	cashierStage.setScene(scene);
    	cashierStage.alwaysOnTopProperty();
    	cashierStage.initModality(Modality.NONE);
    	cashierStage.show();
    	isCashierWindowActive = true;
    }

    @Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
    	list = App.getCustomers();
	}


    
    
    
}
