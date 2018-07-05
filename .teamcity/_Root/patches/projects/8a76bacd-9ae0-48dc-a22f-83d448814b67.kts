package _Root.patches.projects

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.ProjectFeature
import jetbrains.buildServer.configs.kotlin.v2017_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the project with uuid = '8a76bacd-9ae0-48dc-a22f-83d448814b67' (id = '_Root')
accordingly and delete the patch script.
*/
changeProject("8a76bacd-9ae0-48dc-a22f-83d448814b67") {
    params {
        expect {
            password("env.SONAR_LOGIN", "12345678")
        }
        update {
            password("env.SONAR_LOGIN", "credentialsJSON:7be13761-b3e3-438f-9a99-c6dacd07cab8")
        }
        add {
            param("env.sonar_pass", "test")
        }
    }

    features {
    }
}
