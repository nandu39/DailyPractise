package sravanjavaUse;

public class StringClsArray
{
    public static void main(String[] args)
    {
        String names="QTP-TPD-TWR_PIRUE";

        String []sp_nm=names.split("-");
        int ln=sp_nm.length;

        for(int i=0;i<ln;i++)
        {
            System.out.println("value of i is: "+sp_nm[i]);
        }


    }
}
