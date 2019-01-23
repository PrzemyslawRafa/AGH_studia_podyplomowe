import java.io.*;

public class Program4 {
   public static void main(String[] args) {
      try {
         int a;
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Podaj liczbe od 1 do 6: ");
         a = Integer.parseInt(in.readLine());
         switch (a) {
         case 1:
            System.out.println("Punkt (a=1)");
            break;
         case 2:
            System.out.println("Odcinek (a=2)");
            break;
         case 3:
            System.out.println("Trojkat (a=3)");
            break;
         case 4:
            System.out.println("Czworokat (a=4)");
            break;
         default:
            System.out.println("Wielokat (a > 4)");
            break;
         }
      } catch (IOException e) {
      }
   }
}

/*
 * Cwiczenia:
 * 1. dodaj kod sprawdzajacy czy podana liczba jest liczba typu int, np.:
 *                   
                    do {
                    System.out.print("Podaj liczbe od 1 do 6: "); 
                      try
                      {
                           a = Integer.parseInt(in.readLine());
                           break;
                      }
                      catch (NumberFormatException e)
                      {
                        System.out.println("To nie byla liczba calkowita, sprobuj jeszcze raz.");
                      }
                    } while (true);
 */

