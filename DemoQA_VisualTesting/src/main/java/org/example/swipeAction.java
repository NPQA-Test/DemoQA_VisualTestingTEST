package org.example;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.ScreenOrientation;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

public class swipeAction {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        for (int i = 0; i < 4; i++) {
            AndroidDriver driver;
            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability("tg:projectName", "Visual Test apk NP");
            capabilities.setCapability("browserName", "chrome");
            capabilities.setCapability("autoGrantPermissions", "true");


            capabilities.setCapability("deviceName", "Galaxy S24");
            capabilities.setCapability("platformVersion", "14");
            capabilities.setCapability("platformName", "android");
            capabilities.setCapability("automationName", "UiAutomator2");
            capabilities.setCapability("udid", "RFCX50SP0YK");
            capabilities.setCapability("tg:userToken", "k6rq4nwrxba0lf01ge2rget15y7gl9ht");
            capabilities.setCapability("systemPort", "4110");
            capabilities.setCapability("uiautomator2ServerLaunchTimeout", "90000");
            driver = new AndroidDriver(new URL("http://omnissatest.testgrid.io/appium_38110/wd/hub"), capabilities);

            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            ((JavascriptExecutor) driver).executeScript("tg:action", "{\"status\": \"passed\", \"case\": \"Passed Case Test\"}");

            Set<String> contexts = driver.getContextHandles();
            for (String context : contexts) {
                System.out.println(contexts);
                driver.context("NATIVE_APP");
            }
            swipeandroid(driver);
            Thread.sleep(5000);
            System.out.println("Test completed.");
            driver.quit();

        }
    }
    static void swipeandroid(AndroidDriver driver) throws InterruptedException {

        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testcaseName", "NP colour Android Visual"));

        driver.rotate(ScreenOrientation.PORTRAIT);

        Thread.sleep(5000);


//        try {
//            MobileElement homepageButton = (MobileElement) driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.android.chrome:id/home_button']"));
//            if (homepageButton.isDisplayed()) {
//                homepageButton.click();
//                System.out.println("Opened the homepage.");
//                ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "homepageButton"));
//            } else {
//                System.out.println("homepageButton is not displayed.");
//            }
//        } catch (NoSuchElementException e) {
//            System.out.println("homepageButton is not found.");
//        }
//
//        try {
//            MobileElement addressBar = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@text='Search or type URL']"));
//            if (addressBar.isDisplayed()) {
//                addressBar.click();
//                System.out.println("Clicked on the address bar.");
//                ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "addressBar"));
//            } else {
//                System.out.println("Address bar is not displayed.");
//            }
//        } catch (NoSuchElementException e) {
//            System.out.println("Address bar is not found.");
//        }


        Thread.sleep(1000);
            MobileElement urlBar = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.android.chrome:id/url_bar']"));
            urlBar.click();
           // urlBar.sendKeys("https://bouncyballs.org/");
            urlBar.sendKeys("https://infinite-scroll.com/demo/full-page/page4");
            System.out.println("URL typed.");



            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "urlBar"));

            MobileElement searchResult = (MobileElement) driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"));
            searchResult.click();
            System.out.println("Clicked on the search result.");
            Thread.sleep(5000);

            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "searchResult"));

            PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

            for (int i = 0; i < 5; i++) { // Change 3 to the number of times you want to swipe
                Sequence scrollDown = new Sequence(finger, 1);
                scrollDown.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), 500, 1500));
                scrollDown.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
                scrollDown.addAction(finger.createPointerMove(Duration.ofMillis(1500), PointerInput.Origin.viewport(), 500, 500));
                scrollDown.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

                driver.perform(Arrays.asList(scrollDown));
                System.out.println("Scroll down performed " + (i + 1) + " time(s)");

                // Add a small pause between scrolls if needed
                Thread.sleep(2000);

                ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Swipe Up For" + i + "Time"));

            }

            Thread.sleep(2500);

            Sequence ScrollUp = new Sequence(finger, 1);
            ScrollUp.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), 500, 500));
            ScrollUp.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
            ScrollUp.addAction(finger.createPointerMove(Duration.ofMillis(1500), PointerInput.Origin.viewport(), 500, 1000));
            ScrollUp.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Scroll Down performed"));

            driver.perform(Arrays.asList(ScrollUp));
            System.out.println("Scroll Up performed");

            // Add a small pause between scrolls if needed
            Thread.sleep(2000);

            System.out.println("All Swipe perform");
            driver.quit();
    }
}
