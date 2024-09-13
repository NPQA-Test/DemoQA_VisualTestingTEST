package org.example;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Android {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        AndroidDriver driver;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel 8 Pro");
        capabilities.setCapability("platformVersion", "14");
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("udid", "3A211FDJG002M4");
        capabilities.setCapability("tg:userToken", "k6rq4nwrxba0lf01ge2rget15y7gl9ht");
        capabilities.setCapability("systemPort", "4117");
        capabilities.setCapability("uiautomator2ServerLaunchTimeout", "90000");
        driver = new AndroidDriver(new URL("http://omnissatest.testgrid.io/appium_38117/wd/hub"), capabilities);

        capabilities.setCapability("tg:projectName", "TestAPK");


        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

//        switchToWebContext(driver);
 /*       Set<String> contexts = driver.getContextHandles();
        for (String context : contexts) {
            System.out.println(contexts);
            driver.context("NATIVE_APP");
        }
*/
        //studentRegistrationPage(driver);
        demoQATextBox(driver);
        driver.quit();
    }

    static void studentRegistrationPage(AndroidDriver driver) throws InterruptedException {
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testcaseName", "StudentRegistrationForm_DemoQA"));
        Thread.sleep(1000);
        String forms = "Forms";
        String address = "currentAddress";

//        MobileElement ele_withoutAccount = (MobileElement) driver.findElementByXPath("//android.widget.Button[@text='Use without an account']");
//        if (ele_withoutAccount.isDisplayed()) {
//            ele_withoutAccount.click();
//            System.out.println("Clicked on Use without account button successfully.");
//        }
        //switchToWebContext(driver);

        MobileElement ele_addressbar = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.android.chrome:id/url_bar']"));
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Step 1"));
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Browser Home page"));
        ele_addressbar.click();
        System.out.println("Clicked on Address bar.");
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Step 2"));
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Tap on Address bar"));

        MobileElement ele_urlbar = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.android.chrome:id/url_bar']"));
        ele_urlbar.sendKeys("https://demoqa.com/");
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Step 3"));
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Typing URL"));
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        System.out.println("URL type done.");

        //Thread.sleep(30000);
        //boolean ele_toolsqaimage = driver.findElement(By.xpath("//android.widget.Image[@text='Toolsqa']")).isDisplayed();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return driver.findElement(By.xpath("//android.widget.Image[@text='Toolsqa']")).isDisplayed();
            }
        });
        System.out.println("ToolsQA image displayed.");

        Thread.sleep(1000);
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Step 4"));
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "DemoQA homepage"));
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"" + forms + "\").instance(0))").click();
        System.out.println("Scrolled and Clicked to forms.");

        Thread.sleep(2000);
        MobileElement ele_practiceform = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Practice Form']"));
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Step 5"));
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Practice form link"));
        ele_practiceform.click();
        System.out.println("Clicked to practice form.");

        wait.until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return driver.findElement(By.xpath("//android.view.View[@resource-id='google_ads_iframe_/21849154601,22343295815/Ad.Plus-728x90_0']")).isDisplayed();
            }
        });
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Step 6"));
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "First Promotional Section"));
        System.out.println("First Promotional Section Displayed.");

        Thread.sleep(2000);
        //MobileElement ele_registationform_text = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Student Registration Form']"));
        MobileElement ele_firstname = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@resource-id='firstName']"));
        ele_firstname.sendKeys("Sam");
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Step 7"));
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Type First name"));
        System.out.println("First name type done.");
//
        MobileElement ele_lastname = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@resource-id='lastName']"));
        ele_lastname.sendKeys("jose");
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Step 8"));
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Type Last name"));
        System.out.println("Last name type done.");
//
        MobileElement ele_email = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@resource-id='userEmail']"));
        ele_email.sendKeys("sam.jose@test.com");
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Step 9"));
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Type Email"));
        System.out.println("Email type done.");
//
        MobileElement ele_malebutton = (MobileElement) driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='gender-radio-1']"));
        ele_malebutton.click();
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Step 10"));
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Gender selection"));
        System.out.println("Gender selected.");

        MobileElement ele_mobileno = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@resource-id='userNumber']"));
        ele_mobileno.sendKeys("7898945561");
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Step 11"));
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Type mobile number"));
        System.out.println("Mobile number type done.");

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceId(\".currentAddress\").instance(0))").sendKeys("Super marine pines 1695");
        System.out.println("Scrolled to address.");

        //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"" + address + "\").instance(0))");
//        MobileElement ele_address = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@resource-id='currentAddress']"));
//        ele_address.sendKeys("Super marine pines 1695");
        System.out.println("Address type done.");

        wait.until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return driver.findElement(By.xpath("//android.view.View[@resource-id='google_ads_iframe_/21849154601,22343295815/Ad.Plus-Anchor_0']")).isDisplayed();
            }
        });
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Step 12"));
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Second Promotional Section"));

        Thread.sleep(2000);
        driver.quit();
    }

    static void demoQATextBox(AndroidDriver driver) throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testcaseName", "TextBox_DemoQA+A"));
        String submit = "Advertisement";
        Thread.sleep(5000);

        //MobileElement ele_addressbar = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.android.chrome:id/url_bar']"));
        MobileElement ele_addressbar;
        ele_addressbar = (MobileElement) By.xpath("//android.widget.EditText[@resource-id='com.android.chrome:id/search_box_text']").findElement(driver);
        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Step 1"));
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Browser Home page"));
        ele_addressbar.click();
        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Step 2"));
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Tap on Address bar"));
        System.out.println("Clicked on Address bar.");

        MobileElement ele_URL = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.android.chrome:id/url_bar']"));
        ele_URL.sendKeys("https://demoqa.com/text-boxxx");
        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Step 3"));
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Typing URL"));
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Step 4"));
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "URL Searched"));
        System.out.println("URL type done.");

/*        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return driver.findElement(By.xpath("//android.view.View[@resource-id='google_ads_iframe_/21849154601,22343295815/Ad.Plus-728x90_0']")).isDisplayed();
            }
        });
        System.out.println("First Promotional Section Displayed.");
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Step 5"));
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "First Promotional Section"));

        MobileElement ele_fullname = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@resource-id='userName']"));
        ele_fullname.sendKeys("Sam jose");
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Step 6"));
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Typing Full name"));
        System.out.println("Full name type done.");

        MobileElement ele_email = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@resource-id='userEmail']"));
        ele_email.sendKeys("Sam.jose@test.com");
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Step 7"));
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Typing Email"));
        System.out.println("Email type done.");

        MobileElement ele_currentaddress = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@resource-id='currentAddress']"));
        ele_currentaddress.sendKeys("Super marine pines 1975");
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Step 8"));
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Typing Current Address"));
        System.out.println("Address type done.");

        MobileElement ele_permanentaddress = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@resource-id='permanentAddress']"));
        ele_permanentaddress.sendKeys("Super marine pines 1975");
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Step 9"));
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Typing Permanent Address"));
        System.out.println("Permanent address type done.");

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"" + submit +"\").instance(0))");
        System.out.println("Second Promotional Section Displayed");
        //        System.out.println("Clicked on submit.");
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Step 10"));
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Click on Submit"));

//        wait.until(new ExpectedCondition<Boolean>() {
//            @Override
//            public Boolean apply(WebDriver driver) {
//                return driver.findElement(By.xpath("//android.view.View[@resource-id='google_ads_iframe_/21849154601,22343295815/Ad.Plus-300x250_0']")).isDisplayed();
//            }
//        });
//        System.out.println("Second Promotional Section Displayed");
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Step 11"));
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "Second Promotional Section"));
        Thread.sleep(3000);*/
        driver.quit();
    }
}


//        MobileElement ele_subject = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@resource-id='subjectsInput']"));
//        ele_subject.sendKeys("History");
//        MobileElement ele_history = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@resource-id='react-select-2-option-0']"));
//        ele_history.click();

//        HashMap<String, String> scrollObject = new HashMap<>();
//        scrollObject.put("element", String.valueOf(driver.findElement(MobileBy.xpath("//android.widget.EditText[@resource-id='currentAddress']"))));