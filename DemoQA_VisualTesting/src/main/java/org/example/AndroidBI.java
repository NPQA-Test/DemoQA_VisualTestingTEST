package org.example;


import com.google.common.collect.ImmutableMap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidBI {

    public static void main() throws MalformedURLException, InterruptedException {
        for (int i = 0; i < 1; i++) {
            AndroidDriver driver;
            try {
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("deviceName", "Galaxy S23 FE");
                capabilities.setCapability("platformVersion", "14");
                capabilities.setCapability("platformName", "android");
                capabilities.setCapability("automationName", "UiAutomator2");
                capabilities.setCapability("udid", "R5CX21YYZ9F");
                capabilities.setCapability("tg:userToken", "k6rq4nwrxba0lf01ge2rget15y7gl9ht");
                capabilities.setCapability("systemPort", "4106");
                capabilities.setCapability("uiautomator2ServerLaunchTimeout", "90000");
                driver = new AndroidDriver(new URL("http://omnissatest.testgrid.io/appium_38106/wd/hub"), capabilities);

            capabilities.setCapability("tg:projectName", "Visual Test apk");

            capabilities.setCapability("autoGrantPermissions", "true");
            capabilities.setCapability("browserName", "chrome");

            myLocation(driver);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }
    }
    static void myLocation(AndroidDriver driver) throws InterruptedException {

        ((JavascriptExecutor) driver).executeScript ( "tg:logs", ImmutableMap.of ( "testcaseName", "Swag Labs" ) );

        Thread.sleep (5000);


// Open the homepage
/*        MobileElement homepageButton = (MobileElement) driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Open the home page']"));
        homepageButton.click();
        System.out.println("Opened the homepage.");
        Thread.sleep(2000);
// Click on the address bar
        MobileElement addressBar = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@text='Search or type URL']"));
        addressBar.click();
        System.out.println("Clicked on the address bar.");
        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "addressBar"));
        Thread.sleep(1000);
*/
// Type URL in the address bar
        MobileElement urlBar = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.android.chrome:id/url_bar']"));
        urlBar.click();
        Thread.sleep(1000);
        urlBar.sendKeys("https://www.saucedemo.com/");
        System.out.println("URL typed.");
        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "urlBar"));
        Thread.sleep(3000);

// Click on a search result
        MobileElement searchResult = (MobileElement) driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"));
        searchResult.click();
        System.out.println("Clicked on the search result.");

        Thread.sleep(2000);
        
        ((JavascriptExecutor) driver).executeScript ( "tg:logs", ImmutableMap.of ( "testStepName", "ele_SearchResult" ) );

        MobileElement Username = (MobileElement) driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.EditText[1]"));
        Username.sendKeys("standard_user");
        System.out.println("Type in Username.");

        ((JavascriptExecutor) driver).executeScript ( "tg:logs", ImmutableMap.of ( "testStepName", "Userrname" ) );

        Thread.sleep(1000);

        MobileElement Password = (MobileElement) driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.EditText[1]"));
        Password.sendKeys("secret_sauce");
        System.out.println("Type in Password.");

        ((JavascriptExecutor) driver).executeScript ( "tg:logs", ImmutableMap.of ( "testStepName", "Password" ) );

        Thread.sleep(1000);

        MobileElement LoginButton = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@text='Login']"));
        LoginButton.click();
        System.out.println("Clicked on the LoginButton.");
        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "LoginButton"));

        Thread.sleep(5000);

        MobileElement PopupButton = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@text='OK']"));
        if(PopupButton.isDisplayed()) {
            PopupButton.click();
            System.out.println("Clicked on the PopupButton.");
            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "PopupButton"));
        }
        Thread.sleep(1000);

/*        MobileElement WebLogo = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Swag Labs']"));
        WebLogo.isDisplayed();
        System.out.println("Swag Labs Login Successfully");

        Thread.sleep(1000);

        MobileElement FirstProduct = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Sauce Labs Backpack']"));
        FirstProduct.click();
        System.out.println("Sauce Labs Backpack Open Successfully");
        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName", "FirstProduct"));

*/

/*        MobileElement element1 = (MobileElement)driver.findElement(By.xpath("//android.widget.Button[@text='Go back Back to products']"));
        MobileElement element2 = (MobileElement)driver.findElement(By.xpath("//android.widget.Button[@text='Add to cart']"));


// Swipe from element1 to element2
        action.press(ElementOption.element(element1))
                .moveTo(ElementOption.element(element2))
                .release()
                .perform();
        System.out.println("Swip To add to cart Successfully");

        Thread.sleep ( 1000 );

        element2.click();

        MobileElement element3 = (MobileElement)driver.findElement(By.xpath("//android.widget.Button[@text='Add to cart']"));
        action.press(ElementOption.element(element3))
                .moveTo(ElementOption.element(element1))
                .release()
                .perform();
        System.out.println("Swip Go back Back to products Successfully");

        element1.click();

        Thread.sleep ( 1000 );
*/
        driver.quit ();
    }

}


