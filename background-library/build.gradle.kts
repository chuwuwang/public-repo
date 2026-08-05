plugins {
    alias(libs.plugins.android.library)
    id("maven-publish")
}

android {
    namespace = "com.noober.background"
    compileSdk = 37
    defaultConfig {
        minSdk = 14
    }
}

dependencies {

}

afterEvaluate {

    publishing {

        publications {

            create<MavenPublication>("release") {
                groupId = "com.github.pub.repo"
                artifactId = "background-library"
                version = "1.7.6"
                artifact( file("libs/noober-background-library-1.7.6.aar") )
            }

        }

    }

}