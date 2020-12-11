package sravanjava;

public class AdvCalc implements CalcInterFace
{

    public static void main(String[] args)
    {
    CalcInterFace obj1=new AdvCalc();
    obj1.add();
    obj1.sub();

    AdvCalc obj2=new AdvCalc();
    obj2.cos();
    obj2.sin();
    obj2.add();
    obj2.sub();

        System.out.println(a);

    }
    public void cos()
    {
        System.out.println("this is cos");
    }
    public void sin()
    {
        System.out.println("this is sin");
    }
    public void add()
    {
        System.out.println("this is add");
    }

    public void sub()
    {
        System.out.println("this is sub");
    }
}
