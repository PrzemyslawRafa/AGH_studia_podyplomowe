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
public class Ksiazka {
    String autor;
    String tytul;
    String isbn;
    int liczba_egzemplarzy;
    int liczba_wypozyczonych_egzemplarzy;

    public Ksiazka(String autor, String tytul, String isbn, int liczba_egzemplarzy, int liczba_wypozyczonych_egzemplarzy) {
        this.autor = autor;
        this.tytul = tytul;
        this.isbn = isbn;
        this.liczba_egzemplarzy = liczba_egzemplarzy;
        this.liczba_wypozyczonych_egzemplarzy = liczba_wypozyczonych_egzemplarzy;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getLiczba_egzemplarzy() {
        return liczba_egzemplarzy;
    }

    public void setLiczba_egzemplarzy(int liczba_egzemplarzy) {
        this.liczba_egzemplarzy = liczba_egzemplarzy;
    }

    public int getLiczba_wypozyczonych_egzemplarzy() {
        return liczba_wypozyczonych_egzemplarzy;
    }

    public void setLiczba_wypozyczonych_egzemplarzy(int liczba_wypozyczonych_egzemplarzy) {
        this.liczba_wypozyczonych_egzemplarzy = liczba_wypozyczonych_egzemplarzy;
    }

    @Override
    public String toString() {
        return "Ksiazka{" + "autor: " + autor + ", tytul ksiazki: " + tytul + ", numer isbn: " + isbn + ", liczba egzemplarzy: " + liczba_egzemplarzy + ", liczba wypozyczonych egzemplarzy: " + liczba_wypozyczonych_egzemplarzy + '}';
    }

}