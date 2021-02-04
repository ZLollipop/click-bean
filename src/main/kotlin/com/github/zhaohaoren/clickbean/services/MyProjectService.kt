package com.github.zhaohaoren.clickbean.services

import com.github.zhaohaoren.clickbean.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
