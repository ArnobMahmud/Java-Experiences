package main; 
import java.util.Scanner;
 
/*
 * @author arnob mahmud
 *
 * mail : arnob.tech.me@gmail.com
*/ 

public class StringWork { 
     public static void main(String[] args){

          int n; 
          System.out.print("N = ");
 
          String[] st; 
          try (Scanner input = new Scanner(System.in)) { 
               n = input.nextInt(); 
               input.skip(System.lineSeparator());

               st = new String[n]; 
               for(int i = 0; i < n; i++){
                   st[n] = input.nextLine();
               } 
          } 

          for(int i = 0; i < n; i++){
              System.out.println(st[n]); 
          }
     }
}
