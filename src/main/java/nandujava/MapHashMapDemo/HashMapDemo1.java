package nandujava.MapHashMapDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1
{
    public static void main(String[] args)
    {
        HashMap<String,String> obj=new HashMap<String, String>();

        obj.put("3","Selenium");
        obj.put("9","Testing");
        obj.put("25","Java");
        obj.put("11","Developer");

        for(Map.Entry<String,String> mapdata:obj.entrySet())
        {
            System.out.println("Key from Map is " +mapdata.getKey()+ " and Value is: "+mapdata.getValue());
        }
    }
}
