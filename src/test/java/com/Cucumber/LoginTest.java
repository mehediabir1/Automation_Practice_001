package com.Cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginTest {
    WebDriver driver;
    @Given("Browser Opening and Navigating to Login Page")
    public void browser_opening_and_navigating_to_login_page() {
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
    }

    @When("Enter Invalid Login Credentials")
    public void enter_invalid_login_credentials() {
        WebElement LogMail = driver.findElement(By.id("input-email"));
        LogMail.sendKeys("mail@mail.com");

        WebElement LogPass = driver.findElement(By.id("input-password"));
        LogPass.sendKeys("123456");

    }

    @And("Login Unsuccessful")
    public void login_unsuccessful() {
        WebElement logBtn = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        logBtn.click();

        String Expected_Title = "Account Login";
        String Actual_Title = driver.getTitle();
        if (Expected_Title.equals(Actual_Title)){
            System.out.println("Test Passed!");
        }
        else
        {
            System.out.println("Test Failed!");
        }
//        Assert.assertEquals(Expected_Title, Actual_Title);
    }

    @Then("End Test")
    public void end_test() {
        driver.close();
    }
}
