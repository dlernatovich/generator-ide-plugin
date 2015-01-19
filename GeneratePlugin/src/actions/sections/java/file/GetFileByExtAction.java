package actions.sections.java.file;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class GetFileByExtAction extends BaseAction {

    private final String CODE = "/**\n" +
            " * Use for this common-io library\n" +
            " */\n" +
            "File projectRootDir = new File(project.getBasePath());\n" +
            "String[] extensions = new String[]{\"txt\",@<#Your extension#>};\n" +
            "List<File> files = (List<File>) FileUtils.listFiles(projectRootDir, extensions, true);";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
