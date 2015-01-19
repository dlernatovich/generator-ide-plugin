package actions.sections.android.view;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class EditTextErrorAction extends BaseAction {
    private final String CODE = "private boolean checkField() {\n" +
            "boolean result = true;\n" +
            "boolean cancel = false;\n" +
            "View focusView = null;\n" +
            "if (nameEditText.getText().toString().trim().equalsIgnoreCase(\"\")) {\n" +
            "nameEditText.setError(getString(R.string.error_field_required));\n" +
            "focusView = nameEditText;\n" +
            "cancel = true;\n" +
            "}\n" +
            "if (longtitudeEditText.getText().toString().trim().equalsIgnoreCase(\"\")) {\n" +
            "longtitudeEditText.setError(getString(R.string.error_field_required));\n" +
            "focusView = longtitudeEditText;\n" +
            "cancel = true;\n" +
            "}\n" +
            "if (lattitudeEditText.getText().toString().trim().equalsIgnoreCase(\"\")) {\n" +
            "lattitudeEditText.setError(getString(R.string.error_field_required));\n" +
            "focusView = lattitudeEditText;\n" +
            "cancel = true;\n" +
            "}\n" +
            "if (cancel) {\n" +
            "result = false;\n" +
            "focusView.requestFocus();\n" +
            "}\n" +
            "return result;\n" +
            "}";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
