import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
    kotlin("multiplatform") version "2.0.21"
    id("org.jetbrains.dokka") version "1.9.20"

    `maven-publish`
    jacoco
}

val v = "0.1.0"

group = "xyz.calcugames.documake"
version = if (project.hasProperty("snapshot")) "$v-SNAPSHOT" else v

repositories {
    mavenCentral()
    mavenLocal()
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

kotlin {
    applyDefaultHierarchyTemplate()

    jvm()
    js {
        browser {
            testTask {
                enabled = false
            }
        }
        nodejs()
        generateTypeScriptDefinitions()
    }
    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        browser {
            testTask {
                enabled = false
            }
        }
        nodejs {
            testTask {
                useMocha {
                    timeout = "10m"
                }
            }
        }
        generateTypeScriptDefinitions()
    }
    @OptIn(ExperimentalWasmDsl::class)
    wasmWasi {
        nodejs {
            testTask {
                useMocha {
                    timeout = "10m"
                }
            }
        }
    }

    androidNativeX64()
    androidNativeX86()
    androidNativeArm32()
    androidNativeArm64()

    mingwX64()
    linuxArm64()
    linuxX64()

    macosX64()
    macosArm64()
    iosX64()
    iosSimulatorArm64()
    iosArm64()
    tvosX64()
    tvosSimulatorArm64()
    tvosArm64()
    watchosX64()
    watchosSimulatorArm64()
    watchosDeviceArm64()
    watchosArm32()
    watchosArm64()

    sourceSets {
        commonMain.dependencies {
            implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.9.0")
            implementation("io.github.oshai:kotlin-logging:7.0.0")
        }

        commonTest.dependencies {
            implementation(kotlin("test"))
        }
    }
}

publishing {
    publications {
        getByName<MavenPublication>("kotlinMultiplatform") {
            pom {
                name = "DScanner"
                description = "Multiplatform tool for scanning source code"
                url = "https://documake.calcugames.xyz"

                licenses {
                    license {
                        name = "MIT License"
                        url = "https://opensource.org/licenses/MIT"
                    }
                }

                scm {
                    connection = "scm:git:git://github.com/DocuMake/DScanner.git"
                    developerConnection = "scm:git:ssh://github.com/DocuMake/DScanner.git"
                    url = "https://github.com/LDocuMake/DScanner"
                }
            }
        }
    }

    repositories {
        maven {
            credentials {
                username = System.getenv("NEXUS_USERNAME")
                password = System.getenv("NEXUS_PASSWORD")
            }

            val releases = "https://repo.calcugames.xyz/repository/maven-releases/"
            val snapshots = "https://repo.calcugames.xyz/repository/maven-snapshots/"
            url = uri(if (version.toString().endsWith("SNAPSHOT")) snapshots else releases)
        }
    }
}