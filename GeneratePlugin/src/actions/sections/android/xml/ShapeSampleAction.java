package actions.sections.android.xml;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class ShapeSampleAction extends BaseAction {

    private final String CODE = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<selector xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
            "\n" +
            "    <item>\n" +
            "        <shape>\n" +
            "            <solid android:color=\"@android:color/darker_gray\" />\n" +
            "            <stroke android:width=\"3dp\" android:color=\"@android:color/darker_gray\" />\n" +
            "            <corners android:radius=\"10dp\" />\n" +
            "            <padding android:bottom=\"10dp\" android:left=\"10dp\" android:right=\"10dp\" android:top=\"10dp\" />\n" +
            "        </shape>\n" +
            "    </item>\n" +
            "\n" +
            "</selector>\n";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
