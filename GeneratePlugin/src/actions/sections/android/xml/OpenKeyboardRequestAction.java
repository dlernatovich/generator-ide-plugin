package actions.sections.android.xml;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class OpenKeyboardRequestAction extends BaseAction {
    private final String CODE = "android:focusable=\"true\" \n" +
            "android:focusableInTouchMode=\"true\"";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
