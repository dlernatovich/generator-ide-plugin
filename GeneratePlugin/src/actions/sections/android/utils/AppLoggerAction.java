package actions.sections.android.utils;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class AppLoggerAction extends BaseAction {

    private final String CODE = " private static final String PREFIX = \"===>\";\n" +
            "    private static final String ERROR_PREFIX = \"===> [ERROR]:\";\n" +
            "\n" +
            "    public static void info(Object owner, String message) {\n" +
            "        Log.d(String.format(\"%s %s\", PREFIX, owner.getClass().getSimpleName()), message);\n" +
            "    }\n" +
            "\n" +
            "    public static void info(Object owner, String message, String additionalMessage) {\n" +
            "        Log.d(String.format(\"%s %s\", PREFIX, owner.getClass().getSimpleName()), String.format(\"[%s] %s\", additionalMessage.toUpperCase(), message));\n" +
            "    }\n" +
            "\n" +
            "    public static void error(Object owner, String message) {\n" +
            "        Log.e(String.format(\"%s %s\", ERROR_PREFIX, owner.getClass().getSimpleName()), message);\n" +
            "    }\n" +
            "\n" +
            "    public static void error(Object owner, String message, String additionalMessage) {\n" +
            "        Log.e(String.format(\"%s %s\", ERROR_PREFIX, owner.getClass().getSimpleName()), String.format(\"[%s] %s\", additionalMessage.toUpperCase(), message));\n" +
            "    }";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
