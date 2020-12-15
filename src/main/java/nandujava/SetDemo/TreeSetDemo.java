package nandujava.SetDemo;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo
{
    public static void main(String[] args)
    {

        TreeSet<String> val=new TreeSet<String>();

        val.add("Selenium");
        val.add("Testing");
        val.add("9");
        val.add("Automation");
        val.add("Nandu");

        for(String setval:val)
        {
            System.out.println("Value is: "+setval);
        }

        Iterator itr=val.descendingIterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
