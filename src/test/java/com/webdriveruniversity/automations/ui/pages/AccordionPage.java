package com.webdriveruniversity.automations.ui.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AccordionPage {

    private static final By ACCORDION_MANUAL_TESTING = By.xpath("//*[@id='manual-testing-accordion']");
    private static final By ACCORDION_CUCUMBER_BDD = By.xpath("//*[@id='cucumber-accordion']");
    private static final By ACCORDION_AUTOMATION = By.xpath("//*[@id='automation-accordion']");
    private static final By ACCORDION_KEEP_CLICKING = By.xpath("//*[@id='click-accordion']");
    private static final By TEXT_BOX = By.xpath("//*[@id='hidden-text']");
    private static final By PANEL_KEEP_CLICKING = By.xpath("//*[@id='timeout']");
    private static final By PANEL_AUTOMATION = By.xpath("//*[@id='automation-testing-description']");

    public static SelenideElement accordionManualTesting() {
        return $(ACCORDION_MANUAL_TESTING);
    }

    public static SelenideElement accordionCucumberBDD() {
        return $(ACCORDION_CUCUMBER_BDD);
    }

    public static SelenideElement accordionAutomation() {
        return $(ACCORDION_AUTOMATION);
    }

    public static SelenideElement accordionKeepClicking() {
        return $(ACCORDION_KEEP_CLICKING);
    }

    public static SelenideElement textBox() {
        return $(TEXT_BOX);
    }

    public static SelenideElement panelKeepClicking() {
        return $(PANEL_KEEP_CLICKING);
    }

    public static SelenideElement panelAutomation() {
        return $(PANEL_AUTOMATION);
    }
}
