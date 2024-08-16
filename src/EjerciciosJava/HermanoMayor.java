package EjerciciosJava;

import java.util.Scanner;

public class HermanoMayor {
	// TODO: Función que determina el nombre del hermano mayor
    public static String obtenerHermanoMayor(String nombre1, int edad1, String nombre2, int edad2, String nombre3, int edad3) {
        String hermanoMayor = nombre1;
        int mayorEdad = edad1;
        
        // Comparar con el segundo hermano
        if (edad2 > mayorEdad) {
            hermanoMayor = nombre2;
            mayorEdad = edad2;
        }
        
        // Comparar con el tercer hermano
        if (edad3 > mayorEdad) {
            hermanoMayor = nombre3;
            mayorEdad = edad3;
        }
        
        return hermanoMayor;
    }
    
	public static void main(String[] args) {
	// TODO: Leer los nombres y las edades, y mostrar el nombre del hermano mayor
        
        Scanner scanner = new Scanner(System.in);
        
        // Leer el nombre y la edad del primer hermano
        System.out.print("Ingrese el nombre del primer hermano: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Ingrese la edad del primer hermano: ");
        int edad1 = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea
        
        // Leer el nombre y la edad del segundo hermano
        System.out.print("Ingrese el nombre del segundo hermano: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Ingrese la edad del segundo hermano: ");
        int edad2 = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea
        
        // Leer el nombre y la edad del tercer hermano
        System.out.print("Ingrese el nombre del tercer hermano: ");
        String nombre3 = scanner.nextLine();
        System.out.print("Ingrese la edad del tercer hermano: ");
        int edad3 = scanner.nextInt();
        
        // Determinar el hermano mayor usando la función
        String hermanoMayor = obtenerHermanoMayor(nombre1, edad1, nombre2, edad2, nombre3, edad3);
        
        // Mostrar el resultado
        System.out.println("El hermano mayor es: " + hermanoMayor);
        
        scanner.close();

	}

}
