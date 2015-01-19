package ui.views;

import callbacks.DialogActionCallback;
import com.intellij.openapi.project.Project;

import javax.swing.*;

/**
 * Created by dlernatovich on 11/13/14.
 */
public class BaseView extends JPanel {

    private DialogActionCallback dialogActionCallback;
    protected Project project;

    public BaseView(Project project) {
        this.project = project;
    }

    public BaseView getView() {
        return this;
    }

    public void closeForm() {
        if (dialogActionCallback != null) {
            dialogActionCallback.close();
        }
    }

    public void showForm() {
        if (dialogActionCallback != null) {
            dialogActionCallback.show();
        }
    }

    public void hideForm() {
        if (dialogActionCallback != null) {
            dialogActionCallback.hide();
        }
    }

    public void setDialogActionCallback(DialogActionCallback dialogActionCallback) {
        this.dialogActionCallback = dialogActionCallback;
    }
}
