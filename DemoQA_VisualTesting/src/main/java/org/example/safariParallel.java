
package org.example;

import com.google.common.collect.ImmutableMap;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class safariParallel {

    public static void safari2(Capabilities capabilities) throws MalformedURLException, InterruptedException {
        WebDriver driver = new RemoteWebDriver(new URL("http://testos.testgrid.io/browserrun40002/wd/hub"),capabilities);
        String url = "https://www.kiplinger.com"; // URL of the webpage you want to convert
        driver.get(url);

        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testcaseName", "Browser-Visual-Test Safari 2"));

        Thread.sleep(2000);
        System.out.println("Redirected to "+url+" successfully.");

        WebDriver kiplingerLogo = driver.findElement(By.xpath("//span[contains(@class,'logo__svg')]//*[name()='svg']//*[name()='path' and contains(@fill,'#cc2936')]"));
        Assert.assertTrue(((WebElement) kiplingerLogo).isDisplayed());
        System.out.println("kiplinger Logo IS visible.");

        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName","kiplingerLogo"));

        new Actions(driver);

        for (int i = 0; i < 5; i++) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 255);");

            Thread.sleep(1000);
            System.out.println("Value of i: " + i);
            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName","Step No is"+ i));

        }

        Thread.sleep(2000);
        driver.quit();
    }
    public static void safari1(Capabilities capabilities) throws MalformedURLException, InterruptedException {

        WebDriver driver = new RemoteWebDriver(new URL("http://testos.testgrid.io/browserrun40001/wd/hub"), capabilities);
        String url = "https://www.kiplinger.com"; // URL of the webpage you want to convert
        driver.get(url);

        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testcaseName", "Browser-Visual-Test Safari 1"));

        Thread.sleep(2000);
        System.out.println("Redirected to "+url+" successfully.");

        WebDriver kiplingerLogo = driver.findElement(By.xpath("//span[contains(@class,'logo__svg')]//*[name()='svg']//*[name()='path' and contains(@fill,'#cc2936')]"));
        Assert.assertTrue(((WebElement) kiplingerLogo).isDisplayed());
        System.out.println("kiplinger Logo IS visible.");

        ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName","kiplingerLogo"));

        new Actions(driver);

        for (int i = 0; i < 5; i++) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 255);");

            Thread.sleep(1000);
            System.out.println("Value of i: " + i);
            ((JavascriptExecutor) driver).executeScript("tg:logs", ImmutableMap.of("testStepName","Step No is"+ i));

        }

        Thread.sleep(2000);
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException, IOException {

        for (int f = 0 ; f<5; f++) {

            restartSafariVmJar("17");
            restartSafariVmJar("18");
            Thread.sleep(10000);
            try {



                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("tg:udid", "401");
                capabilities.setCapability("tg:userToken", "ochskrxwei4ujverxb8w5jfxj1bgnlsw");
                capabilities.setCapability("browserName", "safari");


                DesiredCapabilities capabilities2 = new DesiredCapabilities();
                capabilities.setCapability("tg:udid", "402");
                capabilities.setCapability("tg:userToken", "ochskrxwei4ujverxb8w5jfxj1bgnlsw");
                capabilities.setCapability("browserName", "safari");


                new Thread(() -> {
                    try {
                        safari1(capabilities);
                    } catch (MalformedURLException | InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                });
                new Thread(() -> {
                    try {
                        safari2(capabilities2);
                    } catch (MalformedURLException | InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                });


            }catch (Exception e){}
            System.out.println("Itratio completed : "+ f);
        }
    }
    public static void restartSafariVmJar(String deviceIds) {
        String apiUrl = "https://testos.testgrid.io/api/restart-safari-vm-jar";
        String cookie = "ci_session=tqbnuhi48pob2bgml1e3k8s2dgbn8id0";
        String deviceId = deviceIds;

        try {
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Cookie", cookie);
            connection.setDoOutput(true);

            String data = "device_id=" + deviceId;

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = data.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8))) {
                StringBuilder response = new StringBuilder();
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                System.out.println(response.toString());
            }

            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
