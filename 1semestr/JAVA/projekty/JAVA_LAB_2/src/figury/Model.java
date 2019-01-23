package figury;

import java.util.ArrayList;

public class Model {
	private ArrayList<Figura> figury;
	
	public Model() {
		figury = new ArrayList<Figura>();
	}
	
	public void dodaj(Figura f) {
		figury.add(f);
	}
	
	public double pole() {
		double suma = 0;
		for(Figura f : figury) {
			suma += f.pole();
		}
		return suma;
	}
	
	public void powieksz(double ile) {
		for(Figura f : figury) {
			f.powieksz(ile);
		}
	}

        @Override
	public String toString() {
	String wynik = "--- Model ---\n";
	for(Figura f : figury) {
		wynik += f + "\n";
	}
	wynik += "pole wszystkich figur modelu = " + pole() + "\n";
	wynik += "-----------";
	return wynik;
	}
	
	public static void main(String[] args) {
		Prostokat p1 = new Prostokat(new Punkt(1, 2), 3 , 4);
		Prostokat p2 = new Prostokat(new Punkt(2, 1), 4 , 3);
		Kolo k1 = new Kolo(new Punkt(0, 0), 3);
		Kolo k2 = new Kolo(new Punkt(5, 5), 2);
                Romb r1 = new Romb(new Punkt(2, 2), 4, 2);
		Romb r2 = new Romb(new Punkt(3, 3), 2, 5);
		
		Model m = new Model();
		m.dodaj(p1);
		m.dodaj(p2);
		m.dodaj(k1);
		m.dodaj(k2);
                m.dodaj(r1);
                m.dodaj(r2);
		
		System.out.println(m);
		
		m.powieksz(2.5);
		
		System.out.println(m);
	}
}


/*
 * Zadania:
 * 1. Dodaj nowa klase dziedziczaca z klasy figura, reprezentujaca np. romb, ktora 
 * posiada atrybuty a (dlugosc boku) oraz h (wysokosc) oraz uzyj jej w programie
 * tak samo jak mialo to miejsce w przypadku klas Kolo i Prostokat. Pole rombu = a*h.
*/