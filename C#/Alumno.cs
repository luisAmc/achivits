using System;

public class Alumno
{
	private string nombre;
	private int cuenta;
	private string email;
	private int edad;
	
	public string Nombre {
		get {
			return (nombre != null) ? nombre : "desconocido";
		}
		set {
			nombre = value;
		}
	}	
	
	public int Cuenta {
		get {
			return (cuenta != null) ? cuenta : 0;
		}
		set {
			if (value.ToString().Length == 8)
				cuenta = value;
			else
				cuenta = 0;
		}
	}
	
	public string Email {
		get {
			return (email != null) ? email : "desconocido";
		}
		set {
			Regex regex = new Regex(@"[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})");
			Match match = regex.Match(value);
			if (match.Success)
				email = value;
			else 
				email = "Email_Incorrecto";
		}
	}
	
	public int Edad {
		get {
			return (edad != null) ? edad : 0;
		}
		set {
			if (value > 0)
				edad = value;
			else
				edad = 0;
		}	
	}

	public override string ToString() {
		return "Nombre: " + nombre + ", Cuenta: " + cuenta + ", Edad: " + edad + ", Email: " + email;
	}
}

public class Test
{
	public static void Main()
	{
		Alumno alumno1 = new Alumno();
		alumno1.Nombre = "Luis";
		alumno1.Cuenta = 11211008;
		alumno1.Email = "luis_amc@unitec.edu";
		alumno1.Edad = 20;
		Console.WriteLine(alumno1);
	}
}