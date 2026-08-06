plugins {
    alias(libs.plugins.android.library)
    id("maven-publish")
}

android {
    namespace = "com.sunmi.payment"
    compileSdk = 37
}

afterEvaluate {

    publishing {

        publications {

            create<MavenPublication>("release") {
                groupId = "com.pub.repo"
                artifactId = "sunmi-payment"
                version = "2.0.34-ex"
                artifact( file("libs/sunmi-pay-lib-release-2.0.34.aar") )
            }

        }

    }

}