plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
    id("com.android.library")
    id("io.github.luca992.multiplatform-swiftpackage") version "2.1.2"
}

@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {
    targetHierarchy.default()

    android {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
        version = "1.0"
        name = "KmpAndroidExistingProjectShared"
        ios.deploymentTarget = "14.1"
        framework {
            isStatic = true
            baseName = "KmpAndroidExistingProjectShared"
        }
        noPodspec()
    }

    multiplatformSwiftPackage {
        packageName("KmpAndroidExistingProjectShared")
        swiftToolsVersion("5.8.1")
        targetPlatforms {
            iOS { v("14.1") }
        }
        outputDirectory(File(rootDir, "/"))
    }
    
    sourceSets {
        val commonMain by getting {
            dependencies {
                //put your multiplatform dependencies here
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

android {
    namespace = "com.marazmone.kmp_android_existing_project"
    compileSdk = 33
    defaultConfig {
        minSdk = 28
    }
}