package org.example;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidSuperProxy {

    public static void main() throws MalformedURLException, InterruptedException {
        AndroidDriver driver;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Galaxy S10+");
        capabilities.setCapability("platformVersion", "12");
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("udid", "RZ8M42CZB5K");
        capabilities.setCapability("tg:userToken", "unp4zq16787tnjsa7o3gb1kin2mooloj");
        capabilities.setCapability("systemPort", "4003");
        capabilities.setCapability("uiautomator2ServerLaunchTimeout", "90000");
        driver = new AndroidDriver(new URL("http://testing.testgrid.io/appium_38003/wd/hub"), capabilities);

        capabilities.setCapability("appPackage", "com.scheler.superproxy");
        capabilities.setCapability("appActivity", "com.scheler.superproxy.activity.MainActivity");

        Thread.sleep(1000);

        SuperProxyHomePage(driver);

    }

    static void SuperProxyHomePage (AndroidDriver driver) throws InterruptedException {
//        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testcaseName", "StudentRegistrationForm_DemoQA"));
        Thread.sleep(1000);

        // MobileElement Logo  = (MobileElement) driver.findElementByXPath("//android.widget.Button[@text='Use without an account']");
//        if (ele_withoutAccount.isDisplayed()) {
//            ele_withoutAccount.click();
//            System.out.println("Clicked on Use without account button successfully.");
//        }
        //switchToWebContext(driver);



        MobileElement logo = (MobileElement) driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Super Proxy']"));
        if (logo.isDisplayed()){
            System.out.println("Super Proxy Logo is Displayed");
            Thread.sleep(2000);
        }


        MobileElement addProxy = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@content-desc='Add proxy']"));
        addProxy.click();
        System.out.println("Clicked on the Add Proxy");
        Thread.sleep(2000);

        MobileElement defaultProfile = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@text='Default Profile']"));
        if (defaultProfile.isDisplayed()){
            System.out.println("Default Profile is Displayed");
            Thread.sleep(2000);
        }

        MobileElement protocol = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@text='SOCKS5']"));
        protocol.isDisplayed();
        System.out.println("Protocol is Displayed");
        Thread.sleep(2000);


        MobileElement server = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@index=2]"));
        server.click();
        server.sendKeys("testing.testgrid.io");
        System.out.println("Type In TestGrid Successfully");
        Thread.sleep(2000);

        MobileElement port = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@index=3]"));
        port.click();
        port.sendKeys("50099");
        System.out.println("Type In Port Successfully");
        Thread.sleep(3000);

        MobileElement saveButton = (MobileElement) driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[2]"));
        saveButton.click();
        System.out.println("Clicked on the Save Button Successfully");
        Thread.sleep(1000);


        MobileElement startButton = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@content-desc='Start']"));
        startButton.click();
        System.out.println("Clicked on the startButton Successfully");
        Thread.sleep(1000);

//
//        MobileElement connectionRequest = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/alertTitle']"));
//        if (logo.isDisplayed()){
//            System.out.println("Connection Request Popup is Displayed");
//
//            MobileElement okButton = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@resource-id='android:id/button1']"));
//            okButton.click();
//
//        }

        Thread.sleep(3000);

        MobileElement stopButton = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@content-desc='Stop']"));
        stopButton.click();
        System.out.println("Clicked on the stopButton Successfully");

        Thread.sleep(3000);
        MobileElement backButton = (MobileElement) driver.findElement(By.xpath("//android.view.View[1]/android.widget.Button[1]"));
        backButton.click();
        System.out.println("Clicked on the backButton Successfully");

        Thread.sleep(2000);

        logo.isDisplayed();
        System.out.println("Super Proxy Logo is Displayed");

        Thread.sleep(2000);

        TouchAction swipe = new TouchAction(driver);
        swipe.press(PointOption.point(850, 215)).moveTo(PointOption.point(300, 215)).release().perform();

        Thread.sleep(2000);

        MobileElement deleteButton = (MobileElement) driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.widget.Button[1]"));
        if (deleteButton.isDisplayed()) {
            System.out.println("delete Button is Displayed");
            Thread.sleep(1000);
            deleteButton.click();
            System.out.println("Click on delete Button");

        }

        Thread.sleep(1000);


        driver.quit();
    }


    private static void swipeLeftOnElement() {
    }
}
