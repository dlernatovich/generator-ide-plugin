package actions.sections.android.helpers;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class NotificationHelperAction extends BaseAction {

    private final String CODE = "private static final int NOTIFICATION_ID = 0x1;\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the show notification from the activity\n" +
            "     *\n" +
            "     * @param currentActivity  current activity\n" +
            "     * @param anotherActivity  activity which should open when tap on notification\n" +
            "     * @param notificationIcon notification icon\n" +
            "     * @param largeIcon        large notification icon\n" +
            "     * @param title            notification title\n" +
            "     * @param contentText      notification text\n" +
            "     * @param subtext          notification subtext\n" +
            "     */\n" +
            "    public static void showNotification(Activity currentActivity,\n" +
            "                                        Class anotherActivity,\n" +
            "                                        int notificationIcon,\n" +
            "                                        int largeIcon,\n" +
            "                                        String title,\n" +
            "                                        String contentText,\n" +
            "                                        String subtext) {\n" +
            "\n" +
            "        //Build the intent\n" +
            "        Intent intent = new Intent(currentActivity, anotherActivity);\n" +
            "        PendingIntent pendingIntent = PendingIntent.getActivity(currentActivity, 0, intent, 0);\n" +
            "\n" +
            "        //Create notification builder\n" +
            "        NotificationCompat.Builder builder = new NotificationCompat.Builder(currentActivity);\n" +
            "        builder.setSmallIcon(notificationIcon);\n" +
            "        builder.setContentIntent(pendingIntent);\n" +
            "        builder.setAutoCancel(true);\n" +
            "        builder.setLargeIcon(BitmapFactory.decodeResource(currentActivity.getResources(), largeIcon));\n" +
            "        builder.setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION));\n" +
            "\n" +
            "        //Set texts to notification\n" +
            "        builder.setContentTitle(title);\n" +
            "        builder.setContentText(contentText);\n" +
            "        builder.setSubText(subtext);\n" +
            "\n" +
            "        //Show the notification\n" +
            "        NotificationManager notificationManager = (NotificationManager) currentActivity.getSystemService(\n" +
            "                Activity.NOTIFICATION_SERVICE);\n" +
            "        notificationManager.notify(NOTIFICATION_ID, builder.build());\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the show notification from the activity\n" +
            "     *\n" +
            "     * @param currentActivity  current activity\n" +
            "     * @param anotherActivity  activity which should open when tap on notification\n" +
            "     * @param notificationIcon notification icon\n" +
            "     * @param title            notification title\n" +
            "     * @param contentText      notification text\n" +
            "     * @param subtext          notification subtext\n" +
            "     */\n" +
            "    public static void showNotification(Activity currentActivity,\n" +
            "                                        Class anotherActivity,\n" +
            "                                        int notificationIcon,\n" +
            "                                        String title,\n" +
            "                                        String contentText,\n" +
            "                                        String subtext) {\n" +
            "\n" +
            "        //Build the intent\n" +
            "        Intent intent = new Intent(currentActivity, anotherActivity);\n" +
            "        PendingIntent pendingIntent = PendingIntent.getActivity(currentActivity, 0, intent, 0);\n" +
            "\n" +
            "        //Create notification builder\n" +
            "        NotificationCompat.Builder builder = new NotificationCompat.Builder(currentActivity);\n" +
            "        builder.setSmallIcon(notificationIcon);\n" +
            "        builder.setContentIntent(pendingIntent);\n" +
            "        builder.setAutoCancel(true);\n" +
            "        builder.setLargeIcon(BitmapFactory.decodeResource(currentActivity.getResources(), notificationIcon));\n" +
            "        builder.setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION));\n" +
            "\n" +
            "        //Set texts to notification\n" +
            "        builder.setContentTitle(title);\n" +
            "        builder.setContentText(contentText);\n" +
            "        builder.setSubText(subtext);\n" +
            "\n" +
            "        //Show the notification\n" +
            "        NotificationManager notificationManager = (NotificationManager) currentActivity.getSystemService(\n" +
            "                Activity.NOTIFICATION_SERVICE);\n" +
            "        notificationManager.notify(NOTIFICATION_ID, builder.build());\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the show notification from the activity\n" +
            "     *\n" +
            "     * @param currentActivity current activity\n" +
            "     * @param anotherActivity activity which should open when tap on notification\n" +
            "     * @param title           notification title\n" +
            "     * @param contentText     notification text\n" +
            "     * @param subtext         notification subtext\n" +
            "     */\n" +
            "    public static void showNotification(Activity currentActivity,\n" +
            "                                        Class anotherActivity,\n" +
            "                                        String title,\n" +
            "                                        String contentText,\n" +
            "                                        String subtext) {\n" +
            "\n" +
            "        //Get current application icon ID\n" +
            "        int appIcon = currentActivity.getApplication().getApplicationInfo().icon;\n" +
            "\n" +
            "        //Build the intent\n" +
            "        Intent intent = new Intent(currentActivity, anotherActivity);\n" +
            "        PendingIntent pendingIntent = PendingIntent.getActivity(currentActivity, 0, intent, 0);\n" +
            "\n" +
            "        //Create notification builder\n" +
            "        NotificationCompat.Builder builder = new NotificationCompat.Builder(currentActivity);\n" +
            "        builder.setSmallIcon(appIcon);\n" +
            "        builder.setContentIntent(pendingIntent);\n" +
            "        builder.setAutoCancel(true);\n" +
            "        builder.setLargeIcon(BitmapFactory.decodeResource(currentActivity.getResources(), appIcon));\n" +
            "        builder.setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION));\n" +
            "\n" +
            "        //Set texts to notification\n" +
            "        builder.setContentTitle(title);\n" +
            "        builder.setContentText(contentText);\n" +
            "        builder.setSubText(subtext);\n" +
            "\n" +
            "        //Show the notification\n" +
            "        NotificationManager notificationManager = (NotificationManager) currentActivity.getSystemService(\n" +
            "                Activity.NOTIFICATION_SERVICE);\n" +
            "        notificationManager.notify(NOTIFICATION_ID, builder.build());\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the show notification from the activity\n" +
            "     *\n" +
            "     * @param currentActivity current activity\n" +
            "     * @param anotherActivity activity which should open when tap on notification\n" +
            "     * @param title           notification title\n" +
            "     * @param contentText     notification text\n" +
            "     */\n" +
            "    public static void showNotification(Activity currentActivity,\n" +
            "                                        Class anotherActivity,\n" +
            "                                        String title,\n" +
            "                                        String contentText) {\n" +
            "\n" +
            "        //Get current application icon ID\n" +
            "        int appIcon = currentActivity.getApplication().getApplicationInfo().icon;\n" +
            "\n" +
            "        //Build the intent\n" +
            "        Intent intent = new Intent(currentActivity, anotherActivity);\n" +
            "        PendingIntent pendingIntent = PendingIntent.getActivity(currentActivity, 0, intent, 0);\n" +
            "\n" +
            "        //Create notification builder\n" +
            "        NotificationCompat.Builder builder = new NotificationCompat.Builder(currentActivity);\n" +
            "        builder.setSmallIcon(appIcon);\n" +
            "        builder.setContentIntent(pendingIntent);\n" +
            "        builder.setAutoCancel(true);\n" +
            "        builder.setLargeIcon(BitmapFactory.decodeResource(currentActivity.getResources(), appIcon));\n" +
            "        builder.setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION));\n" +
            "\n" +
            "        //Set texts to notification\n" +
            "        builder.setContentTitle(title);\n" +
            "        builder.setContentText(contentText);\n" +
            "\n" +
            "        //Show the notification\n" +
            "        NotificationManager notificationManager = (NotificationManager) currentActivity.getSystemService(\n" +
            "                Activity.NOTIFICATION_SERVICE);\n" +
            "        notificationManager.notify(NOTIFICATION_ID, builder.build());\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the show notification from the activity\n" +
            "     *\n" +
            "     * @param currentActivity current activity\n" +
            "     * @param anotherActivity activity which should open when tap on notification\n" +
            "     * @param title           notification title\n" +
            "     * @param contentText     notification text\n" +
            "     */\n" +
            "    public static void showNotification(Context currentActivity,\n" +
            "                                        Class anotherActivity,\n" +
            "                                        int appIcon,\n" +
            "                                        String title,\n" +
            "                                        String contentText) {\n" +
            "\n" +
            "        //Get current application icon ID\n" +
            "\n" +
            "        //Build the intent\n" +
            "        Intent intent = new Intent(currentActivity, anotherActivity);\n" +
            "        PendingIntent pendingIntent = PendingIntent.getActivity(currentActivity, 0, intent, 0);\n" +
            "\n" +
            "        //Create notification builder\n" +
            "        NotificationCompat.Builder builder = new NotificationCompat.Builder(currentActivity);\n" +
            "        builder.setSmallIcon(appIcon);\n" +
            "        builder.setContentIntent(pendingIntent);\n" +
            "        builder.setAutoCancel(true);\n" +
            "        builder.setLargeIcon(BitmapFactory.decodeResource(currentActivity.getResources(), appIcon));\n" +
            "        builder.setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION));\n" +
            "\n" +
            "        //Set texts to notification\n" +
            "        builder.setContentTitle(title);\n" +
            "        builder.setContentText(contentText);\n" +
            "\n" +
            "        //Show the notification\n" +
            "        NotificationManager notificationManager = (NotificationManager) currentActivity.getSystemService(\n" +
            "                Activity.NOTIFICATION_SERVICE);\n" +
            "        notificationManager.notify(NOTIFICATION_ID, builder.build());\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the show notification from the intent\n" +
            "     *\n" +
            "     * @param currentActivity current activity\n" +
            "     * @param intent          intent which should open when tap on notification\n" +
            "     * @param title           notification title\n" +
            "     * @param contentText     notification text\n" +
            "     */\n" +
            "    public static void showNotification(Context currentActivity,\n" +
            "                                        Intent intent,\n" +
            "                                        int appIcon,\n" +
            "                                        String title,\n" +
            "                                        String contentText) {\n" +
            "\n" +
            "        //Get current application icon ID\n" +
            "\n" +
            "        //Build the intent\n" +
            "        PendingIntent pendingIntent = PendingIntent.getActivity(currentActivity, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);\n" +
            "\n" +
            "        //Create notification builder\n" +
            "        NotificationCompat.Builder builder = new NotificationCompat.Builder(currentActivity);\n" +
            "        builder.setSmallIcon(appIcon);\n" +
            "        builder.setContentIntent(pendingIntent);\n" +
            "        builder.setAutoCancel(true);\n" +
            "        builder.setLargeIcon(BitmapFactory.decodeResource(currentActivity.getResources(), appIcon));\n" +
            "        builder.setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION));\n" +
            "\n" +
            "        //Set texts to notification\n" +
            "        builder.setContentTitle(title);\n" +
            "        builder.setContentText(contentText);\n" +
            "\n" +
            "        //Show the notification\n" +
            "        NotificationManager notificationManager = (NotificationManager) currentActivity.getSystemService(\n" +
            "                Activity.NOTIFICATION_SERVICE);\n" +
            "        notificationManager.notify(NOTIFICATION_ID, builder.build());\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the show notification from the intent\n" +
            "     *\n" +
            "     * @param currentActivity current activity\n" +
            "     * @param title           notification title\n" +
            "     * @param contentText     notification text\n" +
            "     */\n" +
            "    public static void showNotification(Context currentActivity,\n" +
            "                                        String title,\n" +
            "                                        String contentText) {\n" +
            "\n" +
            "        //Get current application icon ID\n" +
            "\n" +
            "        //Build the intent\n" +
            "\n" +
            "        //Create notification builder\n" +
            "        NotificationCompat.Builder builder = new NotificationCompat.Builder(currentActivity);\n" +
            "        builder.setSmallIcon(R.mipmap.ic_launcher);\n" +
            "        builder.setAutoCancel(true);\n" +
            "        builder.setLargeIcon(BitmapFactory.decodeResource(currentActivity.getResources(), R.mipmap.ic_launcher));\n" +
            "        builder.setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION));\n" +
            "\n" +
            "        //Set texts to notification\n" +
            "        builder.setContentTitle(title);\n" +
            "        builder.setContentText(contentText);\n" +
            "\n" +
            "        //Show the notification\n" +
            "        NotificationManager notificationManager = (NotificationManager) currentActivity.getSystemService(\n" +
            "                Activity.NOTIFICATION_SERVICE);\n" +
            "        notificationManager.notify(NOTIFICATION_ID, builder.build());\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the show notification from the intent\n" +
            "     *\n" +
            "     * @param currentActivity current activity\n" +
            "     * @param title           notification title\n" +
            "     * @param contentText     notification text\n" +
            "     */\n" +
            "    public static void showNotification(Context currentActivity,\n" +
            "                                        int iconID,\n" +
            "                                        String title,\n" +
            "                                        String contentText) {\n" +
            "\n" +
            "        //Get current application icon ID\n" +
            "\n" +
            "        //Build the intent\n" +
            "\n" +
            "        //Create notification builder\n" +
            "        NotificationCompat.Builder builder = new NotificationCompat.Builder(currentActivity);\n" +
            "        builder.setSmallIcon(iconID);\n" +
            "        builder.setAutoCancel(true);\n" +
            "        builder.setLargeIcon(BitmapFactory.decodeResource(currentActivity.getResources(), iconID));\n" +
            "        builder.setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION));\n" +
            "\n" +
            "        //Set texts to notification\n" +
            "        builder.setContentTitle(title);\n" +
            "        builder.setContentText(contentText);\n" +
            "\n" +
            "        //Show the notification\n" +
            "        NotificationManager notificationManager = (NotificationManager) currentActivity.getSystemService(\n" +
            "                Activity.NOTIFICATION_SERVICE);\n" +
            "        notificationManager.notify(NOTIFICATION_ID, builder.build());\n" +
            "    }";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
