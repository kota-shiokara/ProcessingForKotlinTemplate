plugins {
    kotlin("jvm") version "1.9.0"
    id("com.github.johnrengelman.shadow") version "8.1.1"
    application
}

group = "jp.ikanoshiokara"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.processing:core:3.3.7")
}

tasks{
    shadowJar {
        manifest{
            attributes(Pair("Main-Class", "MainKt"))
        }
    }

    jar {
        manifest {
            attributes(Pair("Main-Class", "MainKt"))
        }
    }

    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }

    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}