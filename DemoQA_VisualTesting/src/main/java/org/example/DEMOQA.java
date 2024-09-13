package org.example;

import com.google.common.collect.ImmutableMap;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DEMOQA {


    public static void main(){
        String DEMOQA = "https://demoqa.com/automation-practice-form";
        try {
            WebDriver driver;

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--proxy-server=http://192.168.4.13:1012");


            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("tg:udid", "101");
            capabilities.setCapability("tg:userToken", "qsh102chi0c138kwwmhfs5hrt5n5n2ru");
            capabilities.setCapability("browserName", "chrome");
            capabilities.merge(options);

            driver = new RemoteWebDriver(new URL("http://grupo.testgrid.io/browserrun35514/wd/hub"), capabilities);

            demoAction(driver,DEMOQA);
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
    }
    static void demoAction(WebDriver driver, String DEMOQA)
    {
        try {
            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testcaseName", "DEMOQATEST"));

            Thread.sleep(2000);
            driver.get(DEMOQA);
            System.out.println("Redirected to "+DEMOQA+" successfully.");

                WebElement DEMOQALogo = driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']"));
            Assert.assertTrue(DEMOQALogo.isDisplayed());
            System.out.println("DEMOQA Logo IS visible.");

            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName","DEMOQALogo"));

            WebElement firstNameElememt = driver.findElement(By.xpath("//input[@id='firstName']"));
            if(firstNameElememt.isDisplayed())
            {
                firstNameElememt.click();
                System.out.println("Clicked on first Name successfully.");

                ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName","firstNameElememt click"));


                Thread.sleep(500);

                firstNameElememt.sendKeys("IRONMAN");
                System.out.println("firstName is added on Name Filed.");

                ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName","firstNameElememt ENTER"));


            }
            WebElement lastNameElement = driver.findElement(By.xpath("//input[@id='lastName']"));
            if(lastNameElement.isDisplayed())
            {
                lastNameElement.click();
                System.out.println("Click on lastName Filed");

                ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName","lastName click"));

                Thread.sleep(500);

                lastNameElement.sendKeys("J.A.R.V.I.S.");
                System.out.println("lastName Is Enter Successfully.");
                ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName","lastName ENTER"));
            }

         /*   WebElement subjectsContainer = driver.findElement( By.cssSelector("div#subjectsContainer > div > div"));
            subjectsContainer.click ();
            System.out.println ( "Clicked on subjects AContainer successfully." );

            ((JavascriptExecutor) driver).executeScript ( "tg:logs", ImmutableMap.of ( "testStepName", "subjectsContainer" ) );


          Thread.sleep ( 1500 );

            WebElement subjectsInput = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
            if(subjectsInput.isDisplayed())
            {
                subjectsInput.click();
                System.out.println("Click on subjectsInput Filed");

             ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName","subjectsInput click"));

            Thread.sleep(500);

                subjectsInput.sendKeys("Maths");
                subjectsInput.sendKeys(Keys.ENTER);
                System.out.println("subjects Is Enter Successfully.");
                ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName","subjectsInput ENTER"));
            }
 */

            WebElement userEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
            if(userEmail.isDisplayed())
            {
                userEmail.click();
                System.out.println("Clicked on userEmail successfully.");

                ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName","userEmail"));


                Thread.sleep(1500);

                userEmail.sendKeys("nptest@gmail.com");
                System.out.println("Email is added on userEmail Filed.");

                ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName","userEmailEnter"));
            }

            WebElement Gender = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
            Gender.click();
            System.out.println("Check Redio Button On Gender.");

            Thread.sleep(500);

            WebElement elementgrouButton = driver.findElement(By.xpath("//div[normalize-space()='Elements']"));
            elementgrouButton.click();
            System.out.println("CLICK ON elementgrouButton.");

            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName","element-group"));


            Thread.sleep(500);

            WebElement LinksButton = driver.findElement(By.xpath("//span[normalize-space()='Links']"));
            LinksButton.click();
            System.out.println("CLICK ON LinksButton.");

            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName","LinksButton"));

            Thread.sleep(500);

            WebElement simpleLinkButton = driver.findElement(By.xpath("(//a[normalize-space()='Home'])[1]"));
            simpleLinkButton.click();
            System.out.println("CLICK ON simpleLinkButton.");

            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName","simpleLinkButton"));

            // Pass or Failed
            ((JavascriptExecutor) driver).executeScript("tg:action","{\"status\": \"Pass\", \"case\": \"Pass test for the testcase!\"}");
            driver.quit();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}