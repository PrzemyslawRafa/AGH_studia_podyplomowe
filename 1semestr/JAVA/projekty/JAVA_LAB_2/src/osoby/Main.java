package osoby;

import java.util.ArrayList;

public class Main {
    private ArrayList<Osoba> osoby;
    
	public static void main(String[] args) {
            ArrayList<Osoba> nauczyciele = new ArrayList<>();
            ArrayList<Osoba> uczniowie = new ArrayList<>();
                
		Osoba jas = new Uczen("Jan", "Kowalski", "5b", 4);
                Osoba steven = new Uczen("Steven", "Fors", "5c", 5);
                Osoba andrzej = new Uczen("Andrzej", "Kozak", "5a", 3);
		Osoba adam = new Nauczyciel("Adam", "Nowak", "matematyka", 2000);
                Osoba kinga = new Nauczyciel("Kinga", "Surowy", "jezyk polski", 1900);
		Osoba ktos = new Osoba("Gal", "Anonim");
                Osoba jan = new Dyrektor("Jan", "Kowalski", "Szkola Podstawowa nr 54 w Koszalinie", 4000);
		
		jas.opis();
		System.out.println();
		adam.opis();
		System.out.println();
		ktos.opis();
		System.out.println();
                jan.opis();
		System.out.println();
                
                //dodawanie obiektow do list
                uczniowie.add(jas);
                uczniowie.add(steven);
                uczniowie.add(andrzej);
                
                nauczyciele.add(adam);
                nauczyciele.add(kinga);
	}
}

/* Zadania:
 *  1. Dodaj kolejna klase np. Dyrektor oraz uzyj jej w podobny sposob,
 *  jak mialo to miejsce z klasami Uczen oraz Nauczyciel.
 *  2. Utworz 2 listy: nauczycieli i uczniow, podobnie jak mialo to miejsce w przykladzie
 *  z figurami.
 *  3. Uzyj w programie tych list do przechowywania obiektow.
*/