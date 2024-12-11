package com.solvd.task1.gui.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {
    public static WebDriver createDriver() {
        String driverPath = System.getProperty("user.dir") + "/src/test/resources/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        return new ChromeDriver();
    }
}
