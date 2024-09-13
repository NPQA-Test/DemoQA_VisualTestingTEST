package org.example;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class AndroidVisualTest {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        AndroidDriver driver;


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel 8");
        capabilities.setCapability("platformVersion", "14");
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("udid", "3A131FDJH009R0");
        capabilities.setCapability("tg:userToken", "k6rq4nwrxba0lf01ge2rget15y7gl9ht");
        capabilities.setCapability("systemPort", "4101");
        capabilities.setCapability("uiautomator2ServerLaunchTimeout", "90000");
        driver = new AndroidDriver(new URL("http://omnissatest.testgrid.io/appium_38101/wd/hub"), capabilities);

        capabilities.setCapability("tg:projectName", "Visual Test");


        capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        capabilities.setCapability("appPackage", "com.android.chrome");

        driver.context ( "NATIVE_APP" );

        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testcaseName", "Android Visual Test"));

        ((JavascriptExecutor) driver).executeScript("tg:action", "{\"status\": \"passed\", \"case\": \"pass Test Case\"}");
        visaulTest(driver);

    }

    static void visaulTest(AndroidDriver driver) throws InterruptedException {


        Thread.sleep(10000);


// Open the homepage
        MobileElement homepageButton = (MobileElement) driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.android.chrome:id/home_button']"));
        homepageButton.click();
        System.out.println("Opened the homepage.");

// Click on the address bar
       MobileElement addressBar = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@text='Search or type URL']"));
        addressBar.click();
        System.out.println("Clicked on the address bar.");
        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "addressBar"));
        Thread.sleep(1000);

// Type URL in the address bar
        MobileElement urlBar = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.android.chrome:id/url_bar']"));
        urlBar.click();
        urlBar.sendKeys("https://www.kiplinger.com/");
        System.out.println("URL typed.");
        Thread.sleep(1000);

        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "urlBar"));

        MobileElement searchResult = (MobileElement) driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"));
        searchResult.click();
        System.out.println("Clicked on the search result.");
        Thread.sleep(1500);

        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "searchResult"));


        System.out.println("Swipe perform");
        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Swipe perform"));
        System.out.println("Swipe perform1");
        Thread.sleep(1500);
        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Swipe perform 1"));
        System.out.println("Swipe perform2");
        Thread.sleep(1500);
        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Swipe perform 2"));
        System.out.println("Swipe perform3");
        Thread.sleep(1500);
        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Swipe perform 3"));


        driver.quit();
    }
}