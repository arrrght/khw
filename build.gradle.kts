plugins {
    id("org.jetbrains.kotlin.jvm") version "1.3.41"
    application
}

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    val ktorVersion = "1.2.4"
    val kotlinVersion = "1.3.41"
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("io.ktor:ktor-server-netty:$ktorVersion")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

application {
    mainClassName = "hw4.AppKt"
}
