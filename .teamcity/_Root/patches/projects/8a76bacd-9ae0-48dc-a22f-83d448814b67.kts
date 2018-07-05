package _Root.patches.projects

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the project with uuid = '8a76bacd-9ae0-48dc-a22f-83d448814b67' (id = '_Root')
accordingly and delete the patch script.
*/
changeProject("8a76bacd-9ae0-48dc-a22f-83d448814b67") {
    features {
        add {
            feature {
                type = "sonar-qube"
                id = "PROJECT_EXT_4"
                param("name", "Sonar")
                param("id", "762649dc-00b0-44bc-9419-9c417a050185")
                param("url", "https://sonarcloud.io")
            }
        }
    }
}
