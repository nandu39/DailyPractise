package nandujava.SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo
{
    public static void main(String[] args)
    {
        LinkedHashSet<String> val=new LinkedHashSet<String>();
        val.add("Selenium");
        val.add("Testing");
        val.add("9");
        val.add("Automation");
        val.add("Nandu");

        System.out.println(val);

        for(String setval:val)
        {
            System.out.println("Value is: "+setval);
        }
    }
}
