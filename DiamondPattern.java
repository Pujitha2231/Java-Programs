/* JFM1T4_Assignment5:
   Write a program to print the following pattern:
       a
     a b a
   a b c b a
     a b a
       a
*/
import java.util.Scanner; 
public class DiamondPattern {

   public static void main(String[] args) {

       for(int i=0;i<=4;i++){
         for(int j=0;j<=4;j++){
             if((i==2) || (j==2)||(i+j)%2==0 && (j%2!=0)){
            if(i==2 && j==2){
                 System.out.print("c"+" ");
             }
              else if((i+j==5)||(i+j==3)){
                 System.out.print("b"+" ");
             }
            else {
                 System.out.print("a"+" ");
             }
             }
             
             else{
           System.out.print(" "+" ");
             }
         }
         System.out.println(" ");
       }




     
   }
}