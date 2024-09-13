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
import java.util.Set;

public class iOSBI {
    public static void main() throws MalformedURLException, InterruptedException {
        IOSDriver driver;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "iPhone 12");
        capabilities.setCapability("platformVersion", "17.1.2");
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("udid", "00008101-00040DEA0E63003A");
        capabilities.setCapability("tg:userToken", "ochskrxwei4ujverxb8w5jfxj1bgnlsw");
        capabilities.setCapability("wdaLocalPort", "3510");
        driver = new IOSDriver(new URL("http://usdc4.testgrid.io/appium_36510/wd/hub"), capabilities);


        capabilities.setCapability("appium:automationName", "XCUITest");
        capabilities.setCapability("browserName", "safari");



        Mylocation(driver);

        driver.quit();
    }

    static void Mylocation(WebDriver driver) throws InterruptedException {
        Thread.sleep(5000);
        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testcaseName", "Mylocation"));

        Thread.sleep(10000);

        IOSElement searchharea = driver.findElement(By.xpath("//XCUIElementTypeTextField[@label='Address']"));
        searchharea.click();
        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "searchharea"));

        Thread.sleep(3000);

        IOSElement ele_URLarea = driver.findElement(By.xpath("//XCUIElementTypeTextField[@name='URL']"));
        ele_URLarea.sendKeys("https://mylocation.org/");
        System.out.println("mylocation search done.");
        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "URLarea"));

        Thread.sleep(3000);

        IOSElement ele_gobutton = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Go\"]"));
        ele_gobutton.click();
        System.out.println("Tap On Go Button.");
        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "gobutton"));


        ((JavascriptExecutor) driver).executeScript("tg:action", "{\"status\": \"passed\", \"case\": \"Passed Case Test\"}");


        driver.quit ();
    }

}
