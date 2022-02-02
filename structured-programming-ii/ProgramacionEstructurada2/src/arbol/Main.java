package arbol;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arbol  arbol = new Arbol();
		arbol.Add(10, "Red");
		arbol.Add(1, "Blue");
		arbol.Add(5, "Black");
		arbol.Add(6, "Green");
		arbol.Add(2, "Orange");
		arbol.Add(15, "Pink");
		arbol.Add(16, "Brown");
		
		int valueToFind = 5;
		Nodo value = arbol.find(valueToFind);
		System.out.println(value);
		arbol.print(OrderType.INORDER, arbol);
		
	}

}
