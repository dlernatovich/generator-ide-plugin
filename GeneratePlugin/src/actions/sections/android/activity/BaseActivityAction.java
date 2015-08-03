package actions.sections.android.activity;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class BaseActivityAction extends BaseAction {

    private final String CODE = "/**\n" +
            "     * Interface which provide the doing some action inside the Handler thread\n" +
            "     */\n" +
            "    protected interface OnActionPerformer {\n" +
            "        void onActionPerform();\n" +
            "    }\n" +
            "\n" +
            "    protected static final int NONE_MENU = Integer.MIN_VALUE;\n" +
            "    protected final Handler MAIN_THREAD_HANDLER = new Handler();\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(getLayoutId());\n" +
            "        ButterKnife.inject(this);\n" +
            "        onCreateActivity();\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public boolean onCreateOptionsMenu(Menu menu) {\n" +
            "        int menuId = getMenuId();\n" +
            "        if (menuId == NONE_MENU) {\n" +
            "            return false;\n" +
            "        }\n" +
            "        getMenuInflater().inflate(menuId, menu);\n" +
            "        return true;\n" +
            "    }\n" +
            "\n" +
            "\n" +
            "    /**\n" +
            "     * Overriden method for the OnClickListener\n" +
            "     *\n" +
            "     * @param v current view\n" +
            "     */\n" +
            "    @Override\n" +
            "    public void onClick(View v) {\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the replace of the fragment inside the activity\n" +
            "     *\n" +
            "     * @param fragment     current fragment\n" +
            "     * @param container_id current container id\n" +
            "     */\n" +
            "    public void replace(Fragment fragment, int container_id) {\n" +
            "        getFragmentTransaction().replace(container_id, fragment,\n" +
            "                getFragmentTag()).commit();\n" +
            "    }\n" +
            "\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the getting of the FragmentTransaction\n" +
            "     *\n" +
            "     * @return current FragmentTransaction\n" +
            "     */\n" +
            "    private FragmentTransaction getFragmentTransaction() {\n" +
            "        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();\n" +
            "        return ft;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the getting of the fragment tag\n" +
            "     *\n" +
            "     * @return current fragment Tag\n" +
            "     */\n" +
            "    private String getFragmentTag() {\n" +
            "        return getClass().getName();\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide starting the Activity\n" +
            "     *\n" +
            "     * @param activtyClass activity which should be starting\n" +
            "     */\n" +
            "    protected void startActivity(Class activtyClass) {\n" +
            "        startActivity(new Intent(this, activtyClass));\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide starting the Service\n" +
            "     *\n" +
            "     * @param serviceClass service which should be starting\n" +
            "     */\n" +
            "    protected void startService(Class serviceClass) {\n" +
            "        if (!isMyServiceRunning(serviceClass)) {\n" +
            "            startService(new Intent(this, serviceClass));\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the service running checking\n" +
            "     *\n" +
            "     * @param serviceClass current service\n" +
            "     * @return checking results\n" +
            "     */\n" +
            "    private boolean isMyServiceRunning(Class<?> serviceClass) {\n" +
            "        ActivityManager manager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);\n" +
            "        for (ActivityManager.RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE)) {\n" +
            "            if (serviceClass.getName().equals(service.service.getClassName())) {\n" +
            "                return true;\n" +
            "            }\n" +
            "        }\n" +
            "        return false;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the setting of the OnClickListener\n" +
            "     *\n" +
            "     * @param views current list of views\n" +
            "     */\n" +
            "    protected void setOnClickListeners(View... views) {\n" +
            "        for (View view : views) {\n" +
            "            view.setOnClickListener(this);\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the doing action on UI thread after the delaying time\n" +
            "     *\n" +
            "     * @param delayTime       delaying time (in seconds)\n" +
            "     * @param actionPerformer current action\n" +
            "     */\n" +
            "    protected void runOnMainThread(double delayTime, final OnActionPerformer actionPerformer) {\n" +
            "        MAIN_THREAD_HANDLER.postDelayed(new Runnable() {\n" +
            "            @Override\n" +
            "            public void run() {\n" +
            "                actionPerformer.onActionPerform();\n" +
            "            }\n" +
            "        }, (int) (delayTime * 1000));\n" +
            "    }\n" +
            "\n" +
            "    //==========================ABSTRACT METHODS==============================\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the getting of the layout ID for the current Activity\n" +
            "     *\n" +
            "     * @return layout ID for the current Activity\n" +
            "     */\n" +
            "    protected abstract int getLayoutId();\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the getting of the menu ID\n" +
            "     * (Can be as NONE_MENU)\n" +
            "     *\n" +
            "     * @return current menu ID\n" +
            "     */\n" +
            "    protected abstract int getMenuId();\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the action when Activity is created\n" +
            "     */\n" +
            "    protected abstract void onCreateActivity();\n" +
            "\n" +
            "    //TODO Example for the onOptionsItemSelected\n" +
            "    //    @Override\n" +
            "    //    public boolean onOptionsItemSelected(MenuItem item) {\n" +
            "    //        // Handle action bar item clicks here. The action bar will\n" +
            "    //        // automatically handle clicks on the Home/Up button, so long\n" +
            "    //        // as you specify a parent activity in AndroidManifest.xml.\n" +
            "    //        int id = item.getItemId();\n" +
            "    //\n" +
            "    //        //noinspection SimplifiableIfStatement\n" +
            "    //        if (id == R.id.action_settings) {\n" +
            "    //            return true;\n" +
            "    //        }\n" +
            "    //\n" +
            "    //        return super.onOptionsItemSelected(item);\n" +
            "    //    }";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
