/* 
   JFM1T5_Assignment 5:
   Write a program to find and print the maximum element in a two-dimensional array with its index position.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of row and column: 
   2
   3
   Enter arr [ 0 ] [ 0] : 1
   Enter arr [ 0 ] [ 1] : 2
   Enter arr [ 0 ] [ 2] : 3

   Enter arr [ 1 ] [ 0] : 4
   Enter arr [ 1 ] [ 1] : 5
   Enter arr [ 1 ] [ 2] : 6
   
   Expected Output:
   Largest element in array is 6 and its index position is arr [ 1 ] [ 2 ]  

*/

   import java.util.*;
   class TwoDimensionalArray
   {
    public static void main(String args[])
     {
      int r;
  int c;
  int x=0;
  int y=0;
  int[][] arr= new int[10][10];
  Scanner sc=new Scanner(System.in);
  System.out.println("enter rows of matrix");
  r=sc.nextInt();
  System.out.println("enter cloumns of matrix");
  c=sc.nextInt();
for(int i=0;i<r;i++){
for(int j=0;j<c;j++)
  {
    System.out.println("enter array elements"+"["+i+","+j+"]"+":");
    arr[i][j]=sc.nextInt();
  }
    }
  int max=arr[0][0];
  for(int k=0;k<arr.length;k++){
    for(int m=0;m<arr.length;m++)
      {
        if(arr[k][m]>max){
          max=arr[k][m];
          x=k;
          y=m;
        }
      }
  }
  System.out.println("largest element in array is  "+max+"array index position is arr["+x+"]"+"["+y+"]");
   }
}
