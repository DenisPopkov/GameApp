plugins {
    id("com.android.application")
    id("kotlin-android")
    id("dagger.hilt.android.plugin")
    kotlin("kapt")
}

android {

    namespace = "ru.popkov.gameapp"
    compileSdk = Sdk.COMPILE_SDK_VERSION
    defaultConfig {
        applicationId = AppConfiguration.APPLICATION_ID
        minSdk = Sdk.MIN_SDK_VERSION
        targetSdk = Sdk.TARGET_SDK_VERSION
        versionCode = AppConfiguration.VERSION_CODE
        versionName = AppConfiguration.VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        debug {
            resValue("string", "app_name", "(D)GameApp")
            isDebuggable = true
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
        release {
            resValue("string", "app_name", "GameApp")
            isDebuggable = false
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
            signingConfig = signingConfigs.getByName("debug")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.COMPOSE_COMPILER
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildToolsVersion = Versions.BUILD_TOOLS
}

kapt {
    correctErrorTypes = true
}

dependencies {
    platform(ComposeLibs.BOM)
        .also(::implementation)
        .also(::androidTestImplementation)

    implementation(AndroidXLibs.CORE)
    implementation(AndroidLibs.MATERIAL)
    implementation(AndroidLibs.SERIALIZATION)
    implementation(AndroidLibs.COROUTINES_CORE)
    implementation(AndroidLibs.COROUTINES)
    implementation(AndroidLibs.LIVEDATA)

    implementation(ComposeLibs.UI)
    implementation(ComposeLibs.MATERIAL)
    implementation(ComposeLibs.TOOLING_PREVIEW)
    implementation(ComposeLibs.CONSTRAINT_LAYOUT)
    implementation(ComposeLibs.NAVIGATION)
    implementation(ComposeLibs.HILT_NAVIGATION)
    implementation(ComposeLibs.ACTIVITY)

    implementation(AndroidXTestLibs.SPLASH)
    implementation(UILibs.COIL)
    implementation(HiltLibs.ANDROID)
    kapt(HiltLibs.ANDROID_COMPILER)

    testImplementation(TestLibs.JUNIT)
    androidTestImplementation(AndroidXTestLibs.JUNIT)
    androidTestImplementation(ComposeLibs.UI_TEST)

    debugImplementation(ComposeLibs.UI_TEST_MANIFEST)
    debugImplementation(ComposeLibs.TOOLING)
    debugImplementation(ComposeLibs.TOOLING_PREVIEW)
}