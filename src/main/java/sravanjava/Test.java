package sravanjavaUse;

public class Test {
    public int sub(int d, int e)
    {
        int c=d-e;
        return c;
    }

    public static void main(String[] args)
    {
        Test test = new Test();
        int f =test.sub(4,5);
        System.out.println(f);
    }
}
