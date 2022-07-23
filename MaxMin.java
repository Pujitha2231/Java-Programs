import java.util.Scanner;
class   MaxMin{
  public static void main(String args[]){
    int n,max,min;
    Scanner s= new Scanner(System.in);
    System.out.println("Enter size of array");
    n=s.nextInt();
    int l[]= new int[n];
    System.out.println("Enter  array elements");
    for(int i=0;i<n;i++)
    l[i]= s.nextInt();
    min=max=l[0];
    //System.out.println("sum of array elements is:");
    for(int i=0;i<n;i++)
      { if(min>=l[i])
        min=l[i];
       if(max<=l[i])
         max=l[i];
      }
       System.out.println(max);
     System.out.println(min);
    
  }
}