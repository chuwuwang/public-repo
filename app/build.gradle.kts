plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.pub.repo"
    compileSdk {
        version = release(37)
    }
    defaultConfig {
        applicationId = "com.pub.repo"
        minSdk = 24
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        release {
            optimization { enable = false }
        }
    }
    buildFeatures {
        // compose = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)

    // implementation( platform(libs.androidx.compose.bom) )
    // implementation(libs.androidx.activity.compose)
    // implementation(libs.androidx.compose.material3)
    // implementation(libs.androidx.compose.ui)
    // implementation(libs.androidx.compose.ui.graphics)
    // implementation(libs.androidx.compose.ui.tooling.preview)
}