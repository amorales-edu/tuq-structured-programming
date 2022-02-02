package edu.tuq.lab.practice01.helpers.stack;

public class Node {

	Object item; 
	Node next;
	
	public Node(Object value){
		item = value;
	}
	
	public void enlazar(Node nuevoNodo) {
		next = nuevoNodo;
	}
	
	public Node obtenerSiguiente() {
		return next;
	}
	
	public Object obtenerNodo() {
		return item;
	}
	
	@Override
	public String toString() {
		return ": " + item + " => Nodo Sig: "+next + " |";
	}
}
