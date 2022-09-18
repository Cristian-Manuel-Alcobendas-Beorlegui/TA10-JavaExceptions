package Ejercicio1;

public class Numero {
	// Atributos de la clase
	private int numIntentos, numAleatorio;
	
	// --------------------------------------------------------------------------------------------------------------------- //

	// Contructores de la clase
	// Contructor por defecto
	public Numero() {
	}
	
	// --------------------------------------------------------------------------------------------------------------------- //
	
	// Métodos y funciones
	// Método 1: Generar un número aleatorio entre 1 y 500.
	public void generarNumAleatorio(int totalNumeros, int numEmpezar) {
		this.numAleatorio = (int)(Math.random() * totalNumeros + numEmpezar);
	}
	
	// --------------------------------------------------------------------------------------------------------------------- //
	
	// Getters y setters
	// Atributo 1: numIntentos
	public int getNumIntentos() {
		return numIntentos;
	}
	
	public void setNumIntentos(int numIntentos) {
		this.numIntentos = numIntentos;
	}
	
	// Atributo 2: numAleatorio
	public int getNumAleatorio() {
		return numAleatorio;
	}
	
	public void setNumAleatorio(int numAleatorio) {
		this.numAleatorio = numAleatorio;
	}
	
	// --------------------------------------------------------------------------------------------------------------------- //

	// Fin de la clase
}
