package actions.sections.android.async;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class RepititiveAction extends BaseAction {
    private final String CODE = "private final static int INTERVAL = 1000 * 60 * 2; //2 minutes\n" +
            "    Handler mHandler;\n" +
            "\n" +
            "    Runnable mHandlerTask = new Runnable()\n" +
            "    {\n" +
            "        @Override\n" +
            "        public void run() {\n" +
            "            doSomething();\n" +
            "            mHandler.postDelayed(mHandlerTask, INTERVAL);\n" +
            "        }\n" +
            "    };\n" +
            "\n" +
            "    void startRepeatingTask()\n" +
            "    {\n" +
            "        mHandlerTask.run();\n" +
            "    }\n" +
            "\n" +
            "    void stopRepeatingTask()\n" +
            "    {\n" +
            "        mHandler.removeCallbacks(mHandlerTask);\n" +
            "    }\n" +
            "    \n" +
            "    private void doSomething(){\n" +
            "        \n" +
            "    }";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
