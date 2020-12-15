package nandujava.ListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo4
{
    public static void main(String[] args)
    {
        ArrayList<String> obj=new ArrayList<String>();
        /* List will allow only String */

        obj.add("Nandu");
        obj.add("Selenium");
        obj.add("Testing");

        for(String val:obj)
        {
            System.out.println("Value is: "+val);
        }
    }
}
