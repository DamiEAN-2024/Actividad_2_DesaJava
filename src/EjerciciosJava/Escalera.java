package EjerciciosJava;

import java.util.Scanner;

public class Escalera {

	 // TODO: Implementar la función que calcula la longitud de la escalera
    public static double calcularLongitudEscalera(double altura, double anguloGrados) {
        // Convertir el ángulo de grados a radianes
        double anguloRadianes = Math.toRadians(anguloGrados);
        
        // Calcular la longitud de la escalera usando la fórmula
        double longitudEscalera = altura / Math.cos(anguloRadianes);
        
        return longitudEscalera;
    }
    
	public static void main(String[] args) {
	// TODO: Usar la función en el método main con entrada del usuario
        
        // Leer la altura y el ángulo desde la consola
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la altura (x) de la escalera: ");
        double altura = scanner.nextDouble();
        
        System.out.print("Ingrese el ángulo (α) en grados: ");
        double anguloGrados = scanner.nextDouble();
        
        // Calcular la longitud de la escalera
        double longitudEscalera = calcularLongitudEscalera(altura, anguloGrados);
        
        // Mostrar el resultado
        System.out.printf("La longitud de la escalera es: %.2f\n", longitudEscalera);
        
        scanner.close();

	}

}
