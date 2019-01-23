package figury;

import figury.Punkt;

public abstract class Figura {
	protected Punkt polozenie;
	
	protected Figura(Punkt p) {
		polozenie = new Punkt(p);
	}
	
	public abstract double pole();
	public abstract void powieksz(double ile);
	
	public void przesun(double dx, double dy) {
		polozenie.przesun(dx, dy);
	}
	
	public String toString() {
		return " @ " + polozenie;
	}
}


/*
1. Modyfikatory dostepu dla klas:

- public: klasa jest widoczna wszedzie;
- package-private (brak modyfikatora): klasa jest widoczna w obrebie pakietu.

2. Modyfikatory dostepu dla atrybutow i metod:

Modifikator | Klasa | Pakiet  | Podklasa | Swiat
------------+-------+---------+----------+-------
public      |  x    |    x    |    x     |   x
------------+-------+---------+----------+-------
protected   |  x    |    x    |    x     |   -
------------+-------+---------+----------+-------
brak        |  x    |    x    |    -     |   -
------------+-------+---------+----------+-------
private     |  x    |    -    |    -     |   -

 */
