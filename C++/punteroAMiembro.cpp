#include <iostream>
using namespace std;

class Test {
public:
	int valor;
	void print() {
		cout << "El valor es: " << valor << endl; 
	}
};

int main(int argc, char const *argv[])
{
	Test test;
	Test *testPointer = &test;
	
	int Test::*valor = &Test::valor;

	test.*valor = 10;
	test.print();

	testPointer->*valor = 20;
	testPointer->print();
	return 0;
}