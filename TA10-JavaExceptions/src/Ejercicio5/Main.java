package Ejercicio5;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		// 1. Declarar las varaibles
		int numPos = 0, longitud = 0, i;
		Password[] passwds;
		boolean[] passwdSeguro;
		Scanner sc = new Scanner(System.in);
		
		// 2. Pedir al usuario el número de posiciones que tendrá el vector y la longitud de las contraseñas,
		System.out.println("CONTRASEÑAS");
		System.out.println("-----------------");
		
		// Intentar ejecutar el código
		try {
			System.out.print("Introduce el número de posiciones que tendrá el vector: ");
			numPos = sc.nextInt();
			System.out.print("Introduce la longitud de las contraseñas: ");
			longitud = sc.nextInt();
			System.out.println();
			
			// 3. Crear el vector con el número de posiciones indicado por el usuario
			passwds = new Password[numPos];
			passwdSeguro = new boolean[numPos];
			
			// 4. Bucle FOR que crea un objeto de la clase "Password" para cada posición del vector
			for(i = 0; i < passwds.length; i++) {
				passwds[i] = new Password(longitud);
				passwdSeguro[i] = passwds[i].esFuerte();
			} // Fin FOR
			
			// 5. Mostrar por pantalla los resultados
			for(i = 0; i < passwds.length; i++) {
				System.out.println(passwds[i].getContrasena() + " |||| " + passwdSeguro[i]);
			} // Fin FOR
			
			// 6. Cerrar la clase Scanner
			sc.close();
		} // Fin TRY
		
		// Control de errores
		// Error que tiene en cuenta el tipo de dato que se especifica.
		catch(InputMismatchException e) {
			System.out.println("ERROR: Solo números enteros.");
		}
		
		
	}
}
