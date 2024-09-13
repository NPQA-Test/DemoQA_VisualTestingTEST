package org.example;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import static org.example.Web.stepsAction;
import static org.example.WebAllOperator.Alloperatorcheck;


public class ParallelCapsWEB {

    public static void browser1(String ParallelCapsWEB, String userToken) throws MalformedURLException, InterruptedException {
            WebDriver driver1 = null;
            try {

                DesiredCapabilities capabilities1 = new DesiredCapabilities();
                capabilities1.setCapability("tg:userToken", userToken);
                capabilities1.setCapability("tg:projectName", "Visual Test Web");


                capabilities1.setCapability("tg:udid", "101");
                capabilities1.setCapability("browserName", "chrome");
                driver1 = new RemoteWebDriver(new URL("http://poc3.testgrid.io/browserrun35411/wd/hub"), capabilities1);

                driver1.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

                Alloperatorcheck(driver1);
            } catch (Exception e) {
                System.out.println("Test run failed: " + e.getMessage());
            } finally {
                if (driver1 != null) {
                    driver1.quit();
                }
                // Wait for 20 seconds before starting the next test run
                Thread.sleep(10000);
            }
    }

    public static void browser2(String ParallelCapsWEB, String userToken) throws MalformedURLException, InterruptedException
        {
                WebDriver driver2 = null;
                try {

                    DesiredCapabilities capabilities2 = new DesiredCapabilities();
                    capabilities2.setCapability("tg:userToken", userToken);
                    capabilities2.setCapability("tg:projectName", "Visual Test Web");


                    capabilities2.setCapability("tg:udid", "201");
                    capabilities2.setCapability("browserName", "firefox");
                    driver2 = new RemoteWebDriver(new URL("http://poc3.testgrid.io/browserrun35411/wd/hub"), capabilities2);

                    driver2.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

                    Alloperatorcheck(driver2);
                } catch (Exception e) {
                    System.out.println("Test run failed: " + e.getMessage());
                } finally {
                    if (driver2 != null) {
                        driver2.quit();
                    }
                    // Wait for 20 seconds before starting the next test run
                    Thread.sleep(10000);

                }
        }
    public static void browser3(String ParallelCapsWEB, String userToken) throws MalformedURLException, InterruptedException {
        WebDriver driver3;

        DesiredCapabilities capabilities3 = new DesiredCapabilities();
        capabilities3.setCapability("tg:userToken", userToken);
        capabilities3.setCapability("tg:projectName", "Visual Test Web");

        capabilities3.setCapability("tg:udid", "301");
        capabilities3.setCapability("browserName", "MicrosoftEdge");
        driver3 = new RemoteWebDriver(new URL("http://poc3.testgrid.io/browserrun35411/wd/hub"), capabilities3);


        driver3.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        Alloperatorcheck(driver3);
    }

    public static void browser4(String ParallelCapsWEB, String userToken) throws MalformedURLException, InterruptedException {
        WebDriver driver4;

        DesiredCapabilities capabilities4 = new DesiredCapabilities();
        capabilities4.setCapability("tg:userToken", userToken);

        
        capabilities4.setCapability("tg:udid", "302");
        capabilities4.setCapability("browserName", "MicrosoftEdge");
        driver4 = new RemoteWebDriver(new URL("http://poc.testgrid.io/browserrun35514/wd/hub"), capabilities4);

        driver4.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        Alloperatorcheck(driver4);
    }
    public static void browser5(String ParallelCapsWEB, String userToken) throws MalformedURLException, InterruptedException {
        WebDriver driver5;

        DesiredCapabilities capabilities5 = new DesiredCapabilities();
        capabilities5.setCapability("tg:userToken", userToken);


        capabilities5.setCapability("tg:udid", "101");
        capabilities5.setCapability("browserName", "chrome");
        driver5 = new RemoteWebDriver(new URL("http://poc.testgrid.io/browserrun35511/wd/hub"), capabilities5);
        driver5.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        Alloperatorcheck(driver5);
    }

    public static void browser6(String ParallelCapsWEB, String userToken) throws MalformedURLException, InterruptedException {
        WebDriver driver6;

        DesiredCapabilities capabilities6 = new DesiredCapabilities();
        capabilities6.setCapability("tg:userToken", userToken);

        capabilities6.setCapability("tg:udid", "102");
        capabilities6.setCapability("browserName", "chrome");
        driver6 = new RemoteWebDriver(new URL("http://poc.testgrid.io/browserrun35514/wd/hub"), capabilities6);

        driver6.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        Alloperatorcheck(driver6);
    }
}
