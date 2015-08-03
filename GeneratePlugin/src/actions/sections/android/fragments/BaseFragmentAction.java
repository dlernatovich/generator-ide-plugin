package actions.sections.android.fragments;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class BaseFragmentAction extends BaseAction {

    private final String CODE = "protected View containerView;\n" +
            "\n" +
            "    public BaseFragment() {\n" +
            "    }\n" +
            "\n" +
            "\n" +
            "    @Override\n" +
            "    public View onCreateView(LayoutInflater inflater, ViewGroup container,\n" +
            "                             Bundle savedInstanceState) {\n" +
            "        containerView = inflater.inflate(getLayoutId(), container, false);\n" +
            "        ButterKnife.inject(this, containerView);\n" +
            "        onCreateFragment(containerView);\n" +
            "        return containerView;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the getting of the current layout ID\n" +
            "     *\n" +
            "     * @return current layout ID\n" +
            "     */\n" +
            "    protected abstract int getLayoutId();\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the action when fragment is created\n" +
            "     *\n" +
            "     * @param containerView current view\n" +
            "     */\n" +
            "    protected abstract void onCreateFragment(View containerView);\n" +
            "\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the setting of the OnClickListener\n" +
            "     *\n" +
            "     * @param views current list of Views\n" +
            "     */\n" +
            "    protected void setOnClickListeners(View... views) {\n" +
            "        for (View view : views) {\n" +
            "            view.setOnClickListener(this);\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the action for the OnClickListener event\n" +
            "     *\n" +
            "     * @param v current view\n" +
            "     */\n" +
            "    @Override\n" +
            "    public void onClick(View v) {\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide starting the Activity\n" +
            "     *\n" +
            "     * @param activtyClass activity which should be starting\n" +
            "     */\n" +
            "    protected void startActivity(Class activtyClass) {\n" +
            "        getActivity().startActivity(new Intent(getActivity(), activtyClass));\n" +
            "    }";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
