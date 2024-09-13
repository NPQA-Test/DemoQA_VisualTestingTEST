package org.example;

import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Web {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        for (int i=0; i < 5 ; i++) {
            WebDriver driver = null;
            try {
                DesiredCapabilities capabilities = new DesiredCapabilities();
                org.openqa.selenium.chrome.ChromeOptions options = new org.openqa.selenium.chrome.ChromeOptions();
                options.addArguments("--proxy-server=http://192.168.5.28:10001");


                capabilities.setCapability("tg:udid", "101");
                capabilities.setCapability("tg:userToken", "5pqrln54x7x3fsutoqu9ycm4ztoqo8sq");
                capabilities.setCapability("browserName", "chrome");


                capabilities.merge(options);
                driver = new RemoteWebDriver(new URL("http://poc3.testgrid.io/browserrun35411/wd/hub"), capabilities);



                String Urldemo = "https://demoqa.com/";
                stepsAction(driver, Urldemo);
            } catch (Exception e) {
                System.out.println("Test run failed: " + e.getMessage());
            } finally {
                if (driver != null) {
                    driver.quit();
                }
                // Wait for 20 seconds before starting the next test run
                Thread.sleep(2000);
            }
        }
    }
        static void stepsAction(WebDriver driver, String Urldemo){
        try {
            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testcaseName", "DemoQA NA Test"));

            Thread.sleep(5000);
            driver.get(Urldemo);
            System.out.println(STR."Redirected to \{Urldemo} successfully.");

            Thread.sleep(5000);

            WebElement elementslink = driver.findElement(By.xpath("//h5[text()='Elements']"));
            elementslink.click();
            System.out.println("Clicked on Elements link successfully.");

            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "elementslink"));
            Thread.sleep(500);

            WebElement textboxElement = driver.findElement(By.xpath("(//span[@class='text'])[1]"));
            if(textboxElement.isDisplayed())
            {
                textboxElement.click();
                System.out.println("Clicked on TextBox link successfully.");
            }
            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "textboxElement"));

            Thread.sleep(500);


            WebElement nameElement = driver.findElement(By.xpath("//input[@id='userName']"));
            if(nameElement.isDisplayed())
            {
                nameElement.sendKeys("Same");
                System.out.println("Type done on TextBox text box.");
            }
            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "nameElement"));
            Thread.sleep(500);

            WebElement emailElement = driver.findElement(By.xpath("//input[@id='userEmail']"));
            emailElement.sendKeys("Same.jose@gmail.com");
            System.out.println("Type done on Email text box.");

            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "emailElement"));
            Thread.sleep(500);

            WebElement addressElement = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
            addressElement.sendKeys("Super Marine Pines 1764");
            System.out.println("Type done on address text box.");

            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "addressElement"));
            Thread.sleep(500);

            WebElement permaddElement = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
            permaddElement.sendKeys("Super Marine Pines 1764");
            System.out.println("Type done on Permanent Address text box.");
            Thread.sleep(1000);

            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "permaddElement"));

            driver.quit();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
