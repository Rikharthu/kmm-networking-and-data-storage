buildscript {

    val kotlinVersion = "1.4.30"
    val sqlDelightVersion:String by project

    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath("org.jetbrains.kotlin:kotlin-serialization:$kotlinVersion")
        classpath("com.squareup.sqldelight:gradle-plugin:$sqlDelightVersion")
        classpath("com.android.tools.build:gradle:4.0.1")
    }
}
group = "com.jetbrains.handson"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
