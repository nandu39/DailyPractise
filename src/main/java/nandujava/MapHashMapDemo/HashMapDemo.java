package nandujava.MapHashMapDemo;

import java.util.HashMap;

public class HashMapDemo
{
    public static void main(String[] args)
    {
        HashMap<String,String> obj=new HashMap<String, String>();

        obj.put("3","Selenium");
        obj.put("9","Testing");
        obj.put("25","Java");
        obj.put("11","Developer");
        System.out.println(obj);

        String k=obj.get("25");
        System.out.println("Value of given Key is: "+k);
    }
}
