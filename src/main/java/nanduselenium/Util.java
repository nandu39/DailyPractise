package nanduselenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import java.io.File;
import java.io.IOException;

public class Util
{
    public static void ssutil(WebDriver driver,String ssfilename) throws IOException
    {
            try
            {
                TakesScreenshot ts=(TakesScreenshot) driver;
                File src=ts.getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(src, new File(".\\target\\Screenshots\\" + ssfilename + ".png"));
                System.out.println("Screenshot taken");
            }
            catch (Exception e)
            {
                System.out.println("Exception"+e.getMessage());
            }
        }
}