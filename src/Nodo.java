
public class Nodo {
	
	private int co;
	private int ex;

	public int getCo() {
		return co;
	}

	public void setCo(int co) {
		this.co = co;
	}

	public int getEx() {
		return ex;
	}

	public void setEx(int ex) {
		this.ex = ex;
	}

	public Nodo(int i, int d) {
		this.ex = i;
		this.co = d;
	}
}
