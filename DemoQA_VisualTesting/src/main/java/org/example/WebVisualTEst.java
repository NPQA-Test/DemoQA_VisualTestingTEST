
package org.example;

import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class WebVisualTEst {


    private static String WebVisualTEst;

    public static void main() {

        WebDriver driver = null;
        try {
//            org.openqa.selenium.chrome.ChromeOptions options = new org.openqa.selenium.chrome.ChromeOptions();
//            options.addArguments("--proxy-server=http://192.168.5.29:10001");


            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("tg:udid", "201");
            capabilities.setCapability("tg:userToken", "pqi5yl9si83ge9jl8rjvf0aen2r3m15o");
            capabilities.setCapability("browserName", "firefox");
            driver = new RemoteWebDriver(new URL("https://stageslave.testgrid.io/browserrun35411/wd/hub"), capabilities);

//            capabilities.merge(options);

//            driver = new RemoteWebDriver(new URL("http://poc3.testgrid.io/browserrun35411/wd/hub"), capabilities);

            capabilities.setCapability("tg:projectName", "Visual Test Web Network log");

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

                checkVisualTest((WebDriver) driver);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
    }
    static void checkVisualTest(WebDriver driver)
    {
        try {
            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testcaseName", "Browser-Visual-Test"));

            Thread.sleep(2000);
            String Amazon = "https://www.amazon.com/";
            driver.get(Amazon);
            System.out.println("Redirected to "+Amazon+" successfully.");


            for (int i = 0; i < 20; i++) {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollBy(0, 300);");

                Thread.sleep(500);

                System.out.println("Swipe for " + i + " Time");
                ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName","Step No is"+ i));

            }

            Thread.sleep(1000);

            driver.quit();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}