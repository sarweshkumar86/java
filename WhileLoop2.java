import java.util.Scanner;

class WhileLoop2
{
public static void main(String[] args)
{

Scanner scan=new Scanner(System.in);
System.out.println("Display number up to 100 which divisible by 7 number using while loop");
int i=1;
while(i<100)
{
if(i%7==0)
{
System.out.println(i);
}
i++;
}


}}