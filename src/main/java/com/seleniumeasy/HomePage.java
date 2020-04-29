package com.seleniumeasy;

public class HomePage extends PathPage{
    //static String url = "https://www.seleniumeasy.com";
    //static String title = "Learn Selenium with Best Practices and Examples | Selenium Easy";

    @Override
    public void goTo() {
        Browser.goTo(BASE_ENDPOINT);
    }

    @Override
    public String pathName() {
        return null;
    }

    public boolean isAt() {
        System.out.println(Browser.title());
        return Browser.title().equals(TITLE_HOMEPAGE);
    }
}
