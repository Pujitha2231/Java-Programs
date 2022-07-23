import java.util.*;
public class IndexArray {
    public static void main(String[] args) {
        int element;
        int index=0;
        int size;
        Scanner s=new Scanner(System.in);
        System.out.println("enter size of an array:");
        size=s.nextInt();
        int arr[]=new int[size];
        System.out.println("enter numbers:");
        for(int i=0;i<size;i++)
        arr[i]=s.nextInt();
        System.out.println("enter element to find the index:");
        element=s.nextInt();
        for(int i = 0; i < size; i++) {
            if(arr[i] == element) {
                index = i;
                break;
            }
        } 
        System.out.println("Index of   given element is : "+index);
    }
}