/* JFM1T4_Assignment1:
   Write a program to find the highest among the given 3 numbers.
   Prompt the user for the 3 numbers to be input from the terminal.

   SampleInput: 
   Enter the first number: 11
   Enter the second number: 22
   Enter the third number: 1

   Expected Output:
   22 is highest number
 	
*/

//import statements for java program to read inputs using Scanner class 
   import java.util.Scanner;
 public class HighestNumber{
     public static void main(String args[]){
         int i,j,k;
         Scanner s= new Scanner(System.in);
         System.out.println("Enter the first no:");
         i=s.nextInt();
         System.out.println("Enter the second no:");
         j=s.nextInt();
         System.out.println("Enter the third no:");
         k=s.nextInt();
         if(i>j && i>k){
             System.out.println(i+" is the highest number");
         }
         else if(j>k && j>i){
             System.out.println(j+" is the highest number");
         }
         else {
             System.out.println(k+" is the highest number");
         }
     }
 }