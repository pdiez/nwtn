
public class Polinomio {

	private int grado;
	private int[] constantes;
	
	
	
	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	public int[] getConstantes() {
		return constantes;
	}

	public void setConstantes(int[] constantes) {
		this.constantes = constantes;
	}

	public Polinomio () {
		this.grado = 0;
	}
	
	public Polinomio (int[] cons) {
		this.grado = cons.length -1;
		this.constantes = cons;
	}
	
	public String toString() {
		String s = "";
		for(int i=this.constantes.length-1; i>=0; i--) {
			int n = this.constantes[i];
			String signo = "";
			if (n < 0) { signo = "-"; }
			if (n > 0 && i < this.constantes.length-1) { signo = "+"; }
			if (i==0) {
				s+= " " + signo + Math.abs(n);
			} else if (n != 0) { 
				s+= " " + signo + Math.abs(n) + "x^" + i;
			}
		}
		
		return s;
	}
}
 