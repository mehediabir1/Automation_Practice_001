package com.Dataprovider;
import com.Utils.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class Dataprovider_Login {

    public static WebDriver driver;
    //BrowserOpen
    @BeforeSuite
    public static void BrowserOpen(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
    }

    @DataProvider(name ="LoginData")
    public Object [] [] data(){

        Object [] [] data=new Object[3][2];
        //set1
        data [0][0]="mail1@mail.com";
        data [0][1]="213213213";

        //set2
        data [1][0]="mail2@test";
        data [1][1]="fdadad";

        //set3
        data [2][0]="asasdas.co";
        data [2][1]="";

        return data;
    }

    @Test(dataProvider = "LoginData")
    public static void LoginWithDP(String Mail, String Pass) {

        WebElement LogMail = driver.findElement(By.id("input-email"));
        LogMail.clear();
        LogMail.sendKeys(Mail);
        Log.info("Email:"+Mail);

        WebElement LogPass = driver.findElement(By.id("input-password"));
        LogPass.clear();
        LogPass.sendKeys(Pass);
        Log.info("Password:"+Pass);

        WebElement LoginBtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        LoginBtn.click();
        Log.info("Login Button pressed!");


        String Expected_Title = "Account Login";
        String Actual_Title= driver.getTitle();

        Assert.assertEquals(Expected_Title,Actual_Title);

    }
}
