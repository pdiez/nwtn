import java.util.ArrayList;

public class Polinomio {

	private int grado;
	private ArrayList<Nodo> nodos;	
	
	
	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}
	
	

	public ArrayList<Nodo> getNodos() {
		return nodos;
	}

	public void setNodos(ArrayList<Nodo> nodos) {
		this.nodos = nodos;
	}

	public Polinomio () {
		this.nodos = new ArrayList<Nodo>();
		this.grado = 0;
	}
	
	public Polinomio (int g) {
		this.nodos = new ArrayList<Nodo>();
		this.grado = g;
	}
	
	
	public void addNodo(int grado, int co) {
		if (co!=0) {
			Nodo n = new Nodo(grado,co);
			nodos.add(n);
		}
	}

	public String toString() {
		String s = "";
		for (Nodo n : nodos) {
			String t = " ";
			if (n.getEx()<this.grado && n.getCo()>0) { t= " +"; }
			
			if (n.getCo()==0) { s+= ""; }
			else if (n.getEx()==0) { s+= t + n.getCo(); }
			else { s+= t + n.getCo()+"x^"+n.getEx(); }
		}
		
		return s;
	}
}
 