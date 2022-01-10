#include <iostream>
#include <string>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
using namespace std;

float suma(float a, float b ){
	float resultado = a+b;
	return resultado;
}
void imprimirMenu(){
	cout << "Menu principal \n";
	cout << "1.- Suma \n";
	cout << "2.- Proceso2 \n";
	cout << "3.- Proceso3 \n";
	cout << "0.- Salir \n";
	cout << "Ingrese una opción: \n";
}


int main(int argc, char** argv) {
	int opcion_menu=0;
	bool esta_corriendo_programa = true;
	
	do{
		imprimirMenu();
		
		cin >> opcion_menu;
		switch(opcion_menu){
		 	case 1:
		 		cout << "Caso 1  \n";
		 		break;
		 	case 2:
		 		cout << "Caso 2  \n";
		 		break;
		 	case 3:
		 		cout << "Caso 3  \n";
		 		break;
		 	case 4:
		 		cout << "bye  \n";
		 		esta_corriendo_programa = false;
		 		break;
		 	default:
		 			cout << "No hay caso  \n";
		}
		
	
	}while(esta_corriendo_programa);
	
	
	return 0;
}


