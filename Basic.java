import java.util.Scanner;
class Basic{
  public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    System.out.println("Enter a Salary");

   int basic=s.nextInt();
float hra=0,da=0,gs=0;
if(basic<=10000){
hra=(basic*67)/100;
da=(basic*78)/100;
}
else if(basic<=20000){
hra=(basic*70)/100;
da=(basic*80)/100;
}
else{
hra=(basic*75)/100;
da=(basic*85)/100;
}
gs=hra+da+basic;

System.out.println("HRA : "+hra);
System.out.println("DA : "+da);
System.out.println("Gross salary: "+gs);
}
}
