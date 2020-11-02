import java.util.Scanner;

class Function2
{
public static void main(String[] args)
{
System.out.println(" function with no return type and  take parameters ");

Scanner scan=new Scanner(System.in);
System.out.println("please enter two  number");

int a=scan.nextInt();
int b=scan.nextInt();




Function fun=new Function();
fun.add(a,b);

}}



class Function
{

void add(int x,int y)
{

int a=x;
int b=y;
System.out.println("Sum of  two  number"+ (x+y));
}
}