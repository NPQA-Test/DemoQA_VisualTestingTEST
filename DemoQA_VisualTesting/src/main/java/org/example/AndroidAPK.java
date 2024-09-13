package org.example;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

class AndroidAPK {


    public static void main() throws MalformedURLException, InterruptedException {

        AndroidDriver driver = null;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appPackage", "com.app.urunner");
        capabilities.setCapability("appActivity", "com.app.urunner.ui.SplashActivity");


        capabilities.setCapability("deviceName", "Pixel 8");
        capabilities.setCapability("platformVersion", "14");
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("udid", "39151FDJH000RK");
        capabilities.setCapability("tg:userToken", "fkpok7pfjc16kogl68gyh74m7qhg4ph1");
        capabilities.setCapability("systemPort", "4020");
        capabilities.setCapability("uiautomator2ServerLaunchTimeout", "90000");
        driver = new AndroidDriver(new URL("http://broadcom.testgrid.io/appium_38020/wd/hub"), capabilities);



        urunnerlogin(driver);

        Set contexts;
        contexts = driver.getContextHandles();
        for (Object _ : contexts) {
            System.out.println(contexts);
            driver.context("NATIVE_APP");

        }
        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testcaseName", "Urunner"));

    }

    static void urunnerlogin(AndroidDriver driver) throws InterruptedException {

            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "UrunnerHomePage"));

        Thread.sleep(10000);


        MobileElement emailaddress = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.app.urunner:id/et_email']"));
        emailaddress.click();
        System.out.println("Clicked on email address.");

        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "emailaddress"));
        if (emailaddress.isDisplayed())
        {
            emailaddress.sendKeys("nptest@gmail.com");
            System.out.println("Email id Enter Successfully.");
        }

        Thread.sleep(10000);

        MobileElement password = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.app.urunner:id/et_password']"));
        password.click();

        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "password"));

        if (password.isDisplayed())
        {
            password.sendKeys("Qwe@123");
            System.out.println("password Enter Successfully.");

        }

        Thread.sleep(10000);

        MobileElement loginbutton = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.app.urunner:id/btn_sign_in']"));
        loginbutton.click();
        System.out.println("Click on log in button.");

        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "loginbutton"));

        Thread.sleep(10000);

        MobileElement okeypopup = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@resource-id='android:id/button1']"));
        okeypopup.click();

        System.out.println("Click on okey popup.");

        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "loginbutton"));

        Thread.sleep(10000);

        driver.quit();
    }

}


