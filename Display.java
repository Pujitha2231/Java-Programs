import java.util.Scanner;
class Display{
  public static void main(String args[]){
    int n,sum=0;
    Scanner s= new Scanner(System.in);
    System.out.println("Enter size of array");
    n=s.nextInt();
    int l[]= new int[n];
    System.out.println("Enter  array elements");
    for(int i=0;i<n;i++)
      l[i]= s.nextInt();
    System.out.println("   array elements");
    for(int i=0;i<n;i++)
     
         sum=sum+l[i];
       System.out.println(sum);
    
  }
}