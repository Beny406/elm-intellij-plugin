package com.github.beny406.elmintellijplugin.lsp

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.ProjectWideLspServerDescriptor

class ElmLspServerDescriptor(project: Project) : ProjectWideLspServerDescriptor(project, "Elm") {

    override fun isSupportedFile(file: VirtualFile) = file.extension == "elm"
    override fun createCommandLine() = GeneralCommandLine("elm-language-server")

    override val lspFormattingSupport = ElmLspServerFormatter(project)

}
