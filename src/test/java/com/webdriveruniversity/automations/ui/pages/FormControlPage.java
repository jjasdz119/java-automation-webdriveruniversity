package com.webdriveruniversity.automations.ui.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Condition.text;

public class FormControlPage {

    public static final SelenideElement DROPDOWN_MENU_1 = $x("//select[@id='dropdowm-menu-1']");
    public static final SelenideElement DROPDOWN_MENU_2 = $x("//select[@id='dropdowm-menu-2']");
    public static final SelenideElement DROPDOWN_MENU_3 = $x("//select[@id='dropdowm-menu-3']");
    public static final SelenideElement CHECKBOX_OPTION_ONE = $x("//input[@value='option-1']");
    public static final SelenideElement CHECKBOX_OPTION_FOUR = $x("//input[@value='option-4']");
    public static final SelenideElement VEGETABLE_RADIO_BUTTON_TWO = $x("(//input[@type='radio'][@name='vegetable'])[2]");
    public static final SelenideElement VEGETABLE_DROPDOWN = $x("//select[@id='fruit-selects']");



    public static SelenideElement dropdownMenu1() {
        return $(DROPDOWN_MENU_1).shouldBe(Condition.visible);
    }

    public static SelenideElement dropdownMenu2() {
        return $(DROPDOWN_MENU_2).shouldBe(Condition.visible);
    }

    public static SelenideElement dropdownMenu3() {
        return $(DROPDOWN_MENU_3).shouldBe(Condition.visible);
    }

    public static SelenideElement checkBoxOptionOne() {
        return $(CHECKBOX_OPTION_ONE).shouldBe(Condition.visible);
    }

    public static SelenideElement checkBoxOptionFour() {
        return $(CHECKBOX_OPTION_FOUR).shouldBe(Condition.visible);
    }

    public static SelenideElement vegetableRadioButtonTwo() {
        return $(VEGETABLE_RADIO_BUTTON_TWO).shouldBe(Condition.visible);
    }

    public static SelenideElement vegetableDropdown() {
        return $(VEGETABLE_DROPDOWN).shouldBe(Condition.visible);
    }

    public static class Actions {
        public static void selectDropdownOptionAndCheck(SelenideElement dropdown, String expectedValue) {
            List<String> options = dropdown.$$("option").texts();
            if (!options.contains(expectedValue)) {
                throw new AssertionError("선택한 값이 드롭다운에 표시되지 않음:" + expectedValue);
            }
            dropdown.selectOption(expectedValue);
            dropdown.shouldHave(text(expectedValue));
        }
    }
}
