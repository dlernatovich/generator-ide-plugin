package actions.sections.java.file;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import helpers.EditorModifyHelper;

/**
 * Created by dlernatovich on 11/28/14.
 */
public class WriteObjectAction extends AnAction {

    private final String CODE = "/**\n" +
            "     * Method which provide to write object inside the file\n" +
            "     * @param o\n" +
            "     * @param filePath\n" +
            "     * @throws IOException\n" +
            "     */\n" +
            "     private void writeObjectToFile(Object o, String filePath) throws IOException {\n" +
            "         File serverFile = new File(filePath);\n" +
            "         FileOutputStream fileOutputStream = new FileOutputStream(serverFile);\n" +
            "         ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);\n" +
            "         objectOutputStream.writeObject(o);\n" +
            "         objectOutputStream.close();\n" +
            "         fileOutputStream.close();\n" +
            "     }";


    @Override
    public void actionPerformed(AnActionEvent e) {
        Project project = e.getProject();
        EditorModifyHelper.writeCode(project, CODE);
    }
}
