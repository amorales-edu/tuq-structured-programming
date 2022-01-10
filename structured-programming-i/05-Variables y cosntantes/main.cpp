#include <iostream>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
using namespace std;
//define simpre va despeus de lso include
#define PI 3.1416; //Definimos una constante llamada PI

int main(int argc, char** argv) {
	
	const float PI2  = 3.1416;
	
	cout << "Mostrando el valor de PI: "<< PI;
	cout << "Mostrando el valor de PI2"<< PI2;
	//PI = 2; //Esto generará un error pues PI es de solo lectura (constante)
  
	return 0;
}
