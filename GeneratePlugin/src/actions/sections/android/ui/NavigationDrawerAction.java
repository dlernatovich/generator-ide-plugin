package actions.sections.android.ui;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class NavigationDrawerAction extends BaseAction {

    private final String CODE = "<android.support.v4.widget.DrawerLayout\n" +
            "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:id=\"@+id/drawer_layout\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\">\n" +
            "    <!-- The main content view -->\n" +
            "    <FrameLayout\n" +
            "        android:id=\"@+id/content_frame\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"match_parent\" />\n" +
            "    <!-- The navigation drawer -->\n" +
            "    <ListView android:id=\"@+id/left_drawer\"\n" +
            "        android:layout_width=\"240dp\"\n" +
            "        android:layout_height=\"match_parent\"\n" +
            "        android:layout_gravity=\"start\"\n" +
            "        android:choiceMode=\"singleChoice\"\n" +
            "        android:divider=\"@android:color/transparent\"\n" +
            "        android:dividerHeight=\"0dp\"\n" +
            "        android:background=\"#111\"/>\n" +
            "</android.support.v4.widget.DrawerLayout>";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
