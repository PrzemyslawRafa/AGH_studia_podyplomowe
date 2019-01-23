import java.util.Scanner;

public class Program6 {
   public static void main(String[] args) {
	   char k;
	   Scanner input = new Scanner(System.in);
	   //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   do {
		   System.out.println("Podaj dowolny znak.");
		   System.out.println("(Aby wyjsc z petli nacisnij q):");
		   k = (input.nextLine()).charAt(0);
	   } 
	   while (k != 'q');
   }
}

/*
 * Cwiczenia:
 * 1. Zmien warunek zakonczenia programu na "quit"
 */