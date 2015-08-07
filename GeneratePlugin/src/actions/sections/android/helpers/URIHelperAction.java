package actions.sections.android.helpers;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class URIHelperAction extends BaseAction {

    private final String CODE = "/**\n" +
            "     * Method which provide the getting of the image from the URI\n" +
            "     *\n" +
            "     * @param uri current URI\n" +
            "     * @return current instance of the Bitmap\n" +
            "     * @throws IOException\n" +
            "     */\n" +
            "    public static Bitmap getBitmapFromUri(Context context, Uri uri) throws IOException {\n" +
            "        ParcelFileDescriptor parcelFileDescriptor =\n" +
            "                context.getContentResolver().openFileDescriptor(uri, \"r\");\n" +
            "        FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();\n" +
            "        Bitmap image = BitmapFactory.decodeFileDescriptor(fileDescriptor);\n" +
            "        parcelFileDescriptor.close();\n" +
            "        return image;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method which provide the getting of the real file path from the URI\n" +
            "     *\n" +
            "     * @param contentUri current URI\n" +
            "     * @return the file path String value\n" +
            "     */\n" +
            "    public static String getPathFromURI(Activity activity, Uri contentUri) {\n" +
            "        String[] proj = {MediaStore.Audio.Media.DATA};\n" +
            "        Cursor cursor = activity.managedQuery(contentUri, proj, null, null, null);\n" +
            "        int column_index = cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DATA);\n" +
            "        cursor.moveToFirst();\n" +
            "        return cursor.getString(column_index);\n" +
            "    }";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
