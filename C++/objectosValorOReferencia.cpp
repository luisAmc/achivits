#include <iostream>
using namespace std;

class Test {
	int valor = 0;

public:
	void setValor(int v) {
		valor = v;
	}
	void printTest() {
		cout << "El valor es: " << valor << endl;
	}
};

void cambiarValor(Test);

int main(int argc, char const *argv[])
{
	Test test;
	test.printTest();
	cambiarValor(test);
	test.printTest();
	return 0;
}

void cambiarValor(Test test) {
	test.setValor(10);
}