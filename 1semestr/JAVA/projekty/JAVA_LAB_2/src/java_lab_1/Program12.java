import java.io.*;
import java.util.*;

public class Program12 {
   public static void main(String[] args) {
      try {
         int zmienna, szuk;
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         Random rand = new Random();
         szuk = rand.nextInt(100);
         while (true) { // lub for (;;)
            System.out.println("Podaj liczbe calk. 0-99: ");
            zmienna = Integer.parseInt(in.readLine());
            if (zmienna == szuk) {
               System.out.println("Brawo, odgadles!");
               break;
            }
            if (zmienna < szuk)
               System.out.println("Za malo!");
            else
               System.out.println("Za duzo!");
         }
      } catch (IOException e) {
      }
   }
}


/*
 * Cwiczenia:
 * 1. Wprowadz podawanie gornej granicy przedzialu losowania 
 * przez uzytkownika.
 * 2. Dodaj komunikat wyswietlajacy informacje za ktorym razem udalo sie
 * odgadnac.
 * 3. Wprowadz wyswietlanie dodatkowego komunikatu, gdy uda sie odgadnac
 * w 5 lub mniej probach
 */
