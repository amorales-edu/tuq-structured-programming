package pila;

public class Nodo {
	Object item; 
	Nodo next;
	
	public Nodo(Object value){
		item = value;
	}
	
	public void enlazar(Nodo nuevoNodo) {
		next = nuevoNodo;
	}
	
	public Nodo obtenerSiguiente() {
		return next;
	}
	
	public Object obtenerNodo() {
		return item;
	}
	
	@Override
	public String toString() {
		return "Node: " + item + " => Nodo Sig: "+next + " |";
	}
	
}