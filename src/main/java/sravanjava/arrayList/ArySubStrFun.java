package sravanjava.arrayList;

import java.util.Arrays;

public class ArySubStrFun
{
    public static void main(String [] args)
    {
        String str1="abcdefghij12345";
        System.out.println(str1.replace('a','k'));
        str1=str1.replaceAll("abcd","lmno");
        System.out.println(str1);

        String str2="%&%$#123abid";
        System.out.println(str2.replaceAll("[^a-z1-9]",""));

        String str3="abcdzxirwfko";
        System.out.println(str3.substring(2,5));
        System.out.println(str3.substring(2));
//        display last 4 characters
        System.out.println(str3.substring(str3.length() -4,str3.length()));

        //how to find whether 2 Strings has same alphabets (Anagram)
        String same1="abcdefkl";
        String same2="fklabcde";

        char s1[]=same1.toCharArray();
        char s2[]=same2.toCharArray();
        Arrays.sort(s1);

        //to print Arrays data using String
        System.out.println("chk "+Arrays.toString(s1));
        Arrays.sort(s2);
        if(Arrays.equals(s1,s2))
        {
            System.out.println("Both are same");
            System.out.println(s1);
        }
        if(!Arrays.equals(s1,s2))
        {
            System.out.println("Both are not same");
        }

    }
}
