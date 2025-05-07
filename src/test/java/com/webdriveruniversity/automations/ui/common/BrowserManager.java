package com.webdriveruniversity.automations.ui.common;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.Map;
import java.util.Set;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BrowserManager {
    private static final Map<String, Map<String, String>> config;

    static {
        Yaml yaml = new Yaml();
        try (InputStream inputStream = BrowserManager.class.getClassLoader().getResourceAsStream("config.yaml")) {
            config = yaml.load(inputStream);
        } catch (Exception e) {
            throw new RuntimeException("config.yml 파일을 로드 실패!", e);
        }
    }

    public static String getUrl(String pageKey) {
        String value = config.get("pages").get(pageKey);
        if (value == null) {
            throw new IllegalArgumentException("URL이 존재하지 않음. " + pageKey);
        }
        return value;
    }


    public static void switchToNewTab() {
        String currentWindowHandle = getWebDriver().getWindowHandle();
        for (String handle : getWebDriver().getWindowHandles()) {
            if (!handle.equals(currentWindowHandle)) {
                Selenide.switchTo().window(handle);
                break;
            }
        }
    }

    public static void closeNewTab() {
        String currentWindowHandle = getWebDriver().getWindowHandle();
        WebDriverRunner.closeWindow();
        Set<String> handles = getWebDriver().getWindowHandles();
        handles.remove(currentWindowHandle);
        if (!handles.isEmpty()) {
            String newWindowHandle = handles.iterator().next();
            Selenide.switchTo().window(newWindowHandle);
        }
    }
}