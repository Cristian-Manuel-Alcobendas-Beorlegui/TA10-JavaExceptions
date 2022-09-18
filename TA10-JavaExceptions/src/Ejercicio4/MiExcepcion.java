package Ejercicio4;

public class MiExcepcion extends Exception {
	// Atributos de la clase
	private int codigoError;
	private static final long serialVersionUID = 1L;
	
	// --------------------------------------------------------------------------------------------------------------------- //
	
	// Constructores de la clase
	// Constructor por defecto
	public MiExcepcion() {
		super();
	}
	
	// Constructor con el código de error
	public MiExcepcion(int codigoError) {
		super();
		this.codigoError = codigoError;
	}
	
	// --------------------------------------------------------------------------------------------------------------------- //
	
	// Métodos y funciones
	// Método 1 (Heredado): getMessage
	@Override
	public String getMessage() {
		// Variable
		String mensaje = "";
		
		// Switch con los códigos de error
		switch(codigoError) {
			case 0: // Error 0: El divisor es 0
				mensaje = "ERROR " + codigoError + ": El divisor no puede ser 0"; 
				break;
			
			default:
				System.out.println("ERROR: Error general.");
		}
		
		// Devolver el valor de "mensaje"
		return mensaje;
	}
	
	// --------------------------------------------------------------------------------------------------------------------- //
	
	// Fin de la clase
}
