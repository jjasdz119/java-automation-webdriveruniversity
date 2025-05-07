package com.webdriveruniversity.automations.ui.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.webdriveruniversity.automations.ui.common.BrowserManager;
import com.webdriveruniversity.automations.ui.pages.SelectionControlPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class SelectionControlTest {

    @BeforeEach
    void setup() {
        open(BrowserManager.getUrl("selectionControls.page"));
    }

    @Test
    @DisplayName("드롭다운 메뉴 기본 값 테스트")
    void testDropdownDefaultValue() {
        Assertions.assertTrue(SelectionControlPage.dropdownMenu1()
                .shouldBe(Condition.value("Java")).exists());
        Assertions.assertTrue(SelectionControlPage.dropdownMenu2()
                .shouldBe(Condition.value("Eclipse")).exists());
        Assertions.assertTrue(SelectionControlPage.dropdownMenu3()
                .shouldBe(Condition.value("HTML")).exists());
    }

    @Test
    @DisplayName("드롭다운 메뉴 선택 테스트")
    void testSelectDropdownValue() {
//        String selectedValueOnDropdown1 = "SQL";
//        String selectedValueOnDropdown2 = "TestNG";
//        String selectedValueOnDropdown3 = "JavaScript";
//
//        SelectionControlPage.Actions.selectAndVerifyDropdown(selectedValueOnDropdown1);
//        SelectionControlPage.Actions.selectAndVerifyDropdown(selectedValueOnDropdown2);
//        SelectionControlPage.Actions.selectAndVerifyDropdown(selectedValueOnDropdown3);
        System.out.println("hello");

//        SelectionControlPage.dropdownMenu1().click();
//        SelectionControlPage.dropdownMenu1().selectOption(selectedValueOnDropdown1);
//        SelectionControlPage.dropdownMenu2().click();
//        SelectionControlPage.dropdownMenu2().selectOption(selectedValueOnDropdown2);
//        SelectionControlPage.dropdownMenu3().click();
//        SelectionControlPage.dropdownMenu3().selectOption(selectedValueOnDropdown3);
//        Assertions.assertTrue(SelectionControlPage.dropdownMenu1()
//                .shouldBe(Condition.innerText(selectedValueOnDropdown1)).exists());
//        Assertions.assertTrue(SelectionControlPage.dropdownMenu2()
//                .shouldBe(Condition.innerText(selectedValueOnDropdown2)).exists());
//        Assertions.assertTrue(SelectionControlPage.dropdownMenu3()
//                .shouldBe(Condition.innerText(selectedValueOnDropdown3)).exists());
    }
}
