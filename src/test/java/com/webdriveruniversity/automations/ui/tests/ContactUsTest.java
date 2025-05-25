package com.webdriveruniversity.automations.ui.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.webdriveruniversity.automations.ui.pages.ContactUsPage;
import com.webdriveruniversity.automations.ui.pages.MainPage;
import com.webdriveruniversity.automations.ui.common.BrowserManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContactUsTest {

    @BeforeEach
    void setUp() {
        Configuration.headless = true;
        open(BrowserManager.getUrl("contact.page"));
    }

    @AfterEach
    void tearDown() {
        BrowserManager.closeNewTab();
    }

    @Test
    @DisplayName("페이지 접근")
    void testClickContactUs() {
        MainPage.CONTACT_US.click();
        BrowserManager.switchToNewTab();
        assertTrue(ContactUsPage.PAGE_TITLE.shouldBe(Condition.visible).exists());
    }

    @Test
    @DisplayName("입력 필드의 초기화 상태")
    void testInputFieldDefaultState() {
        MainPage.CONTACT_US.click();
        BrowserManager.switchToNewTab();
        assertEquals("First Name", ContactUsPage.INPUT_BOX_FIRST_NAME.getAttribute("placeholder"));
        assertEquals("", ContactUsPage.INPUT_BOX_FIRST_NAME.getAttribute("value"));
        assertEquals("Last Name", ContactUsPage.INPUT_BOX_LAST_NAME.getAttribute("placeholder"));
        assertEquals("", ContactUsPage.INPUT_BOX_LAST_NAME.getAttribute("value"));
        assertEquals("Email Address", ContactUsPage.INPUT_BOX_EMAIL_ADDRESS.getAttribute("placeholder"));
        assertEquals("", ContactUsPage.INPUT_BOX_EMAIL_ADDRESS.getAttribute("value"));
        assertEquals("Comments", ContactUsPage.INPUT_BOX_COMMENTS.getAttribute("placeholder"));
        assertEquals("", ContactUsPage.INPUT_BOX_COMMENTS.getAttribute("value"));
    }

    @Test
    @DisplayName("입력 필드 리셋")
    void testResetInputField() {
        MainPage.CONTACT_US.click();
        BrowserManager.switchToNewTab();
        ContactUsPage.INPUT_BOX_FIRST_NAME.setValue("door");
        ContactUsPage.INPUT_BOX_LAST_NAME.setValue("tor");
        ContactUsPage.INPUT_BOX_EMAIL_ADDRESS.setValue("asdz119@naver.com");
        ContactUsPage.INPUT_BOX_COMMENTS.setValue("Comment123!@#");
        ContactUsPage.BTN_RESET.click();
        ContactUsPage.BTN_SUBMIT.click();
        assertTrue(ContactUsPage.MSG_REQUIRED.shouldBe(Condition.visible).exists());
    }

    @ParameterizedTest
    @DisplayName("비유효 이메일 입력 결과")
//    @CsvSource({
//            "12345",
//            "@naver.com",
//            "asdz119@.com",
//            "asdz119@naver.",
//            "' asdz119@naver.com'",
//            "'asdz119@naver.com '"
//    })
    @MethodSource("TestDataUtil#provideInvalidEmails")
    void testSubmitInvalidEmail(String email) {
        MainPage.CONTACT_US.click();
        BrowserManager.switchToNewTab();
        ContactUsPage.INPUT_BOX_FIRST_NAME.setValue("door");
        ContactUsPage.INPUT_BOX_LAST_NAME.setValue("top");
        ContactUsPage.INPUT_BOX_EMAIL_ADDRESS.setValue(email);
        ContactUsPage.INPUT_BOX_COMMENTS.setValue("Comment123!@#");
        ContactUsPage.BTN_SUBMIT.click();
        assertTrue(ContactUsPage.MSG_INVALID.shouldBe(Condition.visible).exists());
    }

    @ParameterizedTest
    @DisplayName("입력 필드 빈 결과")
//    @CsvSource({
//            ", top, asdz119@naver.com, Comment123!@#",
//            "door, , asdz119@naver.com, Comment123!@#",
//            "door, top, , Comment123!@#",
//            "door, top, asdz119@naver.com, "
//    })
    @MethodSource("TestDataUtil#provideInvalidData")
    void testSubmitEmptyValue(String firstName, String lastName, String email, String Comments) {
        MainPage.CONTACT_US.click();
        BrowserManager.switchToNewTab();
        ContactUsPage.INPUT_BOX_FIRST_NAME.setValue(firstName);
        ContactUsPage.INPUT_BOX_LAST_NAME.setValue(lastName);
        ContactUsPage.INPUT_BOX_EMAIL_ADDRESS.setValue(email);
        ContactUsPage.INPUT_BOX_COMMENTS.setValue(Comments);
        ContactUsPage.BTN_SUBMIT.click();
        assertTrue(ContactUsPage.MSG_REQUIRED.shouldBe(Condition.visible).exists());
    }

    @Test
    @DisplayName("유효한 입력 결과")
    void testSubmitValidValue() {
        MainPage.CONTACT_US.click();
        BrowserManager.switchToNewTab();
        ContactUsPage.INPUT_BOX_FIRST_NAME.setValue("door");
        ContactUsPage.INPUT_BOX_LAST_NAME.setValue("top");
        ContactUsPage.INPUT_BOX_EMAIL_ADDRESS.setValue("asdz119@naver.com");
        ContactUsPage.INPUT_BOX_COMMENTS.setValue("this is comments");
        ContactUsPage.BTN_SUBMIT.click();
        assertTrue(ContactUsPage.MSG_VALID.shouldBe().exists());
        assertTrue(ContactUsPage.MSG_VALID.shouldBe(Condition.visible).exists());
    }
}
