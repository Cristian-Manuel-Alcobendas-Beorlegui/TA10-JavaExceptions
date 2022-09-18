package Ejercicio4;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.InputMismatchException;

public class Main {
	
	// Método 1: Mostrar menu
	public static void mostrarMenu(String[] menu) {
		// Variables
		int i;
		
		// Mostrar el menú
		for(i = 0; i < menu.length; i++) {
			System.out.println("   " + (i+1) + ". " + menu[i]);
		} // Fin FOR
		
		// Aplicar un salto de línea al final
		System.out.println();
	}
	
	// --------------------------------------------------------------------------------------- //
	public static void main(String[] args) {
		// 1. Declarar las variables
		int opcion = 0, num1, num2;
		String[] menu = {"Suma", "Resta", "Multiplicar", "Dividir", "Raiz cuadrada", "Raiz cúbica", "Potencia", "Salir"};
		Scanner sc = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.##");

		
		// 2. Mostrar por pantalla un menú
		System.out.println("OPERACIONES MATEMÁTICAS");
		System.out.println("----------------------------");
		
		// 3. Intentar ejecutar el código
		do {
			
			try {
				// Menú
				System.out.println("Menú: ");
				mostrarMenu(menu);
				System.out.print("Opción: ");
				opcion = sc.nextInt();
	
				// Mostrar el nombre de la opción por pantalla.
				System.out.println("\n" + opcion + ". " + menu[opcion-1]);		
				
				switch(opcion) {
					case 1, 2, 3, 4: // Suma - Resta - Multiplicar - Dividir
						// Pedir al usuario dos números
						// Primer número
						System.out.print("Introduce el primer número: ");
						num1 = sc.nextInt();
						// Segundo número
						System.out.print("Introduce el segundo número: ");
						num2 = sc.nextInt();
						
						// Calcular y mostrar el resultado segun el tipo de opción
						switch(opcion) {
							case 1: // Suma
								System.out.println("RESULTADO: " + num1 + " + " + num2 + " = " + (num1 + num2));
								break;
								
							case 2: // Resta
								System.out.println("RESULTADO: " + num1 + " - " + num2 + " = " + (num1 - num2));
								break;
							
							case 3: // Multiplicación
								System.out.println("RESULTADO: " + num1 + " * " + num2 + " = " + (num1 * num2));
								break;
								
							case 4: // División
								// Antes de calcular el resultado, comprobar que el divisor no es igual a 0.
								if(num2 > 0) {
									System.out.println("RESULTADO: " + num1 + " / " + num2 + " = " + decimal.format(((double)num1 / (double)num2)));	
								} else { // Si es igual a 0 se llamará a una excepción.
									throw new MiExcepcion(0);
								}
								
								break;
						} // Fin SWTICH
						break;
						
					case 5: // Raiz cuadrada
						// Pedir al usuario un número
						// Primer número
						System.out.print("Introduce el primer número: ");
						num1 = sc.nextInt();
						
						// Mostrar por pantalla el resultado.
						System.out.println("RESULTADO: La raiz cuadrada de " + num1 + " es igual a " + decimal.format(Math.sqrt(num1)));	
						break;
						
					case 6: // Raiz cúbica
						// Pedir al usuario un número
						// Primer número
						System.out.print("Introduce el primer número: ");
						num1 = sc.nextInt();
						
						// Mostrar por pantalla el resultado.
						System.out.println("RESULTADO: La raiz cuadrada de " + num1 + " es igual a " + decimal.format(Math.cbrt(num1)));
						break;
						
					case 7: // Poténcia
						// Pedir al usuario un número
						// Primer número
						System.out.print("Introduce el primer número: ");
						num1 = sc.nextInt();
						// Segundo número
						System.out.print("Introduce el exponente: ");
						num2 = sc.nextInt();
						
						// Motrar el resultado por pantalla
						System.out.println("RESULTADO: El resultado de elevar " + num1 + " a " + num2 + " es igual a " + decimal.format(Math.pow(num1, num2)));
						break;
						
					case 8: // Salir del programa
						System.out.println("Fin del programa.");
						break;
						
					default: // Opción por defecto
						System.out.println("ERROR: La opción introducida no existe.");
				} // Fin SWITCH
				System.out.println();
			}
			
			// Control de errores
			// ERROR 1: Control del tipo de dato
			catch(InputMismatchException i) {
				System.out.println("ERROR: Solo puedes introducir números.");
				sc.nextLine(); // Limpiar el buffer del teclado
				opcion = -1;
			}
			
			// ERROR 2: Error personalizado
			catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
		} while(opcion != 8);
		
		// 4. Cerrar la clase Scanner
		sc.close();
	}

}
