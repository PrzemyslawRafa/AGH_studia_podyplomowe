package java_lab_2_1;

import java.io.*;
import java.util.Random;
import java.lang.Math;



public class Program1 {

   public static void wczytaj_tablice(int[] tablica, int rozmiar) throws IOException {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      
      //wykorzystanie klasy Random
      Random random = new Random();
      
      //wylosuj liczbę losową od 0 do podanej przez użytkownika
      //System.out.println("Podaj liczbę górnego przedziału liczb: ");
      //int upperLimit = Integer.parseInt(in.readLine());
      
      for ( int i = 0; i < rozmiar; i++ ) {
        //wczytaj elementy tablicy do wartości podanej przez użytkownika
        //tablica[i] = random.nextInt(upperLimit+1);
        
        //wczytaj elementy tablicy z losowego przedziału od 0 do 100
        //tablica[i] = random.nextInt(101);
         
        //wczytaj elementy tablicy potęgami dwójki
        tablica[i] = (int) Math.pow(2, i);
          
      }
   }

   public static void wypisz_tablice(int[] tablica, int rozmiar) {
      for ( int i = 0; i < rozmiar; i++ )
         System.out.println("tablica["+i+"] = "+tablica[i]);
   }

   public static void main(String[] args) {
      try {
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         int r;
         System.out.println("Podaj rozmiar: ");
         r = Integer.parseInt(in.readLine());
         int[] t = new int[r];
         wczytaj_tablice(t, r);
         
         System.out.println("Podales nastepujace liczby:");
         wypisz_tablice(t, r);
         
      } catch(IOException e) {
      }
   }
}

/*
 * Cwiczenia:
 * 1. Zamiast wczytywac elementy tablicy, wylosuj je z przedzialu 
 * od 0 do 100, a nastepnie  do wartosci podanej przez uzytkownika.
 * 2. Zamiast wczytywac elementy tablicy, wypelnij ja kolejnymi 
 * liczbami calkowitymi, kolejnymi potegami dwojki itp.
 */
