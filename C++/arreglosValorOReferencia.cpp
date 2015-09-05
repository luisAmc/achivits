#include <iostream>
using namespace std;

void imprimirArreglo(int[]);
void cambiarValroes(int[]);

int main(int argc, char const *argv[])
{
	int[] arreglo = {0, 0, 0, 0, 0};
	imprimirArreglo(arreglo);
	cambiarValroes(arreglo);
	imprimirArreglo(arreglo)
	return 0;
}

void cambiarValroes(int[] arreglo) {
	arreglo[0] = 1;
	arreglo[1] = 2;
	arreglo[2] = 3;
	arreglo[3] = 4;
	arreglo[4] = 5;
}

void imprimirArreglo(int[] arreglo) {
	for (int index = 0; index < 5; index++)
		cout << "[" << arreglo[index] << "]";
	cout << endl;
}