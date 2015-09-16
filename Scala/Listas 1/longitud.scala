object Main {
	def main(args: Array[String]) {
		var lista = List(1, 2, 3, 4, 5)
		println("La lista es: ")
		lista.foreach(println)
		println("La longitud de la lista es " + longitud(lista))
	}

	def longitud(l: List[Any]) : Int = {
		return l.length
	}
}

//http://ideone.com/mFnmMk