package com.avigilon.webui.framework;

import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Admin on 12/25/2015.
 */
public class WebUIAlertTest {

    @Test
    public void webUIGoogleTest(){
        final String googleURL = "www.google.com";

        WebDriver driver = new FirefoxDriver();

        driver.get(googleURL);

        WebElement element = driver.findElement(By.name("btnK"));

        org.junit.Assert.assertTrue("Search button not found", element != null);

    }
}
