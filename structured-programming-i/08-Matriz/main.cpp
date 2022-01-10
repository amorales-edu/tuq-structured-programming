#include <iostream>
#include <string>

using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	/**
	Una matriz es una estructura de datos similar al vector 
	pero de 2 dimenciones X y Y
	
		tipoDato nombreMatriz[filas][columnas];
	
	
	Matriz con Valores => 	
	['H']['O']
	['L']['A']
	
	Indices o Pos =>[Fila,Columna]	
         Col0 Col1
 Fila 0	[0,0][0,1]
 Fila 1	[1,0][1,1]
	
	
	
	Nota: le tamanio de una matriz será de tamaño fijo
	**/
	
	/**
 	string miMatriz[2][2]; //Matriz con 4 elementos
	miMatriz[0][0] = "0,0";
	miMatriz[0][1] = "0,1";
	miMatriz[1][0] = "1,0";
	miMatriz[1][1] = "1,1";
	*/
	
	/**
 	int edades[3][2] = {{1,2},{9,8},{14,21}};
    int filas = (sizeof(edades)/sizeof(edades[0]));
    int columnas = (sizeof(edades[0])/sizeof(edades[0][0]));
    for (int i = 0; i < filas; i++)
    {
        for (int j = 0; j < columnas; j++)
        {
            cout<<edades[i][j]<<endl;
        }
    }
	
	**/
	

    string Productos[5][2];
    cout << "Por favor ingrese productos: \n";
    string nombre ,precio;
    for(int i = 0; i < 5; i++)
    {
        cout << "\n******* Producto " << i + 1 << "********:\n";
        cout << "Nombre: ";
        getline(cin,nombre);
        cout << "Precio: ";
        getline(cin,precio);
        Productos[i][0] = nombre;
        Productos[i][1] = precio;
    }

    system("pause");
   
	

	
	

	return 0;
	
}
	
