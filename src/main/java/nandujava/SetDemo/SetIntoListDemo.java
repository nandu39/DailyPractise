package nandujava.SetDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetIntoListDemo
{
    public static void main(String[] args)
    {
        Set<String> val=new HashSet<String>(); /* Set is parent and HashSet is child */
        val.add("Selenium");
        val.add("Testing");
        val.add("9");
        val.add("Automation");
        val.add("Nandu");

        System.out.println(val);

        ArrayList<String> obj=new ArrayList<String>(val);
        System.out.println(obj.get(3));

    }
}
