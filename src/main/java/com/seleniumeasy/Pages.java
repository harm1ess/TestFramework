package com.seleniumeasy;

import org.openqa.selenium.support.PageFactory;

public class Pages {

    public static HomePage homePage() {
        return new HomePage();
    }

    public static PathPages pathPages() {
        PathPages pathPages = new PathPages();
        return pathPages;
    }

    public static PathPage demoWebsitePathPage() {
        PathPage demoWebsitePathPage = new DemoWebsitePathPage();
        PageFactory.initElements(Browser.driver, demoWebsitePathPage);
        return demoWebsitePathPage;
    }
}
