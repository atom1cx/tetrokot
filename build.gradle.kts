// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {

    val kotlinVersion by extra("1.6.0")
    val coroutinesVersion by extra("1.6.0")
    val composeVersion by extra("1.1.0-rc01")
    val navigationVersion by extra("2.4.0-rc01")

    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.0.4")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath("com.google.gms:google-services:4.3.10")
        classpath("com.google.firebase:firebase-appdistribution-gradle:2.2.0")
        classpath("com.google.firebase:firebase-crashlytics-gradle:2.8.1")
    }

    allprojects {
        val minSdkVersion by extra(22)
        val compileSdkVersion by extra(31)
    }
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}
