#include <iostream>
using namespace std;

void retornador(int&, int&, int&);

int main(int argc, char const *argv[])
{
	int uno = 0;
	int dos = 0;
	int tres = 0;

	cout << "1:" << uno << ", 2:" << dos << ", 3:" << tres << endl;
	
	retornador(uno, dos, tres);
	
	cout << "1:" << uno << ", 2:" << dos << ", 3:" << tres << endl;
	
	return 0;
}

void retornador(int &primer, int &segundo, int &tercer) {
	primer = 1;
	segundo = 2;
	tercer = 3;
}