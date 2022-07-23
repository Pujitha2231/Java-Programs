import java.util.*;
class Copy{
  public static void main(String args[]){
    int n,i;
    Scanner s=new Scanner(System.in);
    System.out.println("enter no of array elements");
     n=s.nextInt();
    int a[]=new int[n];
    int b[]=new int[n];
    System.out.println("enter array elements");
    for(i=0;i<n;i++)
      a[i]=s.nextInt();
     
    for(i=0;i<n;i++)
      {
         
        b[i]=a[i];
      }
       System.out.println("enter new array");
    for(i=0;i<n;i++)
     System.out.println(b[i]);
  }
}