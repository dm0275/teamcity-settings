package _Root.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object teamcitySettingsGit : GitVcsRoot({
    uuid = "973bb34c-c619-4020-baf8-8d091a161899"
    id = "teamcitySettingsGit"
    name = "https://github.com/dm0275/teamcity-settings.git"
    url = "https://github.com/dm0275/teamcity-settings.git"
    pushUrl = "https://github.com/dm0275/teamcity-settings.git"
    authMethod = password {
        userName = "dm0275"
        password = "credentialsJSON:ec3588b9-c678-4667-9dc1-19a3c3ae09f1"
    }
})
