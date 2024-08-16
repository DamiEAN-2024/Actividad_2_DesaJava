package EjerciciosJava;

import java.util.Scanner;

public class NumeroMayor {
	 // TODO: Implementar la función que recibe dos números y retorna el mayor
    public static int obtenerMayor(int num1, int num2) {
        // Usar una instrucción condicional if para determinar el mayor
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    
	public static void main(String[] args) {
	// TODO: Leer dos números y usar la función para imprimir el mayor número
        
        Scanner scanner = new Scanner(System.in);
        
        // Leer los dos números enteros
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        
        // Obtener el mayor número usando la función
        int mayor = obtenerMayor(num1, num2);
        
        // Imprimir el mayor número
        System.out.printf("El mayor de los dos números es: %d\n", mayor);
        
        scanner.close();

	}

}
