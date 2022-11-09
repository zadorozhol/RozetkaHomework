package org.prog.web.pageobjects.generaluse;

import org.openqa.selenium.WebDriver;

public abstract class AbstractModule {
        protected final WebDriver driver;

        protected AbstractModule(WebDriver driver) {
            this.driver = driver;
        }
    }

