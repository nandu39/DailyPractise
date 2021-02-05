package sravanjava.multiwindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Multiwindows
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tsrtconline.in/oprs-web/");
        String parent=driver.getWindowHandle();
        System.out.println("Parent value is: "+parent);

        driver.findElement(By.xpath("//div[@class='twtr_image']")).click();
        Thread.sleep(4000);

        Set<String> allWin= driver.getWindowHandles();

        int cnt=allWin.size();
        System.out.println("no.of windows are: "+cnt);

        for (String child:allWin)
        {
            if(!parent.equalsIgnoreCase(child))
            {
                driver.switchTo().window(child);

                driver.findElement(By.xpath("//input[@aria-label='Search query']")).sendKeys("Test");
                Thread.sleep(2000);
                driver.close();
            }
        }
        driver.switchTo().window(parent);
        System.out.println("Parent title is: "+driver.getTitle());
        driver.close();

    }
}
