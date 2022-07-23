  import java.util.Scanner;
class  CommonArray
  {
       
  public static void main(String args[]){
    int n,i,j;
    Scanner s=new Scanner(System.in);
    System.out.println("enter no of array elements");
     n=s.nextInt();
    
    int a[]=new int[n];
    System.out.println("enter array elements");
    for(i=0;i<n;i++)
      a[i]=s.nextInt();
    
    int b[]=new int[n];
     System.out.println("enter array elements");
    for(j=0;j<n;j++)
      b[j]=s.nextInt();
     
      for(i=0;i<n;i++){
       for(j=0;j<n;j++)
      { 
        if(a[i]==b[j]){
             System.out.println(a[i]);
        } 
     }
    }
  }
}