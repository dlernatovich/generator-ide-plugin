package actions.sections.android.view;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class BaseViewAction extends BaseAction {

    private final String CODE = "protected View baseView;\n" +
            "\n" +
            "    public BaseView(Context context) {\n" +
            "        super(context);\n" +
            "        onInitializeView(context);\n" +
            "    }\n" +
            "\n" +
            "    public BaseView(Context context, AttributeSet attrs) {\n" +
            "        super(context, attrs);\n" +
            "        onInitializeView(context);\n" +
            "    }\n" +
            "\n" +
            "    public BaseView(Context context, AttributeSet attrs, int defStyleAttr) {\n" +
            "        super(context, attrs, defStyleAttr);\n" +
            "        onInitializeView(context);\n" +
            "    }\n" +
            "\n" +
            "    private void onInitializeView(Context context) {\n" +
            "        inflateView(context, getLayoutId());\n" +
            "        if (baseView != null) {\n" +
            "            ButterKnife.inject(this, baseView);\n" +
            "        }\n" +
            "\n" +
            "        onCreateView();\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the inflating of the view\n" +
            "     *\n" +
            "     * @param context  current context\n" +
            "     * @param layoutID layout id\n" +
            "     */\n" +
            "    private void inflateView(Context context, int layoutID) {\n" +
            "        LayoutInflater inflater = LayoutInflater.from(context);\n" +
            "        baseView = inflater.inflate(layoutID, this);\n" +
            "    }\n" +
            "\n" +
            "    protected abstract int getLayoutId();\n" +
            "\n" +
            "    protected abstract void onCreateView();\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide starting the Activity\n" +
            "     *\n" +
            "     * @param activtyClass activity which should be starting\n" +
            "     */\n" +
            "    protected void startActivity(Class activtyClass) {\n" +
            "        getContext().startActivity(new Intent(getContext(), activtyClass));\n" +
            "    }\n" +
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
            "    @Override\n" +
            "    public void onClick(View v) {\n" +
            "\n" +
            "    }";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
