/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package tvrain.analytics.tagmanager;

import android.app.Application;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.Map;

public class AppMetrica {
    public static void init(Application application) {
        YandexMetricaConfig yandexMetricaConfig = YandexMetricaConfig.newConfigBuilder("47866c6a-8883-4df1-b98a-c723a506fae5").build();
        YandexMetrica.activate(application.getApplicationContext(), yandexMetricaConfig);
        YandexMetrica.enableActivityAutoTracking(application);
    }

    public static void log(Map<String, Object> map) {
        String string2;
        String string3 = string2 = "event";
        if (map.containsKey((Object)"event")) {
            Object object = map.get((Object)"event");
            string3 = string2;
            if (object != null) {
                string3 = object.toString();
            }
        }
        YandexMetrica.reportEvent(string3, map);
    }
}

