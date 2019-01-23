import java.util.*;

public class Program7 {
   public static void main(String[] args) {
      int los;
      Random rand = new Random();
      do {
         los = rand.nextInt(100);
         System.out.print(los+", ");
      } 
      while (los != 50);
      System.out.println();
   }
}

/*
 * Cwiczenia:
 * 1. Zmien gorna granice przedzialu losowania
 */
