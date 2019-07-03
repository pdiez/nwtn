
public class Newton {
	
	int maxIteracion = 200;
	int iteracion =0;
	double x,y=0;
	Polinomio p,d;
	double semilla;
	int precision;
	
	private Polinomio derivada() {
		Polinomio x = new Polinomio(p.getGrado()-1);
		for (Nodo n : p.getNodos()) {
			if (n.getEx()>=1) { x.addNodo(n.getEx()-1, n.getCo()*n.getEx()); }			
		}
		return x;
	}
	
	private double resolver(Polinomio p, double i) {
		double x = 0;
		for (Nodo n : p.getNodos()) {
			x += n.getCo() * Math.pow(i, n.getEx());
		}
		
		return x;
		
	}

	public Newton(Polinomio p, int it, double se, int pre) {
		this.p = p;
		this.d = derivada();
		this.semilla = se;
		this.maxIteracion = it == 0 ? 200 : it;
		this.precision = pre == 0 ? 6 : pre;
		this.iteracion = 0;
	}

	public void empezar() {
		boolean running = true;
		while (running) {
			if (y==0) { //primer intento
				x=semilla - (resolver(p,semilla)/resolver(d,semilla));
			} else {
				x=y - (resolver(p,y)/resolver(d,y));
			}
			iteracion++;
			running = this.iteracion <= this.maxIteracion && !comparar(x,y,this.precision);
			actualizaPantalla();
			y=x;
		}
		System.out.println("Raíz encontrada: " + x + " (~"+ Math.round(x*100.0)/100.0 + ")");
		
	}



	private boolean comparar(double x, double y, int p) {
		float pre = (float) Math.pow(10,p);
		float x1 = (float)Math.abs(x*pre);
		float y1 = (float)Math.abs(y*pre);	
		
		return x1==y1;
	}

	private void actualizaPantalla() {
		System.out.println("## " + this.iteracion + "/" + this.maxIteracion + "## Valor actual: "+ this.x + " Valor anterior: " + this.y + " Diferencia: " + (x-y) ); 
	}
	
}
