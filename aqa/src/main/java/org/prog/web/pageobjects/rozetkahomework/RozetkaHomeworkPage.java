package org.prog.web.pageobjects.rozetkahomework;

import org.openqa.selenium.WebDriver;
import org.prog.web.pageobjects.generaluse.AbstractPage;
import org.prog.web.pageobjects.rozetkahomework.modules.LeftSideCartModule;
import org.prog.web.pageobjects.rozetkahomework.modules.ProductPageModule;
import org.prog.web.pageobjects.rozetkahomework.modules.RightSideCartModule;
import org.prog.web.pageobjects.rozetkahomework.modules.SearchBarModule;

public class RozetkaHomeworkPage extends AbstractPage {
    private static final String URL = "https://rozetka.com.ua/";

    private final SearchBarModule searchBarModule;
    private final RightSideCartModule rightSideCartModule;
    private final LeftSideCartModule leftSideCartModule;
    private final ProductPageModule productPageModule;

    public RozetkaHomeworkPage(WebDriver driver) {
        super(driver, URL);
        searchBarModule = new SearchBarModule(driver);
        rightSideCartModule = new RightSideCartModule(driver);
        leftSideCartModule = new LeftSideCartModule(driver);
        productPageModule = new ProductPageModule(driver);
    }

    public SearchBarModule onAds() {
        return searchBarModule;
    }

    public ProductPageModule onHeader() {
        return productPageModule;
    }

    public RightSideCartModule rightCart() {
        return rightSideCartModule;
    }

    public LeftSideCartModule leftCart() {
        return leftSideCartModule;
    }
}


