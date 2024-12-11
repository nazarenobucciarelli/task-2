package com.solvd.task1.gui.components;

import com.solvd.task1.gui.base.BaseComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product extends BaseComponent {

    @FindBy(css = ".s-item__title span")
    WebElement title;

    public Product(WebElement root) {
        super(root);
        PageFactory.initElements(root, this);
    }

    public String getTitle() {
        return this.title.getText();
    }
}
