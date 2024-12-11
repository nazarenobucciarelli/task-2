package com.solvd.task.gui;

import com.solvd.task.gui.utils.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class AbstractGUITest {

    protected WebDriver driver;

    protected static final Logger logger = LoggerFactory.getLogger(AbstractGUITest.class);

    @BeforeClass
    public void setUp() {
        driver = WebDriverFactory.createDriver();
        driver.get("https://www.ebay.com");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
