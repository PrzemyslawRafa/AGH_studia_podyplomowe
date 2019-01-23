package figury;

public class Prostokat extends Figura {
	private double a, b;

	public Prostokat(Punkt p, double na, double nb) {
		super(p);
		a = na;
		b = nb;
	}

        @Override
	public double pole() {
		return a * b;
	}

        @Override
	public void powieksz(double ile) {
		a *= ile;
		b *= ile;
	}
	
        @Override
	public String toString() {
		return "Prostokat(" + a + ", " + b + ")" + super.toString();
	}
}
