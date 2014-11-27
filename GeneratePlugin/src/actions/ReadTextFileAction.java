package actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import helpers.EditorModifyHelper;

/**
 * Created by dlernatovich on 11/27/14.
 */
public class ReadTextFileAction extends AnAction {
    private static final String CODE = " /**\n" +
            "     * Use the org.apache.commons.io utils for this method\n" +
            "     * @param file\n" +
            "     * @return\n" +
            "     */\n" +
            "    private String readTextFromFile(File file) {\n" +
            "        String text = null;\n" +
            "        try {\n" +
            "            FileInputStream inputStream = new FileInputStream(file);\n" +
            "            text = IOUtils.toString(inputStream);\n" +
            "        } catch (Exception ex) {\n" +
            "            System.out.println(ex.toString());\n" +
            "        }\n" +
            "        return text;\n" +
            "    }";

    @java.lang.Override
    public void actionPerformed(final AnActionEvent anActionEvent) {
        EditorModifyHelper.writeCode(anActionEvent.getProject(), CODE);
    }


}
