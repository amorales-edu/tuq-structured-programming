#include <iostream>
#include <string>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	
	/*
		Un puntero es solo uan simple variabel que almacena una dir de memoria
		Declaración (apuntador o puntero)
		
			tipo_dato *nombre de apuntador;
			
		Tipo_dato : Especifica el tipo de apuntado (int, float, char, etc).
		Nombre de apuntador: Es el identificador (nombre asignado)
		del apuntador.
		
		El operador & sirve para obtener la direccion de memoria
		
		Ejemplos de declaraci?n:
			int *ptr, cont;
			float *res;
			short *bandera;
			char *mensaje;
		
	*/
	
	int *pointer_var;
	int var= 1;
	
	pointer_var = &var;
	//Obtener el valor 
	printf("Acceso directo, var= %d \n",var);
	printf("Acceso indirecto, var= %d \n", *pointer_var);
	//Obtener la direccion o ref
	printf("La dirección de var= %d \n", &var);
	printf("La dirección de var= %d \n", pointer_var);
	
	
	//---------------------------------------
	int a=1,b=2,*p;
	printf("La dirección de a= %d  y b= %d\n",&a,&b);
	p = &a; //p apunta a la variable a
	printf("p = &a | a= %d \n",a);
	b = *p; //ahora b es igual a 1
	printf("b = *p  | b= %d \n",b);
	*p = 0; //ahora el valor de  a es igual a 0
	printf("*p = 0 | p= %d \n",*p);
	
	
	/** uso de heap y stack 
	
	https://pythontutor.com/
	***/
	/**
	  int o,a,b;
	  o = 20;
	  cout << sizeof(o)<< endl;
	  cout << sizeof(&o)<< endl;
	  
	  int* n= new int;
	  *n = 18;
	  cout << sizeof(*n)<< endl;
	  cout << sizeof(n)<< endl;
	  a=1;
	  b=3;
	  o = suma(a,b);
		
	**/

	return 0;
}
