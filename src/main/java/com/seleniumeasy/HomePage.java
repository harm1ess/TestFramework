package com.seleniumeasy;

public class HomePage {
    static String url = "https://www.seleniumeasy.com";
    static String title = "Learn Selenium with Best Practices and Examples | Selenium Easy";

    public void goTo() {
        Browser.goTo(url);
    }

    public boolean isAt() {
        System.out.println(Browser.title());
        return Browser.title().equals(title);
    }
}
