package com.avigilon.webui.framework;

import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by Admin on 12/25/2015.
 */
public class WebUIAlertTest {

    @Test
    public void webUIGoogleTest(){
        final String googleURL = "www.google.com";

        FirefoxProfile profile = new FirefoxProfile();
        FirefoxBinary binary = new FirefoxBinary(new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"));
        WebDriver driver = new FirefoxDriver(binary,profile);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(googleURL);

        WebElement element = driver.findElement(By.name("btnK"));

        org.junit.Assert.assertTrue("Search button not found", element != null);

    }
}
