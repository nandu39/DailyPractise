package sravanjavaUse;

public class ForLoop {
    public static void main(String[] args) {
        for(int i=10;i<20;i++)
        {
            System.out.println("value of i is: "+i);
        }

        for(int i=20;i>10;i--)
        {
            System.out.println("value of i is: "+i);
        }

        int j=30;
        while(j<40)
        {
            System.out.println("j val is: "+j);
            j++;
        }

        int k=25;
        do
        {
            System.out.println("val of k is: "+k);
            k++;
        }while (k<30);
    }
}
