package com.facebookLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        System.out.println( "Hello World!" );

        //Initialize the web driver
        System.setProperty("webdriver.chrome.driver", "/Users/behnaz/Documents/chromedriver-mac-arm64/chromedriver");

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);
        //Open browser and navigate to the APP page we want to test
        driver.get("https://www.facebook.com/login/");

        //enable wait for 2s
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //Locate the components on the page
        driver.findElement(By.id("email")).sendKeys("****@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("pass")).sendKeys("*****");
        Thread.sleep(1000);
        driver.findElement(By.id("loginbutton")).click();
        Thread.sleep(1000);
        driver.quit();

    }
}
