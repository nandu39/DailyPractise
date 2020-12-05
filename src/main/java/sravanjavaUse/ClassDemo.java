package sravanjavaUse;

public class ClassDemo
{
    int i=10, j=20;
    public static void main(String[] args)
    {
        ClassDemo cls=new ClassDemo();
        cls.add();
        System.out.println(cls.i);

    }

    public void add()
    {
        int  a=20,b=25,c;
        c=a+b;
        System.out.println("sum is: "+c);
    }
}
