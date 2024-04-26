pluginManagement {
	repositories {
		maven("https://maven.neoforged.net/releases")
		mavenLocal()
		mavenCentral()
		gradlePluginPortal()
	}
}

plugins {
	id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}