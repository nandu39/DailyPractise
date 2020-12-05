package nanduselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google
{
    public static void main(String[] args)
    {
        //System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Softwares\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com/");

        System.out.println(driver.getTitle());

        driver.close();

    }
}
