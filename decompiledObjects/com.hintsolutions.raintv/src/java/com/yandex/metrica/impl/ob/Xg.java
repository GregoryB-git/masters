/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

public class xg {
    private final Map<String, String> a;

    public xg() {
        HashMap hashMap;
        this.a = hashMap = new HashMap();
        hashMap.put((Object)"easy_collecting", (Object)"ec");
        hashMap.put((Object)"cells_around", (Object)"ca");
        hashMap.put((Object)"google_aid", (Object)"g");
        hashMap.put((Object)"huawei_oaid", (Object)"h");
        hashMap.put((Object)"sim_info", (Object)"si");
        hashMap.put((Object)"throttling", (Object)"tht");
        hashMap.put((Object)"wifi_around", (Object)"wa");
        hashMap.put((Object)"wifi_connected", (Object)"wc");
        hashMap.put((Object)"features_collecting", (Object)"fc");
        hashMap.put((Object)"cell_additional_info", (Object)"cai");
        hashMap.put((Object)"cell_additional_info_connected_only", (Object)"caico");
        hashMap.put((Object)"location_collecting", (Object)"lc");
        hashMap.put((Object)"lbs_collecting", (Object)"lbs");
        hashMap.put((Object)"package_info", (Object)"pi");
        hashMap.put((Object)"permissions_collecting", (Object)"pc");
        hashMap.put((Object)"sdk_list", (Object)"sl");
        hashMap.put((Object)"socket", (Object)"s");
        hashMap.put((Object)"identity_light_collecting", (Object)"ilc");
        hashMap.put((Object)"gpl_collecting", (Object)"gplc");
        hashMap.put((Object)"retry_policy", (Object)"rp");
        hashMap.put((Object)"ui_parsing", (Object)"up");
        hashMap.put((Object)"ui_collecting_for_bridge", (Object)"ucfb");
        hashMap.put((Object)"ui_event_sending", (Object)"ues");
        hashMap.put((Object)"ui_raw_event_sending", (Object)"ures");
        hashMap.put((Object)"cache_control", (Object)"cc");
        hashMap.put((Object)"mediascope_api_keys", (Object)"mak");
        hashMap.put((Object)"diagnostics", (Object)"d");
        hashMap.put((Object)"auto_inapp_collecting", (Object)"aic");
        hashMap.put((Object)"attribution", (Object)"at");
        hashMap.put((Object)"egress", (Object)"eg");
        hashMap.put((Object)"startup_update", (Object)"su");
        hashMap.put((Object)"ssl_pinning", (Object)"sp");
    }

    @NonNull
    public String a(@NonNull String string) {
        String string2 = string;
        if (this.a.containsKey((Object)string)) {
            string2 = (String)this.a.get((Object)string);
        }
        return string2;
    }
}

