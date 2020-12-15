package nandujava.ListDemo;

import org.w3c.dom.stylesheets.LinkStyle;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2
{
    public static void main(String[] args)
    {

        ArrayList obj= new ArrayList();
        obj.add(3988);
        obj.add('N');
        obj.add("Nandu");
        obj.add("Nandu"); /* List will allow duplicate values */
        obj.add(25.11);

        //Enhanced for Loop
        for(Object val:obj)
        {
            System.out.println("Values are: "+val);
        }

        List<Integer> listobj=new ArrayList<Integer>();
        listobj.add(1);
        listobj.add(2);

        for(Integer intval:listobj)
        {
            System.out.println("Integer value is: "+intval);
        }
    }
}
