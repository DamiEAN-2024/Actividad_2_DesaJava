package EjerciciosJava;

import java.util.Scanner;

public class PuntosCartesianos {
	// TODO: Implementar la función que calcula la distancia entre dos puntos
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        // Fórmula: d = √((y2 - y1)^2 + (x2 - x1)^2)
        return Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
    }
    
    // TODO: Implementar la función que calcula la pendiente de la recta que une dos puntos
    public static double calcularPendiente(double x1, double y1, double x2, double y2) {
        // Fórmula: m = (y2 - y1) / (x2 - x1)
        return (y2 - y1) / (x2 - x1);
    }
    
	public static void main(String[] args) {
// TODO: Leer las coordenadas de los puntos y usar las funciones para calcular la distancia y pendiente
        
        Scanner scanner = new Scanner(System.in);
        
        // Leer las coordenadas del primer punto P1(x1, y1)
        System.out.print("Ingrese la coordenada x1 del punto P1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y1 del punto P1: ");
        double y1 = scanner.nextDouble();
        
        // Leer las coordenadas del segundo punto P2(x2, y2)
        System.out.print("Ingrese la coordenada x2 del punto P2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y2 del punto P2: ");
        double y2 = scanner.nextDouble();
        
        // Calcular la distancia entre los dos puntos
        double distancia = calcularDistancia(x1, y1, x2, y2);
        
        // Calcular la pendiente de la recta que une los dos puntos
        double pendiente = calcularPendiente(x1, y1, x2, y2);
        
        // Mostrar los resultados
        System.out.printf("La distancia entre los puntos P1 y P2 es: %.2f\n", distancia);
        System.out.printf("La pendiente de la recta que une los puntos P1 y P2 es: %.2f\n", pendiente);
        
        scanner.close();

	}

}
