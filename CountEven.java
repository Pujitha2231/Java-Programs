import java.util.Scanner;
class  CountEven{
  public static void main(String args[]){
    int n,ecount=0,ocount=0;
    Scanner s= new Scanner(System.in);
    System.out.println("Enter size of array");
    n=s.nextInt();
    int l[]= new int[n];
    System.out.println("Enter  array elements");
    for(int i=0;i<n;i++)
    l[i]= s.nextInt();
   for(int i=0;i<n;i++)
      {
         if(l[i]%2==0)
           ecount++;
        else if(l[i]%2!=0)
          ocount++;
      }
       System.out.println(ecount);
     System.out.println(ocount);
  }
}