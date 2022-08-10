package com.spanslab.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Demo5MutlipleTabs {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");

        System.setProperty("webdriver.ie.driver", "driver/iedriverserver.exe");
        InternetExplorerOptions ieOptions = new InternetExplorerOptions();
        ieOptions.ignoreZoomSettings();
        ieOptions.attachToEdgeChrome();
        ieOptions.withEdgeExecutablePath("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
//        Map<String, Object> ops = (Map<String, Object>) ieOptions.getCapability("se:ieOptions");
//        ops.put("ie.edgechromium", true);
//        ops.put("ignoreZoomSetting", true);
//        ops.put("ie.edgepath", "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");

        WebDriver driver = new InternetExplorerDriver(ieOptions);


//        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.google.net/");

        driver.findElement(By.partialLinkText("phpMy")).click();

        //switch to 2nd tab
        List<String> windows = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));

        driver.findElement(By.id("input_username")).sendKeys("Admin");
        driver.findElement(By.id("input_password")).sendKeys("Admin123");
        driver.findElement(By.id("input_go")).click();

        String actualError = driver.findElement(By.xpath("(//div[@role='alert'])[3]")).getText();
        System.out.println(actualError);

        driver.close();

        driver.switchTo().window(windows.get(0));
        System.out.println(driver.getCurrentUrl());
    }
}
