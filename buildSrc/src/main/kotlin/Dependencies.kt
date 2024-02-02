
object ConfigData {
    const val compileSdk = 34
    const val applicationId = "kr.co.kwon.practice"
    const val minSdk = 26
    const val targetSdk = 33
    const val versionCode = 1
    const val versionName = "1.0.0"
}

object Version {
    const val Core_ktx_version = "1.8.0"
    const val Kotlin_bom_version = "1.8.0"
    const val Lifecycle_runtime_version = "2.3.1"
    const val Activity_compose_version = "1.5.1"
    const val Compose_bom_version = "2022.10.00"
    const val Junit_version = "4.13.2"
    const val Junit_test_version = "1.1.5"
    const val Espresso_test_version = "3.5.1"
//    const val Lifecycle_viewmodel_version = "2.7.1"
    const val Lifecycle_viewModel_version = "2.5.3"
    const val Navigation_compose_version = "2.5.3"
    const val Navigation_compose_animation_version = "0.30.0"
    const val Constraintlayout_compose_version = "1.0.1"
    const val Runtime_livedata_version = "1.4"

}

object Libraries {
    const val Core_ktx = "androidx.core:core-ktx:${Version.Core_ktx_version}"
    const val Kotlin_bom = "org.jetbrains.kotlin:kotlin-bom:${Version.Kotlin_bom_version}"
    const val Lifecycle_runtime = "androidx.lifecycle:lifecycle-runtime-ktx:${Version.Lifecycle_runtime_version}"
    const val Activity_compose = "androidx.activity:activity-compose:${Version.Activity_compose_version}"
    const val Compose_bom = "androidx.compose:compose-bom:${Version.Compose_bom_version}"
    const val Compose_ui = "androidx.compose.ui:ui"
    const val Compose_ui_graphics = "androidx.compose.ui:ui-graphics"
    const val Compose_ui_tool = "androidx.compose.ui:ui-tooling-preview"
    const val Compose_material = "androidx.compose.material3:material3"
    const val Lifecycle_viewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:${Version.Lifecycle_viewModel_version}"
    const val Navigation_compose = "androidx.navigation:navigation-compose:${Version.Navigation_compose_version}"
    const val Navigation_compose_animation = "com.google.accompanist:accompanist-navigation-animation:${Version.Navigation_compose_animation_version}"
    const val Constraintlayout_compose = "androidx.constraintlayout:constraintlayout-compose:${Version.Constraintlayout_compose_version}"

    //Lifecycle
//    const val Runtime_livedata = "androidx.compose.runtime:runtime-livedata:${Version.Runtime_livedata_version}"




//    implementation "com.google.accompanist:accompanist-flowlayout:0.17.0"

    //TEST
    const val Junit = "junit:junit:${Version.Junit_version}"
    const val Junit_test = "androidx.test.ext:junit:${Version.Junit_test_version}"
    const val Espresso_test = "androidx.test.espresso:espresso-core:${Version.Espresso_test_version}"
    const val Compose_ui_test = "androidx.compose.ui:ui-test-junit4"
    const val Compose_ui_tool_test = "androidx.compose.ui:ui-tooling"
    const val Compose_ui_test_manifest = "androidx.compose.ui:ui-test-manifest"
}