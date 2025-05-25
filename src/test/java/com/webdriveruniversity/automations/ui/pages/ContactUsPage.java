package com.webdriveruniversity.automations.ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ContactUsPage {
    public static final SelenideElement PAGE_TITLE = $x("//h2[@name='contactme']");
    public static final SelenideElement INPUT_BOX_FIRST_NAME = $x("//input[@name='first_name']");
    public static final SelenideElement INPUT_BOX_LAST_NAME = $x("//input[@name='last_name']");
    public static final SelenideElement INPUT_BOX_EMAIL_ADDRESS = $x("//input[@name='email']");
    public static final SelenideElement INPUT_BOX_COMMENTS = $x("//textarea[@name='message']");
    public static final SelenideElement BTN_RESET = $x("//input[@type='reset']");
    public static final SelenideElement BTN_SUBMIT = $x("//input[@type='submit']");
    public static final SelenideElement MSG_REQUIRED = $x("//body[contains(., 'Error: all fields are required')]");
    public static final SelenideElement MSG_INVALID = $x("//body[contains(., 'Error: Invalid email address')]");
    public static final SelenideElement MSG_VALID = $x("//div[@id='contact_reply']");

    public static SelenideElement pageTitle() {
        return $(PAGE_TITLE);
    }
}
