package _Root

import _Root.vcsRoots.*
import _Root.vcsRoots.eamcitySettings
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "8a76bacd-9ae0-48dc-a22f-83d448814b67"
    id = "_Root"
    name = "<Root project>"
    description = "Contains all other projects"

    vcsRoot(eamcitySettings)

    features {
        feature {
            id = "PROJECT_EXT_1"
            type = "ReportTab"
            param("startPage", "coverage.zip!index.html")
            param("title", "Code Coverage")
            param("type", "BuildReportTab")
        }
        feature {
            id = "PROJECT_EXT_4"
            type = "sonar-qube"
            param("password", "sonar_pass")
            param("name", "Sonar")
            param("id", "1")
            param("login", "tester")
            param("url", "https://sonarcloud.io")
        }
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_CURRENT_SETTINGS
            rootExtId = eamcitySettings.id
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }

    cleanup {
        preventDependencyCleanup = false
    }
})
