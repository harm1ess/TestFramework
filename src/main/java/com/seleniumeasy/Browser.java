package com.seleniumeasy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {
    static WebDriver driver = new ChromeDriver(new ChromeOptions()
    //                .addArguments("enable-automation")
    //                .addArguments("--headless")
    //                .addArguments("--window-size=1000,1000")
    //                .addArguments("--no-sandbox")
    //                .addArguments("--disable-extensions")
    //                .addArguments("--dns-prefetch-disable")
    //                .addArguments("--disable-gpu")
    //                .addArguments("--disable-infobars")
    //                .addArguments("--disable-dev-shm-usage")
    //                .addArguments("--disable-browser-side-navigation")
    //                .setPageLoadStrategy(PageLoadStrategy.NORMAL)
    );

    public static void goTo(String url) {
        driver.get(url);
    }

    public static String title() {
        return driver.getTitle();
    }

    public static void close() {
        driver.close();
    }
}
