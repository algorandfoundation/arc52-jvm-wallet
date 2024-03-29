plugins {
    kotlin("jvm") version "1.9.22"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(fileTree(mapOf("dir" to "src/libs", "include" to listOf("*.jar"))))
    implementation("net.java.dev.jna:jna:5.12.1")
    implementation("com.goterl:resource-loader:2.0.2")
    implementation("cash.z.ecc.android:kotlin-bip39:1.0.7")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}