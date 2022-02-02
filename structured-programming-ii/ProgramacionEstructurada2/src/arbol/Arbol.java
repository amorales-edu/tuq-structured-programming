package arbol;

public class Arbol {
	Nodo raiz;
	public Arbol() {
		raiz = null;
	}
	public boolean IsEmpty() {
		return raiz== null;
	}
	
	public void Add(int index,Object value) {
		Nodo NodoToAdd =  new Nodo(index,value);
		if(IsEmpty()) {
			this.raiz = NodoToAdd;
		}else {
			
			 Nodo parentNodo = null;
			 Nodo pointerNodo =  this.raiz;
			 //recorrer el arbol hasta encontrar un nodo libre
			 while( pointerNodo != null) {
				 parentNodo = pointerNodo ;
				 boolean  IsLeft = index <= pointerNodo.index;
				 pointerNodo = IsLeft ? pointerNodo.obtenerIzq(): pointerNodo.obtenerDer();
			 }
			 //enlazar valor

			 if(index < parentNodo.index) {
				 parentNodo.enlazarIzq(NodoToAdd);
			 }else {
				 parentNodo.enlazarDer(NodoToAdd);
			 }
			
		}
	}
	
	public Nodo find(int indexToFind) {
		 Nodo pointerNodo =  this.raiz;
		 //recorrer el arbol hasta encontrar un nodo libre
		 while( pointerNodo != null) {
			 if(indexToFind == pointerNodo.index) {
				 return pointerNodo;
			 }else {
				 boolean  IsLeft = indexToFind <= pointerNodo.index;
				 pointerNodo =  IsLeft ? pointerNodo.obtenerIzq(): pointerNodo.obtenerDer();
			 }
		 }
		 return null;
	}
	private void printInOrder(Nodo raiz){
		if(raiz != null) {
			//S-I
			printInOrder(raiz.obtenerIzq());
			//R
			System.out.print(raiz);
			//S-D
			printInOrder(raiz.obtenerDer());
			
		}
	}
	
	public void print(OrderType type, Arbol tree) {
		
		switch(type) {
			case INORDER:
				printInOrder(tree.raiz);
				break;
		}
	}
}
