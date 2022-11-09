package org.prog.web.pageobjects.rozetkahomework.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.prog.web.pageobjects.generaluse.AbstractModule;

public class RightSideCartModule extends AbstractModule {
    public RightSideCartModule(WebDriver driver) {
        super(driver);
    }

    private final By TEXT_LINE = By.xpath("//a[@class='cart-product__title']");
    private final By CLOSE_BUTTON = By.xpath("//button[@aria-label='Закрыть модальное окно']");
    private final By RIGHT_CART_BTN = By.xpath ("//use[@href='#icon-header-basket']");

    public String checkText() {
        return driver.findElement(TEXT_LINE).getText();
    }

    public void buttonClose() {
        try {
            driver.findElement(CLOSE_BUTTON).click();
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void rightsideCart(){
        driver.findElement(RIGHT_CART_BTN).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String textCheck () {
        return driver.findElement(TEXT_LINE).getText();
    }
}