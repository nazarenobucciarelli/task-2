package com.solvd.task1.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    @FindBy(css = "#gh-ac")
    WebElement searchBox;

    @FindBy(css = ".gh-spr")
    WebElement searchButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void typeSearchBox(String text) {
        searchBox.sendKeys(text);
    }

    public SearchResultsPage clickSearchButton() {
        searchButton.click();
        return new SearchResultsPage(driver);
    }
}
