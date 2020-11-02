import java.util.Scanner;

class Function4
{
public static void main(String[] args)
{
System.out.println(" function with return type and take parameters ");

System.out.println("please enter two  number");

Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();




Function fun=new Function();
int z= fun.add(a,b);

System.out.println("Sum of  two  number"+ z);

}}



class Function
{

int add(int x,int y)
{
return(x+y);
}
}