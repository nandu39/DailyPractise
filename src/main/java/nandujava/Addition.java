package nandujava;

public class Addition
{
    public int add(int a, int b){
      int c = a + b;
      return c;
    }
    public static void main(String[] args)
    {
        Addition addition = new Addition();
        int result = addition.add(3,9);
        System.out.println("Addition Result ="+result);

    }
}
