package helpers;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.command.CommandProcessor;
import com.intellij.openapi.command.UndoConfirmationPolicy;
import com.intellij.openapi.editor.CaretModel;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.SelectionModel;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.project.Project;

/**
 * Created by dlernatovich on 11/27/14.
 */
public class EditorModifyHelper {

    public static void writeCode(final Project project, final String code) {
        CommandProcessor.getInstance().executeCommand(project, new Runnable() {
            public void run() {
                ApplicationManager.getApplication().runWriteAction(new Runnable() {
                    public void run() {
                        writeCodeToEditor(project, code);
                    }
                });
            }
        }, "Insert Dummy Text", UndoConfirmationPolicy.DO_NOT_REQUEST_CONFIRMATION);
    }

    private static void writeCodeToEditor(Project project, String code) {
        if (project == null) {
            return;
        }

        Editor editor = FileEditorManager.getInstance(project).getSelectedTextEditor();
        if (editor == null) {
            return;
        }

        SelectionModel selectionModel = editor.getSelectionModel();
        CaretModel caretModel = editor.getCaretModel();

        boolean hasSelection = selectionModel.hasSelection();

        Document document = editor.getDocument();
        if (document == null) {
            return;
        }

        if (hasSelection) {
            document.replaceString(selectionModel.getSelectionStart(), selectionModel.getSelectionEnd(), code);
        } else {
            document.insertString(caretModel.getOffset(), code);
        }
        project.save();
    }
}
