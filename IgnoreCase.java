import java.util.*;
class IgnoreCase{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter a string");
    String s1=s.nextLine();
    System.out.println("enter a string");
    String s2=s.nextLine();
    System.out.println(s1.compareToIgnoreCase(s2));
  }
  
}