package actions.sections.android.maps;

import actions.abs.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by dlernatovich on 1/19/15.
 */
public class RoutingWithMapsAction extends BaseAction {

    private final String CODE = "public static void startNavigation(Activity activity, LatLng from, LatLng to) {\n" +
            "        String uri = String.format(\"http://maps.google.com/maps?saddr=%f,%f&daddr=%f,%f\", from.latitude, from.longitude, to.latitude, to.longitude);\n" +
            "        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri));\n" +
            "        intent.setClassName(\"com.google.android.apps.maps\", \"com.google.android.maps.MapsActivity\");\n" +
            "        activity.startActivity(intent);\n" +
            "    }";

    @Override
    public void actionPerformed(AnActionEvent e) {
        writeCode(e, CODE);
    }
}
