package sravanjava.arrayList;

import java.util.HashSet;

public class HashSetForDups
{
    public static void main(String[] args)
    {
        //removing duplicates from a String using Hashset
        String[] str5 ={"java", "java", "link","link", "program"};
        HashSet<String> hs=new HashSet<String>();

        for(int i=0;i<str5.length; i++)
        {
            if(!hs.contains(str5[i]))
            {
                hs.add(str5[i]);
                //System.out.println("non Dups are: "+str5[i]);
            }
            else
            {
                System.out.println("Duplicate: "+str5[i]);
            }
        }


    }
}
