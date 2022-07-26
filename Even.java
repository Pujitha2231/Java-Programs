import java.util.*;
class  Even
  {
    public static void main(String args[])
    {
      int n;
      Scanner s= new Scanner(System.in);
      System.out.println("enter n value");
      n=s.nextInt();
      int i=1;
      while(i<=n){
        if(i%2==0)
        System.out.println(i);
        i=i+1;
        
      }
    }
  }