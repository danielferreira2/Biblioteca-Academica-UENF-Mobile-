plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("com.google.dagger.hilt.android")
    kotlin("kapt")
}

android {
    namespace = "com.danielferreira.uenf_educar_biblioteca"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.danielferreira.uenf_educar_biblioteca"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
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
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    //hilt
    kapt ("com.google.dagger:hilt-compiler:2.51.1")
    implementation ("com.google.dagger:hilt-android:2.51.1")
    implementation("androidx.hilt:hilt-work:1.2.0")

    implementation("androidx.work:work-runtime-ktx:2.9.0")

    //retrofit e okhttp
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.okhttp3:okhttp:4.9.3")
    implementation("com.squareup.okhttp3:logging-interceptor:4.9.3")

    //icones e componentes material
    implementation("androidx.compose.material:material:1.6.7")
    implementation("androidx.compose.material:material-icons-extended:1.6.7")

    //navigation compose
    implementation("androidx.navigation:navigation-compose:2.7.7")


    // JUnit for unit testing
    testImplementation("junit:junit:4.13.2")

    // Coroutines for testing
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.0")
    // AndroidX Test - Core, Runner, and Rules
    testImplementation("androidx.test:core:1.4.0")
    testImplementation("androidx.test:runner:1.4.0")
    testImplementation("androidx.test:rules:1.4.0")
    // AndroidX Arch Core Testing - for ViewModel testing
    testImplementation("androidx.arch.core:core-testing:2.1.0")
    // MockK for mocking
    testImplementation("io.mockk:mockk:1.12.0")


}