import java.util.Scanner;
class  Neagtive{
  public static void main(String args[]){
    int n,pcount=0,ncount=0;
    Scanner s= new Scanner(System.in);
    System.out.println("Enter size of array");
    n=s.nextInt();
    int l[]= new int[n];
    System.out.println("Enter  array elements");
    for(int i=0;i<n;i++)
    l[i]= s.nextInt();
    //System.out.println("sum of array elements is:");
    for(int i=0;i<n;i++)
      {
        if(l[i]<0)
          ncount++;
        else if(l[i]>0)
          pcount++;
      }
       System.out.println(ncount);
     System.out.println(pcount);
    
  }
}