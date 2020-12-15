package sravanjava.arrayList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

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

        //Removing Duplicates fom a String using Hashmap
        //String[] str6 = {"java", "java", "link", "programs"};
        HashMap<String,Integer> hm= new HashMap<String, Integer>();
        int count=0;
        for(int i=0; i<str5.length;i++)
        {
            if(!hm.containsKey(str5[i]))
            {
                hm.put(str5[i],1);
            }
            else
            {
                hm.put(str5[i], hm.get(str5[i])+1);
            }
        }
        System.out.println(hm);
        for (Object o:hm.keySet())
        {
            //System.out.println(hm.get(o));
            System.out.println("Key: "+o+" "+"Values: "+hm.get(o));
        }
        for(Object o:hm.values())
        {
            System.out.println("Values: "+o);
        }
        for(Map.Entry<String, Integer> ent:hm.entrySet())
        {
            System.out.println(ent.getKey()+" "+ent.getKey());
        }

        //how to find a String in Pallindrome
        String ata="ata";
        char[] arr=ata.toCharArray();
        String rev="";
        //for(int i=0;i<arr.length;i++)
        for(int i=arr.length-1;i>=0;i--)
        {
            rev=rev+ata.charAt(i);
            //rev=rev+arr[i];
        }
        System.out.println("Reverse String is: "+rev);
        if(ata.equals(rev))
        {
            System.out.println("ata: "+ata+" "+"rev: "+rev);
            System.out.println("ata and rev are same");
        }
        if(!ata.equals(rev))
        {
            System.out.println("ata and rev are not same");
        }

    }
}