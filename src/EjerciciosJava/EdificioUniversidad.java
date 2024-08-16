package EjerciciosJava;

import java.util.Scanner;

public class EdificioUniversidad {
	// TODO: Implementar la función que calcula el número de salones necesarios
    public static int calcularNumeroSalones(int numeroEstudiantes, int capacidadSalon) {
        return (int) Math.ceil((double) numeroEstudiantes / capacidadSalon);
    }
    
    // TODO: Implementar la función que calcula el número de pisos necesarios
    public static int calcularNumeroPisos(int numeroSalones, int salonesPorPiso) {
        return (int) Math.ceil((double) numeroSalones / salonesPorPiso);
    }
    
	public static void main(String[] args) {
	// TODO: Leer el número de estudiantes, la capacidad del salón y los salones por piso, y calcular
        
        Scanner scanner = new Scanner(System.in);
        
        // Leer el número de estudiantes
        System.out.print("Ingrese el número de estudiantes en la universidad: ");
        int numeroEstudiantes = scanner.nextInt();
        
        // Leer la capacidad del salón
        System.out.print("Ingrese la capacidad de un salón: ");
        int capacidadSalon = scanner.nextInt();
        
        // Leer el número de salones por piso
        System.out.print("Ingrese el número de salones que tendrá un piso del edificio: ");
        int salonesPorPiso = scanner.nextInt();
        
        // Calcular el número de salones necesarios
        int numeroSalones = calcularNumeroSalones(numeroEstudiantes, capacidadSalon);
        
        // Calcular el número de pisos necesarios
        int numeroPisos = calcularNumeroPisos(numeroSalones, salonesPorPiso);
        
        // Mostrar los resultados
        System.out.printf("Número de salones necesarios: %d\n", numeroSalones);
        System.out.printf("Número de pisos necesarios: %d\n", numeroPisos);
        
        scanner.close();

	}

}
