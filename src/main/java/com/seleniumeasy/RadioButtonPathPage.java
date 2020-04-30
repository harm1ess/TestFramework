package com.seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class RadioButtonPathPage extends PathPage {

    @FindBy( how = How.CSS, using = "head > title" )
    WebElement pageElement;



    @Override
    public void goTo() {

        /*
        System.out.println(pageElement.getText());
        Browser.driver.findElement(By.cssSelector("#block-block-57 > div > div > a")).click();

        WebDriverWait wait = new WebDriverWait(Browser.driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#navbar-brand-centered > ul:nth-child(1) > li.nth-child(1) > a")));

        Browser.driver.findElement(By.cssSelector("#navbar-brand-centered > ul:nth-child(1) > li:nth-child(1) > a")).click();

        Browser.driver.findElement(By.cssSelector("#navbar-brand-centered > ul:nth-child(1) > li.dropdown.open > ul > li:nth-child(3) > a")).click();
         */


        //Browser.driver.findElement(By.cssSelector("#block-block-57 > div > div > a")).click();
        Browser.driver.findElement(By.linkText("Demo Website!")).click();

        WebDriverWait wait = new WebDriverWait(Browser.driver, 30);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("a[data-toggle='dropdown'][class='dropdown-toggle']")));

        WebElement click1 = Browser.driver.findElements(By.cssSelector("a[data-toggle='dropdown'][class='dropdown-toggle']")).get(0);
        click1.click();

        //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Radio Buttons Demo")));
        //click1.findElement(By.linkText("Radio Buttons Demo")).click();
        click1.findElement(By.cssSelector("a[href$='basic-radiobutton-demo.html']")).click();
        //click1.findElement(By.cssSelector("#navbar-brand-centered > ul:nth-child(1) > li.dropdown.open > ul > li:nth-child(3) > a")).click();





        //Browser.driver.findElement(By.cssSelector("#block-block-57 > div > div > a")).click();
        //Browser.driver.findElement(By.cssSelector("a[href='http://www.seleniumeasy.com/test']")).click();

        //[data-toggle='dropdown']
        //[class=dropdown-toggle]
        //[href='./basic-radiobutton-demo.html']
        //Browser.driver.findElement(By.cssSelector("a[href='./basic-radiobutton-demo.html']")).click();
        //Browser.driver.findElement(By.cssSelector("#navbar-brand-centered > ul:nth-child(1) > li:nth-child(1) > a")).click();
        //Select dropdownMenu = new Select(Browser.driver.findElement(By.cssSelector("#navbar-brand-centered > ul:nth-child(1) > li.dropdown.open > ul > li:nth-child(3) > a")));
        //dropdownMenu.selectByVisibleText("Input Forms");

        //Browser.driver.findElement(By.cssSelector("#navbar-brand-centered > ul:nth-child(1) > li.dropdown.open > ul > li:nth-child(3) > a")).click();
        //Browser.driver.findElements(By.linkText("Radio Buttons Demo")).get(0).click();



    }

    @Override
    public String pathName() {
        System.out.println(pageElement.getText());
        return pageElement.getText();
    }
}
