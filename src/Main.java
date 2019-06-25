import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		System.out.println(" * Introduzca los nodos del polinomio especificando coeficiente,grado.Para 3x^4 se introduciría: 3,4");
		System.out.println(" * Para introducir el término independiente, usar el grado 't'. Por ejemplo para -5 se introduciría: -5,t");
		System.out.println(" * Una vez introducido el término independiente (0,t si no tiene valor), continuará con el programa.");
		while (exit) {
			System.out.println("Valores:");
			String s = sc.nextLine();
			String sp[] = s.split(",");
			
		}
		
		
	
	}
}
