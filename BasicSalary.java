import java.util.Scanner;
public class BasicSalary
{
public static void main(String args[])
{
double basic,da,hra,gross;
System.out.println("Enter Basic salary of the employee\n");
Scanner s=new Scanner(System.in);
basic=s.nextDouble();
  if(basic<=10000)
   {
    da=80*basic/100;
    hra=20*basic/100;
    gross= basic+da+hra;
   }
    else if((basic>10000)&&(basic<=20000))
     {
      da=90*basic/100;
      hra=25*basic/100;
      gross= basic+da+hra; 
     }
  else{
      da=95*basic/100;
      hra=30*basic/100;
      gross= basic+da+hra;
  }
System.out.println("The D.A of the basic salary of the employee is:" +da);
System.out.println("The H.R.A of the basic salary of the employee is:" +hra);
System.out.println("The Gross salary of the employee is:" +gross);
}
}