import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    val springBootVersion = "2.7.7"
    val kotlinVersion = "1.8.0"

    kotlin("jvm") version kotlinVersion apply true
    kotlin("plugin.spring") version kotlinVersion apply true

    id("org.springframework.boot") version springBootVersion apply false
    id("io.spring.dependency-management") version "1.1.0" apply false
}

allprojects {
    buildscript {
        project.extra.apply {
            set("springBootVersion", "2.7.7")
        }
    }

    repositories {
        mavenLocal()
        maven { setUrl("https://repo.maven.apache.org/maven2") }
        maven { setUrl("https://repo.spring.io/milestone") }
    }
}

subprojects {
    apply {
        plugin("org.jetbrains.kotlin.jvm")
        plugin("org.jetbrains.kotlin.plugin.spring")
    }

    group = "com.example"

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "11"
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}

subprojects {
    dependencies {
        implementation("org.springframework.boot:spring-boot-starter-web")
        implementation("org.springframework.boot:spring-boot-starter-actuator")

        testImplementation(kotlin("test"))
    }

        apply(plugin = "org.springframework.boot")
        apply(plugin = "io.spring.dependency-management")
}
