package EjerciciosJava;

import java.util.Scanner;

public class TerrenoInmobiliario {
	// TODO: Implementar la función que calcula el área de un rectángulo
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    // TODO: Implementar la función que calcula la hipotenusa de un triángulo rectángulo
    public static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }

    // TODO: Implementar la función que calcula el área de un triángulo
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    // TODO: Implementar la función que calcula el perímetro del terreno
    public static double calcularPerimetroTerreno(double ladoA, double ladoB, double ladoC) {
        // La hipotenusa es necesaria para completar el perímetro
        double alturaTriangulo = ladoA - ladoC;
        double hipotenusa = calcularHipotenusa(alturaTriangulo, ladoB);
        return ladoA + ladoB + ladoC + hipotenusa;
    }
	
    public static void main(String[] args) {
    // TODO: Usar las funciones para calcular y mostrar el área y el perímetro del terreno
        
        Scanner scanner = new Scanner(System.in);
        
        // Leer los lados A, B y C
        System.out.print("Ingrese el lado A: ");
        double ladoA = scanner.nextDouble();
        
        System.out.print("Ingrese el lado B: ");
        double ladoB = scanner.nextDouble();
        
        System.out.print("Ingrese el lado C: ");
        double ladoC = scanner.nextDouble();
        
        // Calcular el área de las tres partes del terreno
        double areaRectangulo = calcularAreaRectangulo(ladoB, ladoC);
        double areaTriangulo = calcularAreaTriangulo(ladoB, ladoA - ladoC);
        
        // El área total del terreno es la suma de las áreas del rectángulo y el triángulo
        double areaTotalTerreno = areaRectangulo + areaTriangulo;
        
        // Calcular el perímetro del terreno
        double perimetroTerreno = calcularPerimetroTerreno(ladoA, ladoB, ladoC);
        
        // Mostrar los resultados
        System.out.printf("El área total del terreno es: %.2f\n", areaTotalTerreno);
        System.out.printf("El perímetro total del terreno es: %.2f\n", perimetroTerreno);
        
        scanner.close();

	}

}
