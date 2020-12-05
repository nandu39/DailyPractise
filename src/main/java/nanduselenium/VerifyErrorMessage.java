package nanduselenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage
{
    public static void main(String[] args)
    {

        System.setProperty("webdriver.chrome.driver","./chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.manage().window().maximize();

        driver.findElement(By.id("identifierNext")).click();

        String actualErrmsg=driver.findElement(By.className("o6cuMc")).getText();

        System.out.println("Actual Error Message: "+actualErrmsg);

        String expectedErrmsg="Enter an email or phone number";

        Assert.assertEquals(actualErrmsg,expectedErrmsg);

        System.out.println("Test Completed");

    }

}
