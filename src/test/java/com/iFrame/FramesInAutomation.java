package com.iFrame;

import com.Base.Base;
import org.openqa.selenium.WebElement;


public class FramesInAutomation extends Base {
    public static void main(String[] args) {
        ChromeOpen();
        GetUrl("https://www.w3schools.com/html/html_iframe.asp");
        iFrameElement();
    }
    public static void iFrameElement(){

//      WebElement frame = findByCSS("#main > div:nth-child(7) > iframe");
//      driver.switchTo().frame(frame);
//
//      driver.switchTo().frame("W3Schools HTML Tutorial");
//      driver.switchTo().frame(0);

        WebElement frame = findByXpath("//*[@id=\"main\"]/div[3]/iframe");
        driver.switchTo().frame(frame);

        WebElement PressCss = findByXpath("//*[@id=\"topnav\"]/div/div/a[4]");
        PressCss.click();
    }
}
