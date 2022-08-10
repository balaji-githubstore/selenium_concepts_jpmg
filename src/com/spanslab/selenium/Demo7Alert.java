package com.spanslab.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo7Alert {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://nasscom.in/nasscom-membership");

        //click on go
        driver.findElement(By.linkText("Calculate Membership Fee")).click();

        //we need to get text and handle the alert
        String alertText=driver.switchTo().alert().getText();
        System.out.println(alertText);

        driver.switchTo().alert().accept();

    }
}
