package com.automate;

import org.openqa.selenium.Dimension;

public class BrowserSize extends BrowserConfig{
    public static void main(String[] args) {
        ChromeOpen();
        ChromeGetSize();
        ChromeSetSize();
        ChromeClose();
    }

    public static void ChromeGetSize(){
        int height= driver.manage().window().getSize().getHeight();
        int width= driver.manage().window().getSize().getWidth();

        System.out.println("width="+width+" height="+height);

    }
    public static void ChromeSetSize(){
        driver.manage().window().setSize(new Dimension(1200,800));

        int height= driver.manage().window().getSize().getHeight();
        int width= driver.manage().window().getSize().getWidth();

        System.out.println("New width="+width+" New height="+height);
    }
}
