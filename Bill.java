import java.util.Scanner;
class Bill{

 public static void main(String args[]){

 Scanner s=new Scanner(System.in);

 System.out.println("Enter number of units to generate bill");
int units=s.nextInt(); //170
double bill=0;
if(units<=50){
bill=(units*0.50);
}
else if(units<=150) {
bill=(50*0.50)+(units-50)*1.20;
}
else{
bill=(50*0.50)+(100*1.20)+(units-150)*1.50;
}
System.out.println("Bill is: "+bill);
}
}