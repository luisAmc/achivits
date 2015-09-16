object Main {
	def main(args: Array[String]) {
		var lista = List(1, 2, 3, 4, 5).map(x => x.toDouble)
		println("La lista es: ")
		lista.foreach(println)
		println("El promedio de la lista es " + promedio(lista))
	}

	def promedio(l: List[Double]) : Double = {
		var retVal:Double = l.sum / l.length
		return retVal
	}
}

//http://ideone.com/xQkJEk