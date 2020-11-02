import java.util.Scanner;

class TwoDarray3
{
public static void main(String[] args)
{

Scanner scan=new Scanner(System.in);
System.out.println("please enter nine number");
int i,j;
int a[][]=new int[3][3];

for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
a[i][j]=scan.nextInt();
}
}

System.out.println("Display the matrix form of 3*3 ");

for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[i][j]+ "  ");
}
System.out.println("");
}




System.out.println("Display the matrix after transpose of 3*3 ");

for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[j][i]+ "  ");
}
System.out.println("");
}





}}