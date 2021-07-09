package com.EndToEndTest;

import com.Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.log.Log;
import org.openqa.selenium.support.ui.Select;

import java.sql.SQLOutput;
import java.util.Random;


public class EndToEnd extends Base {
    public static void main(String[] args) {
        ChromeOpen();
//      GetUrl("https://demo.opencart.com/");
        GetUrl("https://demo.opencart.com/index.php?route=account/register");
//      GettingDropDown();
        String Mail = FillInReg();
        LogOut();
        LogBtn();
        Login2(Mail);


    }
//    public static void GettingDropDown(){
//        WebElement DropDown = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]"));
//        Select Obj = new Select(DropDown);
//        Obj.selectByIndex(1);
//
//    }

    public static String FillInReg(){

       WebElement firstName = findById("input-firstname");
       firstName.sendKeys("Mehedi");

       WebElement lName= findById("input-lastname");
       lName.sendKeys("Abir");

        WebElement Email= findById("input-email");
        Random RanNmb = new Random();
        int a = RanNmb.nextInt(300);
        int b = RanNmb.nextInt(100);
        int c= a+b;
//        System.out.println(c);
        Email.sendKeys(c+"mail@mail.com");
        String Mail = c+"mail@mail.com";
        System.out.println(Mail);

        WebElement Telephone = findById("input-telephone");
        Telephone.sendKeys("123456789");

        WebElement Password= findById("input-password");
        Password.sendKeys("123456");

        WebElement Pass2 = findById("input-confirm");
        Pass2.sendKeys("123456");

        WebElement CheckBox = findByName("agree");
        CheckBox.click();

        WebElement RegBtn = findByCSS(".btn-primary");
        RegBtn.click();
        return Mail;

        System.out.println("Registration DONE!");
    }

    public static void LogOut(){
        WebElement LogOut = driver.findElement(By.linkText("Logout"));
        LogOut.click();
        System.out.println("Logged Out");
    }

    public static void LogBtn(){
        WebElement LogBtn = driver.findElement(By.linkText("Login"));
        LogBtn.click();
        System.out.println("Logging In");
    }

    public static void Login2(String Mail){
       WebElement LogMail = findById("input-email");
       LogMail.sendKeys(Mail);

       WebElement LogPass = findById("input-password");
       LogPass.sendKeys("123456");

       WebElement logBtn = findByXpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
       logBtn.click();

       System.out.println("Logged In");
    }

}
