package edu.tuq.lab.practice01.helpers.stack.generic;

import java.util.Iterator;
import java.util.Vector;

public class Stack<T>  implements Iterable<T>{
	int size;
	Node<T> primero;
	Node<T> ultimo;
	public Stack() {
		this.size = 0;
		this.primero=null;
		this.ultimo=null;
	}
	public boolean isEmpty() {
		return primero ==null;
	}
	public void add(T value) {
		Node<T> newNode = new Node<T>(value);
		if(isEmpty()) {
			primero=newNode;
			ultimo=newNode;
		}else {
			
			Node<T> pointer = primero;
			//recorrer del Node base  hasta encontrar un enlace vacio
			while(pointer.obtenerSiguiente() != null) {
				pointer = pointer.obtenerSiguiente();
			}
			pointer.enlazar(newNode);
			ultimo=newNode;
		}
		size++;
	}
	
	
	public T poll() {
		Node<T> frontToReturn = this.primero;
		if(!isEmpty()){
			primero = primero.obtenerSiguiente();
			size--;
		}
		return frontToReturn == null ? null:frontToReturn.obtenerNodo();
		
	}
	public T peek() {
		return primero.obtenerNodo();
	}
	public int size() {
		return size;
	}
	
	public Iterator<T>iterator(){	return new StackIterator();	}
	
	private class StackIterator implements Iterator<T>
	{
		private Node<T> current = primero;
		public boolean hasNext() {	return current != null;	}
		public void remove() {}
		public T next()
		{
			T item = current.obtenerNodo();
			current = current.obtenerSiguiente();
			return item;
		}
	}
	
	@Override
	public String toString() {
		return "Cola [size=" + size + "]";
	}
	
}
