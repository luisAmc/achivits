#include <iostream>
using namespace std;

class Test {
	int valor;
public:
	Test(int v) {
		valor = v;
	}

	void print() {
		cout << "El valor es: " << valor << endl;
	}
};

int main(int argc, char const *argv[])
{
	int *buffer = new int[sizeof(Test)];
	Test *test = new (buffer) Test(10);
	test->print();
	return 0;
}