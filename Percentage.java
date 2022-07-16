//JFM1T3_Assignment2:
/*
1.Write a program to calculate your percentage assuming total marks given. Print the percentage after rounding it off. 
  Allow user to input the marks from the terminal. 

  Sample Input:
        maximum_marks=500
        total_marks=348

  Expected Output:
        percentage= 70%
       

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class Percentage 
{
   public static void main(String args[]){
      float percentage;
      float total_marks;
      float maximum_marks;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your marks ::");
      maximum_marks = sc.nextFloat();

      System.out.println("Enter total marks ::");
      total_marks = sc.nextFloat();

      percentage =  ( maximum_marks/ total_marks)* 100;
      System.out.println("Percentage ::"+ percentage);
   }
}