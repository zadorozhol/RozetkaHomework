package org.prog;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.prog.web.pageobjects.rozetkahomework.RozetkaHomeworkPage;
import org.prog.web.pageobjects.rozetkahomework.modules.SearchBarModule;

import java.util.List;
import java.util.stream.Stream;

public class RozetkaHomework extends BaseTest {

    private final static String EXPECTED_washingmachine = "пральна машина";

    private static RozetkaHomeworkPage rozetkaHomeworkPage;

    @BeforeAll
    public static void setup() {
        rozetkaHomeworkPage = new RozetkaHomeworkPage(driver);
    }

    @BeforeEach
    public void loadRozetkaPage() {
        rozetkaHomeworkPage.loadPage();
    }

//    @BeforeEach
//    public void loadRozetkaPage() {
//        rozetkaHomeworkPage.loadPage();
//    }


    @Test

    public void findWashingMachine() {

        rozetkaHomeworkPage.onAds().setSearch("пральна машина");
        rozetkaHomeworkPage.onAds().findSearch();
        rozetkaHomeworkPage.onAds().getResults("Стиральная машина Indesit OMTWSE61051WK");
        rozetkaHomeworkPage.onHeader().addToCart();
        rozetkaHomeworkPage.rightCart().checkText();
        Assert.assertEquals("Title name mismatch!", "Стиральная машина узкая INDESIT OMTWSE 61051 WK EU/UA",
                rozetkaHomeworkPage.rightCart().checkText());
        rozetkaHomeworkPage.rightCart().buttonClose();
        rozetkaHomeworkPage.leftCart().hamburgerButton();
        rozetkaHomeworkPage.leftCart().cartButton();
        rozetkaHomeworkPage.leftCart().checkTextLeftCart();
        Assert.assertEquals("Title name mismatch!", "Стиральная машина узкая INDESIT OMTWSE 61051 WK EU/UA",
                rozetkaHomeworkPage.leftCart().checkTextLeftCart());
//        rozetkaHomeworkPage.rightCart().rightsideCart();
//        rozetkaHomeworkPage.rightCart().textCheck();
//        Assert.assertEquals("Title name mismatch!", "Стиральная машина узкая INDESIT OMTWSE 61051 WK EU/UA",
//                rozetkaHomeworkPage.rightCart().textCheck());
//    }
    }
}

