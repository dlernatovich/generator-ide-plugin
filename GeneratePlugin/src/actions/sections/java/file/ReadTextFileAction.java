package actions.sections.java.file;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 11/27/14.
 */
public class ReadTextFileAction extends BaseAction {
    private final String CODE = " /**\n" +
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

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
