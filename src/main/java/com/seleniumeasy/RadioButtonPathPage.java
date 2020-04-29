package com.seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class RadioButtonPathPage extends PathPage {

    @FindBy( how = How.CSS, using = "head > title" )
    WebElement pageElement;

    @Override
    public void goTo() {
        ////Browser.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        ////WebDriverWait wait = new WebDriverWait(Browser.driver, 5);
        //
        //WebElement firstPage = Browser.driver.findElements(By.cssSelector("[href='http://www.seleniumeasy.com/test']")).get(0);
        //firstPage.click();
        //
        ////wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btn_basic_example")));
        //WebElement secondPage = firstPage.findElement(By.id("basic"));
        //secondPage.click();
        //
        ////wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[href='./basic-radiobutton-demo.html']")));
        //WebElement thirdPage = secondPage.findElements(By.cssSelector("[href='./basic-radiobutton-demo.html']")).get(0);
        //thirdPage.click();
        ////Browser.driver.findElement(By.id("btn_basic_example")).click();
        ////Browser.driver.findElements(By.cssSelector("[href='./basic-radiobutton-demo.html']")).get(2).click();
        //
        ////Browser.driver.findElements(By.cssSelector("[href='./basic-radiobutton-demo.html']")).get(0).click();

        //WebElement demoPage = (WebElement) Browser.driver.findElements(By.cssSelector("[href='http://www.seleniumeasy.com/test']"));
        //demoPage.click();




        //WebElement demoPage = Browser.driver.findElement(By.linkText("Demo Website!"));
        //demoPage.click();


        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_basic_example")));
        //WebElement expandMenu = Browser.driver.findElements(By.id("btn_basic_example")).get(0);
        //expandMenu.click();
        //WebElement radioPage = expandMenu.findElements(By.linkText("Radio Buttons Demo")).get(0);
        //radioPage.click();

        //Action gotoDemoPage = (Action) builder
        //        .moveToElement((WebElement) Browser.driver.findElements(By.cssSelector("[href='http://www.seleniumeasy.com/test']")))
        //        .click()
        //        .build();

        //WebElement demoPage = Browser.driver.findElements(By.cssSelector("[href='http://www.seleniumeasy.com/test']")).get(0);
        //demoPage.click();
        //Actions builder = new Actions(Browser.driver);

        //builder.moveToElement(demoPage).build().perform();
        //demoPage.findElement(By.id("btn_basic_example"));
        //builder.moveToElement(demoPage).build().perform();
                //.findElements(By.id("btn_basic_example"))).build().perform();
        //Browser.driver.findElements(By.cssSelector("[href='http://www.seleniumeasy.com/test']")).get(0).click();
        //Browser.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //
        //
        //builder.moveToElement(Browser.driver.findElement(By.id("btn_basic_example"))).build().perform();
        //
        //WebElement radioPage = Browser.driver.findElements(By.cssSelector("[href='./basic-radiobutton-demo.html']")).get(2);
        //builder.moveToElement(radioPage).build().perform();

        //WebElement demoPage = Browser.driver.findElement(By.linkText("Demo Website!"));

        //WebDriverWait wait = new WebDriverWait(Browser.driver, 30);
        //WebElement expandMenu = Browser.driver.findElement(By.id("btn_basic_example"));
        //expandMenu.click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Radio Buttons Demo")));
        List<WebElement> fadeMenu = Browser.driver.findElements(By.className("class='list-group-item"));
        fadeMenu.get(2).select();

        //Actions builder = new Actions(Browser.driver);
        //Action goToRadioPage = (Action) builder
        //        .moveToElement(expandMenu)
        //        .click()
        //        .moveToElement(radioPage)
        //        .click()
        //        .build();


    }

    @Override
    public String pathName() {
        return pageElement.getText();
    }
}
