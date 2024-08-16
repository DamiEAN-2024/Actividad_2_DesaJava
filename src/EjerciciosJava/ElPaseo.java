package EjerciciosJava;

public class ElPaseo {

	// TODO: Implementar la función que calcula el número de buses necesarios
    public static int calcularNumeroBuses(int sillasPorBus, int estudiantesGordos, int estudiantesFlacos) {
        // Cada estudiante gordo ocupa dos sillas
        int sillasOcupadasPorGordos = estudiantesGordos * 2;
        
        // Cada estudiante flaco ocupa una silla
        int sillasOcupadasPorFlacos = estudiantesFlacos;
        
        // Total de sillas ocupadas
        int totalSillasOcupadas = sillasOcupadasPorGordos + sillasOcupadasPorFlacos;
        
        // Calcular el número de buses necesarios
        int numeroBuses = (int) Math.ceil((double) totalSillasOcupadas / sillasPorBus);
        
        return numeroBuses;
    }
	public static void main(String[] args) {
	// TODO: Usar la función en el método main con algunos valores de prueba
        
        // Ejemplo: 50 sillas por bus, 30 estudiantes gordos, 40 estudiantes flacos
        int numeroBuses = calcularNumeroBuses(50, 30, 40);
        System.out.println("El número de buses necesarios es: " + numeroBuses);

	}

}
