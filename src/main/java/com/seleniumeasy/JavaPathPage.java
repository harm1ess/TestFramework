package com.seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class JavaPathPage extends PathPage{

    @FindBy(how = How.CSS, using = "#home > h3 > span")
    WebElement pageElement;

    @Override
    public void goTo() {
        Browser.driver.findElements(By.cssSelector("[href='http://www.seleniumeasy.com/test']")).get(0).click();
    }

    @Override
    public String pathName() {
        return pageElement.getText();
    }
}
