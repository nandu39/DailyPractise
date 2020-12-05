package nandujava;

public class CalculateTest extends Calculate{

    @Override
    public int addition(int a, int b) {
       int  c= super.addition(a, b);
       return c + 10;
    }

    public static void main(String[] args) {
        CalculateTest calculateTest = new CalculateTest();
        calculateTest.addition(1,2);
    }
}
