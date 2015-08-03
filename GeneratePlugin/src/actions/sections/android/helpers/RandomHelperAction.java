package actions.sections.android.helpers;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class RandomHelperAction extends BaseAction {

    private final String CODE = "private static final int MIN_VALUE = 0;\n" +
            "    private static final int MAX_VALUE = 900000;\n" +
            "    private static final String ALPHABET = \"QWERTYUIOP{}ASDFGHJKL:|ZXCVBNM<>?qwertyuiop[]asdfghjkl;'zxcvbnm,./1234567890-=+_\";\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the generating of the random integer value\n" +
            "     *\n" +
            "     * @return current random integer value\n" +
            "     */\n" +
            "    public static int generateRandomInteger() {\n" +
            "        Random rand = new Random();\n" +
            "        int randomNum = rand.nextInt((MAX_VALUE - MIN_VALUE) + 1) + MIN_VALUE;\n" +
            "        return randomNum;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the generating of the random String value with length\n" +
            "     *\n" +
            "     * @param length current random string length\n" +
            "     * @return generated String value\n" +
            "     */\n" +
            "    public static String generateRandomString(int length) {\n" +
            "        char[] chars = ALPHABET.toCharArray();\n" +
            "        StringBuilder sb = new StringBuilder();\n" +
            "        Random random = new Random();\n" +
            "        for (int i = 0; i < length; i++) {\n" +
            "            char c = chars[random.nextInt(chars.length)];\n" +
            "            sb.append(c);\n" +
            "        }\n" +
            "        String output = sb.toString();\n" +
            "        return output;\n" +
            "    }";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
