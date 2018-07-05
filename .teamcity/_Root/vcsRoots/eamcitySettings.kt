package _Root.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object eamcitySettings : GitVcsRoot({
    uuid = "eb5330de-b4c2-40e1-863b-e92f9cb964a9"
    id = "eamcitySettings"
    name = "https://github.com/dm0275/teamcity-settings.git"
    url = "https://github.com/dm0275/teamcity-settings.git"
    pushUrl = "https://github.com/dm0275/teamcity-settings.git"
    authMethod = password {
        userName = "dm0275"
        password = "credentialsJSON:ecf6903b-7e30-4804-b298-a58cb367fe5a"
    }
})
