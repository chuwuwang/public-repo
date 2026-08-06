plugins {
    alias(libs.plugins.android.library)
    id("maven-publish")
}

android {
    namespace = "com.sunmi.rki"
    compileSdk = 37
}

afterEvaluate {

    publishing {

        publications {

            create<MavenPublication>("release") {
                groupId = "com.pub.repo"
                artifactId = "sunmi-rki"
                version = "1.0.2"
                artifact( file("libs/sunmi-rki-lib_1.0.2_release.aar") )
            }

        }

    }

}