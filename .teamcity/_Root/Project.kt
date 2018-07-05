package _Root

import _Root.vcsRoots.*
import _Root.vcsRoots.teamcitySettingsGit
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "7e725d25-7a02-49e7-83ca-9c6b5b7f0628"
    id = "_Root"
    name = "<Root project>"
    description = "Contains all other projects"

    vcsRoot(teamcitySettingsGit)

    features {
        feature {
            id = "PROJECT_EXT_1"
            type = "ReportTab"
            param("startPage", "coverage.zip!index.html")
            param("title", "Code Coverage")
            param("type", "BuildReportTab")
        }
        feature {
            type = "sonar-qube"
            id = "PROJECT_EXT_3"
            param("name", "Sonar")
            param("id", "1")
            param("login", "sonar")
            //param("password", "${'$'}SONAR_LOGIN" )
            param("url", "https://sonarcloud.io")
        }
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_CURRENT_SETTINGS
            rootExtId = teamcitySettingsGit.id
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }

    cleanup {
        preventDependencyCleanup = false
    }
})
