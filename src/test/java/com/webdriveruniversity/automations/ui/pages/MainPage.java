package com.webdriveruniversity.automations.ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    public static final SelenideElement CONTACT_US = $x("//a[@id='contact-us']");
}
