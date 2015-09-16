object Main {
	def main(args: Array[String]) {
	  var lista = List(9, 2, 5, 4, 12, 7, 8, 11, 9, 3, 7, 4, 12, 5, 4, 10, 9, 6, 9, 4).map(x => x.toDouble)
	  println(desviacionEstandar(lista))
	}

	def desviacionEstandar(l:List[Double]) : Double = {
		var promedio:Double = l.sum / l.length
		var sumatoria:Double = l.map(x => (x - promedio) * (x - promedio)).sum
		var retVal = Math.sqrt(sumatoria / l.length)
		return retVal
	}
}

//http://ideone.com/FBubpb