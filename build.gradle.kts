plugins {
  kotlin("jvm") version "1.2.70"
}

val junitVersion: String = "5.3.1"

repositories {
  jcenter()
}

dependencies {
  testCompile("org.junit.jupiter:junit-jupiter-api:$junitVersion")
  testCompile("org.junit.jupiter:junit-jupiter-params:$junitVersion")
  testRuntime("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
}

tasks.withType<Test> {
  useJUnitPlatform()
  testLogging {
    events("passed", "skipped", "failed")
  }
}

