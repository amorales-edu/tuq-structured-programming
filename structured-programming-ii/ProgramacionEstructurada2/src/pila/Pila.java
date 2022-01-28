package pila;

import simple_lista_enlazada.Nodo;

public class Pila {
	int size;
	Nodo top;
	public Pila() {
		this.size =0;
		this.top =null;
	}
	public boolean isEmpty() {
	  return size ==0;
	}
	public void push(Object value) {
		Nodo newNode = new Nodo(value);
		if(isEmpty()) {
			top = newNode;
		}else {
			Nodo pointer = top;
			while( pointer.obtenerSiguiente() != null) {
				pointer = pointer.obtenerSiguiente();
			}
			pointer.enlazar(newNode);
		}
		size++;
	}
	public Object pop() {
		Nodo topToReturn = null;
		if(!isEmpty()){
			if(size == 1) {
				topToReturn = top;
				top = null;
			}else {
				Nodo pointer = top;
				Nodo penultimoNodo = pointer;
				while( pointer.obtenerSiguiente() != null) {
					penultimoNodo = pointer;
					pointer = pointer.obtenerSiguiente();
				}
				topToReturn = pointer;
				penultimoNodo.enlazar(null);
			}
			size--;
		}
		return topToReturn;
	}
	public int size() {
		return size;
	}
	public Object peek() {
		Nodo topToReturn = null;
		if(!isEmpty()){
			Nodo pointer = top;
			while( pointer.obtenerSiguiente() != null) {
				pointer = pointer.obtenerSiguiente();
			}
			topToReturn = pointer;
		}
		return topToReturn;
	}
	@Override
	public String toString() {
		return "Pila [size=" + size + "]";
	}
	
	
}
