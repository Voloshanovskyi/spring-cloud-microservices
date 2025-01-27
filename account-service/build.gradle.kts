plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.cloud:spring-cloud-starter-config")
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks {
    withType<Test> {
        useJUnitPlatform()
    }
}

bootJar {
    mainClassName = "org.example.account.AccountApplication"
}
