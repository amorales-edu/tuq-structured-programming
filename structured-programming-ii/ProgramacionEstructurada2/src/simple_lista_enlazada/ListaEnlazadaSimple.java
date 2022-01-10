package simple_lista_enlazada;

public class ListaEnlazadaSimple {
	 Nodo cabeza;
	 Nodo cola;
	 int size = 0;
	 public ListaEnlazadaSimple() {
		 cabeza=null;
		 cola= null;
	 }
	 public boolean IsEmpty() {
		 return cabeza == null;
	 }
	 
	 public void Add(Object value) {
		 Nodo nuevoNodo = new Nodo(value);
		 if(IsEmpty()) {
			 cabeza = nuevoNodo;
			 cola = nuevoNodo;
		 }else {
			 cola.enlazar(nuevoNodo);
			 cola = nuevoNodo;
		 }
		 size++; 
	 }
	 
	 public void print() {
		 Nodo puntero = cabeza;
		 while( puntero !=null) {
			 System.out.print("["+puntero.obtenerNodo()+"] ");
			 puntero = puntero.obtenerSiguiente();
		 }
	 }
	 
	 public int size() {
		 return size;
	 }
	 
}
