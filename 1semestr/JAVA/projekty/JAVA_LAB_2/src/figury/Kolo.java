package figury;

public class Kolo extends Figura {
	private double r;
	
	public Kolo(Punkt p, double nr) {
		super(p);
		r = nr;
	}
	
        @Override
	public double pole() {
		return Math.PI * r * r;
	}

        @Override
	public void powieksz(double ile) {
		r *= ile;
	}
	
        @Override
	public String toString() {
		return "Kolo(" + r + ")" + super.toString();
	}
}
