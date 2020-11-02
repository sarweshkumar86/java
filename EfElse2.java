import java.util.Scanner;
class EfElse2
{
public static void main(String[] args)
{

Scanner scan=new Scanner(System.in);
System.out.println("please enter a number");
int a=scan.nextInt();

if(a%13==0 && a%7==0)
{
System.out.println("The number is divisible by 13 and 7");
}

else
{
System.out.println("The number is not divisible by 13 and 7");
}


}}