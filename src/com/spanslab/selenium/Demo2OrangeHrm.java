package com.spanslab.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Demo2OrangeHrm {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://opensource-demo.orangehrmlive.com/"); //wait for page load to complete

        driver.findElement(By.id("txtUsername")).sendKeys("Admin"); //check for presence of element in 0.5s

        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        //click on login
        driver.findElement(By.id("btnLogin")).click();

        System.out.println(driver.getCurrentUrl());

        driver.findElement(By.id("welcome")).click();

        driver.findElement(By.linkText("Logout")).click();

        driver.quit(); //close the browser

    }
}
