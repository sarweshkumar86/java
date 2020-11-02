import java.util.Scanner;

class OneDarray1
{
public static void main(String[] args)
{

Scanner scan=new Scanner(System.in);
System.out.println("please enter five number");
int i;
int a[]=new int[5];

for(i=0;i<5;i++)
{
a[i]=scan.nextInt();
}

System.out.println("your entered value is");

for(i=0;i<5;i++)
{
System.out.println(a[i]);

}



}}