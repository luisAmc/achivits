object Main	{
	def main(args:Array[String]) {
		var lista = Array(10, 2, 32, 14, 5)
		println("El menor elemento de " + imprimirArreglo(lista) + " es: " + menorElemento(lista))
	}

	def menorElemento(lista:Array[Int]) : Int = {
		var menor = lista(0)
		for (index <- 0 to (lista.length - 1))
			if (menor > lista(index))
				menor = lista(index)

		return menor
	}

	def imprimirArreglo(lista:Array[Int]) : String = {
		var retVal:String = ""
		for (elemento <- lista)
			retVal += "[" + elemento + "]"

		return retVal
	}
}

//http://ideone.com/Yc2irF