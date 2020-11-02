import java.util.Scanner;

class TwoDarray1
{
public static void main(String[] args)
{

Scanner scan=new Scanner(System.in);
System.out.println("Example of two dimensions");
int i,j;
int a[][]=new int[][]{{10,20},{30,40}};

for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
System.out.print(a[i][j]+" ");
}

System.out.println("");
}



}}