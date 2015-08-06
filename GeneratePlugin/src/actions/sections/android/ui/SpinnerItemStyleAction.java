package actions.sections.android.ui;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class SpinnerItemStyleAction extends BaseAction {

    private final String CODE = "" +
            "=====================Inside your theme==================" +
            "<item name=\"android:spinnerItemStyle\">@style/yourStyleForSpinnerItem</item>\n" +
            "        <item name=\"android:spinnerDropDownItemStyle\">@style/spinnerDropDownItemStyle</item>" +
            "" +
            "=====================Styles=============================" +
            " <style name=\"yourStyleForSpinnerItem\" parent=\"Widget.AppCompat.TextView.SpinnerItem\">\n" +
            "        <item name=\"android:textSize\">15sp</item>\n" +
            "        <item name=\"android:textAllCaps\">false</item>\n" +
            "        <item name=\"android:gravity\">center</item>\n" +
            "    </style>\n" +
            "\n" +
            "    <style name=\"spinnerDropDownItemStyle\" parent=\"TextAppearance.AppCompat.Widget.DropDownItem\">\n" +
            "        <item name=\"android:textSize\">15sp</item>\n" +
            "        <item name=\"android:textAllCaps\">false</item>\n" +
            "        <item name=\"android:gravity\">center</item>\n" +
            "    </style>";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
