package simple_lista_enlazada;


public class Main {

	public static void main(String[] args) {
		/*
		Nodo miNodo1 = new Nodo(1);
		Nodo miNodo2 = new Nodo("Rojo");
		Nodo miNodo3 = new Nodo(true);

		miNodo1.enlazar(miNodo2);
		miNodo2.enlazar(miNodo3);
		
		System.out.print(miNodo1);
		*/
		
		ListaEnlazadaSimple lista =  new ListaEnlazadaSimple();
		lista.Add(1);
		lista.Add("rojo");
		lista.Add(3);
		
		
		lista.print();
		
		
	}

}
