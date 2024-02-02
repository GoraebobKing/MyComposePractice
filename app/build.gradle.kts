plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = ConfigData.applicationId
    compileSdk = ConfigData.compileSdk

    defaultConfig {
        minSdk = ConfigData.minSdk
        targetSdk = ConfigData.targetSdk
        versionCode = ConfigData.versionCode
        versionName = ConfigData.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
    }

    buildTypes {
        release {
            isMinifyEnabled =  false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.2"
    }

    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Libraries.Core_ktx)
    implementation(platform(Libraries.Kotlin_bom))
    implementation(Libraries.Lifecycle_runtime)
    implementation(Libraries.Activity_compose)
    implementation(platform(Libraries.Compose_bom))
    implementation(Libraries.Compose_ui)
    implementation(Libraries.Compose_ui_graphics)
    implementation(Libraries.Compose_ui_tool)
    implementation(Libraries.Compose_material)

    implementation(Libraries.Lifecycle_viewModel)
    implementation(Libraries.Navigation_compose)
    implementation(Libraries.Navigation_compose_animation)
    implementation(Libraries.Constraintlayout_compose)

    testImplementation(Libraries.Junit)
    androidTestImplementation(Libraries.Junit_test)
    androidTestImplementation(Libraries.Espresso_test)
    androidTestImplementation(platform(Libraries.Compose_bom))
    androidTestImplementation(Libraries.Compose_ui_test)
    debugImplementation(Libraries.Compose_ui_tool_test)
    debugImplementation(Libraries.Compose_ui_test_manifest)
}