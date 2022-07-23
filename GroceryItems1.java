import java.util.Scanner;
class GroceryItems1{
public static void main(String args[]){
     
    int i ;
    Scanner s= new Scanner(System.in);
    float l[]= new float[10];
    System.out.println("Enter  array elements");
    for(i=0;i<10;i++)
    l[i]= s.nextFloat();
     float max=l[0];
    for(i=0;i<10;i++)
      {
        if(l[i]>max)
          max=l[i];
      }
    System.out.println("The highest price you incurred is" + max) ;  
  }
}