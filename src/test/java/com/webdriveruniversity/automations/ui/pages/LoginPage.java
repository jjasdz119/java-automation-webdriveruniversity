package com.webdriveruniversity.automations.ui.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    private static final By INPUT_FIELD_USER_NAME = byXpath("//input[@id='text']");
    private static final By INPUT_FIELD_PASSWORD = byXpath("//input[@id='password']");
    private static final By BUTTON_LOGIN = byXpath("//button[@id='login-button']");

    public static SelenideElement inputFieldUserName() {
        return $(INPUT_FIELD_USER_NAME).shouldBe(Condition.visible);
    }

    public static SelenideElement inputFieldPassword() {
        return $(INPUT_FIELD_PASSWORD).shouldBe(Condition.visible);
    }

    public static SelenideElement buttonLogin() {
        return $(BUTTON_LOGIN).shouldBe(Condition.visible);
    }
}