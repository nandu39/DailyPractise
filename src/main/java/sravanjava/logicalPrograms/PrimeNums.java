package sravanjava.logicalPrograms;

public class PrimeNums
{
    public static void main(String[] args)
    {
        int m=0,k=1,l=1,cnt=0;
        while(m<10)
        {
            k=1;
            cnt=0;
            while(k<=l) {
                if (l % k == 0)
                    cnt++;
                k++;
            }
            if(cnt==2)
            {
                System.out.printf("%d ",l);
                m++;
            }
            l++;
        }

        //repeating same logic

        int ct=0,n=0,i=1,j=1;
        while(n<13)
        {
            j=1;
            ct=0;
            while(j<=i)
            {
                if(i%j==0)
                    ct++;
                j++;
            }
            if(ct==2)
            {
                System.out.printf("%d ",i);
                n++;
            }
            i++;
        }
    }
}
