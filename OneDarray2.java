import java.util.Scanner;

class OneDarray2
{
public static void main(String[] args)
{

Scanner scan=new Scanner(System.in);
System.out.println("please enter five number");
int i;

int a[]=new int[5];
int b[]=new int[5];
int sum1=0;
int sum2=0;
int sum3=0;

for(i=0;i<5;i++)
{
a[i]=scan.nextInt();
}


for(i=0;i<5;i++)
{
sum1=sum1+a[i];
}




System.out.println("please enter five number");



for(i=0;i<5;i++)
{
b[i]=scan.nextInt();
}


for(i=0;i<5;i++)
{
sum2=sum2+b[i];
}




sum3=sum1+sum2;



System.out.println("Sum of two array");

System.out.println("Sum of this two array is"+sum3);



}}