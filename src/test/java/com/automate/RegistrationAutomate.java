package com.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationAutomate extends Base{

    public static void main(String[] args) {
        ChromeOpen();
//        ChromeClose();
//          TC_001_Registration_Valid();
//          TC_002_Registration_inValid();
//          TC_003_Registration_inValid();
          TC_004_Registration_inValid();
    }

    public static void TC_001_Registration_Valid(){
        //step 1
        driver.get("https://demo.opencart.com/index.php?route=account/register");

        //step 2
        WebElement fName= driver.findElement(By.id("input-firstname"));
        fName.sendKeys("Mehedi");

        //step 3
        WebElement lName= driver.findElement(By.id("input-lastname"));
        lName.sendKeys("Abir");

        //step 4
        WebElement Email= driver.findElement(By.id("input-email"));
        Email.sendKeys("1233mail@mail.com");

        //step 5
        WebElement Telephone= driver.findElement(By.id("input-telephone"));
        Telephone.sendKeys("123456789");

        //step 6
        WebElement Password= driver.findElement(By.id("input-password"));
        Password.sendKeys("123456");

        //step 7
        WebElement Password2= driver.findElement(By.id("input-confirm"));
        Password2.sendKeys("123456");

        //Checkbox
        WebElement CheckBox= driver.findElement(By.name("agree"));
        CheckBox.click();

        //final step
        WebElement Reg_Btn= driver.findElement(By.cssSelector(".btn-primary"));
        Reg_Btn.click();

        //logout
        WebElement logout= driver.findElement(By.linkText("Logout"));
        logout.click();
    }

    public static void TC_002_Registration_inValid(){
        //step 1
        driver.get("https://demo.opencart.com/index.php?route=account/register");

        //step 2
        WebElement fName= driver.findElement(By.id("input-firstname"));
        fName.sendKeys("Mehedi");

        //step 3
        WebElement lName= driver.findElement(By.id("input-lastname"));
        lName.sendKeys("Abir");

        //step 4
        WebElement Email= driver.findElement(By.id("input-email"));
        Email.sendKeys("mail.com");

        //step 5
        WebElement Telephone= driver.findElement(By.id("input-telephone"));
        Telephone.sendKeys("123456789");

        //step 6
        WebElement Password= driver.findElement(By.id("input-password"));
        Password.sendKeys("123456");

        //step 7
        WebElement Password2= driver.findElement(By.id("input-confirm"));
        Password2.sendKeys("123456");

        //Checkbox
        WebElement CheckBox= driver.findElement(By.name("agree"));
        CheckBox.click();

        //final step
        WebElement Reg_Btn= driver.findElement(By.cssSelector(".btn-primary"));
        Reg_Btn.click();

        //logout
        WebElement logout= driver.findElement(By.linkText("Logout"));
        logout.click();
    }

    public static void TC_003_Registration_inValid(){
        //step 1
        driver.get("https://demo.opencart.com/index.php?route=account/register");

        //step 2
        WebElement fName= driver.findElement(By.id("input-firstname"));
        fName.sendKeys("Mehedi");

        //step 3
        WebElement lName= driver.findElement(By.id("input-lastname"));
        lName.sendKeys("Abir");

        //step 4
        WebElement Email= driver.findElement(By.id("input-email"));
        Email.sendKeys("abzmail@mail.com");

        //step 5
        WebElement Telephone= driver.findElement(By.id("input-telephone"));
        Telephone.sendKeys("abcdeeffas");

        //step 6
        WebElement Password= driver.findElement(By.id("input-password"));
        Password.sendKeys("123456");

        //step 7
        WebElement Password2= driver.findElement(By.id("input-confirm"));
        Password2.sendKeys("123456");

        //Checkbox
        WebElement CheckBox= driver.findElement(By.name("agree"));
        CheckBox.click();

        //final step
        WebElement Reg_Btn= driver.findElement(By.cssSelector(".btn-primary"));
        Reg_Btn.click();

        //logout
        WebElement logout= driver.findElement(By.linkText("Logout"));
        logout.click();
    }

    public static void TC_004_Registration_inValid(){
        //step 1
        driver.get("https://demo.opencart.com/index.php?route=account/register");

        //step 2
        WebElement fName= driver.findElement(By.id("input-firstname"));
        fName.sendKeys(" ");

        //step 3
        WebElement lName= driver.findElement(By.id("input-lastname"));
        lName.sendKeys(" ");

        //step 4
        WebElement Email= driver.findElement(By.id("input-email"));
        Email.sendKeys("abcdmail@mail.com");

        //step 5
        WebElement Telephone= driver.findElement(By.id("input-telephone"));
        Telephone.sendKeys("123456789");

        //step 6
        WebElement Password= driver.findElement(By.id("input-password"));
        Password.sendKeys("123456");

        //step 7
        WebElement Password2= driver.findElement(By.id("input-confirm"));
        Password2.sendKeys("123456");

        //Checkbox
        WebElement CheckBox= driver.findElement(By.name("agree"));
        CheckBox.click();

        //final step
        WebElement Reg_Btn= driver.findElement(By.cssSelector(".btn-primary"));
        Reg_Btn.click();

        //logout
        WebElement logout= driver.findElement(By.linkText("Logout"));
        logout.click();

        
    }
}
