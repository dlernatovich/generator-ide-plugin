package actions.sections.android.view;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class EditTextErrorAction extends BaseAction {
    private final String CODE = "/**\n" +
            "     * Method which provide the set error to EditText\n" +
            "     *\n" +
            "     * @param view      current EditText\n" +
            "     * @param errorText error text\n" +
            "     */\n" +
            "    public void setErrorToEditText(EditText view, String errorText) {\n" +
            "        view.setError(errorText);\n" +
            "        view.requestFocus();\n" +
            "    }";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
