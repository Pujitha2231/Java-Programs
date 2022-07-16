/* JFM1T4_Assignment4:
   Write a program to print the following pattern:
     1 
     01 
     101 
     0101 
     10101 
*/

  import java.util.Scanner;
 public class Pattern{
     public static void main(String args[]){
         int i,j;
         Scanner s= new Scanner(System.in);
         System.out.println("enter no. of rows:");
         i=s.nextInt();
         for( i=1;i<=5;i++){
             for(j=1;j<=i;j++){
                 if((i+j)%2==0 ){
                    System.out.print("1"+" "); 
                 }
                 else{
                     System.out.print("0"+ " ");
                 }
 
             }
              System.out.println(" ");
         }
     }
 }