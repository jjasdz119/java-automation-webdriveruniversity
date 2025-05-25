package com.webdriveruniversity.automations.ui.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PageObjectModelPage {

    //Home Tab
    public static final By HERO_BANNER_1 = By.xpath("(//img[@id='slide-image-1'])[1]");
    public static final By HERO_BANNER_2 = By.xpath("(//img[@id='slide-image-1'])[2]");
    public static final By HERO_BANNER_3 = By.xpath("//img[@id='slide-image-3']");
    public static final By HOME_TAB = By.xpath("//a[text()='Home']");
    public static final By OUR_PRODUCTS_TAB = By.xpath("//a[text()='Our Products']");
    public static final By CONTACT_US_TAB = By.xpath("//a[text()='Contact Us']");
    public static final By WHO_ARE_WE_TITLE = By.xpath("//p[text()='Who Are We?']");
    public static final By BUTTON_FIND_OUT_MORE = By.xpath("//button[@id='button-find-out-more']");
    public static final By POPUP_BUTTON_FIND_OUT_MORE = By.xpath("//button[text()='Find Out More']");

    //Our Products Tab
    public static final By PRODUCT_SPECIAL_OFFERS = By.xpath("//div[@id='special-offers']");
    public static final By POPUP_CONTENT = By.xpath("//div[@class='modal-content']");
    public static final By POPUP_BUTTON_PROCEED = By.xpath("//button[text()='Proceed']");

    public static SelenideElement heroBanner1() {
        return $(HERO_BANNER_1);
    }

    public static SelenideElement heroBanner2() {
        return $(HERO_BANNER_2);
    }
    public static SelenideElement heroBanner3() {
        return $(HERO_BANNER_3);
    }

    public static SelenideElement homeTab() {
        return $(HOME_TAB);
    }

    public static SelenideElement ourProductsTab() {
        return $(OUR_PRODUCTS_TAB);
    }

    public static SelenideElement contactUsTab() {
        return $(CONTACT_US_TAB);
    }

    public static SelenideElement whoAreWeTitle() {
        return $(WHO_ARE_WE_TITLE);
    }

    public static SelenideElement buttonFindOutMore() {
        return $(BUTTON_FIND_OUT_MORE);
    }

    public static SelenideElement popupButtonFindOutMore() {
        return $(POPUP_BUTTON_FIND_OUT_MORE);
    }

    public static SelenideElement titleSpecialOffers() {
        return $(PRODUCT_SPECIAL_OFFERS);
    }

    public static SelenideElement popupContent() {
        return $(POPUP_CONTENT);
    }

    public static SelenideElement popupButtonProceed() {
        return $(POPUP_BUTTON_PROCEED);
    }
}
