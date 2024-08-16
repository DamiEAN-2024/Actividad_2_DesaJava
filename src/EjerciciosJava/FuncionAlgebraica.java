package EjerciciosJava;

public class FuncionAlgebraica {

	  // TODO: Implementar la función algebraica que calcula f(x, y) = x^2 + 2xy + y^2
    public static int calcularFuncion(int x, int y) {
        return x * x + 2 * x * y + y * y;
    }
    
	public static void main(String[] args) {
		 // TODO: Usar la función en el método main con algunos valores de prueba
        int resultado = calcularFuncion(5, 7);  // Por ejemplo, x = 5, y = 7
        System.out.println("El resultado de f(x, y) es: " + resultado);

	}

}
