import java.util.Scanner;

class WhileLoop
{
public static void main(String[] args)
{

Scanner scan=new Scanner(System.in);
System.out.println("Display even up to 10 number using while loop");
int i=1;
while(i<10)
{
if(i%2==0)
{
System.out.println(i);
}
i++;
}


}}