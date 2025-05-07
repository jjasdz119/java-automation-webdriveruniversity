package com.webdriveruniversity.automations.ui.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ToDoListPage {

    private static final By BUTTON_PLUS = By.xpath("//i[@class='fa fa-plus']");
    private static final By INPUT_FIELD_NEW_TO_DO = By.xpath("//input[@type='text']");
    private static final By TO_DO_ITEMS = By.xpath("//li");
    private static final By BUTTON_REMOVE = By.xpath("//i[@class='fa fa-trash']");

    public static SelenideElement buttonPlus() {
        return $(BUTTON_PLUS);
    }

    public static SelenideElement inputFieldNewToDo() {
        return $(INPUT_FIELD_NEW_TO_DO);
    }

    public static ElementsCollection toDoItems() {
        return $$(TO_DO_ITEMS);
    }

    public static SelenideElement buttonRemove() {
        return $(BUTTON_REMOVE);
    }

    public static class Actions {
        public static void addToDo(String text) {
            SelenideElement input = inputFieldNewToDo();
//            ToDoListPage.buttonPlus().click();
            input.shouldBe(visible, Duration.ofSeconds(5));
            ToDoListPage.inputFieldNewToDo().setValue(text).pressEnter();
        }
    }
}

