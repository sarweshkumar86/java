class Test
{
static  int a=10;
static int b=10;
static void add()
{
System.out.println("sum of two number is "+(a+b));
}

static void mult()
{
int aa=20;
int bb=20;
System.out.println("Multiplication of two number is "+(aa*bb));
}

}

class Demo
{
//static int a=10;
//static int b=10;


public static void main(String[] args)
{
System.out.println("helllo this is main class");
//System.out.println(a+b);
//System.out.println(Test.a+Test.b);
//Test.add();
Test.mult();

}
}