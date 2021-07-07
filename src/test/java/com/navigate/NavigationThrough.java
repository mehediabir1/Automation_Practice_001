package com.navigate;

import com.automate.Base;
import com.automate.RegistrationAutomate;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.SQLOutput;

public class NavigationThrough extends Base {
    public static void main(String[] args) {
        ChromeOpen();
        NavBrowser();
        RegistrationAutomate.TC_001_Registration_Valid();
        NavBack();
        NavFrw();
    }

    public static void NavBrowser() {
        driver.navigate().to("https://demo.opencart.com/");
        driver.navigate().to("https://demo.opencart.com/index.php?route=account/register");
        System.out.println("Registration Page Opened");
    }
    public static void NavBack(){
        driver.navigate().back();
        System.out.println("Navigation: BACK ");
    }
    public static void NavFrw(){
        driver.navigate().forward();
        System.out.println("Navigation: FORWARD ");
    }


}
