package com.demo.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserLaunch {
    WebDriver driver;
    @Test
    public void browserlaunch(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\IdeaProjects\\selenium2\\Drivers\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.myntra.com");
    }


}
