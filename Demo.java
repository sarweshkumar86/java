interface Testt
{
public void name();
}


class Test implements Testt
{
public void name()
{
System.out.println(" hello I am sarwesh kumar");
} 
}

class Demo
{
public static void main(String[] args)
{
Test t=new Test();
t.name();

}


}