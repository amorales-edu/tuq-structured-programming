package cola;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] clientesEnEspera = new Object[]{"Cliente1", "Cliente2", "Cliente3"};
		
		Cola filaDeClientes  = new Cola();

		System.out.println("Formación clientes");
		for(Object cliente: clientesEnEspera) {
			System.out.println(cliente);
			filaDeClientes.add(cliente);
		}
		
		System.out.println(filaDeClientes);
		System.out.println("Siguiente o en turno");
		System.out.println(filaDeClientes.peek());
		System.out.println("Atendiendo");
		
			System.out.println(filaDeClientes.poll());
			System.out.println(filaDeClientes);
			System.out.println(filaDeClientes.poll());
			System.out.println(filaDeClientes);
			System.out.println(filaDeClientes.poll());
			System.out.println(filaDeClientes);
			System.out.println(filaDeClientes.poll());
		System.out.println(filaDeClientes);
	}
	
	

}
