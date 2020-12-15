package nandujava.InheritanceDemo;

public class ChildClass1 extends ParentClass
{
    public static void main(String[] args)
    {
        ParentClass obj1=new ParentClass();
        /* ParentClass reference ParentClass object- this will allow to access all the methods of ParentClass only */

        obj1.add();
        obj1.sub();
//        obj1.mul();   /* mul is chlid class object */
//        obj1.div();   /* div is child class object */
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