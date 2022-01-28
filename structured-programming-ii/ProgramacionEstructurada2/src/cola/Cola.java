package cola;

import simple_lista_enlazada.Nodo;

public class Cola {
	int size;
	Nodo primero;
	Nodo ultimo;
	public Cola() {
		this.size = 0;
		this.primero=null;
		this.ultimo=null;
	}
	public boolean isEmpty() {
		return primero ==null;
	}
	public void add(Object value) {
		Nodo newNode = new Nodo(value);
		if(isEmpty()) {
			primero=newNode;
			ultimo=newNode;
		}else {
			
			Nodo pointer = primero;
			//recorrer del nodo base  hasta encontrar un enlace vacio
			while(pointer.obtenerSiguiente() != null) {
				pointer = pointer.obtenerSiguiente();
			}
			pointer.enlazar(newNode);
			ultimo=newNode;
		}
		size++;
	}
	
	
	public Object poll() {
		Nodo frontToReturn = primero;
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
