package sravanjava.generic;

public class ChildClsA extends ParentClsA
{
    public static void main(String[] args) {
        ChildClsA obj1= new ChildClsA();

        obj1.P1();
        obj1.P2();
        obj1.c1();
    }

    public void c1()
    {
        System.out.println("c1");
    }

}

