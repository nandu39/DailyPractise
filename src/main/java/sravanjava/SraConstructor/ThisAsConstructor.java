package sravanjava.SraConstructor;

public class ThisAsConstructor
{
 public ThisAsConstructor()
 {
     this("sra");
     System.out.println("null constructor");
 }

 public ThisAsConstructor(int b)
{
    this(10,20);
    System.out.println("int val b is "+b);
}

public ThisAsConstructor(int c, int d)
{
    this.nonConst();
    System.out.println("int val b is "+c+d);
}

 public void nonConst()
 {
     System.out.println("non constructor method");
 }
 public ThisAsConstructor(String a)
    {
        this(5);
        System.out.println("String a val "+a);
    }

 public static void main(String[] args)
    {
//        ThisAsConstructor ts=new ThisAsConstructor();
        System.out.println("the end");

    }

} /* output: nonconstructed method */
