public class Program10 {
   public static double pole4(double a, double b) {
      return a * b;
   }
   public static double pitagoras(double a, double b) {
      return Math.sqrt(a*a + b*b);
   }
   public static void main(String[] args) {
      System.out.println("Pole czworokata wynosi: "+pole4(2.5, 6));
      System.out.println("Przeciwprostokatna: "+pitagoras(3, 4));      
   }
}

/*
 * Cwiczenia:
 * 1. Dopisz kolejna metode statyczna i uzyj jej w metodzie main()
 */