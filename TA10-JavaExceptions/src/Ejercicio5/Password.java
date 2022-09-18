package Ejercicio5;

public class Password {
	// Atributos de la clase
	private String contrasena;
	private int longitud;
	
	// Valores por defectp
	private final String vpdContrasena = "";
	private final int vpdLongitud = 5;

	// ---------------------------------------------- //
	
	// Constructores de la clase
	// Constructor por defecto
	public Password() {
		contrasena = vpdContrasena;
		longitud = vpdLongitud;
		generarPassword();
	}
	
	// Constructor con el parámetro "longitud"
	public Password(int longitud) {
		contrasena = vpdContrasena;
		this.longitud = longitud;
		generarPassword();
	}
	
	// --------------------------------------------------------------------------------------------------------------------- //
	
	// Métodos y funciones
	// Método 1: Comprobar si la contraeña es fuerte
	public boolean esFuerte() {
		// Variables
		int i, totalMayus = 0, totalMinus = 0, totalNums = 0;
		boolean fuerte = false;
		char[] contrasena;
		
		// Convertir la contraseña en un vector de char
		contrasena = this.contrasena.toCharArray();
		
		// Recorrer el vector y aberiguar si la contraseña es segura o no
		for(i = 0; i < contrasena.length; i++) {
			// Contar el número de mayúsculas
			if(contrasena[i] >= 65 && contrasena[i] <= 90) {
				totalMayus++;
			} else if(contrasena[i] >= 97 && contrasena[i] <= 122) { // Contar el número de minúsculas
				totalMinus++;
			} else if(contrasena[i] >= 48 && contrasena[i] <= 57) { // Contar los números
				totalNums++;
			} // Fin ELSE IF
		} // Fin FOR
		
		// Comprobar si la contraseña es fuerte
		if(totalMayus > 2 && totalMinus > 1 && totalNums > 5) {
			fuerte = true;
		}
		
		// Devolver el valror de "fuerte"
		return fuerte;
	}
	
	// Método 2: Generar una contraseña
	public void generarPassword() {
		// Variables
		int longitud, numAleatorio;
		char[] caracteres = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '$', '#', '&', '@', '?', '!'};
		
		// Generar la contraseña
		for(longitud = 0; longitud < this.longitud; longitud++) {
			// Generar un número aleatorio
			numAleatorio = (int)(Math.random() * caracteres.length);
			
			// Añadir el caracter a la contraseñea
			this.contrasena = this.contrasena + caracteres[numAleatorio];
		} // Fin FOR
	}
	
	// --------------------------------------------------------------------------------------------------------------------- //
	
	// Getters y setters
	// Atributo 1: Contraseña
	public String getContrasena() {
		return contrasena;
	}
	
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	// Atributo 2: Longitud
	public int getLongitud() {
		return longitud;
	}
	
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	// --------------------------------------------------------------------------------------------------------------------- //
	
	// Fin de la clase
}
