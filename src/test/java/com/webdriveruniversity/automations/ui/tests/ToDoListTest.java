package com.webdriveruniversity.automations.ui.tests;

import com.codeborne.selenide.*;
import com.webdriveruniversity.automations.ui.common.BrowserManager;
import com.webdriveruniversity.automations.ui.pages.ToDoListPage;
import org.junit.jupiter.api.*;

import java.time.Duration;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Condition.hidden;
import static org.junit.jupiter.api.Assertions.*;

import static com.codeborne.selenide.Selenide.open;

public class ToDoListTest {

    @BeforeEach
    void setup() {
        Configuration.headless = false;
        open(BrowserManager.getUrl("toDoList.page"));
    }

    @Test
    @DisplayName("초기화 상태 및 +버튼 테스트")
    void testDefaultStatus() {
        ToDoListPage.inputFieldNewToDo().shouldHave(Condition.visible);
        ToDoListPage.buttonPlus().click();
        ToDoListPage.inputFieldNewToDo().shouldNotBe(Condition.visible, Duration.ofSeconds(3));
        assertFalse(ToDoListPage.inputFieldNewToDo().isDisplayed());
    }

    @Test
    @DisplayName("To do list 생성 테스트")
    void testAddNew() {
        String enterText = "Automation Testing";
        ToDoListPage.Actions.addToDo(enterText + "1");
        ToDoListPage.Actions.addToDo(enterText + "2");
        ToDoListPage.Actions.addToDo(enterText + "3");
        ToDoListPage.toDoItems().shouldHave(size(6));   // 배열 길이 체크
    }

    @Test
    @DisplayName("완료된 항목 취소선 테스트")
    void testCompleted() {
        ElementsCollection toDoItems = ToDoListPage.toDoItems();
        toDoItems.get(0).click();
        toDoItems.get(1).click();
        toDoItems.get(0).shouldHave(cssClass("completed"));
        toDoItems.get(1).shouldHave(cssClass("completed"));
        toDoItems.get(2).shouldNotHave(cssClass("completed"));  // 미완료 항목은 취소선 미표시 체크
    }

    @Test
    @DisplayName("To do list 제거 테스트")
    void testRemove() {
        ToDoListPage.toDoItems().shouldHave(size(3), Duration.ofSeconds(3));
        ToDoListPage.buttonRemove().shouldBe(hidden);
        ToDoListPage.buttonRemove().hover();
        ToDoListPage.buttonRemove().click();
        ToDoListPage.toDoItems().shouldHave(size(2));
    }
}
