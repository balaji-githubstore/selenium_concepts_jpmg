package com.spanslab.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Demo3SalesForce {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");

        driver.findElement(By.name("UserFirstName")).sendKeys("John");


        Select selectJobTitle = new Select(driver.findElement(By.name("UserTitle")));
        selectJobTitle.selectByVisibleText("IT Manager");
//        selectJobTitle.selectByValue("IT_Manager_AP");
//        selectJobTitle.selectByIndex(1);

        Select selectCountry = new Select(driver.findElement(By.xpath("//select[contains(@id,'CompanyCountry')]")));
        selectCountry.selectByVisibleText("Spain");

        //select Employees as 101 - 500 employee //complete now
        Select selectEmployees = new Select(driver.findElement(By.name("CompanyEmployees")));
        selectEmployees.selectByVisibleText("101 - 500 employees");


        driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();

        driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();

    }
}
