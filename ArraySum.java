/*  
    JFM1T5_Assignment 1:
    Write a program to store 10 numbers in an array and display the sum of all the elements.
    Prompt the user for the 10 numbers to be input from the terminal.
    Sample Input:
    Enter the 10  elements:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    Expected Output:
    Sum of array elements is : 55

*/
   import java.util.Scanner;
class ArraySum{
  public static void main(String args[]){
    int sum=0;
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the 10 elements");
    int l[]= new int[10];
    for(int i=0;i<10;i++)
    l[i]= s.nextInt();
    System.out.println("Sum of array elements is:");
    for(int i=0;i<10;i++){
       sum=sum+l[i];  
    }
         
       System.out.println(sum);
    
  }
    
}
