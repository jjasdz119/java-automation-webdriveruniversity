package com.webdriveruniversity.automations.ui.tests;

import com.codeborne.selenide.Configuration;
import com.webdriveruniversity.automations.ui.common.BrowserManager;
import com.webdriveruniversity.automations.ui.pages.ActionsPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.Selenide.open;
import static com.webdriveruniversity.automations.ui.pages.ActionsPage.*;

public class ActionsTest {

    @BeforeEach
    void setup() {
        Configuration.headless = false;
        open(BrowserManager.getUrl("actions.page"));
    }

    @Test
    @DisplayName("페이지 호출 테스트")
    void testAccessPage() {
        ActionsPage.pageTitle().shouldBe(visible);
        System.out.println("페이지 타이틀: " + ActionsPage.pageTitle().getText());
    }

    @Test
    @DisplayName("블록 드래그앤드롭 테스트")
    void testDragAndDrop() {
        actions().dragAndDrop(draggableBlock(), dropSpot()).perform();
        ActionsPage.dropSpot().shouldHave(text("Dropped!"));
        System.out.println("드롭 스팟에 표시된 텍스트: " + ActionsPage.dropSpot().getText());
    }
}
