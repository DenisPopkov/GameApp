object Versions {
    internal const val COMPOSE_BOM = "2023.10.01"
    const val COMPOSE_COMPILER = "1.5.3"
    const val COMPOSE_NAVIGATION = "2.7.4"
    const val COMPOSE_HILT_NAVIGATION = "1.0.0"
    const val COIL = "2.4.0"
    const val SPLASH = "1.0.0"
    const val ACTIVITY = "1.8.0"
    const val KOTLIN = "1.9.10"
    const val BUILD_TOOLS = "34.0.0"
    const val HILT = "2.48"
    const val SERIALIZATION = "1.6.0"
    const val COROUTINES = "1.7.3"
    const val LIVEDATA = "1.5.4"
    const val AGP = "8.1.2"
}

object Sdk {
    const val COMPILE_SDK_VERSION = 34
    const val MIN_SDK_VERSION = 24
    const val TARGET_SDK_VERSION = 34
}

object ComposeLibs {
    const val BOM = "androidx.compose:compose-bom:${Versions.COMPOSE_BOM}"
    const val UI = "androidx.compose.ui:ui"
    const val MATERIAL = "androidx.compose.material3:material3"
    const val TOOLING = "androidx.compose.ui:ui-tooling"
    const val TOOLING_PREVIEW = "androidx.compose.ui:ui-tooling-preview"
    const val ACTIVITY = "androidx.activity:activity-compose:${Versions.ACTIVITY}"
    const val UI_TEST = "androidx.compose.ui:ui-test-junit4"
    const val NAVIGATION = "androidx.navigation:navigation-compose:${Versions.COMPOSE_NAVIGATION}"
    const val HILT_NAVIGATION =
        "androidx.hilt:hilt-navigation-compose:${Versions.COMPOSE_HILT_NAVIGATION}"
    const val UI_TEST_MANIFEST = "androidx.compose.ui:ui-test-manifest"
}

object UILibs {
    const val COIL = "io.coil-kt:coil-compose:${Versions.COIL}"
}

object HiltLibs {
    const val ANDROID = "com.google.dagger:hilt-android:${Versions.HILT}"
    const val CORE = "com.google.dagger:hilt-core:${Versions.HILT}"
    const val ANDROID_COMPILER = "com.google.dagger:hilt-android-compiler:${Versions.HILT}"
}

object AndroidXLibs {
    const val CORE = "androidx.core:core-ktx:1.12.0"
}

object AndroidXTestLibs {
    const val JUNIT = "androidx.test.ext:junit:1.1.3"
    const val SPLASH = "androidx.core:core-splashscreen:${Versions.SPLASH}"
}

object TestLibs {
    const val JUNIT = "junit:junit:4.13.2"
}

object AndroidLibs {
    const val MATERIAL = "com.google.android.material:material:1.10.0"
    const val SERIALIZATION =
        "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.SERIALIZATION}"
    const val COROUTINES_CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINES}"
    const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES}"
    const val LIVEDATA = "androidx.compose.runtime:runtime-livedata:${Versions.LIVEDATA}"
}