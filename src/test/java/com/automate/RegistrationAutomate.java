package com.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class RegistrationAutomate extends Base{

    public static void main(String[] args) {
            ChromeOpen();
//          ChromeClose();
//          TC_001_Registration_Valid();
//          TC_002_Registration_inValid();
//          TC_003_Registration_inValid();
//          TC_004_Registration_inValid();
            BV_FirstName();
            BV_LastName();
    }

//    public static void TC_001_Registration_Valid(){
//        //step 1
//        driver.get("https://demo.opencart.com/index.php?route=account/register");
//
//        //step 2
//        WebElement fName= driver.findElement(By.id("input-firstname"));
//        fName.sendKeys("Mehedi");
//
//        //step 3
//        WebElement lName= driver.findElement(By.id("input-lastname"));
//        lName.sendKeys("Abir");
//
//        //step 4
//        WebElement Email= driver.findElement(By.id("input-email"));
//        Email.sendKeys("1233mail@mail.com");
//
//        //step 5
//        WebElement Telephone= driver.findElement(By.id("input-telephone"));
//        Telephone.sendKeys("123456789");
//
//        //step 6
//        WebElement Password= driver.findElement(By.id("input-password"));
//        Password.sendKeys("123456");
//
//        //step 7
//        WebElement Password2= driver.findElement(By.id("input-confirm"));
//        Password2.sendKeys("123456");
//
//        //Checkbox
//        WebElement CheckBox= driver.findElement(By.name("agree"));
//        CheckBox.click();
//
//        //final step
//        WebElement Reg_Btn= driver.findElement(By.cssSelector(".btn-primary"));
//        Reg_Btn.click();
//
//        //logout
//        WebElement logout= driver.findElement(By.linkText("Logout"));
//        logout.click();
//    }

    public static void BV_FirstName()
    {
        //test case BV001
        //blank
        driver.get("https://demo.opencart.com/index.php?route=account/register");
        WebElement Reg_Btn= driver.findElement(By.cssSelector(".btn-primary"));
        //test case BV001
        WebElement fName= driver.findElement(By.id("input-firstname"));
        fName.sendKeys(" ");
        Reg_Btn.click();

        String Expc_Msg="First Name must be between 1 and 32 characters!";
        String Actl_Msg=driver.findElement(By.cssSelector("#account > div:nth-child(3) > div > div")).getText();

        System.out.println("Checking:"+ Actl_Msg);

        if (Expc_Msg.equals(Actl_Msg))
        {
            System.out.println("BVA_00 Passed");
        }
        else
        {
            System.out.println("BVA_001 Failed, BUG FOUND");
        }
        Actl_Msg= "";


        //test case BV002
        //3
        driver.get("https://demo.opencart.com/index.php?route=account/register");
        WebElement fName2= driver.findElement(By.id("input-firstname"));
        fName2.sendKeys("aba");
        Reg_Btn= driver.findElement(By.cssSelector(".btn-primary"));
        Reg_Btn.click();

        try {
            Actl_Msg=driver.findElement(By.cssSelector("#account > div:nth-child(3) > div > div")).getText();
            System.out.println("BVA_002 Failed, BUG FOUND");
        }
        catch (Exception e)
        {
            System.out.println("BVA_002 Passed");
        }
        Actl_Msg= "";

        //test case BV003
        //32
        driver.get("https://demo.opencart.com/index.php?route=account/register");
        WebElement fName3= driver.findElement(By.id("input-firstname"));
        fName3.sendKeys("asdasdasdasdasdas dasdasdasadasd");
        Reg_Btn= driver.findElement(By.cssSelector(".btn-primary"));
        Reg_Btn.click();

        try {
            Actl_Msg=driver.findElement(By.cssSelector("#account > div:nth-child(3) > div > div")).getText();
            System.out.println("BVA_003 Failed, BUG FOUND");
        }
        catch (Exception e)
        {
            System.out.println("BVA_003 Passed");
        }
        Actl_Msg= "";

        //test case BV004
        //48
        driver.get("https://demo.opencart.com/index.php?route=account/register");
        WebElement fName4= driver.findElement(By.id("input-firstname"));
        fName4.sendKeys("asdasdasdasdasdas dasdasdasadasd asdadasdasadasd");
        Reg_Btn= driver.findElement(By.cssSelector(".btn-primary"));
        Reg_Btn.click();

        try {
            Actl_Msg=driver.findElement(By.cssSelector("#account > div:nth-child(3) > div > div")).getText();
            System.out.println("BVA_002 Passed");
        }
        catch (Exception e)
        {
            System.out.println("BVA_002 Failed, BUG FOUND");
        }
        Actl_Msg= "";


    }
    public static void BV_LastName()
    {
        //test case BV005
        //blank
        driver.get("https://demo.opencart.com/index.php?route=account/register");
        WebElement Reg_Btn= driver.findElement(By.cssSelector(".btn-primary"));
        //test case BV001
        WebElement fName= driver.findElement(By.id("input-lastname"));
        fName.sendKeys(" ");
        Reg_Btn.click();

        String Expc_Msg="Last Name must be between 1 and 32 characters!";
        String Actl_Msg=driver.findElement(By.cssSelector("#account > div:nth-child(4) > div > div")).getText();

        if (Expc_Msg.equals(Actl_Msg))
        {
            System.out.println("BVA_005 Passed");
        }
        else
        {
            System.out.println("BVA_005 Failed, BUG FOUND");
        }
        Actl_Msg= "";


        //test case BV006
        //3
        driver.get("https://demo.opencart.com/index.php?route=account/register");
        WebElement fName2= driver.findElement(By.id("input-lastname"));
        fName2.sendKeys("aba");
        Reg_Btn= driver.findElement(By.cssSelector(".btn-primary"));
        Reg_Btn.click();

        try {
            Actl_Msg=driver.findElement(By.cssSelector("#account > div:nth-child(4) > div > div")).getText();
            System.out.println("BVA_006 Failed, BUG FOUND");
        }
        catch (Exception e)
        {
            System.out.println("BVA_006 Passed");
        }
        Actl_Msg= "";

        //test case BV007
        //32
        driver.get("https://demo.opencart.com/index.php?route=account/register");
        WebElement fName3= driver.findElement(By.id("input-lastname"));
        fName3.sendKeys("asdasdasdasdasdas dasdasdasadasd");
        Reg_Btn= driver.findElement(By.cssSelector(".btn-primary"));
        Reg_Btn.click();

        try {
            Actl_Msg=driver.findElement(By.cssSelector("#account > div:nth-child(4) > div > div")).getText();
            System.out.println("BVA_007 Failed, BUG FOUND");
        }
        catch (Exception e)
        {
            System.out.println("BVA_007 Passed");
        }
        Actl_Msg= "";

        //test case BV008
        //48
        driver.get("https://demo.opencart.com/index.php?route=account/register");
        WebElement fName4= driver.findElement(By.id("input-lastname"));
        fName4.sendKeys("asdasdasdasdasdas dasdasdasadasd asdadasdasadasd");
        Reg_Btn= driver.findElement(By.cssSelector(".btn-primary"));
        Reg_Btn.click();

        try {
            Actl_Msg=driver.findElement(By.cssSelector("#account > div:nth-child(4) > div > div")).getText();
            System.out.println("BVA_008 Passed");
        }
        catch (Exception e)
        {
            System.out.println("BVA_008 Failed, BUG FOUND");
        }
        Actl_Msg= "";

    }


//    public static void TC_002_Registration_inValid(){
//        //step 1
//        driver.get("https://demo.opencart.com/index.php?route=account/register");
//
//        //step 2
//        WebElement fName= driver.findElement(By.id("input-firstname"));
//        fName.sendKeys("Mehedi");
//
//        //step 3
//        WebElement lName= driver.findElement(By.id("input-lastname"));
//        lName.sendKeys("Abir");
//
//        //step 4
//        WebElement Email= driver.findElement(By.id("input-email"));
//        Email.sendKeys("mail.com");
//
//        //step 5
//        WebElement Telephone= driver.findElement(By.id("input-telephone"));
//        Telephone.sendKeys("123456789");
//
//        //step 6
//        WebElement Password= driver.findElement(By.id("input-password"));
//        Password.sendKeys("123456");
//
//        //step 7
//        WebElement Password2= driver.findElement(By.id("input-confirm"));
//        Password2.sendKeys("123456");
//
//        //Checkbox
//        WebElement CheckBox= driver.findElement(By.name("agree"));
//        CheckBox.click();
//
//        //final step
//        WebElement Reg_Btn= driver.findElement(By.cssSelector(".btn-primary"));
//        Reg_Btn.click();
//
//        //logout
//        WebElement logout= driver.findElement(By.linkText("Logout"));
//        logout.click();
//    }
//
//    public static void TC_003_Registration_inValid(){
//        //step 1
//        driver.get("https://demo.opencart.com/index.php?route=account/register");
//
//        //step 2
//        WebElement fName= driver.findElement(By.id("input-firstname"));
//        fName.sendKeys("Mehedi");
//
//        //step 3
//        WebElement lName= driver.findElement(By.id("input-lastname"));
//        lName.sendKeys("Abir");
//
//        //step 4
//        WebElement Email= driver.findElement(By.id("input-email"));
//        Email.sendKeys("abzmail@mail.com");
//
//        //step 5
//        WebElement Telephone= driver.findElement(By.id("input-telephone"));
//        Telephone.sendKeys("abcdeeffas");
//
//        //step 6
//        WebElement Password= driver.findElement(By.id("input-password"));
//        Password.sendKeys("123456");
//
//        //step 7
//        WebElement Password2= driver.findElement(By.id("input-confirm"));
//        Password2.sendKeys("123456");
//
//        //Checkbox
//        WebElement CheckBox= driver.findElement(By.name("agree"));
//        CheckBox.click();
//
//        //final step
//        WebElement Reg_Btn= driver.findElement(By.cssSelector(".btn-primary"));
//        Reg_Btn.click();
//
//        //logout
//        WebElement logout= driver.findElement(By.linkText("Logout"));
//        logout.click();
//    }
//
//    public static void TC_004_Registration_inValid(){
//        //step 1
//        driver.get("https://demo.opencart.com/index.php?route=account/register");
//
//        //step 2
//        WebElement fName= driver.findElement(By.id("input-firstname"));
//        fName.sendKeys(" ");
//
//        //step 3
//        WebElement lName= driver.findElement(By.id("input-lastname"));
//        lName.sendKeys(" ");
//
//        //step 4
//        WebElement Email= driver.findElement(By.id("input-email"));
//        Email.sendKeys("abcdmail@mail.com");
//
//        //step 5
//        WebElement Telephone= driver.findElement(By.id("input-telephone"));
//        Telephone.sendKeys("123456789");
//
//        //step 6
//        WebElement Password= driver.findElement(By.id("input-password"));
//        Password.sendKeys("123456");
//
//        //step 7
//        WebElement Password2= driver.findElement(By.id("input-confirm"));
//        Password2.sendKeys("123456");
//
//        //Checkbox
//        WebElement CheckBox= driver.findElement(By.name("agree"));
//        CheckBox.click();
//
//        //final step
//        WebElement Reg_Btn= driver.findElement(By.cssSelector(".btn-primary"));
//        Reg_Btn.click();
//
//        //logout
//        WebElement logout= driver.findElement(By.linkText("Logout"));
//        logout.click();
//
//
//    }
}
