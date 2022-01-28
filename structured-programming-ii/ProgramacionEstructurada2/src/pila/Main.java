package pila;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object[] input= new Object[]{"hola", "mundo", "esto", "es", "mi primer", "pila"};
		
		Pila portapapeles = new Pila();
		System.out.println("Llenando pila");
		for(Object obj: input) {
			portapapeles.push(obj);
		}
		System.out.println(portapapeles);
		System.out.println("Obteniendo Top peek");
		Object obtenerTop = portapapeles.peek();
		Object obtenerTop1 = portapapeles.peek();
		System.out.println(obtenerTop);
		System.out.println("vaciar pila pop");
		for(Object obj: input) {
			System.out.println(portapapeles.pop());
		}
		System.out.println(portapapeles);
		
	}

}
