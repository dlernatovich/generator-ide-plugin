package actions.sections.java.arrays;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class ArrayFilterAction extends BaseAction {

    private final String CODE = "/**\n" +
            "     * Method which provide the applying the filter for the\n" +
            "     * current list\n" +
            "     *\n" +
            "     * @param list current list\n" +
            "     * @param k    filter value\n" +
            "     * @return filtered list\n" +
            "     */\n" +
            "    public List<T> applyFilter(List<T> list, K k) {\n" +
            "        List<T> sortedList = new ArrayList<>();\n" +
            "        for (T t : list) {\n" +
            "            if (compare(t, k)) {\n" +
            "                sortedList.add(t);\n" +
            "            }\n" +
            "        }\n" +
            "        return sortedList;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the comparing\n" +
            "     * of the element\n" +
            "     *\n" +
            "     * @param t comparing object\n" +
            "     * @param k filter value\n" +
            "     * @return\n" +
            "     */\n" +
            "    public abstract boolean compare(T t, K k);";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
