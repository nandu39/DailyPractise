package sravanjava;

public class Polymorphism
{
    public static void main(String[] args) {
        Polymorphism pm=new Polymorphism();
        pm.sum(10,20);
        pm.sum(10,20,30);
        pm.sum(10,20.10);
        pm.sum(10.20,20);
    }
    public void sum(int a, int b)
    {
        int c=a+b;
        System.out.println(c);
    }

    public void sum(int a, int b,int d)
    {
        int c=a+b+d;
        System.out.println(c);
    }
    public void sum(int a, double b)
    {
        double c=a+b;
        System.out.println(c);
    }
    public void sum(double a, int b)
    {
        double c=a+b;
        System.out.println(c);
    }
}
