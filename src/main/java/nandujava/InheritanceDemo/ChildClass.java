package nandujava.InheritanceDemo;

public class ChildClass extends ParentClass
{
    public static void main(String[] args)
    {
        ChildClass obj1=new ChildClass();
        /* ChildClass reference ChildClass object- this will allow to access all the methods of ParentClass & ChildClass */

        obj1.add();
        obj1.sub();
        obj1.mul();
        obj1.div();
    }

    public void mul()
    {
        System.out.println("Child Class and Multiplication is 2500");
    }

    public void div()
    {
        System.out.println("Child Class and Division is 11");
    }

}
