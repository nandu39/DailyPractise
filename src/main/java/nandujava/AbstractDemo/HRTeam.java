package nandujava.AbstractDemo;

public class HRTeam extends ITDept
{

    public static void main (String[] args)
    {

        HRTeam hrTeam=new HRTeam();
        hrTeam.goodies();
        hrTeam.salary();
        hrTeam.work();
        hrTeam.bonus();
    }
    public void bonus()
    {
        System.out.println("Bonus is 1 Lakh");
    }
    public void salary()
    {
        System.out.println("5 LPA");
    }

}
