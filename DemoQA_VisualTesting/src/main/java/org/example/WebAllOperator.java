package org.example;

import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.net.URL;

public class WebAllOperator {

    public static void main() throws InterruptedException { {
        WebDriver driver = null;
        for (int i=0; i<1; i++) {
            try {

                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("tg:udid", "101");
                capabilities.setCapability("tg:userToken", "ochskrxwei4ujverxb8w5jfxj1bgnlsw");
                capabilities.setCapability("browserName", "chrome");
                driver = new RemoteWebDriver(new URL("http://poc3.testgrid.io/browserrun35411/wd/hub"), capabilities);

                String automationtesting = "https://demo.automationtesting.in/Register.html";
                Alloperatorcheck((WebDriver) driver);
            } catch (Exception e) {
                System.out.println("Test run failed: " + e.getMessage());
            } finally {
                if (driver != null) {
                    driver.quit();
                }
                // Wait for 20 seconds before starting the next test run
                Thread.sleep(10000);
            }
        }
    }
}
    static void Alloperatorcheck(WebDriver driver){
        try {
            String automationtesting = "https://demo.automationtesting.in/Register.html";
            Thread.sleep(5000);
            driver.get(automationtesting);
            System.out.println(STR."Redirected to \{automationtesting} successfully.");

            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testcaseName", "Demo Site Test NP"));

            WebElement elementslink = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
            elementslink.click();
            System.out.println("Clicked on Elements link successfully.");

            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "elementslink"));

            Thread.sleep(5000);

            WebElement AutomationDemoSite = driver.findElement(By.xpath("//h1[normalize-space()='Automation Demo Site']"));
            if(AutomationDemoSite.isDisplayed())
                ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "isDisplayed"));
            {
                AutomationDemoSite.click();
                System.out.println("Clicked on TextBox link successfully.");
            }
            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "click"));

            AutomationDemoSite.isEnabled();
            System.out.println("Automation Demo Site is enabled.");

            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "isEnabled"));

            Thread.sleep(5000);

            WebElement checkbox1 = driver.findElement(By.xpath("(//input[@id='checkbox1'])[1]"));
            if(checkbox1.isDisplayed())
            {
                checkbox1.click();
                System.out.println("Tap on checkbox1.");
            }
            Thread.sleep(2000);
            checkbox1.isSelected();
            System.out.println("checkbox1 is Selected");
            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "isSelected"));
            Thread.sleep(2000);

            WebElement skillsElement = driver.findElement(By.xpath("//select[@id='Skills']"));
            Select skillsSelect = new Select(skillsElement);
            skillsSelect.selectByValue("Open Source Software");
            System.out.println("Selected skills from Drop Down");
            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "skillsSelect"));
            Thread.sleep(2000);

            WebElement Firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
            Firstname.sendKeys("Virat");
            System.out.println("type First name");
            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "sendKeys"));
            Thread.sleep(2000);

            Firstname.clear();
            System.out.println("clear First name");
            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "clear"));
            Thread.sleep(2000);

            String attributeValue = Firstname.getAttribute("id");
            System.out.println("Value of the attribute: " + attributeValue);
            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "getAttribute"));
            Thread.sleep(2000);

            String colorValue = AutomationDemoSite.getCssValue("color");
            System.out.println("Value of the color CSS property: " + colorValue);
            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "CssValue"));
            Thread.sleep(2000);

            Point location = AutomationDemoSite.getLocation();
            int x = location.getX();
            int y = location.getY();
            System.out.println("X coordinate: " + x + ", Y coordinate: " + y);
            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "getLocation"));
            Thread.sleep(2000);

            System.out.println(AutomationDemoSite.toString());
            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "toString"));
            Thread.sleep(2000);

            String tagName = AutomationDemoSite.getTagName();
            System.out.println("Value of the tagName: " + tagName);
            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "tagName"));
            Thread.sleep(2000);

            String getText = AutomationDemoSite.getText();
            System.out.println("Value of the getText: " + getText);
            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "getText"));
            Thread.sleep(2000);

            Dimension size = AutomationDemoSite.getSize();
            System.out.println("Value of the size: " + size);
            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "size"));
            Thread.sleep(2000);

            if ("Automation Demo Site".equals(AutomationDemoSite)) {
                System.out.println("The strings are equal.");
            } else {
                System.out.println("The strings are not equal.");
            }
            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "equals"));

            int hashCode = AutomationDemoSite.hashCode();
            System.out.println("Hash code for " + Firstname + " is: " + hashCode);
            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "hashCode"));
            Thread.sleep(2000);

            Class<?> clazz = AutomationDemoSite.getClass();
            System.out.println("Class of " + AutomationDemoSite + " is: " + clazz.getName());
            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "getClass"));

            Thread.sleep(1500);

            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            Thread.sleep(1500);

            Rectangle rect = AutomationDemoSite.getRect();
            System.out.println("Element's X coordinate: " + rect.getX());
            System.out.println("Element's Y coordinate: " + rect.getY());
            System.out.println("Element's width: " + rect.getWidth());
            System.out.println("Element's height: " + rect.getHeight());

            Thread.sleep(1500);

//            driver.get("https://www.w3schools.com/html/html_forms.asp");
//
//            Thread.sleep(5000);
//
//            WebElement Formsubmit = driver.findElement(By.xpath("(//input[@value='Submit'])[1]"));
//            Formsubmit.submit();
//            System.out.println("Press on Form submit");
//
//            Thread.sleep(5000);
//
              driver.quit();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

