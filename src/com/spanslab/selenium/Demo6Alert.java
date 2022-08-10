package com.spanslab.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo6Alert {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm");

        //click on go
        driver.findElement(By.xpath("//img[@alt='Go']")).click();

        //we need to get text and handle the alert
        String alertText=driver.switchTo().alert().getText();
        System.out.println(alertText);

        driver.switchTo().alert().accept();

    }
}
