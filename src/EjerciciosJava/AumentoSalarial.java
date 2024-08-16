package EjerciciosJava;

import java.util.Scanner;

public class AumentoSalarial {
	 // TODO: Función que calcula el valor del aumento basado en el salario actual
    public static double calcularAumento(double salarioActual) {
        double porcentajeAumento;
        
        // Determinar el porcentaje de aumento según las condiciones dadas
        if (salarioActual <= 800000) {
            porcentajeAumento = 0.10;  // 10%
        } else if (salarioActual <= 1200000) {
            porcentajeAumento = 0.08;  // 8%
        } else {
            porcentajeAumento = 0.05;  // 5%
        }
        
        // Calcular el valor del aumento
        return salarioActual * porcentajeAumento;
    }
    
	public static void main(String[] args) {
	// TODO: Leer el salario actual, calcular el aumento y mostrar el nuevo salario
        
        Scanner scanner = new Scanner(System.in);
        
        // Leer el salario actual del empleado
        System.out.print("Ingrese el salario actual del empleado: ");
        double salarioActual = scanner.nextDouble();
        
        // Calcular el valor del aumento
        double aumento = calcularAumento(salarioActual);
        
        // Calcular el nuevo salario
        double nuevoSalario = salarioActual + aumento;
        
        // Mostrar el resultado
        System.out.printf("El aumento es: %.2f\n", aumento);
        System.out.printf("El nuevo salario es: %.2f\n", nuevoSalario);
        
        scanner.close();

	}

}
