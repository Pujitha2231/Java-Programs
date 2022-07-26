 class StringBufferMethods{
     public static void main(String args[])
{
   StringBuffer s=new StringBuffer("Welcome");
    s.delete(1,1); 
    System.out.println(s); 
    s.delete(2,4); 
    System.out.println(s);
    StringBuffer s1=new StringBuffer("pujitha");
    s1.reverse(); 
    System.out.println(s1);
    StringBuffer s2=new StringBuffer("Gandepalli");
    s2.append("pujitha"); 
    System.out.println(s2);
    StringBuffer s3=new StringBuffer("uk");
    s3.insert(0,"London"); 
    System.out.println(s3);
    StringBuffer s4=new StringBuffer("pujit");
    s4.replace(3,4,"itha"); 
    System.out.println(s4);

}
}