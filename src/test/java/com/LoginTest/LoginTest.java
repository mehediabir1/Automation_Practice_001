package com.LoginTest;

import com.Base.Base;
import org.openqa.selenium.WebElement;

public class LoginTest extends Base {

    public static void main(String[] args) {

        ChromeOpen();
        Login_1_invalid();
        Login_2_valid();
        ChromeClose();

    }

    public static void Login_1_invalid()
    {
        WebElement LogMail = findById("input-email");
        LogMail.sendKeys("gmail.com");

        WebElement LogPass = findById("input-password");
        LogPass.sendKeys("123456");

        WebElement logBtn = findByXpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
        logBtn.click();
    }

    public static void Login_2_valid()
    {
        WebElement LogMail = findById("input-email");
        LogMail.sendKeys("mehedi.abir2@gmail.com");

        WebElement LogPass = findById("input-password");
        LogPass.sendKeys("123456789");

        WebElement logBtn = findByXpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
        logBtn.click();
    }
}
