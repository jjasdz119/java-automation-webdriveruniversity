package com.webdriveruniversity.automations.ui.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.webdriveruniversity.automations.ui.common.BrowserManager;
import com.webdriveruniversity.automations.ui.pages.AccordionPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.open;

public class AccordionTest {

    @BeforeEach
    void setup() {
        Configuration.headless = false;
        open(BrowserManager.getUrl("accordion.page"));
    }

    @Test
    @DisplayName("확장패널 열기 테스트")
    void testOpenAccordion() {
        AccordionPage.accordionManualTesting().click();
        AccordionPage.accordionCucumberBDD().click();
        AccordionPage.accordionAutomation().click();
        AccordionPage.accordionManualTesting()
                .shouldHave(Condition.attribute("class", "accordion active"));
        AccordionPage.accordionCucumberBDD()
                .shouldHave(Condition.attribute("class", "accordion active"));
        AccordionPage.accordionAutomation()
                .shouldHave(Condition.attribute("class", "accordion active"));
    }

    @Test
    @DisplayName("확장패널 닫기 테스트")
    void testCloseAccordion() {
        AccordionPage.accordionManualTesting().click();
        AccordionPage.accordionManualTesting()
                .shouldHave(Condition.attribute("class", "accordion active"));
        AccordionPage.accordionManualTesting().click();
        AccordionPage.accordionManualTesting()
                .shouldHave(Condition.attribute("class", "accordion"));
    }

    @Test
    @DisplayName("확장패널 상세내용 확인 테스트")
    void testContentIsDisplay() {
        AccordionPage.accordionAutomation().click();
        AccordionPage.panelAutomation().shouldHave(Condition.innerText("Automation testing has been steadily"));
    }

    @Test
    @DisplayName("로딩 완료 후 상세내용 노출 되는지 테스트")
    void testAppearTextAccordion() {
        AccordionPage.accordionKeepClicking().click();
        AccordionPage.panelKeepClicking().shouldNotHave(Condition.innerText("This text has appeared"));
        AccordionPage.textBox().shouldHave(Condition.matchText("LOADING COMPLETE."), Duration.ofSeconds(10));
        AccordionPage.panelKeepClicking().shouldHave(Condition.innerText("This text has appeared"));
    }
}

