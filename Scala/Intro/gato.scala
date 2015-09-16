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
			peso -= r.nextDouble() * 5
		}
	}

	def Comer() {
		if ((nVidas > 0) || (peso > 0.2) || (peso < 14)) {
			val r = scala.util.Random
			peso += r.nextDouble() * 5
		}
	}

	def cruzarCalle() {
		if ((nVidas > 0) || (peso > 0.2) || (peso < 14)) {
			val r = scala.util.Random
			if (r.nextInt(2) == 1)
				nVidas -= 1
		}
	}
}

object Main {
	def main(args:Array[String]) {
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
}

//http://ideone.com/GKMt3x