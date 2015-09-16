object Main {
	def main(args: Array[String]) {
		var a:Int = 2
		var b:Int = 5
	  	println("El mayor numero entre " + a + " y " + b + " es: " + mayorNumero(a, b))
	}
	
	def mayorNumero(a:Int, b:Int) : Int = {
		if (a > b)
			return a
		return b
	}
}

//http://ideone.com/iqJHBy