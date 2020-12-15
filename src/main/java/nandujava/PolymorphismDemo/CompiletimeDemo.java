package nandujava.PolymorphismDemo;

public class CompiletimeDemo
{
    public static void main(String[] args)
    {

        CompiletimeDemo obj=new CompiletimeDemo();

        obj.add(3,11);
        obj.add(1988,3);
        obj.add(2511,1991);
        obj.add(3,9,25);
    }

    public void add(int a, int b)
    {
        int c=a+b;
        System.out.println("Addition of two numbers: "+c);
    }

    //    Method overloading can be done if the method has same name (add) but with different signature

    public void add(int a,int b,int d) 			/* number of arguments are different*/
    {
        int c=a+b+d;
        System.out.println("Addition of three numbers: "+c);
    }

    public void add(double a,double b)			/* type of arguments are different */
    {
        double c=a+b;
        System.out.println("Addition of two numbers: "+c);
    }

    public void add(double a,int b)				/* order of arguments are different */
    {
        double c=a+b;
        System.out.println("Addition of two numbers: "+c);
    }
}
