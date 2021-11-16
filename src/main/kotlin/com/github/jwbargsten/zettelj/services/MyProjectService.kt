package com.github.jwbargsten.zettelj.services

import com.intellij.openapi.project.Project
import com.github.jwbargsten.zettelj.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
