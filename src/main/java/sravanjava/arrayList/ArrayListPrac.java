package sravanjava.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPrac
{
    public static void main(String[] args)
    {
        ArrayList arl=new ArrayList();

        arl.add("Test");
        arl.add(123);
        arl.add('A');
        arl.add(1234567899);
        System.out.println(arl);

        arl.add(2,43);
        System.out.println(arl);

        //        normal for loop
        int sz=arl.size();
        for(int i=0;i<sz;i++)
        {
            System.out.println("regular for loop vals "+arl.get(i));
        }

        //        enhanced for loop
        for(Object ab:arl)
        {
            System.out.println("adv for loop vals "+ab);
        }

        //        iterator
        Iterator it=arl.iterator();
        while (it.hasNext())
        {
            Object ob=it.next();
            System.out.println("Iterator vals "+ob);
        }

    }
}
