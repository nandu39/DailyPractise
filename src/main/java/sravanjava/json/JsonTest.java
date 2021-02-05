package sravanjava.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileReader;
import java.util.concurrent.TimeUnit;

public class JsonTest
{
    public static WebDriver driver;
    public static void main(String[] args) throws Exception
    {
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        JsonTest jsn=new JsonTest();

        jsn.readJson();
        System.out.println("run");
    }

    public String[] readJson() throws Exception
    {
        JSONParser jsonParser=new JSONParser();
        FileReader reader=new FileReader(".\\testJson.json");

        Object obj=jsonParser.parse(reader);

        JSONObject userloginJsonObj=(JSONObject) obj;
        JSONArray userloginsarray=(JSONArray) userloginJsonObj.get("userlogins");

        String arr[]=new String[userloginsarray.size()];

        for (int i=0;i<userloginsarray.size();i++)
        {
            JSONObject users=(JSONObject)userloginsarray.get(i);
            String usrnm=(String) users.get("username");
            String usrpwd=(String) users.get("password");

            arr[i]=usrnm+","+usrpwd;
            driver.get("https://www.nopcommerce.com/en/login?returnUrl=%2Fen");
            driver.findElement(By.id("Username")).sendKeys(usrnm);
            driver.findElement(By.id("Password")).sendKeys(usrpwd);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@type='submit']")).click();
            System.out.println(arr[i]);
        }
        driver.close();
        return arr;
    }

}
