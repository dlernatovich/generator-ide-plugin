package actions.sections.java.formatting;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class FormattingAction extends BaseAction {
    private final String CODE = "/**\n" +
            "     * Method which provide the formatting of double value\n" +
            "     *\n" +
            "     * @param number value which should be formatted\n" +
            "     * @param precisionCount precision count\n" +
            "     * @return\n" +
            "     */\n" +
            "    public static String format(double number, int precisionCount) {\n" +
            "        StringBuilder formatterValue = new StringBuilder(\"#.\");\n" +
            "\n" +
            "        for (int i = 0; i < precisionCount; i++) {\n" +
            "            formatterValue.append(\"#\");\n" +
            "        }\n" +
            "\n" +
            "        DecimalFormat formatter = new DecimalFormat(formatterValue.toString());\n" +
            "        return formatter.format(number);\n" +
            "    }";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
