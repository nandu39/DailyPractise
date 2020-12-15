package nandujava.ConstructorDemo;

public class Marks
{
    int result;

    public static void main(String[] args)
    {
        Marks obj1=new Marks(90);
        obj1.displayResult();
    }
    public Marks(int marks)		/* Constructor should be same as Class name*/
    {
        result=marks;
        System.out.println("Marks are:"+result);
    }
    public void displayResult()
    {
        System.out.println("Final marks for Student is "+result);
    }

}
