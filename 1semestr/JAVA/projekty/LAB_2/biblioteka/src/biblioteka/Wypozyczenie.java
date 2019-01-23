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
public class Wypozyczenie {
    Ksiazka ksiazka;
    Czytelnik czytelnik;

    public Wypozyczenie(Ksiazka ksiazka, Czytelnik czytelnik) {
        this.ksiazka = ksiazka;
        this.czytelnik = czytelnik;
    }

    public Ksiazka getKsiazka() {
        return ksiazka;
    }

    public void setKsiazka(Ksiazka ksiazka) {
        this.ksiazka = ksiazka;
    }

    public Czytelnik getCzytelnik() {
        return czytelnik;
    }

    public void setCzytelnik(Czytelnik czytelnik) {
        this.czytelnik = czytelnik;
    }

    @Override
    public String toString() {
        return "Wypozyczenie{" + "ksiazka=" + ksiazka + ", czytelnik=" + czytelnik + '}';
    }
    
}
