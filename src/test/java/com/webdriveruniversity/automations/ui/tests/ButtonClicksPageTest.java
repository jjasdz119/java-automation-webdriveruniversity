package com.webdriveruniversity.automations.ui.tests;

import com.codeborne.selenide.Configuration;
import com.webdriveruniversity.automations.ui.common.BrowserManager;
import com.webdriveruniversity.automations.ui.pages.ButtonClicksPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ButtonClicksPageTest {

    @BeforeEach
    void setUp() {
        Configuration.headless = false;
        open(BrowserManager.getUrl("buttonClick.page"));
    }

    @Test
    void testWebElementClick() {
        ButtonClicksPage.webElementClickButton().click();
        assertTrue(ButtonClicksPage.modalCongratulations().isDisplayed());
    }

    @Test
    void testJavaScriptClick() {
        ButtonClicksPage.javaScriptClickButton().click();
        assertTrue(ButtonClicksPage.modalEasy().isDisplayed());
    }

    @Test
    void testActionMoveAndClick() {
        ButtonClicksPage.actionMoveAndClickButton().click();
        assertTrue(ButtonClicksPage.modalWellDone().isDisplayed());

    }
}
