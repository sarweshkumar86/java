import java.util.Scanner;

class Function3
{
public static void main(String[] args)
{
System.out.println(" function with return type and  NO parameters ");





Function fun=new Function();
int x= fun.add();

System.out.println("Sum of  two  number"+ x);

}}



class Function
{

int add()
{

System.out.println("please enter two  number");

Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();

return(a+b);
}
}