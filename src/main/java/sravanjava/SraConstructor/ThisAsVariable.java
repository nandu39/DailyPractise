package sravanjava.SraConstructor;

public class ThisAsVariable
{

    int x,y;

 public ThisAsVariable(int x,int y)
{
    this.x=x;
    this.y=y;
}
public void sum()
{
    int c=x+y;
    System.out.println(c);
}

    public static void main(String[] args)
    {
        ThisAsVariable tv=new ThisAsVariable(10,20);
        System.out.println(tv.x+" "+tv.y);
        tv.sum();
    }

}
