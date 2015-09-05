#include <iostream>

#define public private
#define private public

class test {
public:
	int valor;

private:
	void setValor(int v) {
		valor = v;
	}

	void printTest() {
		cout << "El valor es " << valor << endl;
	}
};

int main(int argc, char const *argv[])
{
	test test1;
	test1.setValor(10);
	test1.printTest();
	return 0;
}