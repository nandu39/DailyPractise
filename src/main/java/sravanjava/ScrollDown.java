package sravanjavaUse;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class ScrollDown
{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","./chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://www.tsrtconline.in/oprs-web/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@title='Terms & Conditions']")).click();

//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//        js.executeScript("window.scrollBy(0,50)");
        WebElement el=driver.findElement(By.xpath("//span[text()='Waiting list:']"));
        js.executeScript("arguments[0].scrollIntoView();",el);
        driver.findElement(By.xpath("//a[text()='www.tsrtconline.in']")).click();

        // It will return the parent window name as a String
        String parent=driver.getWindowHandle();

        Set<String> s=driver.getWindowHandles();

// Now iterate using Iterator
        Iterator<String> I1= s.iterator();

        while(I1.hasNext())
        {

            String child_window=I1.next();


            if(!parent.equals(child_window))
            {
                driver.switchTo().window(child_window);

                System.out.println(driver.switchTo().window(child_window).getTitle());
                WebElement v_txt=driver.findElement(By.xpath("//span[contains(text(),'Ticket Enquiry Status')]"));
                String vtx=v_txt.getText();
                Boolean txt_v=vtx.equalsIgnoreCase("Ticket Enquiry Status");
                System.out.println("Text match? "+txt_v);
//                driver.close();
            }

        }
//switch to the parent window
        driver.switchTo().window(parent);
        driver.findElement(By.xpath("//a[text()='Contact Us']")).click();

//        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
//        driver.close();
    }
}