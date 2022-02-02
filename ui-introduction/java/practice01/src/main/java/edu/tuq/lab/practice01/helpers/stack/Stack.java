package edu.tuq.lab.practice01.helpers.stack;

public class Stack {
	int size;
	Node primero;
	Node ultimo;
	public Stack() {
		this.size = 0;
		this.primero=null;
		this.ultimo=null;
	}
	public boolean isEmpty() {
		return primero ==null;
	}
	public void add(Object value) {
		Node newNode = new Node(value);
		if(isEmpty()) {
			primero=newNode;
			ultimo=newNode;
		}else {
			
			Node pointer = primero;
			//recorrer del Node base  hasta encontrar un enlace vacio
			while(pointer.obtenerSiguiente() != null) {
				pointer = pointer.obtenerSiguiente();
			}
			pointer.enlazar(newNode);
			ultimo=newNode;
		}
		size++;
	}
	
	
	public Object poll() {
		Node frontToReturn = primero;
		if(!isEmpty()){
			primero = primero.obtenerSiguiente();
			size--;
		}
		return frontToReturn == null ? null:frontToReturn.obtenerNodo();
		
	}
	public Object peek() {
		return primero.obtenerNodo();
	}
	public int size() {
		return size;
	}
	@Override
	public String toString() {
		return "Cola [size=" + size + "]";
	}
}
