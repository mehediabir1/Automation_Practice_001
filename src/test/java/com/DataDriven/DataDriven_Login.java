package com.DataDriven;

import com.Utils.Log;
import com.Utils.Xls_Reader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DataDriven_Login {

    public static WebDriver driver;

    @BeforeSuite
    public static void BrowserOpen(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
    }

    @Test
    public static void LoginWithDD() {

        Xls_Reader reader=new Xls_Reader("./src/main/resources/LoginData.xlsx");
        String sheetName="Sheet1";

        int rowCount= reader.getRowCount(sheetName);

        for(int rowNum=2; rowNum<=rowCount;rowNum++) {
            String email = reader.getCellData(sheetName, "Email", rowNum);
            String pass = reader.getCellData(sheetName, "Password", rowNum);

            WebElement LogMail = driver.findElement(By.id("input-email"));
            LogMail.clear();
            LogMail.sendKeys(email);
            Log.info("Email:" + email);

            WebElement LogPass = driver.findElement(By.id("input-password"));
            LogPass.clear();
            LogPass.sendKeys(pass);
            Log.info("Password:" + pass);

            WebElement LoginBtn = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
            LoginBtn.click();
            Log.info("Login Button pressed!");


            String Expected_Title = "Account Login";
            String Actual_Title = driver.getTitle();

            Assert.assertEquals(Expected_Title, Actual_Title);
        }
    }
}
