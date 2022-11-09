package org.prog.web.pageobjects.rozetkahomework.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.prog.web.pageobjects.generaluse.AbstractModule;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import static org.openqa.selenium.Keys.RETURN;

public class SearchBarModule extends AbstractModule {
    public SearchBarModule(WebDriver driver) {
        super(driver);
    }

    private final static By ROZETKA_SEARCH_BAR_NAME = By.xpath("//input[@name='search']");
    private final static By ROZETKA_SEARCH_RESULTS = By.xpath("//a[@class='goods-tile__heading ng-star-inserted']");


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    public void setSearch(String searchValue) {

        try {
            driver.findElement(ROZETKA_SEARCH_BAR_NAME).sendKeys(searchValue);
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void findSearch() {

        try {
            driver.findElement(ROZETKA_SEARCH_BAR_NAME).sendKeys(RETURN);
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void getResults(String value) {
        try {
            driver.findElements(ROZETKA_SEARCH_RESULTS).stream()
                    .filter(webElement -> webElement.getText().contains(value))
                    .findAny()
                    .ifPresent(WebElement::click);
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
