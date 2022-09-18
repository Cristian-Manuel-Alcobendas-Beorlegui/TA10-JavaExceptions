package Ejercicio3;

public class MiExcepcion extends Exception {
	
	// Atributos de la clase
	private int codigoError;
	private static final long serialVersionUID =  1L; // Número de versión de la clase
	
	// --------------------------------------------------------------------------------------------------------------------- //
	
	// Constructores de la clase
	// Contructor por defecto
	public MiExcepcion() {
		super();
	}
	
	// Constructor con el parámetro "codigo de error"
	public MiExcepcion(int codigoError) {
		super();
		this.codigoError = codigoError;
	}
	
	// --------------------------------------------------------------------------------------------------------------------- //
	
	// Métodos y funciones
	// Método 1 (Heredado): getMessage
	@Override
	public String getMessage() {
		// Variables
		String mensaje = "";
		
		// SWITCH con los códigos de error
		switch(codigoError) {
			case 0: // Error 0: Número par
				mensaje = "EXCEPCIÓN 0: Número par";
				break;
				
			case 1: // Error 1: Número impar
				mensaje = "EXCEPCION 1: Número impar.";
				break;
		
			default:
				mensaje = "ERROR: Error general.";
		}
		
		// Devolver el mensaje
		return mensaje;
	}
	
	// --------------------------------------------------------------------------------------------------------------------- //
	
	// Fin de la clase
}
