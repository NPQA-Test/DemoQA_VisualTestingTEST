package org.example;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.concurrent.TimeUnit;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;

import static org.example.SwipeIOS.IOSSwipe;

public class ParallelCapsIOS {

        public static void iosdevice1(String parallelCapsIOS, String userToken) throws MalformedURLException, InterruptedException {
            for (int i = 0; i < 1; i++) {
                IOSDriver driver1 = null;
                ;
                try {
                    DesiredCapabilities capabilities1 = new DesiredCapabilities();
                    capabilities1.setCapability("tg:userToken", userToken);
                    capabilities1.setCapability("browserName", "safari");
                    capabilities1.setCapability("tg:projectName", "NP Visual Ios-Test");

                    capabilities1.setCapability("deviceName", "iPhone 11 Pro");
                    capabilities1.setCapability("platformVersion", "17.6.1");
                    capabilities1.setCapability("automationName", "XCUITest");
                    capabilities1.setCapability("platformName", "iOS");
                    capabilities1.setCapability("udid", "00008030-000E7419213A802E");
                    capabilities1.setCapability("wdaLocalPort", "3102");
                    driver1 = new IOSDriver(new URL("http://omnissatest.testgrid.io/appium_36102/wd/hub"), capabilities1);



                    ((JavascriptExecutor) driver1).executeScript("tg:action", "{\"status\": \"passed\", \"case\": \"Passed Case Test\"}");

                    IOSSwipe(driver1);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                // Wait for 20 seconds before starting the next test run
                Thread.sleep(30000);
            }

        }

    public static void iosdevice2(String parallelCapsIOS, String userToken) throws MalformedURLException, InterruptedException {
        for (int f = 0; f < 1; f++) {

            IOSDriver driver2 = null;
            try {
                DesiredCapabilities capabilities2 = new DesiredCapabilities();
                capabilities2.setCapability("tg:userToken", userToken);
                capabilities2.setCapability("browserName", "safari");
                capabilities2.setCapability("tg:projectName", "Visual Ios-Test");

                capabilities2.setCapability("deviceName", "iPhone SE 2nd Gen");
                capabilities2.setCapability("platformVersion", "16.1.2");
                capabilities2.setCapability("automationName", "XCUITest");
                capabilities2.setCapability("platformName", "iOS");
                capabilities2.setCapability("udid", "00008030-001404983CEB802E");
                capabilities2.setCapability("wdaLocalPort", "3101");
                driver2 = new IOSDriver(new URL("http://omnissatest.testgrid.io/appium_36101/wd/hub"), capabilities2);



                driver2.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

                ((JavascriptExecutor) driver2).executeScript("tg:action", "{\"status\": \"passed\", \"case\": \"Passed Case Test\"}");


                IOSSwipe(driver2);

            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            // Wait for 20 seconds before starting the next test run
            Thread.sleep(30000);
        }
    }

    public static void iosdevice3(String parallelCapsIOS, String userToken) throws MalformedURLException, InterruptedException {
        for (int i = 0; i < 2; i++) {
            IOSDriver driver3 = null;
            try {
                DesiredCapabilities capabilities3 = new DesiredCapabilities();
                capabilities3.setCapability("tg:userToken", userToken);

                capabilities3.setCapability("deviceName", "iPhone 15 Pro");
                capabilities3.setCapability("platformVersion", "17.3.1");
                capabilities3.setCapability("automationName", "XCUITest");
                capabilities3.setCapability("platformName", "iOS");
                capabilities3.setCapability("udid", "00008130-001659690201001C");
                capabilities3.setCapability("wdaLocalPort", "3003");
                capabilities3.setCapability("tg:projectName", "Visual Test ios");
                driver3 = new IOSDriver(new URL("http://grupo.testgrid.io/appium_36003/wd/hub"), capabilities3);


                //    capabilitiesthree.setCapability("tg:projectName", "Visual Ios-Test");
                capabilities3.setCapability("appium:automationName", "XCUITest");
                capabilities3.setCapability("browserName", "safari");

                driver3.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

                ((JavascriptExecutor) driver3).executeScript("tg:action", "{\"status\": \"passed\", \"case\": \"Passed Case Test\"}");

                IOSSwipe(driver3);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            // Wait for 20 seconds before starting the next test run
            Thread.sleep(30000);
        }
    }

/*    public static void iosdevice4(String parallelCapsIOS, String userToken) throws MalformedURLException, InterruptedException {
        for (int i = 0; i < 2; i++) {
            IOSDriver driver4 = null;
            try {
                DesiredCapabilities capabilities4 = new DesiredCapabilities();
                capabilities4.setCapability("tg:userToken", userToken);

                capabilities4.setCapability("deviceName", "iPhone 14");
                capabilities4.setCapability("platformVersion", "16.3");
                capabilities4.setCapability("automationName", "XCUITest");
                capabilities4.setCapability("platformName", "iOS");
                capabilities4.setCapability("udid", "00008110-000E406401F1401E");
                capabilities4.setCapability("tg:userToken", "ksa4ayqcngnmdttqqu4efftx2jajo2in");
                capabilities4.setCapability("wdaLocalPort", "3101");
                capabilities4.setCapability("tg:projectName", "Visual Test ios");
                driver4 = new IOSDriver(new URL("http://indc1.testgrid.io/appium_36101/wd/hub"), capabilities4);

                //    capabilitiesthree.setCapability("tg:projectName", "Visual Ios-Test");
                capabilities4.setCapability("appium:automationName", "XCUITest");
                capabilities4.setCapability("browserName", "safari");

                driver4.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

                ((JavascriptExecutor) driver4).executeScript("tg:action", "{\"status\": \"passed\", \"case\": \"Passed Case Test\"}");

                IOSSwipe(driver4);

            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            // Wait for 20 seconds before starting the next test run
            Thread.sleep(30000);
        }
*/
    }
