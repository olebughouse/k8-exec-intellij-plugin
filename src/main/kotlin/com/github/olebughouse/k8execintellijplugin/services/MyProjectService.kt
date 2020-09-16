package com.github.olebughouse.k8execintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.olebughouse.k8execintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
