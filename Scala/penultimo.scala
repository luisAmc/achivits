object Main {
	def main(args: Array[String]) {
		var lista = List(1, 2, 3, 4, 5)
		println("La lista es: ")
		lista.foreach(println)
		println("El penultimo elemento es " + penultimo(lista))
	}

	def penultimo(l: List[Any]) : Any = {
		return l(l.length - 2)
	}
}