pluginManagement {
	repositories {
		maven("https://maven.fabricmc.net")
		maven("https://repo.sleeping.town")
		mavenLocal()
		mavenCentral()
		gradlePluginPortal()
	}
}

plugins {
	id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}