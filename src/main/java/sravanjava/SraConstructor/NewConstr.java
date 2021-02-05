package sravanjava.SraConstructor;

public class NewConstr
{

    int a, b;

    public NewConstr()
    {
        this.a=10;
        this.b=20;
    }

    public static void main(String[] args)
    {
        NewConstr cn=new NewConstr();

        System.out.println("val of a is: "+cn.a);
        System.out.println("val of b is: "+cn.b);
    }

}
