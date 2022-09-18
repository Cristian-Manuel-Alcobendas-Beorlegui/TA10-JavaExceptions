package Ejercicio1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1. Declarar el objeto
		int numUsuario;
		boolean adivinado = false;
		Numero num = new Numero();
		Scanner sc = new Scanner(System.in);	
		
		// 2. Generar el número aleatorio
		num.generarNumAleatorio(500, 1);
		
		// 3. Bucle FOR que pedirá al usuario un número hasta que lo adivine.
		System.out.println("¡¡INTENTA ADIVINAR EL NÚMERO!!");
		for(num.setNumIntentos(0); !adivinado; num.setNumIntentos(num.getNumIntentos()+1)) {
			
			// Intentar ejecutar el código
			try {
				// Pedir al usuario un número
				System.out.print("Introduce un número: ");
				numUsuario = sc.nextInt();
				
				// Comprobar si el número del usuario es igual al número aleatorio
				if(numUsuario == num.getNumAleatorio()) {
					System.out.println("ENHORABUENA: ¡¡Has encontrado el número!!\n");
					adivinado = true;
				} else if(numUsuario > num.getNumAleatorio()) {
					System.out.println("PISTA: El número que buscas es más pequeño.\n");
				} else {
					System.out.println("PISTA: El número que buscas es mayor.\n");
				} // Fin ELSE
			} 
			
			// Control de errores, excepciones
			// Catch 1: Controlar el tipo de dato que introduce el usuario
			catch(InputMismatchException i) {
				System.out.println("ERROR: Solo números, no se puede introducir ni letras ni caracteres especiales.\n");
				// Limpiar el buffer del teclado
				sc.nextLine();
			}
			
		} // Fin FOR
		
		// 4. Mostrar por pantalla el número de intentos
		System.out.println("Número de intentos: " + num.getNumIntentos());
		
		// 5. Cerrar la clase Scanner
		sc.close();
	
		// --------------------------------------------------------------------------------------------------------------------- //
		
	}
}
