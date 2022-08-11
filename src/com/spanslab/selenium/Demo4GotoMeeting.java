package com.spanslab.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo4GotoMeeting {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.goto.com/meeting");

        driver.findElement(By.xpath("//button[text()='Accept Recommended Settings']")).click();
        driver.findElement(By.linkText("Try Free")).click();

        System.out.println(driver.getTitle());



    }
}
