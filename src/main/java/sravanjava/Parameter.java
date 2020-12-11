package sravanjavaUse;

public class Parameter
{
    public static void main(String[] args)
    {
        Parameter pr=new Parameter();
        pr.sum(12, 15);
        Parameter.subt(10,4);
        int mul=pr.mult(7,4);
        System.out.println(mul);
        String fnm=Parameter.myName("Sra1","muthu");
        System.out.println(fnm);

    }

    public void sum (int a, int b)
    {
        int c=a+b;
        System.out.println(c);
    }

    public static void subt(int x, int y)
    {
        int z=x-y;
        System.out.println(z);
    }

    public int mult(int p, int r)
    {
        int s=p*r;
        return s;
    }

    public static String myName(String fn, String ln)
    {
        String nm=fn+ln;
        return nm;
    }
}
