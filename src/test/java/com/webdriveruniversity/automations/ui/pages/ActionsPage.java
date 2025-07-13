package com.webdriveruniversity.automations.ui.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ActionsPage {

    public static final By PAGE_TITLE = By.xpath("//h1[@id='main-header']");
    public static final By DRAGGABLE_BLOCK = By.xpath("//div[@id='draggable']");
    public static final By DROP_SPOT = By.xpath("//div[@id='droppable']");

    public static SelenideElement pageTitle() {
        return $(PAGE_TITLE).shouldBe(visible);
    }

    public static SelenideElement draggableBlock() {
        return $(DRAGGABLE_BLOCK).shouldBe(visible);
    }

    public static SelenideElement dropSpot() {
        return $(DROP_SPOT).shouldBe(visible);
    }
}
