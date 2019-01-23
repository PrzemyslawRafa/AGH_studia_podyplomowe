public class Program11 {
   public static double pole4(double a, double b) {
      return a * b;
   }
   public static double pole4(double a, double b, double h) {
      return 0.5*(a+b)*h;
   }
   public static void main(String[] args) {
      System.out.println("Pole prostokata wynosi: "+pole4(2, 3));
      System.out.println("Pole trapezu: "+pole4(2.5, 3.5, 2));
   }
}

/*
 * Cwiczenia:
 * 1. Dopisz kolejna metode statyczna o tej samej nazwie, ale innym zestawie parametrow 
 * i uzyj jej w metodzie main()
 */