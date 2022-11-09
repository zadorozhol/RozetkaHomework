package org.prog.web.pageobjects.rozetkahomework.modules;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.prog.web.pageobjects.generaluse.AbstractModule;

import java.util.List;
import java.util.stream.Collectors;

public class ProductPageModule extends AbstractModule {
    private final By BUY_BUTTON = By.xpath("//button[@class='buy-button button button--with-icon button--green button--medium ng-star-inserted']");


    public ProductPageModule(WebDriver driver) {
        super(driver);
    }

    public void addToCart() {

        try {
            driver.findElement(BUY_BUTTON).click();
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}





