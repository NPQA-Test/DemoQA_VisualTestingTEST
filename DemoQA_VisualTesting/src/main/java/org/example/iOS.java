package org.example;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

public class iOS {
    public static void main() throws MalformedURLException, InterruptedException {
        IOSDriver driver;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "iPhone 15 Pro");
        capabilities.setCapability("platformVersion", "17.3.1");
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("udid", "00008130-001659690201001C");
        capabilities.setCapability("tg:userToken", "qsh102chi0c138kwwmhfs5hrt5n5n2ru");
        capabilities.setCapability("wdaLocalPort", "3003");
        driver = new IOSDriver(new URL("http://grupo.testgrid.io/appium_36003/wd/hub"), capabilities);


        capabilities.setCapability("appium:automationName", "XCUITest");
        capabilities.setCapability("browserName", "safari");

        ((JavascriptExecutor) driver).executeScript("tg:action", "{\"status\": \"failed\", \"case\": \"Failed Test Case\"}");

        studentRegistrationPage(driver);

        driver.quit();
    }

    static void studentRegistrationPage(WebDriver driver) throws InterruptedException {
        Thread.sleep(10000);
        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testcaseName", "Student Registration Page"));

        IOSElement TabOverviewButton = driver.findElement(By.xpath("(//XCUIElementTypeButton[@name='TabOverviewButton'])[1]"));
        TabOverviewButton.click();
        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Tab Overview Button"));

        Thread.sleep(3000);

        IOSElement NewTabButton = driver.findElement(By.xpath("(//XCUIElementTypeButton[@label='New tab'])[1]"));
        NewTabButton.click();
        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "New Tab Button"));

        Thread.sleep(3000);

        IOSElement ele_address = driver.findElement(By.xpath("//XCUIElementTypeTextField[@label='Address']"));
        ele_address.click();
        System.out.println("Clicked on Address bar.");

        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "ele_address"));


        IOSElement ele_URL = driver.findElement(By.xpath("//XCUIElementTypeTextField[@name=\"URL\"][1]"));
        ele_URL.sendKeys("https://demoqa.com/automation-practice-form"+"\n");
        System.out.println("URL type done.");

        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until((ExpectedCondition<Boolean>) driver1 -> driver1.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Student Registration Form']")).isDisplayed());
        System.out.println("Registration form displayed.");

        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "ele_URL"));

        Thread.sleep(2000);
        IOSElement ele_firstname = driver.findElement(By.xpath("//XCUIElementTypeTextField[@value='First Name']"));
        ele_firstname.sendKeys("Samee");
        System.out.println("Firstname type done.");

        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "ele_firstname"));


        IOSElement ele_lastname = driver.findElement(By.xpath("//XCUIElementTypeTextField[@value='Last Name']"));
        ele_lastname.sendKeys("josec");
        System.out.println("Lastname type done.");

        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "ele_lastname"));

        IOSElement ele_mail = driver.findElement(By.xpath("//XCUIElementTypeTextField[@value='name@example.com']"));
        ele_mail.sendKeys("samee.jose@test.com");
        System.out.println("Email type done.");

        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "ele_mail"));

        IOSElement ele_male = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Male']"));
        ele_male.click();
        System.out.println("Male selected.");

        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "ele_male"));

        IOSElement ele_mobile = driver.findElement(By.xpath("//XCUIElementTypeTextField[@value='Mobile Number']"));
        ele_mobile.sendKeys("7859261548");
        System.out.println("Mobile number type done.");

        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "ele_mobile"));

        IOSElement ele_submit = driver.findElement(By.xpath("//XCUIElementTypeButton[@name='Submit']"));
        ele_submit.click();
        System.out.println("Clicked on submit.");

        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "ele_submit"));

        Thread.sleep(1000);
        driver.quit();
    }
}