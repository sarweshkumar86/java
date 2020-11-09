class Test1
{
void car()
{
System.out.println(" I want red color car");
}
}


class Test2 extends Test1
{
void car()
{
System.out.println(" I want white color car");
}

}


class Demo
{

public static void main(String a[])
{
Test2 t=new Test2();
t.car();

}
}