package EjerciciosJava;

import java.util.Scanner;

public class Calculadora {
	// TODO: Implementar la función que aplica la operación aritmética
    public static double calcularOperacion(int num1, int num2, String operador) {
        double resultado = 0;
        
        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                // Validar la división por cero
                if (num2 != 0) {
                    resultado = (double) num1 / num2;
                } else {
                    System.out.println("Error: División por cero.");
                    return Double.NaN; // Retorna un valor que indica error
                }
                break;
            case "%":
                resultado = num1 % num2;
                break;
            case "**":
                resultado = Math.pow(num1, num2);  // Potencia
                break;
            default:
                System.out.println("Operador no válido.");
                return Double.NaN;  // Retorna un valor que indica error
        }
        
        return resultado;
    }
    
	public static void main(String[] args) {
	// TODO: Leer dos números, el operador y mostrar el resultado de la operación
        
        Scanner scanner = new Scanner(System.in);
        
        // Leer los dos números enteros
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        
        // Leer el operador aritmético
        System.out.print("Ingrese el operador aritmético (+, -, *, /, %, **): ");
        String operador = scanner.next();
        
        // Calcular el resultado usando la función
        double resultado = calcularOperacion(num1, num2, operador);
        
        // Mostrar el resultado solo si es válido (no es NaN)
        if (!Double.isNaN(resultado)) {
            System.out.printf("El resultado de la operación %d %s %d es: %.2f\n", num1, operador, num2, resultado);
        }
        
        scanner.close();

	}

}
