import java.util.Scanner;
class Switch
{
public static void main(String[] args)
{

Scanner scan=new Scanner(System.in);
System.out.println("1.floor number one");
System.out.println("2.floor number two");
System.out.println("3.floor number Three");
System.out.println("4.floor number four");


System.out.println("please enter your floor number");
int a=scan.nextInt();

switch(a)
{
case 1:System.out.println("You are floor number number 1");
break;
case 2:System.out.println("You are floor number number 2");
break;

case 3:System.out.println("You are floor number number 3");
break;
case 4:System.out.println("You are floor number number 4");
break;

default:System.out.println("Please enter valid floor number ");



}
}}