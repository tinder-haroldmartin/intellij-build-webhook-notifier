package com.github.tinderharoldmartin.intellijbuildwebhooknotifier.services

import com.github.tinderharoldmartin.intellijbuildwebhooknotifier.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
