package sravanjava.generic;

public class ChildClsB extends ChildClsA
{
    public static void main(String[] args)
    {
        ChildClsB obj2=new ChildClsB();

        obj2.P1();
        obj2.c1();
        obj2.c1();
    }
    public void c1()
    {
        System.out.println("cls B c1");
    }

}
