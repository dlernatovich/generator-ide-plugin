package actions.sections.java.file;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 11/28/14.
 */
public class WriteObjectAction extends BaseAction {

    private String CODE = "/**\n" +
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
        writeCode(e, CODE);
    }
}
