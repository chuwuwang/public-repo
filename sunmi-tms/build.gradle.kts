plugins {
    alias(libs.plugins.android.library)
    id("maven-publish")
}

android {
    namespace = "com.sunmi.tms"
    compileSdk = 37
}

afterEvaluate {

    publishing {

        publications {

            create<MavenPublication>("release") {
                groupId = "com.pub.repo"
                artifactId = "sunmi-tms"
                version = "1.0.48"
                artifact( file("libs/sunmi_customer_api_1.0.48_release.aar") )
            }

        }

    }

}