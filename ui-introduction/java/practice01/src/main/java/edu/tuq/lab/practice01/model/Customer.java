package edu.tuq.lab.practice01.model;

import java.util.Random;

public class Customer {
	private String name;
	private int balance;
	private String[] names = new String[]{"Maria", "Jorge", "Karina", "Jesus", "Patricia"};
	private String[] lastname = new String[]{"Perez", "Soto", "Rosa", "Sánchez", "Ramirez"};
	private Random random;
	private int turn;
	public Customer() {
		this.random = new Random();
		this.balance =  getRandomBalance();
		this.name =  getRandomName();
		this.turn=0;
	}
	
	public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}

	public String getName() {
		return this.name;
	}
	public int getBalance() {
		return this.balance;
	}

	private int getRandomBalance() {
		 return random.nextInt(1000) + 1;
	}
	
	private String getRandomName() {
	    	return new StringBuilder()
	    			.append(this.names[random.nextInt(this.names.length)]).append(" ")
	    			.append(this.lastname[random.nextInt(this.lastname.length)]).toString();
	}
	@Override
	public String toString() {
		return "Customer [Name=" + getName() + ", Balance=" + getBalance() +  "]";
	}

}
