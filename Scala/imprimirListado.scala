class Gato(v:Int, p:Double, n:String) {
	var nVidas:Int = v
	var peso:Double = p
	var nombre:String = n

	def Imprimir() {
		println(nombre + ", pesa " + peso + " y tiene " + nVidas + " vidas")
	}

	def Miau() {
		if ((nVidas > 0) || (peso > 0.2) || (peso < 14)) 
			println(nombre + " dice: miau!")
	}

	def Correr() {
		if ((nVidas > 0) || (peso > 0.2) || (peso < 14)) {
			val r = scala.util.Random
			peso -= r.next(5)
		}
	}

	def Comer() {
		if ((nVidas > 0) || (peso > 0.2) || (peso < 14)) {
			val r = scala.util.Random
			peso += r.next(5)
		}
	}

	def cruzarCalle() {
		if ((nVidas > 0) || (peso > 0.2) || (peso < 14)) {
			val r = scala.util.Random
			if (r.nextInt == 1)
				nVidas -= 1
		}
	}
}

object Main {
	def main(args: Array[String]) {
	 	var lista = Array("Sarah", "Ellie", "Mikasa") 
	 	imprimirLista(lista)

	 	var a:Int = 10;
	 	var b:Int = 20;
	 	println("El numero mayor entre " + a + " y " +  b + " es: " + calcularMayor(a, b))

	 	val gato = new Gato(9, 12.3, "Jinjo")
	 	gato.Imprimir()
	 	gato.Miau()
	 	gato.Correr()
	 	gato.Imprimir()
	 	gato.Comer()
	 	gato.Imprimir()
	 	gato.cruzarCalle()
	 	gato.Imprimir()
	}	

	def imprimirLista(lista:Array[String]) {
		for (nombre <- lista)
			print(nombre + " ")
		println()
	}

	def calcularMayor(a:Int, b:Int) : Int = {
		if (a > b)
			return a
		else
			return b
	}
}