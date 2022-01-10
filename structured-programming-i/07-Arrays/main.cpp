#include <iostream>
#include <string>

using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	/**
	Un arreglo o vector es un tipo de dato estrucutura qu epermite agrupar 
	una serie de datos acorde a su definición
	
		tipo_de_dato nombre_del_vector[tamanio];
	
	
	Valores => 	['H']['O']['L']['A']
	Indices o Pos =>	[0][1][2][3]
	
	Nota: le tamanioo de un arreglo simpre será de tamaño fijo
	**/
	
	int edades[] = {1,2,9,8,16,32,9,50,36,20,1,87};
	int limite = (sizeof(edades)/sizeof(edades[0]));
	
	for (int i = 0; i < limite; i++)
    {
            cout<<"indice:"<<i<<" valor:"<<edades[i]<<endl;
    }
    
    
    
    int miArray[4];
    
    miArray[0] = 1;
    miArray[1] = 5;
    miArray[2] = 10;
    miArray[3] = 15;
    
    int sizeArray = sizeof(miArray);
    int sizeFistElement = sizeof(miArray[0]);
	
		/**
 	string nombres[5];
    string precios[5];
    cout << "Por favor ingrese datos del producto: \n";
    for(int i = 0; i < 5; i++)
    {
        cout << "\n******* Productos " << i + 1 << "********:\n";
        cout << "Nombre: ";
        //cin >> titulos[i]; //No funciona con espacios
        getline(cin, nombres[i]);
        
        cout << "Precio: ";
        //cin >> autores[i]; //No funciona con espacios
        getline(cin, precios[i]);
    }
	**/
	
	
	/**
	int edades[] = {1,2,9,8,16,32,9,50,36,20,1,87};
    cout<<sizeof(edades)<<endl;
    cout<<sizeof(edades[0])<<endl;
    
	int limite = (sizeof(edades)/sizeof(edades[0]));
    for (int i = 0; i < limite; i++)
    {
            cout<<edades[i]<<endl;
    }
    **/
	

	
	

	return 0;
	
}
