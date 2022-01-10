#include <iostream>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

using namespace std;
int main(int argc, char** argv) {
	/*Palabras reservadas
	auto	const	double	float
	int	short	struct	unsigned
	break	continue	else	for
	long	signed	switch	void
	case	default	enum	goto
	register	sizeof	typedef	volatile
	char	do	extern	if
	return	static	union	while
	*/
	
	/**Tipos de datos primitivos
	*bool: 8 bits, rango 0 y 1
	*int:32 bits, rango  -2.147.483.648 y 2.147.483.647.
	**Modificadores int:
		-short int: 16 bits,rango -32.768 y 32.767.
		-unsigned short int:  16 bits, rango 0 y 65535.
		-unsigned int: 32 bits,rango 0 y 4.294.967.295.
		-long long int: 64 bits, rango -9.223.372.775.808 y 9.223.375.775.807.
		-unsigned long long int:  64 bits, rango  0 y 2exp64.
	*float: 32 bits, rango 1,17549*(e^-38) hasta 3,40282*(e^+38)
	*double:  64 bits, rango 2,22507*(e^-308) hasta 1,79769*(e^308)
	**long double: 96 bits (precisión  18 cifras), rango  3,3621*(e^-4932) hasta 1,18973*(e^4932).
	*char: variable tipo vector nombre_char[tamañoMax];  o char nombre = 'valor' 
	*/
	
	char x = 'a'; // Declaramos y asignamos en la misma línea

    int num; //Declaramos el entero en una línea
    num = 5; //Le asignamos un valor en otra línea

    int num2 = 8; //Asignacion y declaracion al tiempo

    float numero; //Un numero decimal
    numero = 3.5; //Le asignamos un valor al decimal

    float res = numero + num2; //Sumamos dos variables y las asignamos a res
    //3.5 + 8 = 11.5

    res = res + num; //Al valor actual de res le sumamos el valor de num
    //11.5 + 5 = 16.5

    bool valor = false; //Variable booleana
    valor = true; // Pueden ser true o false

    res = res*2; //Duplicamos el valor de res 16.5*2 = 33

    cout << res << endl; //Mostramos el valor de res por pantalla

	return 0;
}
