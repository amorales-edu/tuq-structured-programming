package edu.tuq.lab.practice01.helpers.stack.generic;

public class Node<T> {

	T item; 
	Node<T> next;
	
	public Node(T value){
		item = value;
	}
	
	public void enlazar(Node<T> nuevoNodo) {
		next = nuevoNodo;
	}
	
	public Node<T> obtenerSiguiente() {
		return next;
	}
	
	public T obtenerNodo() {
		return item;
	}
	
	@Override
	public String toString() {
		return ": " + item + " => Nodo Sig: "+next + " |";
	}
}
