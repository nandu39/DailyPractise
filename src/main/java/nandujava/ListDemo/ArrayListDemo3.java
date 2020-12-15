package nandujava.ListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3
{
    public static void main(String[] args)
    {

        ArrayList obj= new ArrayList();
        obj.add(3988);
        obj.add('N');
        obj.add("Nandu");
        obj.add("Nandu"); /* List will allow duplicate values */
        obj.add(25.11);

        Iterator itr=obj.iterator();

        while(itr.hasNext())
        {
            Object val=itr.next();
            System.out.println("Values are: "+val);
        }



    }
}
