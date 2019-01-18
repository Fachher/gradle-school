plugins {
    java
}

group = "de.syed"
version = "1.0-SNAPSHOT"

allprojects {
    print("allprojects sections\n")
}

artifacts {
    print("artifacts sections\n")
}

buildscript {
    print("buildscript section\n")
}

configurations {
    print("configurations section\n")
}

repositories {
    mavenCentral()
}

dependencies {
    testCompile("junit", "junit", "4.12")
    testCompile("org.mockito", "mockito-core", "2.23.4")
    testCompile("org.assertj", "assertj-core", "3.7.0")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}