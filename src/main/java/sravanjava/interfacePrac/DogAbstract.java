package sravanjava.interfacePrac;

//-- another example of Interfact Abstract
public abstract class DogAbstract implements Animal
{
    public void sound()
    {
        System.out.println("Sound of Dog is:");
    }

    public abstract void run();
}