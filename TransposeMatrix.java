/* JFM1T5_Assignment 4:

   Write a program to create a square matrix and print its transpose.
   Prompt the user input from the terminal.
   
  Sample Input:
  Enter number of rows: 3
  Enter number of columns: 3
  Elements  [1,1] : 2
  Elements  [1,2] : 3
  Elements  [1,3] : 4
  Elements  [2,1] : 1
  Elements  [2,2] : 2
  Elements  [2,3] : 3
  Elements  [3,1] : 4
  Elements  [3,2] : 5
  Elements  [3,3] : 6
   
  Expected Output:
    
  After Transpose Matrix  
  2       1       4
  3       2       5
  4       3       6
   
*/

import java.util.*;
class TransposeMatrix{
  public static void main(String args[]){
    int i,j,row,col;
    Scanner s=new Scanner(System.in);
    System.out.println("enter number of row:");
    row=s.nextInt();
    System.out.println("enter number of column:");
    col=s.nextInt();
    System.out.println("enter matrix"); 
    int a[][]=new int[row][col];
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            System.out.println("Enter arr["+i+"] ["+j+"]");
            a[i][j]=s.nextInt();
        }
    }
   int b[][]=new int[row][col];
   for(i=0;i<row;i++){
      for(j=0;j<col;j++){
         b[i][j]=a[j][i];
        }
     }
    System.out.println(" After  transpose matrix   ");
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
          System.out.print(b[i][j]+" ");
        }
         System.out.println(" ");
    }
  }
}