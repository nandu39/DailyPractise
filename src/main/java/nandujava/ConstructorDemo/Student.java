package nandujava.ConstructorDemo;

public class Student
{

    public Student()
    {
        System.out.println("Student");
    }
    public Student(String sname)
    {
        System.out.println("School name is "+sname);
    }
    public Student(int scrank)
    {
        System.out.println("School rank is "+scrank);

    }
    public Student(String sname, int scrank)
    {
        System.out.println("School name is " +sname+ " and rank is "+scrank);

    }
    public void result()
    {
        System.out.println("Result");
    }

    public static void main(String[] args)
    {
        Student student=new Student("HPS", 1);
        /* Constructor with zero arguments don't need any object to call */
        student.result();
    }

}