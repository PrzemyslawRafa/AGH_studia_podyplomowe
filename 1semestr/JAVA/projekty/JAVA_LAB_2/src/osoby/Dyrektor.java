/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osoby;

/**
 *
 * @author przemek
 */
public class Dyrektor extends Osoba{
        String nazwaSzkoly;
        private double pensja;
    
    public Dyrektor(String imie, String nazwisko, String nazwaSzkoly, double pensja) {
        super(imie, nazwisko);
        this.nazwaSzkoly=nazwaSzkoly;
        this.pensja=pensja;
    }
    public void opis() {
		super.opis();
		System.out.println("Jestem dyrektorem szkoly " + nazwaSzkoly);
	}
}
