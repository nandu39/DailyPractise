package sravanjava;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import sravanjava.logger.LogCls;

public class AdvCalc implements CalcInterFace
{
    public static final Logger logger = LogManager.getLogger(LogCls.class);
    public static void main(String[] args)
    {
        // basic log4j configurator
        BasicConfigurator.configure();


    CalcInterFace obj1=new AdvCalc();
    obj1.add();
    obj1.sub();

    AdvCalc obj2=new AdvCalc();
    obj2.cos();
    obj2.sin();
    obj2.add();
    obj2.sub();

        System.out.println(a);

    }
    public void cos()
    {
        System.out.println("this is cos");
        logger.info("this is cos");
    }
    public void sin()
    {
        System.out.println("this is sin");
    }
    public void add()
    {
        System.out.println("this is add");
    }

    public void sub()
    {
        System.out.println("this is sub");
    }
}
