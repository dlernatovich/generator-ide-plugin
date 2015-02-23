package actions.sections.android.helpers;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class BadgerHelperAction extends BaseAction {

    private final String CODE = "/**\n" +
            "     * Show badge on view\n" +
            "     *\n" +
            "     * @param activity current activity\n" +
            "     * @param view     current view\n" +
            "     * @param value    text value\n" +
            "     */\n" +
            "    public static BadgeView showBadge(Activity activity, View view, String value) {\n" +
            "        BadgeView badge = new BadgeView(activity, view);\n" +
            "        badge.setText(value);\n" +
            "        badge.show();\n" +
            "        return badge;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Show badge on view\n" +
            "     *\n" +
            "     * @param activity current activity\n" +
            "     * @param view     current view\n" +
            "     * @param value    text value\n" +
            "     * @param color    background color\n" +
            "     */\n" +
            "    public static BadgeView showBadge(Activity activity, View view, String value, int color) {\n" +
            "        BadgeView badge = new BadgeView(activity, view);\n" +
            "        badge.setText(value);\n" +
            "        badge.setBadgeBackgroundColor(color);\n" +
            "        badge.show();\n" +
            "        return badge;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Show badge on view\n" +
            "     *\n" +
            "     * @param activity current activity\n" +
            "     * @param view     current view\n" +
            "     * @param value    text value\n" +
            "     * @param color    background color\n" +
            "     * @param position badge position (should be: BadgeView.POSITION_CENTER etc)\n" +
            "     */\n" +
            "    public static BadgeView showBadge(Activity activity, View view, String value, int color, int position) {\n" +
            "        BadgeView badge = new BadgeView(activity, view);\n" +
            "        badge.setText(value);\n" +
            "        badge.setBadgeBackgroundColor(color);\n" +
            "        badge.setBadgePosition(position);\n" +
            "        badge.show();\n" +
            "        return badge;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Show badge on view\n" +
            "     *\n" +
            "     * @param activity current activity\n" +
            "     * @param view     current view\n" +
            "     * @param value    text value\n" +
            "     * @param color    background color\n" +
            "     * @param position badge position (should be: BadgeView.POSITION_CENTER etc)\n" +
            "     * @param textSize text size\n" +
            "     */\n" +
            "    public static BadgeView showBadge(Activity activity, View view, String value, int color, int position, int textSize) {\n" +
            "        BadgeView badge = new BadgeView(activity, view);\n" +
            "        badge.setText(value);\n" +
            "        badge.setBadgeBackgroundColor(color);\n" +
            "        badge.setBadgePosition(position);\n" +
            "        badge.setTextSize(textSize);\n" +
            "        badge.show();\n" +
            "        return badge;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Show badge on view\n" +
            "     *\n" +
            "     * @param activity current activity\n" +
            "     * @param view     current view\n" +
            "     * @param color    background color\n" +
            "     * @param position badge position (should be: BadgeView.POSITION_CENTER etc)\n" +
            "     * @param textSize text size\n" +
            "     */\n" +
            "    public static BadgeView showBadge(Activity activity, View view, int color, int position, int textSize) {\n" +
            "        BadgeView badge = new BadgeView(activity, view);\n" +
            "        badge.setBadgeBackgroundColor(color);\n" +
            "        badge.setBadgePosition(position);\n" +
            "        badge.setTextSize(textSize);\n" +
            "        badge.show();\n" +
            "        return badge;\n" +
            "    }";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
