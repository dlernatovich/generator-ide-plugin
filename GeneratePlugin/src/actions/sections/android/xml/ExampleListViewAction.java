package actions.sections.android.xml;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class ExampleListViewAction extends BaseAction {
    private final String CODE = "<ListView\n" +
            " android:id=\"@+id/topicList\"\n" +
            " android:layout_below=\"@id/tmp_header1\"\n" +
            " android:layout_width=\"fill_parent\"\n" +
            " android:layout_height=\"fill_parent\"\n" +
            " android:cacheColorHint=\"#00000000\"\n" +
            " android:divider=\"@drawable/devider_private_cabinet\"\n" +
            " android:dividerHeight=\"1px\"\n" +
            " />";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
