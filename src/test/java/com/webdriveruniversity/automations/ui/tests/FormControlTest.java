package com.webdriveruniversity.automations.ui.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.webdriveruniversity.automations.ui.common.BrowserManager;
import com.webdriveruniversity.automations.ui.pages.FormControlPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class FormControlTest {

    @BeforeEach
    void setup() {
        open(BrowserManager.getUrl("formControls.page"));
    }

    @Test
    @DisplayName("드롭다운 목록의 초기화 상태 테스트")
    void testDropdownDefaultValue() {
        Assertions.assertTrue(FormControlPage.dropdownMenu1()
                .shouldBe(Condition.value("Java")).exists());
        Assertions.assertTrue(FormControlPage.dropdownMenu2()
                .shouldBe(Condition.value("Eclipse")).exists());
        Assertions.assertTrue(FormControlPage.dropdownMenu3()
                .shouldBe(Condition.value("HTML")).exists());
    }

    @Test
    @DisplayName("드롭다운 선택 테스트")
    void testSelectDropdownValue() {
        SelenideElement dropdown1 = FormControlPage.dropdownMenu1();
        SelenideElement dropdown2 = FormControlPage.dropdownMenu2();
        SelenideElement dropdown3 = FormControlPage.dropdownMenu3();
        FormControlPage.Actions.selectDropdownOptionAndCheck(dropdown1, "Python");
        FormControlPage.Actions.selectDropdownOptionAndCheck(dropdown2, "JUnit");
        FormControlPage.Actions.selectDropdownOptionAndCheck(dropdown3, "JavaScript");

        // 드롭다운 선택으로 UI 변화가 일어나는 경우 Assertion으로 검증할 것
    }

    @Test
    @DisplayName("체크박스 선택 테스트")
    void testSelectCheckbox() {
        FormControlPage.checkBoxOptionOne().click();
        FormControlPage.checkBoxOptionFour().click();

        // Elements에서 selected, unselect 속성으로 구분하지 않는 경우 어떻게 식별할지 찾아볼 것
    }

    @Test
    @DisplayName("비활성화된 라디오버튼, 체크박스 확인 테스트")
    void testDisableButtonAndCheckBox() {
        FormControlPage.vegetableRadioButtonTwo().shouldBe(Condition.disabled);
        FormControlPage.vegetableDropdown().find("option", 0).shouldBe(Condition.enabled);
        FormControlPage.vegetableDropdown().find("option", 1).shouldBe(Condition.disabled);
    }


}
