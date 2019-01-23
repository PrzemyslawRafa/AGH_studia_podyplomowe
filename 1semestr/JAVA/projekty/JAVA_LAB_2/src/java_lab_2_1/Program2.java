package java_lab_2_1;

import java.io.*;
import java.util.Random;

public class Program2 {

   public static int suma(int[] tablica, int rozmiar) {
      int s = 0;
      for ( int i = 0; i < rozmiar; i++ )
         s += tablica[i];
      return s;
   }

   public static int minimum(int[] tablica, int rozmiar) {
      int min = tablica[0];
      for ( int i = 1; i < rozmiar; i++ )
         if ( tablica[i] < min )
            min = tablica[i];
      return min;
   }
   
   public static double srednia (int[] tablica, int rozmiar){
      int suma = 0;
      for ( int i = 1; i < rozmiar; i++ )
          suma += tablica[i];
      double srednia = (double)suma/tablica.length;
      return srednia;
   }
   
   public static void wczytaj_tablice(int[] tablica, int rozmiar) throws IOException {
      Random random = new Random();
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      //wylosuj liczbę losową od 0 do podanej przez użytkownika
      System.out.println("Podaj liczbę górnego przedziału liczb: ");
      int upperLimit = Integer.parseInt(in.readLine());
      
      for ( int i = 0; i < rozmiar; i++ ) {
        tablica[i] = random.nextInt(upperLimit);
      }
   }
   
   public static void wypisz_tablice(int[] tablica, int rozmiar) {
      for ( int i = 0; i < rozmiar; i++ )
         System.out.println("tablica["+i+"] = "+tablica[i]);
   }

   public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj rozmiar: ");
        int r = Integer.parseInt(in.readLine());
        
        //utwórz tablicę int;
        int[] t = new int[r];
        
        //wykonaj metodę wypełniającą talbicę
       wczytaj_tablice(t, r);
       
       System.out.println("Suma wygenerowanych liczb wynosi: " + suma(t,r));
       System.out.println("Minimum wygenerowanych liczb wynosi: " + minimum(t,r));
       System.out.println("Srednia wygenerowanych liczb wynosi: " + srednia(t,r));
   }
}

/*
 * Cwiczenia:
 * 1. Z pomoca zaproponowanych funkcji napisz programy podajace 
 * odpowiednio sume i minimum podanych przez uzytkownika (lub wygenerowanych) liczb.
 * 2. Napisz funkcje obliczajaca srednia dla podanego (lub 
 * wygenerowanego) ciagu liczb.
 */
