package helpers;

import com.intellij.openapi.project.Project;
import ui.runtime.MainDialog;
import ui.views.BaseView;

import javax.swing.*;

/**
 * Created by dlernatovich on 11/28/14.
 */
public class DialogHelper {
    public static void createDialogFromView(final Project project, final BaseView baseView, final String title) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainDialog(project, baseView, title).show();
            }
        });
    }
}
