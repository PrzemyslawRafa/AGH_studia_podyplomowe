package osoby;

public class Nauczyciel extends Osoba {
	String przedmiot;
	private int pensja;
	
	public Nauczyciel(String imie, String nazwisko, String przedmiot, int pensja) {
		super(imie, nazwisko);
		this.przedmiot = przedmiot;
		this.pensja = pensja;
	}
	
	public void opis() {
		super.opis();
		System.out.println("Jestem nauczycielem, moj przedmiot to " + przedmiot);
	}
}
