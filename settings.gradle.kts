
include(":stately-strict")
include(":stately-concurrency")
include(":stately-concurrent-collections")

// Deprecated modules
include(":stately-common")
include(":stately-collections")
include(":stately-isolate")
include(":stately-iso-collections")

project(":stately-common").projectDir = File("deprecated/stately-common")
project(":stately-collections").projectDir = File("deprecated/stately-collections")
project(":stately-isolate").projectDir = File("deprecated/stately-isolate")
project(":stately-iso-collections").projectDir = File("deprecated/stately-iso-collections")

pluginManagement {
    includeBuild("convention-plugins")
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://mirrors.tencent.com/nexus/repository/maven-public/")
    }
}

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
        google()
        maven("https://mirrors.tencent.com/nexus/repository/maven-public/")
    }
}