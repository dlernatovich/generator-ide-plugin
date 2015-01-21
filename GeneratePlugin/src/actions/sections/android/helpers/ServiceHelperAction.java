package actions.sections.android.helpers;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class ServiceHelperAction extends BaseAction {

    private final String CODE = "/**\n" +
            "     * Method which provide the checking if Service is already running\n" +
            "     *\n" +
            "     * @param context      current context\n" +
            "     * @param serviceClass current service class\n" +
            "     * @return result\n" +
            "     */\n" +
            "    private static boolean isMyServiceRunning(Context context, Class<?> serviceClass) {\n" +
            "        ActivityManager manager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);\n" +
            "        for (ActivityManager.RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE)) {\n" +
            "            if (serviceClass.getName().equals(service.service.getClassName())) {\n" +
            "                return true;\n" +
            "            }\n" +
            "        }\n" +
            "        return false;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the service starting\n" +
            "     *\n" +
            "     * @param context      current context\n" +
            "     * @param serviceClass current service class\n" +
            "     */\n" +
            "    public static void startService(Context context, Class<?> serviceClass) {\n" +
            "        if (!isMyServiceRunning(context, serviceClass)) {\n" +
            "            context.startService(new Intent(context, serviceClass));\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the service starting\n" +
            "     *\n" +
            "     * @param context      current context\n" +
            "     * @param serviceClass current service class\n" +
            "     * @param intent       current intent\n" +
            "     */\n" +
            "    public static void startService(Context context, Class<?> serviceClass, Intent intent) {\n" +
            "        if (!isMyServiceRunning(context, serviceClass)) {\n" +
            "            context.startService(intent);\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the service stopping\n" +
            "     *\n" +
            "     * @param context      current context\n" +
            "     * @param serviceClass current service class\n" +
            "     */\n" +
            "    public static void stopService(Context context, Class<?> serviceClass) {\n" +
            "        if (isMyServiceRunning(context, serviceClass)) {\n" +
            "            context.stopService(new Intent(context, serviceClass));\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the service stopping\n" +
            "     *\n" +
            "     * @param context      current context\n" +
            "     * @param serviceClass current service class\n" +
            "     * @param intent       current intent\n" +
            "     */\n" +
            "    public static void stopService(Context context, Class<?> serviceClass, Intent intent) {\n" +
            "        if (isMyServiceRunning(context, serviceClass)) {\n" +
            "            context.stopService(intent);\n" +
            "        }\n" +
            "    }";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
