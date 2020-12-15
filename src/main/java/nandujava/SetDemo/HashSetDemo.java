package nandujava.SetDemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo
{
    public static void main(String[] args)
    {
//        HashSet<String> val=new HashSet<String>();
        Set<String> val=new HashSet<String>(); /* Set is parent and HashSet is child */
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
