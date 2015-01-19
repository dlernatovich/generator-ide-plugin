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
            "    }";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
