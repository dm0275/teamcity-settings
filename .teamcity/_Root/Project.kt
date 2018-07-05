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

    params {
        // Sonar Credentials
        param("env.SONAR_HOST_URL", "https://sonar01.com")
        password("env.SONAR_LOGIN", "12345678")
    }

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
            id = "PROJECT_EXT_5"
            //password("password", "%SONAR_LOGIN%" )
            param("name", "Sonar")
            param("id", "1")
            //param("id", "8b543757-42d1-4479-9120-a191d80f96ed")
            param("login", "sonar")
            param("password", "%SONAR_LOGIN%" )
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
