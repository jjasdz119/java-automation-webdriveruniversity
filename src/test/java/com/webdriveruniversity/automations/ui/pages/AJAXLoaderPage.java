package com.webdriveruniversity.automations.ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AJAXLoaderPage {

    public static final SelenideElement LOADER_SPINNER = $x("//div[@id='loader']");
    public static final SelenideElement BUTTON_CLICK_ME = $x("//p[contains(., 'CLICK ME!')]");
    public static final SelenideElement MODAL_WELL_DONE = $x("//div[@class='modal-content']");


    public static SelenideElement loaderSpinner() {
        return $(LOADER_SPINNER).shouldBe(visible);
    }

    public static SelenideElement buttonClickMe() {
        return $(BUTTON_CLICK_ME).shouldBe(visible);
    }

    public static SelenideElement modalWellDone() {
        return $(MODAL_WELL_DONE).shouldBe(visible);
    }
}
