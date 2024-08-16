package EjerciciosJava;

import java.util.Scanner;

public class DiaSiguiente {
	// TODO: Función que recibe el nombre de un día y retorna el día de mañana
    public static String obtenerDiaSiguiente(String dia) {
        dia = dia.toLowerCase();  // Convertir a minúsculas para evitar problemas de mayúsculas/minúsculas
        
        switch (dia) {
            case "lunes":
                return "martes";
            case "martes":
                return "miércoles";
            case "miércoles":
            case "miercoles":
                return "jueves";
            case "jueves":
                return "viernes";
            case "viernes":
                return "sábado";
            case "sábado":
            case "sabado":
                return "domingo";
            case "domingo":
                return "lunes";
            default:
                return "Día inválido";
        }
    }
    
	public static void main(String[] args) {
	// TODO: Leer el nombre de un día y mostrar el nombre del día de mañana
        
        Scanner scanner = new Scanner(System.in);
        
        // Leer el nombre de un día de la semana
        System.out.print("Ingrese el nombre de un día de la semana: ");
        String dia = scanner.nextLine();
        
        // Obtener el día de mañana usando la función
        String diaSiguiente = obtenerDiaSiguiente(dia);
        
        // Imprimir el resultado
        System.out.println("El día de mañana es: " + diaSiguiente);
        
        scanner.close();

	}

}
