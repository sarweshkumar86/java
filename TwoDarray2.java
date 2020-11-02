import java.util.Scanner;

class TwoDarray2
{
public static void main(String[] args)
{

Scanner scan=new Scanner(System.in);
System.out.println("please enter six number");
int i,j;
int a[][]=new int[3][2];

for(i=0;i<3;i++)
{
for(j=0;j<2;j++)
{
a[i][j]=scan.nextInt();
}
}

System.out.println("Display the result of 3*2 matrix form");

for(i=0;i<3;i++)
{
for(j=0;j<2;j++)
{
System.out.print(a[i][j]+ "  ");
}
System.out.println("");
}






}}