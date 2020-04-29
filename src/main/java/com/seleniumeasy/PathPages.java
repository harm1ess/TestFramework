package com.seleniumeasy;

public class PathPages {

    static String url = "https://www.seleniumeasy.com/test";
    //static String title = "Selenium Easy - Best Demo website to practice Selenium Webdriver Online";

    public void goTo() {
        Browser.goTo(url);
    }

    public PathPage getPathPage(String page) {
        switch (page) {
            case "Demo-ref":
                return Pages.demoWebsitePathPage();
            case "Radio-ref":
                return Pages.radioButtonPathPage();
        }

        return null;
    }

    //public boolean isAt() {
    //    return Browser.title().equals(title);
    //}

}
