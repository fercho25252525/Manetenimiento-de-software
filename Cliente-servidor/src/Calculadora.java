
public class Calculadora {

	/*
	 * OPCI�N 1 = SUMA
	 * OPCI�N 2 = RESTA
	 * OPCI�N 3 = MULTIPLICACI�N
	 * OPCI�N 4 = DIVISION
	 * */
	
	public static void main (String args[]) {
		double numerUno = 20;
		double numeroDos = 50;
		int opcion = 2;
		
		double resultado;
		
		if (opcion == 1) {
			resultado = numerUno + numeroDos;
			System.out.println("El resultado de la operacion es: " + resultado);
		}else if (opcion == 2) {
			resultado = numerUno - numeroDos;
			System.out.println("El resultado de la operacion es: " + resultado);
		}else if (opcion == 3) {
			resultado = numerUno * numeroDos;
			System.out.println("El resultado de la operacion es: " + resultado);
		}else if (opcion == 4) {
			if (numerUno != 0 || numeroDos != 0) {
				resultado = numerUno / numeroDos;
				System.out.println("El resultado de la operacion es: " + resultado);
			} else {
				System.out.println("Error: No se puede dividir por cero " );
			}			
		}else {
			System.out.println("Opcion no valida, por favor ingresar otra opcion");
		}
	}
}
