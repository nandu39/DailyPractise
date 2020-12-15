package nandujava.AbstractDemo;


public abstract class ITDept implements Employee
{
    public abstract void salary();
        /* if single method is abstract in a Class, then Class will become abstract */

        public void goodies()
        {
            System.out.println("Laptop");
        }

        public void work()
        {
            System.out.println("Automation");
        }

    }
