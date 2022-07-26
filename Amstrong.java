import java.util.Scanner;
class Amstrong{
 public static void main(String args[]){
 Scanner s=new Scanner(System.in);
System.out.println("Enter number to check it is Armstrong number or not.");
int num=s.nextInt(); // 153
int temp=num;
int sum=0;
int count=0;
while(num!=0){
num=num/10;
count++;
}
num=temp;
// System.out.println("Number of digits: "+count);
int rem=0;
while(num!=0){
rem=num%10; // 3
sum=sum+(int)Math.pow(rem,count);
num=num/10;
}
if(temp==sum){
System.out.println("Armstrong number");
}
else{
System.out.println("Not a Armstrong number");
}
}
}
