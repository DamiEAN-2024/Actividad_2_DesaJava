package EjerciciosJava;

import java.util.Scanner;

public class NumerosRomanos {
	// TODO: Función para obtener la cifra de las decenas de un número
    public static int obtenerDecenas(int numero) {
        return numero / 10;
    }
    
    // TODO: Función para obtener la cifra de las unidades de un número
    public static int obtenerUnidades(int numero) {
        return numero % 10;
    }
    
    // TODO: Función que convierte una cifra de 1 a 9 en su equivalente en romano
    public static String convertirUnidadesARomano(int unidades) {
        switch (unidades) {
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 4: return "IV";
            case 5: return "V";
            case 6: return "VI";
            case 7: return "VII";
            case 8: return "VIII";
            case 9: return "IX";
            default: return ""; // Caso para 0
        }
    }
    
    // TODO: Función que convierte una cifra de 1 a 9 en su equivalente en romano para las decenas
    public static String convertirDecenasARomano(int decenas) {
        switch (decenas) {
            case 1: return "X";
            case 2: return "XX";
            case 3: return "XXX";
            case 4: return "XL";
            case 5: return "L";
            case 6: return "LX";
            case 7: return "LXX";
            case 8: return "LXXX";
            case 9: return "XC";
            default: return ""; // Caso para 0
        }
    }
    
	public static void main(String[] args) {
	// TODO: Leer un número entero y convertirlo a números romanos si es válido
        
        Scanner scanner = new Scanner(System.in);
        
        // Leer el número entero
        System.out.print("Ingrese un número entre 1 y 99: ");
        int numero = scanner.nextInt();
        
        // Validar que el número esté en el rango permitido
        if (numero < 1 || numero > 99) {
            System.out.println("Error: El número debe estar entre 1 y 99.");
        } else {
            // Obtener las decenas y unidades del número
            int decenas = obtenerDecenas(numero);
            int unidades = obtenerUnidades(numero);
            
            // Convertir las decenas y unidades a romano
            String romanoDecenas = convertirDecenasARomano(decenas);
            String romanoUnidades = convertirUnidadesARomano(unidades);
            
            // Imprimir el número en romano
            System.out.println("El número en romano es: " + romanoDecenas + romanoUnidades);
        }
        
        scanner.close();

	}

}
