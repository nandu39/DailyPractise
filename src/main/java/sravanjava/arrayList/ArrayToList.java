package sravanjava.arrayList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList
{
    public static void main(String[] args)
    {
        int[] a={10,20,30,40,50};
        //==
        System.out.println(Arrays.toString(a));
        //how to convert Arrays to list
        //ArrayList<Integer> li=new ArrayList<Integer>();
        List<Integer> lis=new ArrayList<Integer>();
        for(int b:a)
        {
            lis.add(b);
        }
        int c=lis.size();
        for(int k=0;k<c;k++)
        {
            System.out.println(lis.get(k));
        }

    }
}
