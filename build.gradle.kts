import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "regexpviewer"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

plugins {
    kotlin("jvm") version "1.3.40"
    groovy
}

dependencies {
    implementation("org.jetbrains:annotations:17.0.0")
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.codehaus.groovy:groovy-all:2.4.15")
}
val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}