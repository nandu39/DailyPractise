package sravanjava;

public class ChildClass extends IsNotDisp
{
    public static void main(String args[]) throws InterruptedException {
//        ChildClass ch=new ChildClass();
//        ch.add();
//        ch.sub();
//        ch.mul();
        IsNotDisp ch=new IsNotDisp();
        ch.cancelTkt();
        if(ch.cancelTkt()==false)
        {
            System.out.println("Cancel ticket is not displayed");
        }
    }

    public void mul()
    {
        System.out.println("this is mul");
    }
}
