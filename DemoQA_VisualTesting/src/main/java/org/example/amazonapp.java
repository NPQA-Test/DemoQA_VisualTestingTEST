package org.example;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;

import java.net.URL;
import java.util.Set;

class amazonapp {


    public static void main() throws MalformedURLException, InterruptedException {
        for (int i=0 ; i < 1 ; i++) {
            AndroidDriver driver;
            String userToken = "k6rq4nwrxba0lf01ge2rget15y7gl9ht";

            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability("tg:userToken", userToken);
            capabilities.setCapability("tg:projectName", "NP Visual-Test apk");
            capabilities.setCapability("appPackage", "com.amazon.mShop.android.shopping");
            capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");


            capabilities.setCapability("deviceName", "Galaxy S23");
            capabilities.setCapability("platformVersion", "13");
            capabilities.setCapability("platformName", "android");
            capabilities.setCapability("automationName", "UiAutomator2");
            capabilities.setCapability("udid", "RFCW90A54EN");
            capabilities.setCapability("tg:userToken", "67sx6p96lne9yz9ut81clw20j0sbe9pr");
            capabilities.setCapability("tg:deviceOTT", "44213cee1bb35d22011a82b984d3ab12");
            capabilities.setCapability("tg:projectName", "Visual Test apk");
            capabilities.setCapability("systemPort", "4605");
            capabilities.setCapability("uiautomator2ServerLaunchTimeout", "90000");
            driver = new AndroidDriver(new URL("http://usdc5.testgrid.io/appium_38605/wd/hub"), capabilities);


            ((JavascriptExecutor) driver).executeScript("tg:action", "{\"status\": \"passed\", \"case\": \"Passed Case Test\"}");

            Set contexts;
            contexts = driver.getContextHandles();
            for (Object _ : contexts) {
                System.out.println(contexts);
                driver.context("NATIVE_APP");
            }

            amazonapk(driver);
            Thread.sleep(5000);
            System.out.println("Test completed.");
            driver.quit();
        }
    }
    static void amazonapk(AndroidDriver driver) throws InterruptedException {
        Thread.sleep(5000);

        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Amazon home Page"));

        Thread.sleep(5000);

        MobileElement dismissalerts = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_deny_button']"));
        dismissalerts.click();
        System.out.println("Clicked on dismiss alerts Button.");

        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "dismissalerts"));

        Thread.sleep(5000);

        MobileElement skipSignin = (MobileElement) driver.  findElement(By.xpath("//android.widget.Button[@resource-id='com.amazon.mShop.android.shopping:id/skip_sign_in_button']"));
        skipSignin.click();
        System.out.println("Clicked on skip Sign in Button.");

        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "skip Sign in"));

        Thread.sleep(5000);

        MobileElement amazonhome = (MobileElement) driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Home Tab 1 of 5']"));
        amazonhome.click();
        System.out.println("Clicked on amazon home Button.");

        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "amazonhome"));

        Thread.sleep(5000);

        MobileElement groxeries = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Groceries']"));
        groxeries.click();
        System.out.println("Click on groxeries button.");

        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "groxeriesbutton"));

        Thread.sleep(5000);

        MobileElement nearbyStore = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Find a nearby store']"));
        nearbyStore.click();

        System.out.println("Click on nearby Store.");
        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "nearbyStore"));
        Thread.sleep(5000);

        MobileElement foodmarket = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@resource-id='VUZHIFdob2xlIEZvb2Rz']"));

        foodmarket.isEnabled();
        System.out.println("foodmarket button is Enabled.");
        Thread.sleep(2000);

        String attributeValue = foodmarket.getAttribute("hint");
        System.out.println("Value of the hint: " + attributeValue);

        Thread.sleep(1000);

        Point location = foodmarket.getLocation();
        int x = location.getX();
        int y = location.getY();
        System.out.println("X coordinate: " + x + ", Y coordinate: " + y);

        Thread.sleep(1000);

        String tagName = foodmarket.getTagName();
        System.out.println("Value of the tagName: " + tagName);

        Thread.sleep(1000);

        String getText = foodmarket.getText();
        System.out.println("Value of the getText: " + getText);

        Thread.sleep(1000);

        Dimension size = foodmarket.getSize();
        System.out.println("Value of the size: " + size);

        Thread.sleep(1000);

        int hashCode = foodmarket.hashCode();
        System.out.println("Hash code for " + foodmarket + " is: " + hashCode);

        Thread.sleep(1000);

        Class<?> clazz = foodmarket.getClass();
        System.out.println("Class of " + foodmarket + " is: " + clazz.getName());

        Thread.sleep(1000);

        Rectangle rect = foodmarket.getRect();
        System.out.println("Element's X coordinate: " + rect.getX());
        System.out.println("Element's Y coordinate: " + rect.getY());
        System.out.println("Element's width: " + rect.getWidth());
        System.out.println("Element's height: " + rect.getHeight());

        Thread.sleep(5000);

        System.out.println("all step Done");
        driver.quit();
    }

}


