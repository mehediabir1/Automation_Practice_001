package com.ScreenShot;

import com.Base.Base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;

public class CaptureSs extends Base {
    public static void main(String[] args) throws IOException {
        ChromeOpen();
        GetUrl("https://www.bbc.com/");
//        Wait10Seconds();
//        ScrollDown();
//        Cap_ss();
        Cap_Full_ss();
    }
    public static void Wait10Seconds(){
      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Thread.sleep(1000);
    }
    public static void ScrollDown(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000)", "");
    }
    public static void Cap_ss() throws IOException {
        File img_file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(img_file, new File("./src/test/Screenshot/SS.png"), true);
    }

    public static void Cap_Full_ss() throws IOException {
        Screenshot fpss= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        ImageIO.write(fpss.getImage(),"png",new File("./src/test/Screenshot/fss.png"));
    }
}
