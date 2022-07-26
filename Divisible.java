import java.util.*;
public class  Divisible{
  public static void main(String args[]){
    
    Scanner s = new Scanner(System.in);
     System.out.println("Enter a number:");
      int num = s.nextInt();
    if((num%5 == 0) && (num%11 == 0)){
      System.out.println(num + " is divisible by 5 or 11");
    }
    else{
      System.out.println(num + " is not divisible by 5 or 11");
    }
  }
}