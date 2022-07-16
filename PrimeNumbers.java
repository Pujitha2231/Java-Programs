/* JFM1T4_Assignment3:
   Write a program to print all the prime numbers between 2 numbers.
   Prompt the user to enter the 2 numbers.
   
   Sample Input:
   Enter starting Number: 20
   Enter ending Number: 30

   Expected Output:
   Prime numbers between 20 and 30 are : 
   23
   29

*/

//import statements for java program to read inputs using Scanner class 
  import java.util.Scanner;
  class PrimeNumbers{
    public static void main(String[] args) {
      int a,b;
      Scanner sc = new Scanner(System.in);
      System.out.printf("Enter starting number: ");
      a = sc.nextInt(); 
      System.out.printf("Enter ending number: ");
      b = sc.nextInt(); 
      while (a < b) {
        boolean flag = false;
            for(int i = 2; i <= a/2; ++i) {
                if(a% i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag && a != 0 && a != 1)
                System.out.print(a + " ");
            ++a;
        }
    }
}