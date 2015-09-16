object Main {
	def main(args: Array[String]) {
	  var lista = List(2, 3, 4)
	  println(hacerPalindromo(lista))
	}
	
	def hacerPalindromo(l:List[Any]) : List[Any] = {
		return l ::: l.reverse
	}
}

//http://ideone.com/X8OK5i