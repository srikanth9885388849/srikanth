import java.util.Scanner;
class simple
{
 int age;
void display()
{
    if(age>=18)
    {
      System.out.println("eligoble for vote");
    }
   System.out.println("the age is:"+age);
}
}
class mpcs1
{
 public static void main(String args[])
 {
 simple x=new simple();
  x.age=20;
  x.display(); 
}
}