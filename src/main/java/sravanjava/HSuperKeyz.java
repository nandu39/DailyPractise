package sravanjava;

public class HSuperKeyz extends Parameter
{
    public static void main(String[] args)
    {
        HSuperKeyz sk=new HSuperKeyz();
//        sk.showMeInxt();
//        sk.showMeIntAtPvt();



    }

    public void showMeInxt()
    {
        System.out.println("show me int method");
    }

    public void showMeIntAtPvt()
    {
        showMeInxt();
        System.out.println("Pvt bank");
    }
}

//output: show me int method .. pvt bank