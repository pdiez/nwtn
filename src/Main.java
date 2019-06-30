import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		pantalla();
		int i = 0;
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		System.out.println(" * Indique el grado del polinomio: ");
		i = sc.nextInt();
		System.out.println("-> Polinomio de grado " + i);
		Polinomio p = new Polinomio(i);
		System.out.println();
		
		while (i>=0) {
			String t = "x^"+i;
			System.out.println(" * Escriba el coeficiente para " +t);
			int n = sc.nextInt();
			p.addNodo(i, n);
			i--;
		}
		
		System.out.println("-> Polinomio de grado " + p.getGrado()  + " -> " + p.toString());
		/* numero máximo de iteraciones, la precisión en la solución, 
		 * la semilla inicial para arrancar, si se quiere hacer otra busqueda con otra semilla,... 
		 * */
		System.out.println(" * Indique el nº máximo de iteraciones (0 para usar por defecto 200): ");
		int it = sc.nextInt();
		System.out.println(" * Indique la semilla inicial: ");
		double se = sc.nextDouble();
		System.out.println(" * Indique la precisión (0 para usar por defecto 6 decimales): ");
		int pre = sc.nextInt();
		
		Newton newton = new Newton(p,it,se,pre);
		newton.empezar();
		
	
	}


	private static void pantalla() {
		System.out.println("                                            ,d                            ");
		System.out.println("                                            88                            ");
		System.out.println("8b,dPPYba,   ,adPPYba, 8b      db      d8 MM88MMM ,adPPYba,  8b,dPPYba,   ");  
		System.out.println("88P'   `\"8a a8P_____88 `8b    d88b    d8'   88   a8\"     \"8a 88P'   `\"8a  ");
		System.out.println("88       88 8PP\"\"\"\"\"\"\"  `8b  d8'`8b  d8'    88   8b       d8 88       88  ");
		System.out.println("88       88 \"8b,   ,aa   `8bd8'  `8bd8'     88,  \"8a,   ,a8\" 88       88  ");
		System.out.println("88       88  `\"Ybbd8\"'     YP      YP       \"Y888 `\"YbbdP\"'  88       88  ");
		System.out.println("///////////////////////////////////////////////////////////////////////");


	}
}
