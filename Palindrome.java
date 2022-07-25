/*  JFM1T8_Assignment4:

    Write a program to check whether a string is a Palindrome.
    Prompt the user input from the terminal.
    
    Sample input: Malayalam
    
    Expected output: Malayalam is a Palindrome
*/

import java.util.Scanner;

public class Palindrome {

//main method
public static void main(String args[]){

//declare varible
 
//take input from user
 
String str= "malayalam";
String rev="";
int i=str.length()-1;
 for(;i>=0;i--)
   {
     rev=rev+str.charAt(i);
   }
  if(rev.equals(str)){
    System.out.println(rev + " is a palindrome");
  }
  else{
  
    System.out.println( rev + " not palindrome");
  
  
  }
    /* 
   divide the whole string into two halves and compare each character in the 
   first half with each character in the second half in reverse.  
   If both are equal then it is a palindrome else print it is not a palindrome 
*/

}
}