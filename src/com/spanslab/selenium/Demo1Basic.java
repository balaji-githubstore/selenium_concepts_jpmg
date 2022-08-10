package com.spanslab.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Demo1Basic {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        String title = driver.getTitle();
        System.out.println(title);

        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);

        String pageSouce = driver.getPageSource();
        System.out.println(pageSouce);

    }
}
