package EjerciciosJava;

import java.util.Scanner;

public class CoronaCircular {
	// TODO: Implementar la función que calcula el área de un círculo
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);  // Área = π * r^2
    }
    
    // TODO: Implementar la función que calcula el área de la corona circular
    public static double calcularAreaCoronaCircular(double radioGrande, double radioPequeno) {
        // Área de la corona circular es la diferencia entre las áreas de los dos círculos
        double areaCirculoGrande = calcularAreaCirculo(radioGrande);
        double areaCirculoPequeno = calcularAreaCirculo(radioPequeno);
        return areaCirculoGrande - areaCirculoPequeno;
    }
	public static void main(String[] args) {
	// TODO: Usar las funciones para calcular y mostrar el área de la corona circular
        
        Scanner scanner = new Scanner(System.in);
        
        // Leer los radios de los dos círculos
        System.out.print("Ingrese el radio grande (R): ");
        double radioGrande = scanner.nextDouble();
        
        System.out.print("Ingrese el radio pequeño (r): ");
        double radioPequeno = scanner.nextDouble();
        
        // Calcular el área de la corona circular
        double areaCoronaCircular = calcularAreaCoronaCircular(radioGrande, radioPequeno);
        
        // Mostrar el resultado
        System.out.printf("El área de la corona circular es: %.2f\n", areaCoronaCircular);
        
        scanner.close();

	}

}
