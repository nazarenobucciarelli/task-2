package com.solvd.task1.gui.pages;

import com.solvd.task1.gui.components.Product;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class SearchResultsPage {
    WebDriver driver;

    @FindBy(css = ".srp-results .s-item")
    List<WebElement> productElements;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public List<Product> getProducts() {
        return productElements.stream()
                .map(Product::new)
                .collect(Collectors.toList());
    }
}
