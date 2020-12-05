package sravanjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTablee {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.tsrtconline.in/oprs-web/home/aboutus.do");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        List<WebElement> ful_tab = driver.findElements(By.cssSelector("table[class=\"boxborderTd\"]>tbody>tr>td"));
        int tb_cnt=ful_tab.size();
//        System.out.println("webElem line read "+tb_cnt);
//int k=1;
//        String s=ful_tab.get(k).getText();
//        int a =s.length();
//        System.out.println(s);
//        System.out.println(a);

        String src="Deluxe (2 + 2 Non-AC)";

        for (int i=0;i<tb_cnt;i++)
        {
            String fet= ful_tab.get(i).getText();
            if(fet.equalsIgnoreCase(src))
            {
//            String cel_val =ful_tab.get(i).getText();
//                System.out.println(fet);
            System.out.println("No. of Bus Services for Search is: "+ful_tab.get(i+1).getText());
//            System.out.println();
            }
        }
        driver.close();
    }
}
