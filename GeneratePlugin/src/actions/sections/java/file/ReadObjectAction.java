package actions.sections.java.file;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import helpers.EditorModifyHelper;

/**
 * Created by dlernatovich on 11/28/14.
 */
public class ReadObjectAction extends AnAction {

    private final String CODE = "/**\n" +
            "     * Method which provide read object from file\n" +
            "     * @param filePath\n" +
            "     * @return\n" +
            "     * @throws IOException\n" +
            "     * @throws ClassNotFoundException\n" +
            "     */\n" +
            "    private Object readObjectFromFile(String filePath) throws IOException, ClassNotFoundException {\n" +
            "        Object o;\n" +
            "        File serverFile = new File(filePath);\n" +
            "        FileInputStream fileInputStream = new FileInputStream(serverFile);\n" +
            "        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);\n" +
            "        o = objectInputStream.readObject();\n" +
            "        objectInputStream.close();\n" +
            "        fileInputStream.close();\n" +
            "        return o;\n" +
            "    }";

    @Override
    public void actionPerformed(AnActionEvent e) {
        Project project = e.getProject();
        EditorModifyHelper.writeCode(project, CODE);
    }
}
