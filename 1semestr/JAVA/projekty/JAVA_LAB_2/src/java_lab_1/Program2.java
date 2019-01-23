import java.io.*;

public class Program2 {
   public static void main(String[] args) {
      try {
      int x, pole;
      System.out.println("Podaj dowolna liczbe calkowita: ");
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));      
      x = Integer.parseInt(in.readLine());
      pole = x*x;
      System.out.println("Pole kwadratu o boku "+x+" wynosi: "+pole);
      } catch (IOException e) {
      }
   }
}

/*
 * Cwiczenia:
 * 1. wczytaj dwie liczby i wyswietl ich iloczyn (pole prostokata);
 * 2. policz i wyswietl obwod prostokata.
 */