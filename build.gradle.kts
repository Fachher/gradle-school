plugins {
    java
    id("base") // only writting "base" with id(*) would work too
}

group = "de.syed"
version = "1.0-SNAPSHOT"
description = "A simple gradle school project"

allprojects {
    print("allprojects sections\n")

    configurations.all {
        resolutionStrategy{
            dependencySubstitution {
                substitute(module("org.objenesis:objenesis:2.6"))
                        .because("I just want to take advantage of the new features")
                        .with(module("org.objenesis:objenesis:3.0.1"))
            }
        }
    }
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

// tasks
tasks.create<Copy>("copy") {
    description = "Copies sources to the dest directory"
    group = "Custom"
    DuplicatesStrategy.WARN
    from("src")
    into("dest")
}
// belongs to base plugin
tasks.create<Zip>("zip") {
    description = "Archives sources in a zip file"
    group = "Archive"
    archiveName = "basic-demo-1.0.zip"

    from("src")
}