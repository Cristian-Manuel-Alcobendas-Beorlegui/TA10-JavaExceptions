package Ejercicio2;

public class Main {

	public static void main(String[] args) {
		// 1. Intentar ejecutar el código
		try {
			// Mostrar un mensaje por pantalla
			System.out.println("Mensaje mostrado por pantalla:");
			
			// Lanzar un error de código 0, error de prueba
			throw new MiExcepcion(0);
		}
		
		// Control de errores
		catch(Exception ex) {
			// Mostrar por pantalla el error
			System.out.println(ex.getMessage());
		}
		
		
		
		// Finally, se ejecutará tanto si el TRY funciona como si falla.
		finally {
			System.out.println("Fin del programa.");
		}

		// ----------------------------------------------------------------------- //
	}
}
