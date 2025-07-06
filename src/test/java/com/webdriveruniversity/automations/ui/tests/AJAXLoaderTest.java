package com.webdriveruniversity.automations.ui.tests;

import com.webdriveruniversity.automations.ui.common.BrowserManager;
import com.webdriveruniversity.automations.ui.pages.AJAXLoaderPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;

public class AJAXLoaderTest {

    @BeforeAll
    static void setup() {
        open(BrowserManager.getUrl("ajaxLoader.page"));
    }

    @Test
    @DisplayName("스피너 및 버튼 노출 테스트")
    void testAJAXLoader() {
        AJAXLoaderPage.loaderSpinner().shouldBe(visible);
        // 스피너가 화면에서 숨을 때까지 대기
        AJAXLoaderPage.loaderSpinner().shouldBe(hidden, Duration.ofSeconds(5));
        AJAXLoaderPage.buttonClickMe().shouldBe(visible).click();
        AJAXLoaderPage.modalWellDone().shouldBe(visible);
    }
}
