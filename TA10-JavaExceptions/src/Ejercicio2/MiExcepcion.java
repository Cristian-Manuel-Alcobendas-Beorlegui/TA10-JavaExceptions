package Ejercicio2;

public class MiExcepcion extends Exception {

	// Atributos de la clase
	private int codigoError;
	private static final long serialVersionUID = 1L; // Número de versión de la clase.
	
	// --------------------------------------------------------------------------------------------------------------------- //
	
	// Contructores de la clase
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
	
	// Métodos y funcions
	// Método 1 (Heredado): Getter para conseguir el código de error
	@Override
	public String getMessage() {
		// Variables
		String mensaje = "";
		
		// SWITCH con los códigos de error
		switch(codigoError) {
			case 0: // Error 0: Excepción de prueba
				mensaje = "ERROR " + codigoError + ": Excepción capturada con mensaje: Esto es un objeto Exception.";
				break;
				
			default:
				mensaje = "ERROR " + codigoError + ": Error general.";
		
		} // Fin SWITCH
		
		// Devolver el valor de "mensaje"
		return mensaje;
	}

	// --------------------------------------------------------------------------------------------------------------------- //
	
	// Fin de la clase

}
