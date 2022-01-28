package arbol;

public class Nodo {
	Object item; 
	int index;
	Nodo right;
	Nodo left;
	public Nodo(int index, Object value){
		this.index = index;
		this.item = value;
		this.right = null;
		this.left = null;
	}
	public void enlazarIzq(Nodo nuevoNodo) {
		left = nuevoNodo;
	}
	public Nodo obtenerIzq() {
		return left;
	}
	public void enlazarDer(Nodo nuevoNodo) {
		right = nuevoNodo;
	}
	public Nodo obtenerDer() {
		return right;
	}
	public Object obtenerValor() {
		return item;
	}
	@Override
	public String toString() {
		return "Node: " + index + " | Value: "+ item ;
	}
}
