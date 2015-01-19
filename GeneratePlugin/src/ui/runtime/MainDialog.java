/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.runtime;

import callbacks.DialogActionCallback;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.FrameWrapper;
import ui.views.BaseView;

import java.awt.*;

/**
 * @author dlernatovich
 */
public class MainDialog extends FrameWrapper {
    private Window frame;

    public MainDialog(Project project, BaseView baseView, String title) {
        super(project);
        frame = this.getFrame();
        setTitle(title);
        init(baseView);
    }

    private void init(BaseView baseView) {
        frame.add(baseView);
        frame.pack();
        resizeDilog();
        frame.setLocationRelativeTo(null);

        baseView.setDialogActionCallback(new DialogActionCallback() {
            @Override
            public void show() {
                getInstance().show();
            }

            @Override
            public void hide() {
                getInstance().hide();
            }

            @Override
            public void close() {
                getInstance().dispose();
            }
        });
    }

    private MainDialog getInstance() {
        return this;
    }

    public void show() {
        frame.show();
    }

    public void hide() {
        frame.hide();
    }

    public void dispose() {
        frame.dispose();
    }

    /**
     * Method which provide the correctly resizing
     * dialog when one the UI component are hiding
     */
    private void resizeDilog() {
        Dimension dimension = new Dimension(640, getFrame().getHeight());
        getFrame().setMinimumSize(dimension);
        getFrame().setPreferredSize(dimension);
        getFrame().setSize(dimension);
    }
}
