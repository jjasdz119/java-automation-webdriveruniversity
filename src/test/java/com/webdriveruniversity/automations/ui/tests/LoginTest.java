package com.webdriveruniversity.automations.ui.tests;

import com.webdriveruniversity.automations.ui.common.BrowserManager;
import com.webdriveruniversity.automations.ui.pages.LoginPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest {

    @BeforeEach
    void setup() {
        open(BrowserManager.getUrl("login.page"));
    }

    @Test
    @DisplayName("로그인 정보 미입력")
    void testInvalidSubmit() {
        LoginPage.buttonLogin().click();
    }
}
