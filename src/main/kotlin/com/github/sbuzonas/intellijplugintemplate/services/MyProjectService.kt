package com.github.sbuzonas.intellijplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.sbuzonas.intellijplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
