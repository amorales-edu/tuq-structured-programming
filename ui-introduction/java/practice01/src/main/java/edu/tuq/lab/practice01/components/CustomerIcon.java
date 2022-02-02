package edu.tuq.lab.practice01.components;

import edu.tuq.lab.practice01.App;
import edu.tuq.lab.practice01.model.Customer;
import javafx.scene.image.Image;

public class CustomerIcon extends Customer {
	Image image;
	int x, y, w, h;

	
	public CustomerIcon() {
		super();
		// TODO Auto-generated constructor stub
		image = new  Image(App.class.getResourceAsStream("assets/man.png"));
	}


	public Image getImage() {
		return image;
	}


	public CustomerIcon(int x, int y, int w, int h) {
		super();
		image = new  Image(App.class.getResourceAsStream("assets/man.png"));
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getW() {
		return w;
	}
	public int getH() {
		return h;
	}
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setW(int w) {
		this.w = w;
	}

	public void setH(int h) {
		this.h = h;
	}

	
}
