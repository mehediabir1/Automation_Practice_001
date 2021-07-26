package com.TestNg;

import com.Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.Random;

public class TestNg {
    public static WebDriver driver;
    //browser On
    @BeforeSuite
    public static void OpenBrow(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/index.php?route=account/register");
    }
    @Test
    public static void Checking() {
        WebElement firstName = driver.findElement(By.id("input-firstname"));
        firstName.sendKeys("Mehedi");

        WebElement lName = driver.findElement(By.id("input-lastname"));
        lName.sendKeys("Abir");

        WebElement Email = driver.findElement(By.id("input-email"));
        Random RanNmb = new Random();
        int a = RanNmb.nextInt(300);
        int b = RanNmb.nextInt(200);
        int c = a + b;

        Email.sendKeys(c + "mail@mail.com");
        String Mail = c + "mail@mail.com";
        System.out.println("Account Created with: " + Mail);

        WebElement Telephone = driver.findElement(By.id("input-telephone"));
        Telephone.sendKeys("123456789");

        WebElement Password = driver.findElement(By.id("input-password"));
        Password.sendKeys("123456");

        WebElement Pass2 = driver.findElement(By.id("input-confirm"));
        Pass2.sendKeys("123456");

        WebElement CheckBox = driver.findElement(By.name("agree"));
        CheckBox.click();

        WebElement RegBtn = driver.findElement(By.cssSelector(".btn-primary"));
        RegBtn.click();
//        return Mail;
//        Login2(Mail);

        //logout and login
        WebElement logOut = driver.findElement(By.linkText("Logout"));
        logOut.click();
        System.out.println("Logged Out");
        WebElement LogBtn = driver.findElement(By.linkText("Login"));
        LogBtn.click();
        System.out.println("Logging In");

        //login

        WebElement LogMail = driver.findElement(By.id("input-email"));
        LogMail.sendKeys(Mail);
        WebElement LogPass = driver.findElement(By.id("input-password"));
        LogPass.sendKeys("123456");
        WebElement logBtn = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        logBtn.click();
        System.out.println("Logged In");
    }

//    @Test
//    public static void LoginLogout(){
//        WebElement logOut = driver.findElement(By.linkText("Logout"));
//        logOut.click();
//        System.out.println("Logged Out");
//        WebElement LogBtn = driver.findElement(By.linkText("Login"));
//        LogBtn.click();
//        System.out.println("Logging In");
//    }
//    @AfterSuite
//    public static void Login2(String Mail){
//        WebElement LogMail = driver.findElement(By.id("input-email"));
//        LogMail.sendKeys("a");
//        WebElement LogPass = driver.findElement(By.id("input-password"));
//        LogPass.sendKeys("123456");
//        System.out.println("Logged In");
//    }


}
