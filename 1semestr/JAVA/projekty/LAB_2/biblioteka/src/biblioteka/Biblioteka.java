/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteka;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteka {
    private final ArrayList<Ksiazka> ksiazki;
    private final ArrayList<Czytelnik> czytelnicy;
    private final ArrayList<Wypozyczenie> wypozyczenia;
    private String menuUserInput="";
    Scanner reader = new Scanner(System.in);

    public Biblioteka() {
        this.ksiazki = new ArrayList<>();
        this.czytelnicy = new ArrayList<>();
        this.wypozyczenia = new ArrayList<>();
    }

    public static void main(String[] args) {
        Biblioteka biblioteka = new Biblioteka();
        //Ksiazka(String autor, String tytul, String isbn, int liczba_egzemplarzy, int liczba_wypozyczonych_egzemplarzy)
        biblioteka.ksiazki.add(new Ksiazka ("Jan Brzechwa", "Akademia Pana Kleksa", "9788375174458", 1,0));
        biblioteka.ksiazki.add(new Ksiazka ("Jan Parandowski", "Mitologia", "9780907587859", 1,0));
        biblioteka.ksiazki.add(new Ksiazka ("Carlo Collodi", "Pinokio", "9788373276246", 1,0));
        biblioteka.ksiazki.add(new Ksiazka ("Testowy autor", "Testowa Ksiazka", "1234", 3,0));
        
        //Czytelnik(String imie, String nazwisko, int numer_karty)
        biblioteka.czytelnicy.add(new Czytelnik("Jeffrey", "Brussi", 1));
        biblioteka.czytelnicy.add(new Czytelnik("Brian", "Kibler", 2));
        biblioteka.czytelnicy.add(new Czytelnik("Sebastian", "Fors", 3));
        
        biblioteka.start();
    }
        public void start() {
            //Wyswietl tekst poczatkowy menu:
            printInitialMenu();
            //Zapytanie o operacje, zakonczenie po nacisnieciu "x"
            while(!menuUserInput.equals("x")){
                chooseOperationMenu();
            }
            System.out.println("\n"+"Zakonczono program");
    }
        
        public void printInitialMenu() {
            System.out.println("Menu biblioteki\n" +
            "dostępne opcje:\n" +
            " 1 dodaj czytelnika\n" +
            " 2 usun czytelnika\n" +
            " 3 dodaj ksiazke\n" +
            " 4 usun ksiazke\n" +
            " 5 wypozycz ksiazke\n" +
            " 6 zwrot ksiazki\n" +
            " 7 wyswietl ksiazki\n" +
            " 8 wyswietl czytelnikow\n" +
            " x wyjdz");
    }

        public void chooseOperationMenu(){
            System.out.print("\n"+"Operacja: ");
            menuUserInput = reader.nextLine();
            if(menuUserInput.equals("1"))
                dodajCzytelnika();
            if(menuUserInput.equals("2"))
               usunCzytelnika();
            if(menuUserInput.equals("3"))
                dodajKsiazke();
            if(menuUserInput.equals("4"))
                usunKsiazke();
            if(menuUserInput.equals("5"))
                dodajWypozyczenie();
            if(menuUserInput.equals("6"))
                zwrotKsiazki();
            if(menuUserInput.equals("7"))
                wyswietlKsiazki();
            if(menuUserInput.equals("8"))
                wyswietlCzytelnikow();
    }

    public void dodajKsiazke() {
        String imie;
        String nazwaKsiazki;
        String isbn;
        int liczbaDodawanychKsiazek;
        boolean dodawanieKopii=false;

        System.out.println("Podaj numer isbn ksiazki: ");
        isbn=reader.next();
        //brzydkie rozwiazanie - poszukac lepszego
        reader.nextLine();
            
        for(Ksiazka ksiazka : ksiazki){
            //sprawdzenie, czy ksiazka o takim numerze isbn jest juz w zbiorach
            if(ksiazka.getIsbn().equals(isbn)){
                System.out.println("Podaj liczbe dodawanych kopii ksiazki: ");
                liczbaDodawanychKsiazek=reader.nextInt();
                if(liczbaDodawanychKsiazek<=0){
                    System.out.println("Liczba musi byc wieksza od zera!");
                    dodawanieKopii=true;
                    //brzydkie rozwiazanie - poszukac lepszego
                    reader.nextLine();
                    break;
                }
                ksiazka.setLiczba_egzemplarzy(liczbaDodawanychKsiazek+ksiazka.getLiczba_egzemplarzy());
                //brzydkie rozwiazanie - poszukac lepszego
                reader.nextLine();
                dodawanieKopii=true;
                System.out.println("Dodano nowe egzemplarze do zbiorow");
            }
        }
        if(!dodawanieKopii){
            System.out.println("Podaj imie i nazwisko autora: ");
            imie=reader.nextLine();

            System.out.println("Podaj nazwe ksiazki: ");
            nazwaKsiazki=reader.nextLine();


            System.out.println("Podaj liczbe dodawanych kopii ksiazki: ");
            liczbaDodawanychKsiazek=reader.nextInt();
            //brzydkie rozwiazanie - poszukac lepszego
            reader.nextLine();
            if(liczbaDodawanychKsiazek<=0){
                    System.out.println("Liczba musi byc wieksza od zera!\n"
                            + "Ksiazka nie zostala dodana.");
            }
            else
                this.ksiazki.add(new Ksiazka(imie,nazwaKsiazki,isbn,liczbaDodawanychKsiazek,0));
        }
    }
    
    public void usunKsiazke() {
        System.out.println("Podaj numer ISBN ksiazki do usuniecia: ");
        String isbnKsiazki=reader.nextLine();
        for(Ksiazka ksiazka : ksiazki){
            if(ksiazka.getIsbn().equals(isbnKsiazki)){
                System.out.println("Usunieto ksiazke \""+ ksiazka.getTytul()+"\"");
                /*lepszym rozwiazaniem bylaby zmiana ilosci ksiazek na zero,
                ale zostawmy calkowite usuwanie ksiazek*/
                ksiazki.remove(ksiazka);
                break;
            }
        }
    }

    public void dodajCzytelnika() {
        String imie;
        String nazwisko;
        int numerKarty;
        
        System.out.println("Podaj imie czytelnika: ");
        imie=reader.nextLine();
                
        System.out.println("Podaj nazwisko czytelnika: ");
        nazwisko=reader.nextLine();
        
        numerKarty=czytelnicy.size()+1;
        
        //Czytelnik(String imie, String nazwisko, int numer_karty)
        this.czytelnicy.add(new Czytelnik(imie,nazwisko,numerKarty));
        System.out.println("Dodano czytelnika: "+ imie +" "+ nazwisko);
    }

    public void usunCzytelnika() {
        System.out.println("Czytelnicy sa usuwani wedlug ich numeru karty.\n"
                + "Wyswietlic liste (Y/n)?");
        if(reader.nextLine().equalsIgnoreCase("Y"))
            wyswietlCzytelnikow();
        Czytelnik wybranyCzytelnik=przypiszCzytelnika();
        if(wybranyCzytelnik!=null){
            System.out.println("Usunieto czytelnika: " 
                + wybranyCzytelnik.getImie() + " "
                + wybranyCzytelnik.getNazwisko());
            czytelnicy.remove(wybranyCzytelnik);
        }
        else
            System.out.println("Nie ma czytelnika o takim numerze");
    }

    public Czytelnik przypiszCzytelnika(){
        System.out.print("Podaj numer karty czytelnika: ");
        int inputNumerKarty = reader.nextInt();
        //brzydkie rozwiazanie - poszukac lepszego
        reader.nextLine();
        Czytelnik wybranyCzytelnik=null;
        for(Czytelnik czytelnik : czytelnicy){
            if(czytelnik.getNumer_karty()==inputNumerKarty){
                wybranyCzytelnik=czytelnik;
                break;
            }
        }
        return wybranyCzytelnik;
    }
    
    public void dodajWypozyczenie() {
        Czytelnik wybranyCzytelnik = przypiszCzytelnika();
        if (wybranyCzytelnik!=null) {
            System.out.print("Podaj numer isbn ksiazki do wypozyczenia: ");
            String isbnKsiazki=reader.next();
            //brzydkie rozwiazanie - poszukac lepszego
            reader.nextLine();
            System.out.println("");
            Boolean znalezionoKsiazke=false;

            for(Ksiazka ksiazka : ksiazki){
                if(ksiazka.getIsbn().equals(isbnKsiazki)) {
                    if((ksiazka.getLiczba_egzemplarzy()-ksiazka.getLiczba_wypozyczonych_egzemplarzy())>0){
                        ksiazka.liczba_wypozyczonych_egzemplarzy++;
                        
                        /*nie odejmuje wartosci od liczby egzemplarzy, gdyz uznaje je za liczbe
                        wszystkich ksiazek jakie biblioteka ma w swoich zasobach jak i wypozyczonych.
                        Liczba dostepnych ksiazek jest wiec roznica pomiedzy tymi wartosciami*/
                        
                        //powiekszeniu ulega wiec jedynie wartosci liczby wypozyczonych egzemplarzy
                        ksiazka.setLiczba_wypozyczonych_egzemplarzy(ksiazka.liczba_wypozyczonych_egzemplarzy++);
                        System.out.println("Gratulacje, wypozyczono jedną książkę");
                        znalezionoKsiazke=true;

                        //dodanie wypozyczenia jako kombinacji ksiazki i czytelnika
                        wypozyczenia.add(new Wypozyczenie(ksiazka, wybranyCzytelnik));
                        break;
                    }
                    else{
                        System.out.println("Wszystkie egzemplarze ksiazki zostaly wypozyczone");
                        znalezionoKsiazke=true;
                        break;
                    }
                }
            }
            if(!znalezionoKsiazke)
                System.out.println("Podanej ksiazki nie ma w katalogu");
        }
        else
            System.out.println("Nie znaleziono czytelnika o takim numerze karty");
    }

    public void zwrotKsiazki() {
        Czytelnik aktualnyCzytelnik = przypiszCzytelnika();
        if(aktualnyCzytelnik!=null){
            System.out.println("Podaj numer isbn ksiazki do zwrotu: ");
            String isbnKsiazki=reader.nextLine();
            Boolean udanyZwrot=false;
            Boolean znalezionoKsiazke=false;

            for(Ksiazka ksiazka : ksiazki){
                if(ksiazka.getIsbn().equals(isbnKsiazki)) {
                    ksiazka.liczba_wypozyczonych_egzemplarzy--;
                        /*zakladam, ze wypozyczenia zapisuja jedynie aktualne wypozyczenia 
                        a nie historie wypozyczen, dlatego trzeba usunac tez relacje z ArrayList wypozyczenia.
                        Tworzac historie wypozyczen najlepsze bylyby flagi rozdzielajace
                        wypozyczenia historyczne od aktualnych.
                        */
                    znalezionoKsiazke=true;
                    for (Wypozyczenie wypozyczenie : wypozyczenia){
                        if (wypozyczenie.czytelnik.equals(aktualnyCzytelnik)&&wypozyczenie.ksiazka.equals(ksiazka)){
                            System.out.println("Usunieto pozycje z wypozyczenia\n"
                                    + "Gratulacje, zwrocono jedną książkę");
                            wypozyczenia.remove(wypozyczenie);
                            udanyZwrot=true;
                            break;
                        }
                    }
                    if(!udanyZwrot && znalezionoKsiazke)
                        System.out.println("Czytelnik nie mial wypozyczonej podanej ksiazki");
                    break;
                }
            }
            if(!udanyZwrot && !znalezionoKsiazke)
                System.out.println("Bledny numer ISBN. Podanej ksiazki nie ma w katalogu biblioteki");
        }
        else
            System.out.println("Nie ma czytelnika o takim numerze konta.");
    }

    public void wyswietlKsiazki() {
        //System.out.println(ksiazki);
        for (Ksiazka ksiazka : ksiazki){
            System.out.println(ksiazka);
        }
    }

    public void wyswietlCzytelnikow() {
        for (Czytelnik czytelnik : czytelnicy){
            System.out.println(czytelnik);
        }
    }
}