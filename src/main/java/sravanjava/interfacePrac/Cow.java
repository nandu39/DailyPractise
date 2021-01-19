package sravanjava.interfacePrac;

public class Cow implements Animal
{
    public void sound()
    {
        System.out.println("this is Animal sound");
    }

    public void run()
    {
        System.out.println("this is Animal run");
    }

    public static void main(String[] args)
    {
        Cow cw=new Cow();

        cw.sound();
        cw.run();

    }

}
