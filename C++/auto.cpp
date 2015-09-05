#include <iostream>
using namespace std;

void imprimirArreglo(auto);

int main(int argc, char const *argv[])
{
	int a1[5] = {1, 2, 3, 4, 5};
	double a2[5] = {1.0, 2.0, 3.0, 4.0, 5.0};
	char a3[5] = {'a', 'b', 'c', 'd', 'e'};
	imprimirArreglo(a1);
	imprimirArreglo(a2);
	imprimirArreglo(a3);
	return 0;
}

void imprimirArreglo(auto arreglo) {
	for (int index = 0; index < 5; index++)
		cout << "[" << arreglo[index] << "]";
	cout << endl;
}