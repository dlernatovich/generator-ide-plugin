package actions.sections.plugin.intellijidea;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class ActionGenerationAction extends BaseAction {
    private final String CODE = "<group text=\"@<#Text here>\" id=\"@<#ID here>\" popup=\"true\">\n" +
            "</group>";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
