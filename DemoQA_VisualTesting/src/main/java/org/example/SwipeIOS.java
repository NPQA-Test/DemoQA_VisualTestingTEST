package org.example;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Set;


public class SwipeIOS {

    private static String ParallelExecution;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        for (int i=0; i<2; i++) {
            IOSDriver driver = null;
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("browserName", "safari");
            capabilities.setCapability("tg:projectName", "NP Visual Ios-Test");

            capabilities.setCapability("deviceName", "iPhone 13 Pro Max");
            capabilities.setCapability("platformVersion", "17.5.1");
            capabilities.setCapability("automationName", "XCUITest");
            capabilities.setCapability("platformName", "iOS");
            capabilities.setCapability("udid", "00008110-001E50960A87801E");
            capabilities.setCapability("tg:userToken", "k6rq4nwrxba0lf01ge2rget15y7gl9ht");
            capabilities.setCapability("wdaLocalPort", "3107");
            driver = new IOSDriver(new URL("http://omnissatest.testgrid.io/appium_36107/wd/hub"), capabilities);

            Set contexts;
            contexts = driver.getContextHandles();
            for (Object _ : contexts) {
                System.out.println(contexts);
                driver.context("NATIVE_APP");
            }
            IOSSwipe(driver);
            Thread.sleep(30000);

        }
    }
    static void IOSSwipe(WebDriver driver) throws InterruptedException {
        Thread.sleep(10000);

        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testcaseName", "Visual Test-IOS"));

        IOSElement TabOverviewButton = driver.findElement(By.xpath("//XCUIElementTypeButton[@name='TabOverviewButton']"));
        TabOverviewButton.click();
        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Tab Overview Button"));

        Thread.sleep(3000);

        IOSElement NewTabButton = driver.findElement(By.xpath("(//XCUIElementTypeButton[@name='NewTabButton'])[1]"));
        NewTabButton.click();
        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "New Tab Button"));

        Thread.sleep(3000);

        IOSElement searchharea = driver.findElement(By.xpath("//XCUIElementTypeTextField[@label='Address']"));
        searchharea.click();
        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "searchharea"));

        Thread.sleep(3000);

        IOSElement ele_URLarea =  driver.findElement(By.xpath("//XCUIElementTypeTextField[@name='URL']"));
        ele_URLarea.sendKeys("https://infinite-scroll.com/demo/full-page/");
        System.out.println("Website search done.");
        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "URLarea"));

        Thread.sleep(3000);

        IOSElement ele_gobutton =  driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Go\"]"));
        ele_gobutton.click();
        System.out.println("Tap On Go Button.");
        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "gobutton"));

        Thread.sleep(2000);

        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "searchResult"));

        for (int i = 0; i < 4; i++) { // Change 3 to the number of times you want to swipe
            JavascriptExecutor js = (JavascriptExecutor) driver;
            HashMap<String, Object> swipeObject = new HashMap<>();
            swipeObject.put("direction", "up");
            js.executeScript("mobile: swipe", swipeObject);

            System.out.println(i + "Swipe up done");
            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName","Swipe No is"+ i));

        }

        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, Object> swipeObject = new HashMap<>();
        swipeObject.put("direction", "down");
        js.executeScript("mobile: swipe", swipeObject);
        System.out.println("Swipe Down done");
        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName","Swipe Down Done"));


        System.out.println("All Swipe perform");

        driver.quit ();
    }

}

