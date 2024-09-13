package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.example.amazonapp.amazonapk;


public class ParallelCapsAndroid {

    public static void android1(String userToken) throws MalformedURLException, InterruptedException {
        for (int i = 0; i < 1; i++) {
            AndroidDriver driver1;
            DesiredCapabilities capabilities1 = new DesiredCapabilities();
            capabilities1.setCapability("tg:userToken", userToken);
            capabilities1.setCapability("tg:projectName", "NP Visual-Test apk");
            capabilities1.setCapability("appPackage", "com.amazon.mShop.android.shopping");
            capabilities1.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");

            capabilities1.setCapability("deviceName", "Galaxy S22+");
            capabilities1.setCapability("platformVersion", "14");
            capabilities1.setCapability("platformName", "android");
            capabilities1.setCapability("automationName", "UiAutomator2");
            capabilities1.setCapability("udid", "RFCT114FM6N");
            capabilities1.setCapability("systemPort", "4108");
            capabilities1.setCapability("uiautomator2ServerLaunchTimeout", "90000");
            driver1 = new AndroidDriver(new URL("http://omnissatest.testgrid.io/appium_38108/wd/hub"), capabilities1);


            driver1.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

            Set<String> contexts = driver1.getContextHandles();
            for (String context : contexts) {
                System.out.println(contexts);
                driver1.context("NATIVE_APP");
            }
            amazonapk(driver1);
            driver1.quit();
            Thread.sleep(1500);
        }
    }

    public static void android2(String userToken) throws MalformedURLException, InterruptedException {
        for (int i = 0; i < 1; i++) {
            AndroidDriver driver2;

            DesiredCapabilities capabilities2 = new DesiredCapabilities();
            capabilities2.setCapability("tg:userToken", userToken);
            capabilities2.setCapability("tg:projectName", "NP Visual-Test apk");
            capabilities2.setCapability("appPackage", "com.amazon.mShop.android.shopping");
            capabilities2.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");

            capabilities2.setCapability("deviceName", "Galaxy S24+");
            capabilities2.setCapability("platformVersion", "14");
            capabilities2.setCapability("platformName", "android");
            capabilities2.setCapability("automationName", "UiAutomator2");
            capabilities2.setCapability("udid", "R5CX136R2CX");
            capabilities2.setCapability("systemPort", "4120");
            capabilities2.setCapability("uiautomator2ServerLaunchTimeout", "90000");
            driver2 = new AndroidDriver(new URL("http://omnissatest.testgrid.io/appium_38120/wd/hub"), capabilities2);


            driver2.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            Set<String> contexts = driver2.getContextHandles();
            for (String context : contexts) {
                System.out.println(contexts);
                driver2.context("NATIVE_APP");
            }

            amazonapk(driver2);
            Thread.sleep(1500);
        }
    }
    public static void android3(String userToken) throws MalformedURLException, InterruptedException {
        for (int i = 0; i < 1; i++) {
            AndroidDriver driver3;

            DesiredCapabilities capabilities3 = new DesiredCapabilities();
            capabilities3.setCapability("tg:userToken", userToken);
            capabilities3.setCapability("tg:projectName", "NP Visual-Test apk");
            capabilities3.setCapability("appPackage", "com.amazon.mShop.android.shopping");
            capabilities3.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");


            capabilities3.setCapability("deviceName", "Galaxy S22");
            capabilities3.setCapability("platformVersion", "14");
            capabilities3.setCapability("platformName", "android");
            capabilities3.setCapability("automationName", "UiAutomator2");
            capabilities3.setCapability("udid", "R5CT91QMDRD");
            capabilities3.setCapability("systemPort", "4119");
            capabilities3.setCapability("uiautomator2ServerLaunchTimeout", "90000");
            driver3 = new AndroidDriver(new URL("http://omnissatest.testgrid.io/appium_38119/wd/hub"), capabilities3);


            driver3.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

            Set<String> contexts = driver3.getContextHandles();
            for (String context : contexts) {
                System.out.println(contexts);
                driver3.context("NATIVE_APP");
            }
            amazonapk(driver3);
        }
    }

    public static void android4(String userToken) throws MalformedURLException, InterruptedException {
        for (int i = 0; i < 1; i++) {
            AndroidDriver driver4;

            DesiredCapabilities capabilities4 = new DesiredCapabilities();
            capabilities4.setCapability("tg:userToken", userToken);
            capabilities4.setCapability("tg:projectName", "NP Visual-Test apk");
            capabilities4.setCapability("appPackage", "com.amazon.mShop.android.shopping");
            capabilities4.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");


            capabilities4.setCapability("deviceName", "Pixel 8");
            capabilities4.setCapability("platformVersion", "14");
            capabilities4.setCapability("platformName", "android");
            capabilities4.setCapability("automationName", "UiAutomator2");
            capabilities4.setCapability("udid", "44011FDJH002D2");
            capabilities4.setCapability("systemPort", "4118");
            capabilities4.setCapability("uiautomator2ServerLaunchTimeout", "90000");
            driver4 = new AndroidDriver(new URL("http://omnissatest.testgrid.io/appium_38118/wd/hub"), capabilities4);


            Set<String> contexts = driver4.getContextHandles();
            for (String context : contexts) {
                System.out.println(contexts);
                driver4.context("NATIVE_APP");
            }
            driver4.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

            amazonapk(driver4);
        }
    }
    public static void android5(String userToken) throws MalformedURLException, InterruptedException {
        for (int i = 0; i < 1; i++) {
            AndroidDriver driver5;

            DesiredCapabilities capabilities5 = new DesiredCapabilities();
            capabilities5.setCapability("tg:userToken", userToken);
            capabilities5.setCapability("tg:projectName", "NP Visual-Test apk");
            capabilities5.setCapability("appPackage", "com.amazon.mShop.android.shopping");
            capabilities5.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");


            capabilities5.setCapability("deviceName", "Galaxy S23 FE");
            capabilities5.setCapability("platformVersion", "14");
            capabilities5.setCapability("platformName", "android");
            capabilities5.setCapability("automationName", "UiAutomator2");
            capabilities5.setCapability("udid", "R5CX21YYZ9F");
            capabilities5.setCapability("systemPort", "4106");
            capabilities5.setCapability("uiautomator2ServerLaunchTimeout", "90000");
            driver5 = new AndroidDriver(new URL("http://omnissatest.testgrid.io/appium_38106/wd/hub"), capabilities5);


            Set<String> contexts = driver5.getContextHandles();
            for (String context : contexts) {
                System.out.println(contexts);
                driver5.context("NATIVE_APP");
            }
            driver5.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

            amazonapk(driver5);
        }

    }

    public static void android6(String userToken) throws MalformedURLException, InterruptedException {
        for (int i = 0; i < 1; i++) {
            AndroidDriver driver6;

            DesiredCapabilities capabilities6 = new DesiredCapabilities();
            capabilities6.setCapability("tg:userToken", userToken);
            capabilities6.setCapability("tg:projectName", "NP Visual-Test apk");
            capabilities6.setCapability("appPackage", "com.amazon.mShop.android.shopping");
            capabilities6.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");


            capabilities6.setCapability("deviceName", "Pixel 7 Pro");
            capabilities6.setCapability("platformVersion", "14");
            capabilities6.setCapability("platformName", "android");
            capabilities6.setCapability("automationName", "UiAutomator2");
            capabilities6.setCapability("udid", "29061FDH3009VQ");
            capabilities6.setCapability("systemPort", "4112");
            capabilities6.setCapability("uiautomator2ServerLaunchTimeout", "90000");
            driver6 = new AndroidDriver(new URL("http://omnissatest.testgrid.io/appium_38112/wd/hub"), capabilities6);


            Set<String> contexts = driver6.getContextHandles();
            for (String context : contexts) {
                System.out.println(contexts);
                driver6.context("NATIVE_APP");
            }
            driver6.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

            amazonapk(driver6);
        }
    }
    public static void android7(String userToken) throws MalformedURLException, InterruptedException {
        for (int i = 0; i < 1; i++) {
            AndroidDriver driver7;

            DesiredCapabilities capabilities7 = new DesiredCapabilities();
            capabilities7.setCapability("tg:userToken", userToken);
            capabilities7.setCapability("tg:projectName", "NP Visual-Test apk");
            capabilities7.setCapability("appPackage", "com.amazon.mShop.android.shopping");
            capabilities7.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");


            capabilities7.setCapability("deviceName", "Pixel 7");
            capabilities7.setCapability("platformVersion", "13");
            capabilities7.setCapability("platformName", "android");
            capabilities7.setCapability("automationName", "UiAutomator2");
            capabilities7.setCapability("udid", "27211FDH20094U");
            capabilities7.setCapability("systemPort", "4111");
            capabilities7.setCapability("uiautomator2ServerLaunchTimeout", "90000");
            driver7 = new AndroidDriver(new URL("http://omnissatest.testgrid.io/appium_38111/wd/hub"), capabilities7);


            Set<String> contexts = driver7.getContextHandles();
            for (String context : contexts) {
                System.out.println(contexts);
                driver7.context("NATIVE_APP");
            }
            driver7.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

            amazonapk(driver7);
        }
    }

    public static void android8(String userToken) throws MalformedURLException, InterruptedException {
        for (int i = 0; i < 1; i++) {
            AndroidDriver driver8;

            DesiredCapabilities capabilities8 = new DesiredCapabilities();

            capabilities8.setCapability("tg:userToken", userToken);
            capabilities8.setCapability("tg:projectName", "NP Visual-Test apk");
            capabilities8.setCapability("appPackage", "com.amazon.mShop.android.shopping");
            capabilities8.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");


            capabilities8.setCapability("deviceName", "Pixel 8 Pro");
            capabilities8.setCapability("platformVersion", "14");
            capabilities8.setCapability("platformName", "android");
            capabilities8.setCapability("automationName", "UiAutomator2");
            capabilities8.setCapability("udid", "38071FDJG000ZL");
            capabilities8.setCapability("systemPort", "4115");
            capabilities8.setCapability("uiautomator2ServerLaunchTimeout", "90000");
            driver8 = new AndroidDriver(new URL("http://omnissatest.testgrid.io/appium_38115/wd/hub"), capabilities8);

            Set<String> contexts = driver8.getContextHandles();
            for (String context : contexts) {
                System.out.println(contexts);
                driver8.context("NATIVE_APP");
            }
            driver8.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

            amazonapk(driver8);
        }
    }
        public static void android9(String userToken) throws MalformedURLException, InterruptedException {
            for (int i = 0; i < 1; i++) {
                AndroidDriver driver9;
                DesiredCapabilities capabilities9 = new DesiredCapabilities();

                capabilities9.setCapability("tg:userToken", userToken);
                capabilities9.setCapability("tg:projectName", "NP Visual-Test apk");
                capabilities9.setCapability("appPackage", "com.amazon.mShop.android.shopping");
                capabilities9.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");


                capabilities9.setCapability("deviceName", "Pixel 7");
                capabilities9.setCapability("platformVersion", "14");
                capabilities9.setCapability("platformName", "android");
                capabilities9.setCapability("automationName", "UiAutomator2");
                capabilities9.setCapability("udid", "2A181FDH200BFU");
                capabilities9.setCapability("systemPort", "4113");
                capabilities9.setCapability("uiautomator2ServerLaunchTimeout", "90000");
                driver9 = new AndroidDriver(new URL("http://omnissatest.testgrid.io/appium_38113/wd/hub"), capabilities9);

                Set<String> contexts = driver9.getContextHandles();
                for (String context : contexts) {
                    System.out.println(contexts);
                    driver9.context("NATIVE_APP");
                }
                driver9.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

                amazonapk(driver9);
            }
        }

        public static void android10(String userToken) throws MalformedURLException, InterruptedException {
            for (int i = 0; i < 1; i++) {
                AndroidDriver driver10;
                DesiredCapabilities capabilities10 = new DesiredCapabilities();

                capabilities10.setCapability("tg:userToken", userToken);
                capabilities10.setCapability("tg:projectName", "NP Visual-Test apk");
                capabilities10.setCapability("appPackage", "com.amazon.mShop.android.shopping");
                capabilities10.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");


                capabilities10.setCapability("deviceName", "Galaxy S24+");
                capabilities10.setCapability("platformVersion", "14");
                capabilities10.setCapability("platformName", "android");
                capabilities10.setCapability("automationName", "UiAutomator2");
                capabilities10.setCapability("udid", "R5CWC4B7GGD");
                capabilities10.setCapability("systemPort", "4105");
                capabilities10.setCapability("uiautomator2ServerLaunchTimeout", "90000");
                driver10 = new AndroidDriver(new URL("http://omnissatest.testgrid.io/appium_38105/wd/hub"), capabilities10);

                Set<String> contexts = driver10.getContextHandles();
                for (String context : contexts) {
                    System.out.println(contexts);
                    driver10.context("NATIVE_APP");
                }
                driver10.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

                amazonapk(driver10);
            }
        }

    public static void android11(String userToken) throws MalformedURLException, InterruptedException {
        for (int i = 0; i < 1; i++) {
            AndroidDriver driver11;
            DesiredCapabilities capabilities11 = new DesiredCapabilities();

            capabilities11.setCapability("tg:userToken", userToken);
            capabilities11.setCapability("tg:projectName", "NP Visual-Test apk");
            capabilities11.setCapability("appPackage", "com.amazon.mShop.android.shopping");
            capabilities11.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");


            capabilities11.setCapability("deviceName", "Galaxy S23+");
            capabilities11.setCapability("platformVersion", "14");
            capabilities11.setCapability("platformName", "android");
            capabilities11.setCapability("automationName", "UiAutomator2");
            capabilities11.setCapability("udid", "R5CW21KAZ8L");
            capabilities11.setCapability("systemPort", "4103");
            capabilities11.setCapability("uiautomator2ServerLaunchTimeout", "90000");
            driver11 = new AndroidDriver(new URL("http://omnissatest.testgrid.io/appium_38103/wd/hub"), capabilities11);

            Set<String> contexts = driver11.getContextHandles();
            for (String context : contexts) {
                System.out.println(contexts);
                driver11.context("NATIVE_APP");
            }
            driver11.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

            amazonapk(driver11);
        }
    }

    public static void android12(String userToken) throws MalformedURLException, InterruptedException {
        for (int i = 0; i < 1; i++) {
            AndroidDriver driver12;
            DesiredCapabilities capabilities12 = new DesiredCapabilities();

            capabilities12.setCapability("tg:userToken", userToken);
            capabilities12.setCapability("tg:projectName", "NP Visual-Test apk");
            capabilities12.setCapability("appPackage", "com.amazon.mShop.android.shopping");
            capabilities12.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");


            capabilities12.setCapability("deviceName", "Galaxy S24");
            capabilities12.setCapability("platformVersion", "14");
            capabilities12.setCapability("platformName", "android");
            capabilities12.setCapability("automationName", "UiAutomator2");
            capabilities12.setCapability("udid", "RFCX419E8EY");
            capabilities12.setCapability("systemPort", "4109");
            capabilities12.setCapability("uiautomator2ServerLaunchTimeout", "90000");
            driver12 = new AndroidDriver(new URL("http://omnissatest.testgrid.io/appium_38109/wd/hub"), capabilities12);

            Set<String> contexts = driver12.getContextHandles();
            for (String context : contexts) {
                System.out.println(contexts);
                driver12.context("NATIVE_APP");
            }
            driver12.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

            amazonapk(driver12);
        }
    }
}

