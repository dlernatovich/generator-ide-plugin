package actions.sections.android.activity;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class BaseActivityAction extends BaseAction {

    private final String CODE = "public void add(Fragment fragment, int container_id) {\n" +
            "        getFragmentTransaction().add(container_id, fragment, getFTag())\n" +
            "                .commit();\n" +
            "    }\n" +
            "\n" +
            "    public void replace(Fragment fragment, int container_id) {\n" +
            "        getFragmentTransaction().replace(container_id, fragment,\n" +
            "                getFTag()).commit();\n" +
            "    }\n" +
            "\n" +
            "    public void addToBackStack(Fragment fragment, int container_id) {\n" +
            "        getFragmentTransaction()\n" +
            "                .add(container_id, fragment, getFTag())\n" +
            "                .addToBackStack(getFTag()).commit();\n" +
            "    }\n" +
            "\n" +
            "    public void replaceInBackStack(Fragment fragment, int container_id) {\n" +
            "        getFragmentTransaction()\n" +
            "                .replace(container_id, fragment, getFTag())\n" +
            "                .addToBackStack(getFTag()).commit();\n" +
            "    }\n" +
            "\n" +
            "    private FragmentTransaction getFragmentTransaction() {\n" +
            "        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();\n" +
            "        return ft;\n" +
            "    }\n" +
            "    \n" +
            "    private String getFTag() {\n" +
            "        return getClass().getName();\n" +
            "    }" +
            "" +
            "/**\n" +
            "     * Method which provide starting the Activity\n" +
            "     *\n" +
            "     * @param activtyClass activity which should be starting\n" +
            "     */\n" +
            "    protected void startActivity(Class activtyClass) {\n" +
            "        startActivity(new Intent(this, activtyClass));\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide starting the Service\n" +
            "     *\n" +
            "     * @param serviceClass service which should be starting\n" +
            "     */\n" +
            "    protected void startService(Class serviceClass) {\n" +
            "        if (!isMyServiceRunning(serviceClass)) {\n" +
            "            startService(new Intent(this, serviceClass));\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the service running checking\n" +
            "     *\n" +
            "     * @param serviceClass current service\n" +
            "     * @return checking results\n" +
            "     */\n" +
            "    private boolean isMyServiceRunning(Class<?> serviceClass) {\n" +
            "        ActivityManager manager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);\n" +
            "        for (ActivityManager.RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE)) {\n" +
            "            if (serviceClass.getName().equals(service.service.getClassName())) {\n" +
            "                return true;\n" +
            "            }\n" +
            "        }\n" +
            "        return false;\n" +
            "    }" +
            "" +
            "protected void setOnClickListener(View view) {\n" +
            "        view.setOnClickListener(this);\n" +
            "    }";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
