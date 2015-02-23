package actions.sections.android.helpers;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class RandomHelperAction extends BaseAction {

    private final String CODE = "private static int MIN_VALUE = 0;\n" +
            "    private static int MAX_VALUE = 900000;\n" +
            "\n" +
            "    /**\n" +
            "     * Method which\n" +
            "     * @return\n" +
            "     */\n" +
            "    public static int generateRandomInteger() {\n" +
            "        Random rand = new Random();\n" +
            "        int randomNum = rand.nextInt((MAX_VALUE - MIN_VALUE) + 1) + MIN_VALUE;\n" +
            "        return randomNum;\n" +
            "    }";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
