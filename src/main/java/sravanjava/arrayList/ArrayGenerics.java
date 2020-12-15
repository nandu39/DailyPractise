package sravanjava.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayGenerics
{
    public static void main(String[] args)
    {
        ArrayList<String> aStr=new ArrayList<String>();
        aStr.add("Array");
        aStr.add("List");
        aStr.add("123");

        //Enhanced for loop
        for(String s:aStr)
        {
            System.out.println("ArrayList vals are "+s);
        }

        List<String> bStr=new ArrayList<String>();
        bStr.add("Parent");


    }
}
