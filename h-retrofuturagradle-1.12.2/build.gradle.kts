import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("com.gtnewhorizons.retrofuturagradle") version "1.3.30"
}

group = "hummel"
version = LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

dependencies {
	implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
}

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(8)
	}
}

minecraft {
	mcVersion = "1.12.2"
	username = "Hummel009"
}

tasks {
	withType<JavaCompile>().configureEach {
		options.encoding = "UTF-8"
	}
}
