plugins {
    id("demoApiScalarGalaxy.kotlin")
}

dependencies {
    api(project(":demoApiScalarGalaxy-kotlin-core"))

    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")

    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.3")
}
