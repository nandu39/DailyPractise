package nandujava.ListDemo;

import java.util.ArrayList;

public class ArrayListDemo1
{
    public static void main(String[] args)
    {
        ArrayList obj= new ArrayList();
        obj.add(3988);
        obj.add('N');
        obj.add("Nandu");
        obj.add("Nandu"); /* List will allow duplicate values */
        obj.add(25.11);

        int listsize=obj.size();

        for(int i=0;i<listsize;i++)
        {
            System.out.println("Values in the list are: " + obj.get(i));
        }
    }
}
