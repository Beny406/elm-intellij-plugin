package com.github.beny406.elmintellijplugin.lsp

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.customization.LspFormattingSupport

class ElmLspServerFormatter(project: Project) : LspFormattingSupport() {

    override fun shouldFormatThisFileExclusivelyByServer(file: VirtualFile,
                                                         ideCanFormatThisFileItself: Boolean,
                                                         serverExplicitlyWantsToFormatThisFile: Boolean) =
        file.extension == "elm"
}
