package sravanjava.arrayList;

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




    }
}
