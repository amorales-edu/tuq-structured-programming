#include "iostream"
#include "string"

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
using namespace std;
//http://www.cplusplus.com/reference/iostream/cout/

int main(int argc, char** argv) {
	//Escribir 
	cout << "Menu principal" << "\n" << "Por favor ingrese su nombre:" << "\n";
    string nombre;//Definir nombre
   	cin >> nombre; //Leer nombre 
   	//Nota getline(cin, nombre); captura todo el stream hasta detectar un /r/n
	char pswrd[20];
    
    int i=0;
    while((pswrd[i]=cin.get())!='\r')
    {
	    cout<<"*";
	    i++;
    }
   	//Escribir 
   	cout << "Bienvenido al sistema " << nombre  << "\n";

	return 0;
}
