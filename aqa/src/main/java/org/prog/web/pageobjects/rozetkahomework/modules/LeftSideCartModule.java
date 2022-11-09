package org.prog.web.pageobjects.rozetkahomework.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.prog.web.pageobjects.generaluse.AbstractModule;

public class LeftSideCartModule extends AbstractModule {
    public LeftSideCartModule(WebDriver driver) {
        super(driver);
    }

    private final By HAMBURGER_BTN = By.xpath("//button[@aria-label='Открыть меню']");
    private final By CART_BTN = By.cssSelector("#cdk-overlay-0 > nav > div > div.side-menu__body.ng-tns-c94-1.ng-star-inserted > ul.side-menu__list.side-menu__list--top.ng-tns-c94-1 > li:nth-child(2) > button");
    private final By TEXT_TITLE = By.xpath("//a[@class='cart-product__title']");


    public void hamburgerButton() {
        try {
            driver.findElement(HAMBURGER_BTN).click();
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void cartButton() {
        try {
            driver.findElement(CART_BTN).click();
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String checkTextLeftCart() {
        return driver.findElement(TEXT_TITLE).getText();
    }
}
