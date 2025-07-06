# java-automation-webdriveruniversity

# 🔥 GUI 웹 테스트 자동화 연습 프로젝트: Java & Selenide
#### 이 프로젝트는 Java와 Selenide 프레임워크를 활용하여 웹 기반 GUI 테스트 자동화를 연습하고 핵심 개념을 익히기 위해 시작되었습니다. Selenium WebDriver의 간결한 래퍼인 Selenide를 통해 코드 가독성과 테스트 작성 효율을 높였습니다.

---

### 1️⃣ 프로젝트 소개 및 목표
이 프로젝트는 웹 애플리케이션의 UI를 자동화된 방식으로 테스트하는 방법을 학습하고 실습하는 것을 목표로 합니다.
WebDriverUniversity 데모 웹사이트를 대상으로 다양한 UI 구성 요소를 테스트 자동화로 학습합니다.


프로젝트의 목표:
* 웹 기반 테스트 자동화의 기본 개념 및 실제 적용 방법을 익힙니다.
* 다양한 UI 구성 요소의 자동화 검증 방법을 학습합니다.
* Selenide 프레임워크를 통해 코드 가독성과 테스트 작성 효율성을 높이는 방법을 경험합니다.
* 페이지 객체 모델(POM) 패턴을 적용하여 유지보수성과 재사용성을 향상시킵니다.

---

### 2️⃣ 주요 기술 스택
이 프로젝트는 아래와 같은 기술 스택을 기반으로 합니다.
* Java: 테스트 스크립트 작성
* Selenide: 웹 브라우저 자동화 프레임워크
* JUnit5: 테스트 프레임워크
* Chrome WebDriver: 브라우저 제어

📍Selenide 채택 이유:

대중적인 Selenium WebDriver 대신 Selenide를 선택한 주된 이유는 코드 가독성을 높이며, 복잡한 대기 처리를 간소화하여 유지보수하기 쉬운 테스트 코드를 작성하기 위해 선택하였습니다.

---

### 3️⃣ 프로젝트 구조

프로젝트의 핵심 테스트 및 유틸리티 코드는 src/test/java 아래에 구조화되어 있습니다.

~~~
src/test/java
└── com
    └── webdriveruniversity
        └── automations
            └── ui
                ├── common
                │   ├── BrowserManager.java
                │   └── TestDataUtil.java
                ├── pages
                │   ├── AJAXLoaderPage.java
                │   ├── AccordionPage.java
                │   ├── ButtonClicksPage.java
                │   ├── ContactUsPage.java
                │   ├── FormControlPage.java
                │   ├── LoginPage.java
                │   ├── MainPage.java
                │   ├── PageObjectModelPage.java
                │   └── ToDoListPage.java
                └── tests
                    ├── AJAXLoaderTest.java
                    ├── AccordionTest.java
                    ├── ButtonClicksPageTest.java
                    ├── ContactUsTest.java
                    ├── FormControlTest.java
                    ├── LoginTest.java
                    ├── PageObjectModelTest.java
                    └── ToDoListTest.java
~~~

---

### 4️⃣ 테스트 시나리오 예시

WebDriverUniversity 데모 웹사이트를 대상으로 특정 기능 및 UI 구성 요소를 검증합니다.

* 페이지의 초기화 상태 (Default 검증)
* 유효 값 입력
* 비유효 값 입력
* 각종 구성요소의 option 및 value 확인
* 액션에 대한 화면 응답

