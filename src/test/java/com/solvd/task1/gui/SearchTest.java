package com.solvd.task1.gui;

import com.solvd.task1.gui.components.Product;
import com.solvd.task1.gui.pages.HomePage;
import com.solvd.task1.gui.pages.SearchResultsPage;
import com.solvd.task1.gui.utils.WebDriverFactory;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SearchTest {
    private WebDriver driver;
    private static final Logger logger = LogManager.getLogger(SearchTest.class);

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.createDriver();
        driver.get("https://www.ebay.com");
    }

    @Test
    public void testSearchResults() {
        HomePage homePage = new HomePage(driver);
        homePage.typeSearchBox("something");
        SearchResultsPage searchResultsPage = homePage.clickSearchButton();
        List<Product> products = searchResultsPage.getProducts();
        Assert.assertFalse(products.isEmpty());
        products.forEach(product -> {
            logger.info(product.getTitle());
        });
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
