package actions.sections.android.helpers;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class SharedPrefaranceHelperAction extends BaseAction {

    private final String CODE = "public static final String SHARED_PREFERENCE_NAME = \"SHARED_PREFERENCE_NAME\";\n" +
            "    public static final String REQUEST_SHARED_VALUE = \"REQUEST_SHARED_VALUE\";\n" +
            "    public static final String SURVEY_SHARED_VALUE = \"SURVEY_SHARED_VALUE\";\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the saving of the String value to the SharedPreferences\n" +
            "     *\n" +
            "     * @param context current context\n" +
            "     * @param object  current String value\n" +
            "     * @param ID      SharedPreferences key\n" +
            "     */\n" +
            "    public static void writeStringByID(Context context, String object, String ID) {\n" +
            "        SharedPreferences settings = context.getSharedPreferences(SHARED_PREFERENCE_NAME, 0);\n" +
            "        SharedPreferences.Editor editor = settings.edit();\n" +
            "        editor.putString(ID, object);\n" +
            "        editor.commit();\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the getting of the the String value by key\n" +
            "     *\n" +
            "     * @param context current context\n" +
            "     * @param ID      key ID\n" +
            "     * @return current String\n" +
            "     */\n" +
            "    public static String getStringByID(Context context, String ID) {\n" +
            "        SharedPreferences settings = context.getSharedPreferences(SHARED_PREFERENCE_NAME, 0);\n" +
            "        String value = settings.getString(ID, null);\n" +
            "        return value;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide to save the Request list to SharedPreferences\n" +
            "     *\n" +
            "     * @param context   current context\n" +
            "     * @param orderList Requests list\n" +
            "     */\n" +
            "    public static void saveRequests(Context context, List<Request> orderList) {\n" +
            "        Type listOfTestObject = new TypeToken<List<Request>>() {\n" +
            "        }.getType();\n" +
            "        if (orderList != null) {\n" +
            "            String s = GsonHelper.toString(orderList, listOfTestObject);\n" +
            "            SharedPreferenceHelper.writeStringByID(context, s, REQUEST_SHARED_VALUE);\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide to get the Request list from SharedPreferences\n" +
            "     *\n" +
            "     * @param context current context\n" +
            "     * @return list of Requests\n" +
            "     */\n" +
            "    public static List<Request> getRequests(Context context) {\n" +
            "        List<Request> orderList = new ArrayList<>();\n" +
            "        Type listOfTestObject = new TypeToken<List<Request>>() {\n" +
            "        }.getType();\n" +
            "        String value = SharedPreferenceHelper.getStringByID(context, REQUEST_SHARED_VALUE);\n" +
            "        if (value != null) {\n" +
            "            List<Request> orders = (List<Request>) GsonHelper.fromString(value, listOfTestObject);\n" +
            "            if (orders != null) {\n" +
            "                orderList.addAll(orders);\n" +
            "            }\n" +
            "        }\n" +
            "        return orderList;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide to save the Survey list to SharedPreferences\n" +
            "     *\n" +
            "     * @param context   current context\n" +
            "     * @param list Survey list\n" +
            "     */\n" +
            "    public static void saveSyrveys(Context context, List<Survey> list) {\n" +
            "        Type listOfTestObject = new TypeToken<List<Survey>>() {\n" +
            "        }.getType();\n" +
            "        if (list != null) {\n" +
            "            String s = GsonHelper.toString(list, listOfTestObject);\n" +
            "            SharedPreferenceHelper.writeStringByID(context, s, SURVEY_SHARED_VALUE);\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide to get the Survey list from SharedPreferences\n" +
            "     *\n" +
            "     * @param context current context\n" +
            "     * @return list of Survey\n" +
            "     */\n" +
            "    public static List<Survey> getSurveys(Context context) {\n" +
            "        List<Survey> orderList = new ArrayList<>();\n" +
            "        Type listOfTestObject = new TypeToken<List<Survey>>() {\n" +
            "        }.getType();\n" +
            "        String value = SharedPreferenceHelper.getStringByID(context, SURVEY_SHARED_VALUE);\n" +
            "        if (value != null) {\n" +
            "            List<Survey> orders = (List<Survey>) GsonHelper.fromString(value, listOfTestObject);\n" +
            "            if (orders != null) {\n" +
            "                orderList.addAll(orders);\n" +
            "            }\n" +
            "        }\n" +
            "        return orderList;\n" +
            "    }";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
