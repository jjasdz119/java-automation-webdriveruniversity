package com.webdriveruniversity.automations.ui.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Condition.text;

public class SelectionControlPage {

    public static final SelenideElement DROPDOWN_MENU_1 = $x("//select[@id='dropdowm-menu-1']");
    public static final SelenideElement DROPDOWN_MENU_2 = $x("//select[@id='dropdowm-menu-2']");
    public static final SelenideElement DROPDOWN_MENU_3 = $x("//select[@id='dropdowm-menu-3']");

    public static SelenideElement dropdownMenu1() {
        return $(DROPDOWN_MENU_1).shouldBe(Condition.visible);
    }

    public static SelenideElement dropdownMenu2() {
        return $(DROPDOWN_MENU_2).shouldBe(Condition.visible);
    }

    public static SelenideElement dropdownMenu3() {
        return $(DROPDOWN_MENU_3).shouldBe(Condition.visible);
    }

    public static class Actions {
        public static void selectAndVerifyDropdown(SelenideElement dropdown, String expectedValue) {
            dropdown.selectOption(expectedValue);
            dropdown.shouldHave(text(expectedValue));
        }
    }
}
