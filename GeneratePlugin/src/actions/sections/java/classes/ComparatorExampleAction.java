package actions.sections.java.classes;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class ComparatorExampleAction extends BaseAction {
    private final String CODE = "public class ReverseTaskComparator implements Comparator<Task> {\n" +
            " @Override\n" +
            " public int compare(Task task, Task task1) {\n" +
            " if (task.getPriority() < task1.getPriority()) {\n" +
            " return 1;\n" +
            " } else if (task.getPriority() == task1.getPriority()) {\n" +
            " return 0;\n" +
            " } else {\n" +
            " return -1;\n" +
            " }\n" +
            " }\n" +
            "}";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
