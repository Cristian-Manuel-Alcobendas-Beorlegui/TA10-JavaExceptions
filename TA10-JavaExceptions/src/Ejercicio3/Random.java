package Ejercicio3;

public class Random {
	// Atributos de la clase
	private int numAleatorio;
	
	// ----------------------------------------------- //
	
	// Constructor de la clase
	public Random() {
		numAleatorio = (int)(Math.random() * 1000);
	}
	
	// ----------------------------------------------- //
	
	// Getters
	// Atributo 1: numAleatorio
	public int getNumAleatorio() {
		return numAleatorio;
	}
	
	// ----------------------------------------------- //
	
	// Fin de la clase
}
