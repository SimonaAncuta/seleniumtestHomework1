package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ProtocolHandshake;


public class ViewProductDetails {

    @Test

    public void ViewProductDetailsWithOneKeyword() {

        System.setProperty("webdriver.chrome.driver", "/Users/ElenaSimonaAncuta/Desktop/webDrivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://fasttrackit.org/selenium-test/");

        driver.findElement(By.id("search")).sendKeys("vase" + Keys.ENTER);

        driver.findElement(By.className("product-name")).isDisplayed();

        driver.quit();

    }

}
