package nandujava.InheritanceDemo;

public class ChildClass2 extends ParentClass
{

    public static void main(String[] args)
    {
        ParentClass obj1=new ChildClass2();

        /* ParentClass reference and ChildClass object- this will allow to access all the methods of ParentClass only not ChildClass methods */

        obj1.add();
        obj1.sub();
        //obj1.mul();
        //obj1.div();
    }

    public void mul()
    {
        System.out.println("Child Class and Multiplication is 2500");
    }

    public void div()
    {
        System.out.println("Child Class and Division is 50");
    }

}
