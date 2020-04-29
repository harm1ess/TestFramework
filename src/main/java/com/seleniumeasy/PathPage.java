package com.seleniumeasy;

public abstract class PathPage {

    public abstract void goTo();
    public abstract String pathName();

    public final static String BASE_ENDPOINT = "https://www.seleniumeasy.com";
    public final static String TITLE_HOMEPAGE = "Learn Selenium with Best Practices and Examples | Selenium Easy";

    public final static String TITLE_DEMOPAGE = "Selenium Easy - Best Demo website to practice Selenium Webdriver Online";



    public boolean isAtPathPage(String pathName) {
        return pathName().equals(pathName);
    }
}
