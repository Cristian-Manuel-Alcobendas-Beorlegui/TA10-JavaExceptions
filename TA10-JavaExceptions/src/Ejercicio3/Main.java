package Ejercicio3;

public class Main {

	public static void main(String[] args) {
		// 1. Crear un objeto
		Random random;
		
		// 2. Intentar ejecutar el código
		try {
			// Mostrar por pantalla el número generado
			System.out.println("Generando número aleatorio...");
			random = new Random();
			System.out.println("El número generado ha sido: " + random.getNumAleatorio());
			
			// Comprobar si el número es par o impar, o 1 o 0.
			if(random.getNumAleatorio() == 0) { // 0 = Par
				throw new MiExcepcion(0);
			} else if(random.getNumAleatorio() == 1) { // 1 = Impar
				throw new MiExcepcion(1);
			} else if(random.getNumAleatorio()%2 == 0) { // Si el residuo es 0, el número es par.
				throw new MiExcepcion(0);
			} else { // Si el residuo no es 0, el número es impar.
				throw new MiExcepcion(1);
			} // Fin ELSE
			
		}
		
		// Control de errores
		catch(Exception ex) {
			System.out.println(ex.getMessage()); // Mostrar la excepción por pantalla.
		}
		
		// Finally, siempre se ejecutará
		finally {
			System.out.println("Fin del programa.");
		}

		// ----------------------------------------------- //
		
	}

}
