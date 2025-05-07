plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

dependencies {
    implementation("org.jetbrains:annotations:24.0.0")
    testImplementation(platform("org.junit:junit-bom:5.10.2"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("com.codeborne:selenide:7.7.0")
    testImplementation("org.yaml:snakeyaml:1.33")
    testImplementation("io.cucumber:cucumber-java:7.20.1")
    testImplementation("io.cucumber:cucumber-junit:7.20.1")
    }

repositories {
    mavenCentral()
}

tasks.test {
    useJUnitPlatform()
}
