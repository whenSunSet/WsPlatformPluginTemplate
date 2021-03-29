package com.github.whensunset.wsplatformplugintemplate.services

import com.github.whensunset.wsplatformplugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
