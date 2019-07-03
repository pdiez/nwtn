
public class Nodo {
	
	private double co;
	private int ex;

	public double getCo() {
		return co;
	}

	public void setCo(double co) {
		this.co = co;
	}

	public int getEx() {
		return ex;
	}

	public void setEx(int ex) {
		this.ex = ex;
	}

	public Nodo(int i, double d) {
		this.ex = i;
		this.co = d;
	}
}
