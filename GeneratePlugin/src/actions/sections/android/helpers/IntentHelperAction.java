package actions.sections.android.helpers;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class IntentHelperAction extends BaseAction {

    private final String CODE = "/**\n" +
            "     * Open app page at Google Play. If Play Store application isn't available on the device\n" +
            "     * then web browser will be opened\n" +
            "     *\n" +
            "     * @param context Application context\n" +
            "     */\n" +
            "    public static Intent openPlayStore(Context context) {\n" +
            "        return openPlayStore(context, true);\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Open app page at Google Play\n" +
            "     *\n" +
            "     * @param context       Application context\n" +
            "     * @param openInBrowser Should we try to open application page in web browser\n" +
            "     *                      if Play Store app not found on device\n" +
            "     */\n" +
            "    public static Intent openPlayStore(Context context, boolean openInBrowser) {\n" +
            "        String appPackageName = context.getPackageName();\n" +
            "        Intent marketIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(\"market://details?id=\" + appPackageName));\n" +
            "        if (isIntentAvailable(context, marketIntent)) {\n" +
            "            return marketIntent;\n" +
            "        }\n" +
            "        if (openInBrowser) {\n" +
            "            return openLink(\"https://play.google.com/store/apps/details?id=\" + appPackageName);\n" +
            "        }\n" +
            "        return marketIntent;\n" +
            "    }\n" +
            "\n" +
            "    public static void startNavigation(Activity activity, LatLng from, LatLng to) {\n" +
            "        String uri = String.format(\"http://maps.google.com/maps?saddr=%f,%f&daddr=%f,%f\", from.latitude, from.longitude, to.latitude, to.longitude);\n" +
            "        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri));\n" +
            "        intent.setClassName(\"com.google.android.apps.maps\", \"com.google.android.maps.MapsActivity\");\n" +
            "        activity.startActivity(intent);\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Send email message\n" +
            "     *\n" +
            "     * @param to      Receiver email\n" +
            "     * @param subject Message subject\n" +
            "     * @param text    Message body\n" +
            "     * @see #sendEmail(String[], String, String)\n" +
            "     */\n" +
            "    public static Intent sendEmail(String to, String subject, String text) {\n" +
            "        return sendEmail(new String[]{to}, subject, text);\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * @see #sendEmail(String, String, String)\n" +
            "     */\n" +
            "    public static Intent sendEmail(String[] to, String subject, String text) {\n" +
            "        Intent intent = new Intent(Intent.ACTION_SEND);\n" +
            "        intent.setType(\"message/rfc822\");\n" +
            "        intent.putExtra(Intent.EXTRA_EMAIL, to);\n" +
            "        intent.putExtra(Intent.EXTRA_SUBJECT, subject);\n" +
            "        intent.putExtra(Intent.EXTRA_TEXT, text);\n" +
            "        return intent;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Share text via thirdparty app like twitter, facebook, email, sms etc.\n" +
            "     *\n" +
            "     * @param subject Optional subject of the message\n" +
            "     * @param text    Text to share\n" +
            "     */\n" +
            "    public static Intent shareText(String subject, String text) {\n" +
            "        Intent intent = new Intent();\n" +
            "        intent.setAction(Intent.ACTION_SEND);\n" +
            "        if (!TextUtils.isEmpty(subject)) {\n" +
            "            intent.putExtra(Intent.EXTRA_SUBJECT, subject);\n" +
            "        }\n" +
            "        intent.putExtra(Intent.EXTRA_TEXT, text);\n" +
            "        intent.setType(\"text/plain\");\n" +
            "        return intent;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Send SMS message using built-in app\n" +
            "     *\n" +
            "     * @param to      Receiver phone number\n" +
            "     * @param message Text to send\n" +
            "     */\n" +
            "    public static Intent sendSms(String to, String message) {\n" +
            "        Uri smsUri = Uri.parse(\"tel:\" + to);\n" +
            "        Intent intent = new Intent(Intent.ACTION_VIEW, smsUri);\n" +
            "        intent.putExtra(\"address\", to);\n" +
            "        intent.putExtra(\"sms_body\", message);\n" +
            "        intent.setType(\"vnd.android-dir/mms-sms\");\n" +
            "        return intent;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Opens the Street View application to the given location.\n" +
            "     * The URI scheme is based on the syntax used for Street View panorama information in Google Maps URLs.\n" +
            "     *\n" +
            "     * @param latitude  Latitude\n" +
            "     * @param longitude Longitude\n" +
            "     * @param yaw       Panorama center-of-view in degrees clockwise from North.\n" +
            "     *                  <p/>\n" +
            "     *                  Note: The two commas after the yaw parameter are required.\n" +
            "     *                  They are present for backwards-compatibility reasons.\n" +
            "     * @param pitch     Panorama center-of-view in degrees from -90 (look straight up) to 90 (look straight down.)\n" +
            "     * @param zoom      Panorama zoom. 1.0 = normal zoom, 2.0 = zoomed in 2x, 3.0 = zoomed in 4x, and so on.\n" +
            "     *                  A zoom of 1.0 is 90 degree horizontal FOV for a nominal landscape mode 4 x 3 aspect ratio display Android\n" +
            "     *                  phones in portrait mode will adjust the zoom so that the vertical FOV is approximately the same as the\n" +
            "     *                  landscape vertical FOV. This means that the horizontal FOV of an Android phone in portrait mode is much\n" +
            "     *                  narrower than in landscape mode. This is done to minimize the fisheye lens effect that would be present\n" +
            "     *                  if a 90 degree horizontal FOV was used in portrait mode.\n" +
            "     * @param mapZoom   The map zoom of the map location associated with this panorama.\n" +
            "     *                  This value is passed on to the Maps activity when the Street View \"Go to Maps\" menu item is chosen.\n" +
            "     *                  It corresponds to the zoomLevel parameter in {@link #showLocation(float, float, Integer)}\n" +
            "     */\n" +
            "    public static Intent showStreetView(float latitude,\n" +
            "                                        float longitude,\n" +
            "                                        Float yaw,\n" +
            "                                        Integer pitch,\n" +
            "                                        Float zoom,\n" +
            "                                        Integer mapZoom) {\n" +
            "        StringBuilder builder = new StringBuilder(\"google.streetview:cbll=\").append(latitude).append(\",\").append(longitude);\n" +
            "        if (yaw != null || pitch != null || zoom != null) {\n" +
            "            String cbpParam = String.format(\"%s,,%s,%s\", yaw == null ? \"\" : yaw, pitch == null ? \"\" : pitch, zoom == null ? \"\" : zoom);\n" +
            "            builder.append(\"&cbp=1,\").append(cbpParam);\n" +
            "        }\n" +
            "        if (mapZoom != null) {\n" +
            "            builder.append(\"&mz=\").append(mapZoom);\n" +
            "        }\n" +
            "\n" +
            "        Intent intent = new Intent();\n" +
            "        intent.setAction(Intent.ACTION_VIEW);\n" +
            "        intent.setData(Uri.parse(builder.toString()));\n" +
            "        return intent;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Opens the Maps application to the given location.\n" +
            "     *\n" +
            "     * @param latitude  Latitude\n" +
            "     * @param longitude Longitude\n" +
            "     * @param zoomLevel A zoom level of 1 shows the whole Earth, centered at the given lat,lng.\n" +
            "     *                  A zoom level of 2 shows a quarter of the Earth, and so on. The highest zoom level is 23.\n" +
            "     *                  A larger zoom level will be clamped to 23.\n" +
            "     * @see #findLocation(String)\n" +
            "     */\n" +
            "    public static Intent showLocation(float latitude, float longitude, Integer zoomLevel) {\n" +
            "        Intent intent = new Intent();\n" +
            "        intent.setAction(Intent.ACTION_VIEW);\n" +
            "        String data = String.format(\"geo:%s,%s\", latitude, longitude);\n" +
            "        if (zoomLevel != null) {\n" +
            "            data = String.format(\"%s?z=%s\", data, zoomLevel);\n" +
            "        }\n" +
            "        intent.setData(Uri.parse(data));\n" +
            "        return intent;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Opens the Maps application to the given query.\n" +
            "     *\n" +
            "     * @param query Query string\n" +
            "     * @see #showLocation(float, float, Integer)\n" +
            "     */\n" +
            "    public static Intent findLocation(String query) {\n" +
            "        Intent intent = new Intent();\n" +
            "        intent.setAction(Intent.ACTION_VIEW);\n" +
            "        String data = String.format(\"geo:0,0?q=%s\", query);\n" +
            "        intent.setData(Uri.parse(data));\n" +
            "        return intent;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Open system settings location services screen for turning on/off GPS\n" +
            "     */\n" +
            "    public static Intent showLocationServices() {\n" +
            "        Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);\n" +
            "        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY | Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);\n" +
            "        return intent;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Open a browser window to the URL specified.\n" +
            "     *\n" +
            "     * @param url Target url\n" +
            "     */\n" +
            "    public static Intent openLink(String url) {\n" +
            "        // if protocol isn't defined use http by default\n" +
            "        if (!TextUtils.isEmpty(url) && !url.contains(\"://\")) {\n" +
            "            url = \"http://\" + url;\n" +
            "        }\n" +
            "\n" +
            "        Intent intent = new Intent();\n" +
            "        intent.setAction(Intent.ACTION_VIEW);\n" +
            "        intent.setData(Uri.parse(url));\n" +
            "        return intent;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * @see #openLink(String)\n" +
            "     */\n" +
            "    public static Intent openLink(URL url) {\n" +
            "        return openLink(url.toString());\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Open a video file in appropriate app\n" +
            "     *\n" +
            "     * @param file File to open\n" +
            "     */\n" +
            "    public static Intent openVideo(File file) {\n" +
            "        return openVideo(Uri.fromFile(file));\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * @see #openVideo(java.io.File)\n" +
            "     */\n" +
            "    public static Intent openVideo(String file) {\n" +
            "        return openVideo(new File(file));\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * @see #openVideo(java.io.File)\n" +
            "     */\n" +
            "    public static Intent openVideo(Uri uri) {\n" +
            "        return openMedia(uri, \"video/*\");\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Open an audio file in appropriate app\n" +
            "     *\n" +
            "     * @param file File to open\n" +
            "     */\n" +
            "    public static Intent openAudio(File file) {\n" +
            "        return openAudio(Uri.fromFile(file));\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * @see #openAudio(java.io.File)\n" +
            "     */\n" +
            "    public static Intent openAudio(String file) {\n" +
            "        return openAudio(new File(file));\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * @see #openAudio(java.io.File)\n" +
            "     */\n" +
            "    public static Intent openAudio(Uri uri) {\n" +
            "        return openMedia(uri, \"audio/*\");\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Open an image file in appropriate app\n" +
            "     *\n" +
            "     * @param file File to open\n" +
            "     */\n" +
            "    public static Intent openImage(String file) {\n" +
            "        return openImage(new File(file));\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * @see #openImage(String)\n" +
            "     */\n" +
            "    public static Intent openImage(File file) {\n" +
            "        return openImage(Uri.fromFile(file));\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * @see #openImage(String)\n" +
            "     */\n" +
            "    public static Intent openImage(Uri uri) {\n" +
            "        return openMedia(uri, \"image/*\");\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Open a text file in appropriate app\n" +
            "     *\n" +
            "     * @param file File to open\n" +
            "     */\n" +
            "    public static Intent openText(String file) {\n" +
            "        return openText(new File(file));\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * @see #openText(String)\n" +
            "     */\n" +
            "    public static Intent openText(File file) {\n" +
            "        return openText(Uri.fromFile(file));\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * @see #openText(String)\n" +
            "     */\n" +
            "    public static Intent openText(Uri uri) {\n" +
            "        return openMedia(uri, \"text/plain\");\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Pick file from sdcard with file manager. Chosen file can be obtained from Intent in onActivityResult.\n" +
            "     * See code below for example:\n" +
            "     * <p/>\n" +
            "     * <pre><code>\n" +
            "     *     @Override\n" +
            "     *     protected void onActivityResult(int requestCode, int resultCode, Intent data) {\n" +
            "     *         Uri file = data.getData();\n" +
            "     *     }\n" +
            "     * </code></pre>\n" +
            "     */\n" +
            "    public static Intent pickFile() {\n" +
            "        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);\n" +
            "        intent.setType(\"file/*\");\n" +
            "        return intent;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Calls the entered phone number. Valid telephone numbers as defined in the IETF RFC 3966 are accepted.\n" +
            "     * Valid examples include the following:\n" +
            "     * tel:2125551212\n" +
            "     * tel: (212) 555 1212\n" +
            "     * <p/>\n" +
            "     * Note: This requires your application to request the following permission in your manifest:\n" +
            "     * <code>&lt;uses-permission android:name=\"android.permission.CALL_PHONE\"/&gt;</code>\n" +
            "     *\n" +
            "     * @param phoneNumber Phone number\n" +
            "     */\n" +
            "    public static Intent callPhone(String phoneNumber) {\n" +
            "        Intent intent = new Intent();\n" +
            "        intent.setAction(Intent.ACTION_CALL);\n" +
            "        intent.setData(Uri.parse(\"tel:\" + phoneNumber));\n" +
            "        return intent;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Pick contact from phone book\n" +
            "     */\n" +
            "    public static Intent pickContact() {\n" +
            "        return pickContact(null);\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Pick contact from phone book\n" +
            "     *\n" +
            "     * @param scope You can restrict selection by passing required content type. Examples:\n" +
            "     *              <p/>\n" +
            "     *              <code><pre>\n" +
            "     *                                                                                                                                                             // Select only from users with emails\n" +
            "     *                                                                                                                                                             IntentUtils.pickContact(ContactsContract.CommonDataKinds.Email.CONTENT_TYPE);\n" +
            "     *              <p/>\n" +
            "     *                                                                                                                                                             // Select only from users with phone numbers on pre Eclair devices\n" +
            "     *                                                                                                                                                             IntentUtils.pickContact(Contacts.Phones.CONTENT_TYPE);\n" +
            "     *              <p/>\n" +
            "     *                                                                                                                                                             // Select only from users with phone numbers on devices with Eclair and higher\n" +
            "     *                                                                                                                                                             IntentUtils.pickContact(ContactsContract.CommonDataKinds.Phone.CONTENT_TYPE);\n" +
            "     *                                                                                                                                                             </pre></code>\n" +
            "     */\n" +
            "    public static Intent pickContact(String scope) {\n" +
            "        Intent intent;\n" +
            "        if (isSupportsContactsV2()) {\n" +
            "            intent = new Intent(Intent.ACTION_PICK, Uri.parse(\"content://com.android.contacts/contacts\"));\n" +
            "        } else {\n" +
            "            intent = new Intent(Intent.ACTION_PICK, Contacts.People.CONTENT_URI);\n" +
            "        }\n" +
            "\n" +
            "        if (!TextUtils.isEmpty(scope)) {\n" +
            "            intent.setType(scope);\n" +
            "        }\n" +
            "        return intent;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Pick contact only from contacts with telephone numbers\n" +
            "     */\n" +
            "    public static Intent pickContactWithPhone() {\n" +
            "        Intent intent;\n" +
            "        if (isSupportsContactsV2()) {\n" +
            "            intent = pickContact(ContactsContract.CommonDataKinds.Phone.CONTENT_TYPE);\n" +
            "        } else { // pre Eclair, use old contacts API\n" +
            "            intent = pickContact(Contacts.Phones.CONTENT_TYPE);\n" +
            "        }\n" +
            "        return intent;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Pick image from gallery\n" +
            "     */\n" +
            "    public static Intent pickImage() {\n" +
            "        Intent intent = new Intent(Intent.ACTION_PICK);\n" +
            "        intent.setType(\"image/*\");\n" +
            "        return intent;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Dials (but does not actually initiate the call) the number given.\n" +
            "     * Telephone number normalization described for {@link #callPhone(String)} applies to dial as well.\n" +
            "     *\n" +
            "     * @param phoneNumber Phone number\n" +
            "     */\n" +
            "    public static Intent dialPhone(String phoneNumber) {\n" +
            "        Intent intent = new Intent();\n" +
            "        intent.setAction(Intent.ACTION_DIAL);\n" +
            "        intent.setData(Uri.parse(\"tel:\" + phoneNumber));\n" +
            "        return intent;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Check that cropping application is available\n" +
            "     *\n" +
            "     * @param context Application context\n" +
            "     * @return true if cropping app is available\n" +
            "     * @see #cropImage(android.content.Context, java.io.File, int, int, int, int, boolean)\n" +
            "     */\n" +
            "    public static boolean isCropAvailable(Context context) {\n" +
            "        Intent intent = new Intent(\"com.android.camera.action.CROP\");\n" +
            "        intent.setType(\"image/*\");\n" +
            "        return IntentHelper.isIntentAvailable(context, intent);\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Crop image. Before using, cropImage requires especial check that differs from\n" +
            "     * {@link #isIntentAvailable(android.content.Context, android.content.Intent)}\n" +
            "     * see {@link #isCropAvailable(android.content.Context)} instead\n" +
            "     *\n" +
            "     * @param context Application context\n" +
            "     * @param image   Image that will be used for cropping. This image is not changed during the cropImage\n" +
            "     * @param outputX Output image width\n" +
            "     * @param outputY Output image height\n" +
            "     * @param aspectX Crop frame aspect X\n" +
            "     * @param aspectY Crop frame aspect Y\n" +
            "     * @param scale   Scale or not cropped image if output image and cropImage frame sizes differs\n" +
            "     * @return Intent with <code>data</code>-extra in <code>onActivityResult</code> which contains result as a\n" +
            "     * {@link android.graphics.Bitmap}. See demo app for details\n" +
            "     */\n" +
            "    public static Intent cropImage(Context context, File image, int outputX, int outputY, int aspectX, int aspectY, boolean scale) {\n" +
            "        Intent intent = new Intent(\"com.android.camera.action.CROP\");\n" +
            "        intent.setType(\"image/*\");\n" +
            "\n" +
            "        List<ResolveInfo> list = context.getPackageManager().queryIntentActivities(intent, 0);\n" +
            "        ResolveInfo res = list.get(0);\n" +
            "\n" +
            "        intent.putExtra(\"outputX\", outputX);\n" +
            "        intent.putExtra(\"outputY\", outputY);\n" +
            "        intent.putExtra(\"aspectX\", aspectX);\n" +
            "        intent.putExtra(\"aspectY\", aspectY);\n" +
            "        intent.putExtra(\"scale\", scale);\n" +
            "        intent.putExtra(\"return-data\", true);\n" +
            "        intent.setData(Uri.fromFile(image));\n" +
            "\n" +
            "        intent.setComponent(new ComponentName(res.activityInfo.packageName, res.activityInfo.name));\n" +
            "        return intent;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Call standard camera application for capturing an image\n" +
            "     *\n" +
            "     * @param file Full path to captured file\n" +
            "     */\n" +
            "    public static Intent photoCapture(String file) {\n" +
            "        Uri uri = Uri.fromFile(new File(file));\n" +
            "        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);\n" +
            "        intent.putExtra(MediaStore.EXTRA_OUTPUT, uri);\n" +
            "        return intent;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Check that in the system exists application which can handle this intent\n" +
            "     *\n" +
            "     * @param context Application context\n" +
            "     * @param intent  Checked intent\n" +
            "     * @return true if intent consumer exists, false otherwise\n" +
            "     */\n" +
            "    public static boolean isIntentAvailable(Context context, Intent intent) {\n" +
            "        PackageManager packageManager = context.getPackageManager();\n" +
            "        List<ResolveInfo> list = packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY);\n" +
            "        return list.size() > 0;\n" +
            "    }\n" +
            "\n" +
            "    private static Intent openMedia(Uri uri, String mimeType) {\n" +
            "        Intent intent = new Intent(Intent.ACTION_VIEW);\n" +
            "        intent.setDataAndType(uri, mimeType);\n" +
            "        return intent;\n" +
            "    }\n" +
            "\n" +
            "    private static boolean isSupportsContactsV2() {\n" +
            "        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.ECLAIR;\n" +
            "    }";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
