package osoby;

public class Uczen extends Osoba {
	String klasa;
	double srednia;
	
	public Uczen(String imie, String nazwisko, String klasa, double srednia) {
		super(imie, nazwisko);
		this.klasa = klasa;
		this.srednia = srednia;
	}
	
	public void opis() {
		super.opis();
		System.out.println("Jestem uczniem klasy " + klasa + ", moja srednia ocen: " + srednia);
	}
}
