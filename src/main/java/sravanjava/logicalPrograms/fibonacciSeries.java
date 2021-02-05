package sravanjava.logicalPrograms;

public class fibonacciSeries
{
    public static void main(String args[])
    {
        int a1=0, a2=1,a3, j, cnt=10;
        System.out.print(a1+" "+a2);

        for(j=2;j<cnt;j++)
        {
            a3=a1+a2;
            System.out.print(" "+a3);
            a1=a2;
            a2=a3;
        }

// same logic for practice
        int n1=0,n2=1,n3,i,count=10;
        System.out.println("");
        System.out.println(n1+" "+n2);//printing 0 and 1

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.println(" "+n3);
            n1=n2;
            n2=n3;
        }

// same logic for practice
        int b1=0,b2=1,b3, k, cn=10;
        System.out.print(b1+" "+b2);

        for(k=2;k<cn;k++)
        {
            b3=b1+b2;
            System.out.print(" "+b3);
            b1=b2;
            b2=b3;
        }

    }
}
