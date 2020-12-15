package nandujava.ListDemo;

import java.util.ArrayList;

public class ArrayListDemo
{
    public static void main(String[] args)
    {

        ArrayList obj= new ArrayList();
        obj.add(3988);
        obj.add('N');
        obj.add("Nandu");
        obj.add(25.11);

        System.out.println(obj);
        System.out.println(obj.get(3));

    }
}
