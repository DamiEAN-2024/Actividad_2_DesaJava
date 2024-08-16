package EjerciciosJava;

import java.util.Scanner;

public class GastosDePedro {
	// TODO: Implementar la función que calcula el gasto en arriendo (40% del sueldo)
    public static double calcularGastoArriendo(double sueldo) {
        return sueldo * 0.40;
    }
    
    // TODO: Implementar la función que calcula el gasto en comida (15% del sueldo)
    public static double calcularGastoComida(double sueldo) {
        return sueldo * 0.15;
    }

	public static void main(String[] args) {
	// TODO: Usar las funciones para calcular y mostrar los gastos y el dinero restante
        
        Scanner scanner = new Scanner(System.in);
        
        // Leer el sueldo de Pedro
        System.out.print("Ingrese el sueldo de Pedro: ");
        double sueldo = scanner.nextDouble();
        
        // Calcular el gasto en arriendo y comida
        double gastoArriendo = calcularGastoArriendo(sueldo);
        double gastoComida = calcularGastoComida(sueldo);
        
        // Calcular el dinero restante
        double dineroRestante = sueldo - (gastoArriendo + gastoComida);
        
        // Mostrar los resultados
        System.out.printf("Gasto en arriendo: %.2f\n", gastoArriendo);
        System.out.printf("Gasto en comida: %.2f\n", gastoComida);
        System.out.printf("Dinero restante: %.2f\n", dineroRestante);
        
        scanner.close();

	}

}
