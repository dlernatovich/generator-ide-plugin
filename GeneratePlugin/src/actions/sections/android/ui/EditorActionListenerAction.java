package actions.sections.android.ui;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class EditorActionListenerAction extends BaseAction {

    private final String CODE = "<your edittext>.setOnEditorActionListener(new TextView.OnEditorActionListener() {\n" +
            "                @Override\n" +
            "                public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {\n" +
            "                        if (actionId == EditorInfo.IME_ACTION_SEARCH ||\n" +
            "                                actionId == EditorInfo.IME_ACTION_DONE ||\n" +
            "                                event.getAction() == KeyEvent.ACTION_DOWN &&\n" +
            "                                        event.getKeyCode() == KeyEvent.KEYCODE_ENTER) {\n" +
            "\n" +
            "                                //YOUR ACTION\n" +
            "                                \n" +
            "                                return false;\n" +
            "                        }\n" +
            "                        return false;\n" +
            "                }\n" +
            "        });";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
