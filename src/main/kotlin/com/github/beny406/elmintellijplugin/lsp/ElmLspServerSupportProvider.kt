package com.github.beny406.elmintellijplugin.lsp

import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.LspServerSupportProvider

internal class ElmLspServerSupportProvider : LspServerSupportProvider {
    override fun fileOpened(project: Project, file: VirtualFile, serverStarter: LspServerSupportProvider.LspServerStarter) {
        if (file.extension == "elm") {
            serverStarter.ensureServerStarted(ElmLspServerDescriptor(project))
        }
    }
}
