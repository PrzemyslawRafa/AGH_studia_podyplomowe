/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteka;

/**
 *
 * @author przemek
 */
public class Czytelnik {
    String imie;
    String nazwisko;
    int numer_karty;

    public Czytelnik(String imie, String nazwisko, int numer_karty) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer_karty = numer_karty;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getNumer_karty() {
        return numer_karty;
    }

    public void setNumer_karty(int numer_karty) {
        this.numer_karty = numer_karty;
    }

    @Override
    public String toString() {
        return "Czytelnik{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", numer karty=" + numer_karty + '}';
    }
    
}
