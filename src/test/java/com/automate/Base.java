package com.automate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    public static WebDriver driver;

    public static void main(String[] args){
        ChromeOpen();
        ChromeClose();
    }
    //Browser Launch
    public static void ChromeOpen(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://www.google.com/");
        System.out.println("Chrome Opened!");
    }
    //Browser Close
    public static void ChromeClose(){
        driver.quit();
        System.out.println("Chrome Closed!");
    }
}
