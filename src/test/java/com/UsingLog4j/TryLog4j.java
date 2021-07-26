package com.UsingLog4j;

import com.Base.Base;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class TryLog4j extends Base {
    public static void main(String[] args) {
        ChromeOpen();
        GetUrl("https://demo.opencart.com/index.php?route=account/register");
        FillInReg();
        ChromeClose();
    }

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
        System.out.println("Account Created with: "+Mail);

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
    }
}
