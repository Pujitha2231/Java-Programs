class Count{

 public static void main(String args[]){
int ecount=0,ocount=0;
int arr[]={10,39,45,90,67,88};
for (int i=0;i<arr.length;i++){
if(arr[i]%2==0){
 ecount++;
}
else{
ocount++;
}
}
System.out.println("count of even numbers: "+ecount);
System.out.println("count of odd numbers: "+ocount);

}
}