#include <iostream>
#include <string>
#include <vector>
using namespace std;

class Alumno {
	string correo;
public:
	Alumno(string correo) {
		this->correo = correo;
	}		

	string getCorreo() {
		return correo;
	}
};

int main(int argc, char const *argv[])
{
	vector<Alumno> alumnos;
	Alumno alumno1("alumno1@unitec.edu");
	Alumno alumno2("alumno2@unitec.edu");
	Alumno alumno3("alumno3@unitec.edu");
	alumnos.push_back(alumno1);
	alumnos.push_back(alumno2);
	alumnos.push_back(alumno3);

	for (auto alumno : alumnos)
		cout << alumno.getCorreo() << endl;

	return 0;
}