package com.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Random;

public class Base {
    public static WebDriver driver;

    public static void main(String[] args) throws IOException {
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
    //Getting URL
    public static void GetUrl(String URL){
        driver.get(URL);
    }
    //Web Element finding.
    public static WebElement findById(String Locator){
        return driver.findElement(By.id(Locator));
    }

    public static WebElement findByClass(String Locator){
        return driver.findElement(By.className(Locator));
    }

    public static WebElement findByCSS(String Locator){
        return driver.findElement(By.cssSelector(Locator));
    }

    public static WebElement findByXpath(String Locator){
        return driver.findElement(By.xpath(Locator));
    }

    public static WebElement findByName(String Locator){
        return driver.findElement(By.name(Locator));
    }

//    public static WebElement findByXpath(String Locator){
//        return driver.findElement(By.linkText(Locator));
//    }


    //Browser Close
    public static void ChromeClose(){
        driver.quit();
        System.out.println("Chrome Closed!");
    }
}
