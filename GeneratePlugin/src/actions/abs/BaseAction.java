package actions.abs;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import helpers.EditorModifyHelper;

/**
 * Created by dlernatovich on 1/19/15.
 */
public abstract class BaseAction extends AnAction {

    @Override
    public abstract void actionPerformed(AnActionEvent e);

    protected void writeCode(AnActionEvent event, String code) {
        Project project = event.getProject();
        EditorModifyHelper.writeCode(project, code);
    }
}
