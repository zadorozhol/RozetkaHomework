package org.prog.web.pageobjects.rozetkahomework.modules;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public abstract class BaseRozetkaModule {
    protected WebDriver driver;

    public BaseRozetkaModule(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


}
