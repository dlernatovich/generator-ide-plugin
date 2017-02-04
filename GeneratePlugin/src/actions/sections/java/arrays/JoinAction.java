package actions.sections.java.arrays;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class JoinAction extends BaseAction {

    private final String CODE = "/**\n" +
            "     * Class which provide the getting of the required field value that will\n" +
            "     * be using for delimitering\n" +
            "     *\n" +
            "     * @param <T> object type\n" +
            "     */\n" +
            "    public interface OnJoinCallback<T extends Object> {\n" +
            "        String getField(final T object);\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the joining of the objects by delimiter\n" +
            "     *\n" +
            "     * @param objects   list of objects\n" +
            "     * @param delimiter delimiter value\n" +
            "     * @param callback  instance of {@link OnJoinCallback}\n" +
            "     * @param <T>       object type\n" +
            "     * @return joined value\n" +
            "     */\n" +
            "    public static <T extends Object> String join(final Collection<T> objects,\n" +
            "                                                 final String delimiter,\n" +
            "                                                 final OnJoinCallback<T> callback) {\n" +
            "        final StringBuilder builder = new StringBuilder(\"\");\n" +
            "        final List<String> results = new ArrayList<>();\n" +
            "\n" +
            "        if ((objects != null) && (!objects.isEmpty())) {\n" +
            "            for (final T object : objects) {\n" +
            "                if (object != null) {\n" +
            "                    final String value = callback.getField(object);\n" +
            "                    if ((value != null) && (!value.isEmpty())) {\n" +
            "                        results.add(value);\n" +
            "                    }\n" +
            "                }\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "        if ((results != null) && (!results.isEmpty())) {\n" +
            "            builder.append(join(results, delimiter));\n" +
            "        }\n" +
            "\n" +
            "        return builder.toString();\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the joining of the objects ({@link String}) by delimiter\n" +
            "     *\n" +
            "     * @param objects   list of {@link String}\n" +
            "     * @param delimiter delimiter value\n" +
            "     * @return joined value\n" +
            "     */\n" +
            "    protected static String join(final Collection<String> objects,\n" +
            "                                 final String delimiter) {\n" +
            "        final String methodName = \"String join(objects, delimiter)\";\n" +
            "        final StringBuilder builder = new StringBuilder(\"\");\n" +
            "        if ((objects != null) && (!objects.isEmpty())) {\n" +
            "            final String[] strings = objects.toArray(new String[0]);\n" +
            "            final int length = strings.length - 1;\n" +
            "            for (int i = 0; i <= length; i++) {\n" +
            "                builder.append(strings[i]);\n" +
            "                if (i != length) {\n" +
            "                    builder.append(delimiter);\n" +
            "                }\n" +
            "            }\n" +
            "        }\n" +
            "        return builder.toString();\n" +
            "    }";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
