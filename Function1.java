import java.util.Scanner;

class Function1
{
public static void main(String[] args)
{
System.out.println(" function with no return type and  no parameters ");

Function fun=new Function();
fun.add();

}}



class Function
{

void add()
{
Scanner scan=new Scanner(System.in);
System.out.println("please enter two  number");

int a=scan.nextInt();
int b=scan.nextInt();

System.out.println("Sum of  two  number"+(a+b));
}
}