package com.webdriveruniversity.automations.ui.tests;

import com.webdriveruniversity.automations.ui.common.BrowserManager;
import com.webdriveruniversity.automations.ui.pages.ContactUsPage;
import com.webdriveruniversity.automations.ui.pages.PageObjectModelPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.innerText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class PageObjectModelTest {

    @BeforeEach
    void setUp() {
        open(BrowserManager.getUrl("pageObjectModel.Page"));
    }

    @Test
    @DisplayName("Home 탭 테스트")
    void testAccessHomeTab() {
        PageObjectModelPage.homeTab().click();
        PageObjectModelPage.whoAreWeTitle().shouldBe(visible);
    }

    @Test
    @DisplayName("히어로 배너 테스트")
    void testHeroBanner() {
        PageObjectModelPage.heroBanner1().exists();
        PageObjectModelPage.heroBanner2().exists();
        PageObjectModelPage.heroBanner3().exists();
    }

    @Test
    @DisplayName("Find Out More 팝업 확인 테스트")
    void testFindOutMore() {
        PageObjectModelPage.buttonFindOutMore().click();
        PageObjectModelPage.popupButtonFindOutMore().shouldBe(visible).click();
    }

    @Test
    @DisplayName("Our Products 탭 테스트")
    void testAccessOurProductsTab() {
        PageObjectModelPage.ourProductsTab().click();
        PageObjectModelPage.titleSpecialOffers().shouldBe(visible);
    }

    @Test
    @DisplayName("Products 팝업 호출 및 상세 내용 확인 테스트")
    void testClickProducts() {
        PageObjectModelPage.ourProductsTab().click();
        PageObjectModelPage.titleSpecialOffers().click();
        PageObjectModelPage.popupContent().shouldBe(visible)
                        .shouldHave(innerText("Please Note:"));
        PageObjectModelPage.popupButtonProceed().click();
    }

    @Test
    @DisplayName("Contact Us 탭 접근 테스트")
    void testAccessContactUsTab() {
        PageObjectModelPage.contactUsTab().click();
        ContactUsPage.pageTitle().shouldBe(visible);
    }
}