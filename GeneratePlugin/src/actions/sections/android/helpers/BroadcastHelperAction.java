package actions.sections.android.helpers;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class BroadcastHelperAction extends BaseAction {

    private final String CODE = "/**\n" +
            "     * Method which provide the sending the broadcast event for subscribing object\n" +
            "     *\n" +
            "     * @param context      current context\n" +
            "     * @param intentFilter value that allow apply the intent filter and put extra for intent\n" +
            "     * @param bundleValue  extra value for the intent\n" +
            "     */\n" +
            "    public static void sendBroadcastWithExtra(Context context, String intentFilter, String bundleValue) {\n" +
            "        Intent intent = new Intent(intentFilter);\n" +
            "        intent.putExtra(intentFilter, bundleValue);\n" +
            "        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the sending the broadcast event for subscribing object\n" +
            "     *\n" +
            "     * @param context      current context\n" +
            "     * @param intentFilter value that allow apply the intent filter and put extra for intent\n" +
            "     */\n" +
            "    public static void sendBroadcast(Context context, String intentFilter) {\n" +
            "        Intent intent = new Intent(intentFilter);\n" +
            "        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);\n" +
            "    }";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
