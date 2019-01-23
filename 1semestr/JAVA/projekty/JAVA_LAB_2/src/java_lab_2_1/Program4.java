package java_lab_2_1;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class Program4 {

   public static void babelek(int[] tablica, int rozmiar) {
      int tmp;
      int i, j;
      for ( i = 1; i < rozmiar; i++ )
         for ( j = 1; j < rozmiar; j++ )
            if ( tablica[j-1] > tablica[j] ) {
               tmp = tablica[j-1];
               tablica[j-1] = tablica[j];
               tablica[j] = tmp;
            }
   }
   
   //sortowanie przez wstawianie
   public static void instertionSort(int[] tablica, int rozmiar){
       int tmp;
       for(int i=1; i<rozmiar; i++){
           for(int j = i; j>0; j--){
               if(tablica[j]<tablica[j-1]){
                   tmp=tablica[j];
                   tablica[j]=tablica[j-1];
                   tablica[j-1]=tmp;
               }
           }
           
       }
   }

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
   
   public static void wczytaj_tablice(int[] tablica, int rozmiar) throws IOException {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      Random random = new Random();
      for ( int i = 0; i < rozmiar; i++ ) {
         System.out.println("Podaj liczbe (tablica["+i+"]): ");
         
         //zapełnienie tablicy liczbami pseudolosowymi
         tablica[i] = random.nextInt(21);
         //tablica[i] = Integer.parseInt(in.readLine());
      }
   }
   
   public static void wypisz_tablice(int[] tablica, int rozmiar) {
      for ( int i = 0; i < rozmiar; i++ )
         //System.out.println("tablica["+i+"] = "+tablica[i]);
          System.out.print(tablica[i] + " ");
       System.out.println("\n");
   }

   public static void main(String[] args) {
      try {
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         int r;
         System.out.println("Podaj rozmiar: ");
         r = Integer.parseInt(in.readLine());
         int[] t = new int[r];
         wczytaj_tablice(t, r);
         
         System.out.println("Tablica przed posortowaniem:");
         wypisz_tablice(t, r);
         
         //babelek(t, r);
         
         //sortowanie przez wstawianie
         //instertionSort(t,r);
         
         //sortowanie funkcją wbudowaną
         //The sorting algorithm is a Dual-Pivot Quicksort by Vladimir Yaroslavskiy, Jon Bentley, and Joshua Bloch
         Arrays.sort(t);
         System.out.println("Tablica posortowana:");
         wypisz_tablice(t, r);
 
      } catch(IOException e) {
      }
   }
}

/*
 * Cwiczenia:
 * 1. Zastanow sie jak ulepszyc (zmniejszyc liczbe iteracji) 
 * zaproponowana funkcje sortujaca (tzw. sortowanie babelkowe).
 * 2. Sprobuj wykorzystac biblioteczna metode 
 * java.util.Arrays.sort() do posortowania tablicy. 
 * Jaki algorytm sortowania zaimplementowany jest w tej metodzie?
 */
