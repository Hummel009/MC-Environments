pluginManagement {
	repositories {
		maven {
			name = "GTNH Maven"
			url = uri("http://jenkins.usrv.eu:8081/nexus/content/groups/public/")
			isAllowInsecureProtocol = true
			mavenContent {
				includeGroup("com.gtnewhorizons")
				includeGroup("com.gtnewhorizons.retrofuturagradle")
			}
		}
		mavenLocal()
		mavenCentral()
		gradlePluginPortal()
	}
}

plugins {
	id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}