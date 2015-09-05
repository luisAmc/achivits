object Main {
	def main(args: Array[String]) {
	 	var lista = Array("Sarah", "Ellie", "Mikasa") 
	 	imprimirLista(lista)
	}	

	def imprimirLista(lista:Array[String]) {
		for (nombre <- lista)
			print(nombre + " ")
		println()
	}


//http://ideone.com/pk9hp9