using System;

public class Test
{
	public static void Main()
	{
		Fraccion a = new Fraccion(1,2);	
		Fraccion b = new Fraccion(5,8);
		Console.WriteLine(a*b);
	}
}

public class Fraccion {
	private double num;
	private double denom;
	
	public Fraccion(double n, double d) {
		num = n;
		denom = d;
	} 

	public double Numerador {
		get {
			return num;
		}
		set {
			num = value;
		}
	}
	
	public double Denominador {
		get {
			return denom;
		}
		set {
			denom = value;
		}
	}
	
	public static Fraccion operator * (Fraccion a, Fraccion b) {
		return new Fraccion((a.Numerador * b.Numerador), (a.Denominador * b.Denominador));
	}

	public override string ToString() {
		return "[" + num + "/" + denom + "]";
	}
}