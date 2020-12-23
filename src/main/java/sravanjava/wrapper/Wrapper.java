package sravanjava.wrapper;

public class Wrapper
{
    public static void main(String[] args)
    {
        int a=10;
        // Integer is Wrapper class
        Integer ab=110;
        String ac="123";
        String bd="456";

        int k=Integer.parseInt(ac);
        int j=Integer.parseInt(bd);

        System.out.println(ab.intValue());
        System.out.println(k+j);

//        autoboxing
        int bx=30;
        Integer xb=bx;
        System.out.println(xb);

//        boxing
        int cy=40;
        Integer yb=Integer.valueOf(cy);
        System.out.println(yb);

//        Unboxing
        Integer ka=25;
        int kb=ka.intValue();
        System.out.println(kb);

//        Auto unboxing
        Integer ja=35;
        int aj=ja;
        System.out.println(aj);

    }
}
