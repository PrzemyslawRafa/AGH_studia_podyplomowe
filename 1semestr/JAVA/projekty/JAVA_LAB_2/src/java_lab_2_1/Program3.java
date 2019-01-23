package java_lab_2_1;

import java.io.*;

public class Program3 {
    
   public static void main(String[] args) {
      try {
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         int x, y;
         System.out.println("Podaj liczbe wierszy macierzy: ");
         x = Integer.parseInt(in.readLine());
         System.out.println("Podaj liczbe kolumn macierzy: ");
         y = Integer.parseInt(in.readLine());        
         int[][] m = new int[x][y];
         
         for ( int i = 0; i < x; i++ ) {
            for ( int j = 0; j < y; j++ ) {
               System.out.println("Podaj element ["+i+"]["+j+"]: ");
               m[i][j] = Integer.parseInt(in.readLine());
            }
         }
         
         //utworzenie zmiennych przechowujących minimum całej tabeli
         int min_x = 0, min_y = 0;
         //utworzenie zmiennych przechowujących minimum pojedynczego wiersza
         int min_rzedu_x = 0, min_rzedu_y=0;
         //utworzenie zmiennych przechowujących największe minimum wierszy
         int najw_min_x=0, najw_min_y=0;
         
         for ( int i = 0; i < x; i++ ) {
            //ustalenie pierwszej wartości rzędu jako nowe minimum
            min_rzedu_x = i;
            min_rzedu_y=0;
            
            //iteracja po kolumnach
            for ( int j = 0; j < y; j++ ){
                //sprawdzenie nowego mimimum globalnego
                if ( m[i][j] < m[min_x][min_y] ) {
                    min_x = i;
                    min_y = j;
                }
                //sprawdzenie nowego minimum rzędu
                if(m[i][j]<m[min_rzedu_x][min_rzedu_y]){
                    min_rzedu_x = i;
                    min_rzedu_y=j;
               }
            }
         //porownanie minimów wierszy dla pierwszej 
            if(min_rzedu_x==0){
                najw_min_x=min_rzedu_x;
                najw_min_y=min_rzedu_y;
            }
            //sprawdzenie, czy minimum wiersza jest większe niż dotychczasowe największe minimum        
            if(m[min_rzedu_x][min_rzedu_y]>m[najw_min_x][najw_min_y]){
                najw_min_x=min_rzedu_x;
                najw_min_y=min_rzedu_y;
            }
         }
         System.out.println("Najmniejszy element znajduje sie w wierszu nr "+
                            (min_x)+" i kolumnie nr "+(min_y)+
                            " a jego wartosc wynosi "+m[min_x][min_y]);
        
          System.out.println("Największe minimum z poszczególnych wierszy znajduje sie w wierszu nr "+
                            (najw_min_x)+" i kolumnie nr "+(najw_min_y)+
                            " a jego wartosc wynosi "+m[najw_min_x][najw_min_y]);
        
      } catch(IOException e) {
      }
   }
}

/*
 * Cwiczenia:
 * 1. Znajdz najwieksze z minimow poszczegolnych wierszy.
 * 2. Policz srednia minimow wierszy.
 */
