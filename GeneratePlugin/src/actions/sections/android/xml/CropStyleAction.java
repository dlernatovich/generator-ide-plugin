package actions.sections.android.xml;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class CropStyleAction extends BaseAction {

    private final String CODE = "<!--Set image to android:src instead of android:background-->\n" +
            "    <style name=\"styleCropImageCenter\">\n" +
            "        <item name=\"android:layout_width\">wrap_content</item>\n" +
            "        <item name=\"android:layout_height\">wrap_content</item>\n" +
            "        <item name=\"android:gravity\">center</item>\n" +
            "        <item name=\"android:scaleType\">fitCenter</item>\n" +
            "        <item name=\"android:adjustViewBounds\">true</item>\n" +
            "    </style>";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
