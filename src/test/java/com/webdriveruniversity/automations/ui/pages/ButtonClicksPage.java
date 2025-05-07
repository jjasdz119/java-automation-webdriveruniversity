package com.webdriveruniversity.automations.ui.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class ButtonClicksPage {

    private static final By BUTTON_WEB_ELEMENT_CLICK = byXpath("//*[@id='button1']");
    private static final By BUTTON_JAVA_SCRIPT_CLICK = byCssSelector("#button2");
    private static final By BUTTON_ACTION_MOVE_AND_CLICK = by("id","button3");
    private static final By MODAL_CONGRATULATIONS = byXpath("(//h4[@class='modal-title'])[1]");
    private static final By MODAL_EASY = byXpath("(//h4[@class='modal-title'])[2]");
    private static final By MODAL_WELL_DONE = byXpath("(//h4[@class='modal-title'])[3]");

    public static SelenideElement webElementClickButton() {
        return $(BUTTON_WEB_ELEMENT_CLICK).shouldBe(Condition.visible);
    }

    public static SelenideElement javaScriptClickButton() {
        return $(BUTTON_JAVA_SCRIPT_CLICK).shouldBe(Condition.visible);
    }

    public static SelenideElement actionMoveAndClickButton() {
        return $(BUTTON_ACTION_MOVE_AND_CLICK).shouldBe(Condition.visible);
    }

    public static SelenideElement modalCongratulations() {
        return $(MODAL_CONGRATULATIONS).shouldBe(Condition.visible);
    }

    public static SelenideElement modalEasy() {
        return $(MODAL_EASY).shouldBe(Condition.visible);
    }

    public static SelenideElement modalWellDone() {
        return $(MODAL_WELL_DONE).shouldBe(Condition.visible);
    }
}
