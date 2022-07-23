  import java.util.*;
class Alternate{
  public static void main(String args[]){
    int n;
    Scanner s=new Scanner(System.in);
    System.out.println("enter no of array elements");
     n=s.nextInt();
    
    int a[]=new int[n];
    System.out.println("Enter  array elements");
    for(int i=0;i<n;i++)
    a[i]= s.nextInt();
    
     for (int i = 0; i < n ; i = i+2) {  
            System.out.println(a[i]);  
        }  
  }
}