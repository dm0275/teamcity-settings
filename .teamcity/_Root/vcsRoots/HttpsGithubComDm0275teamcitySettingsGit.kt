package _Root.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object HttpsGithubComDm0275teamcitySettingsGit : GitVcsRoot({
    uuid = "c35fa790-b621-443a-87fa-e04648894cf2"
    extId = "HttpsGithubComDm0275teamcitySettingsGit"
    name = "https://github.com/dm0275/teamcity-settings.git"
    url = "https://github.com/dm0275/teamcity-settings.git"
    authMethod = password {
        userName = "dm0275"
        password = "credentialsJSON:22a9f56f-393f-42c3-8681-5e17f494795a"
    }
})
