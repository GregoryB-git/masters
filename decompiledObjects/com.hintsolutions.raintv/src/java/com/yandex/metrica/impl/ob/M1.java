/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map$Entry
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import android.location.Location;
import android.text.TextUtils;
import com.yandex.metrica.PreloadInfo;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.impl.ob.Gl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class m1 {
    private String a(Location object) {
        if (object == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("provider", (Object)object.getProvider());
            jSONObject.put("time", object.getTime());
            jSONObject.put("accuracy", (double)object.getAccuracy());
            jSONObject.put("alt", object.getAltitude());
            jSONObject.put("lng", object.getLongitude());
            jSONObject.put("lat", object.getLatitude());
            object = jSONObject.toString();
            return object;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    private Location b(String string) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty((CharSequence)string)) {
            return null;
        }
        try {
            jSONObject = new JSONObject(string);
            string = jSONObject.has("provider") ? jSONObject.optString("provider") : null;
        }
        catch (Throwable throwable) {
            return null;
        }
        Location location = new Location(string);
        location.setLongitude(jSONObject.getDouble("lng"));
        location.setLatitude(jSONObject.getDouble("lat"));
        location.setTime(jSONObject.optLong("time"));
        location.setAccuracy((float)jSONObject.optDouble("accuracy"));
        location.setAltitude((double)((float)jSONObject.optDouble("alt")));
        return location;
    }

    private PreloadInfo c(String object) throws JSONException {
        boolean bl = TextUtils.isEmpty((CharSequence)object);
        Iterator iterator = null;
        Map.Entry entry2 = null;
        if (!bl) {
            iterator = new HashMap<String, String>((String)object);
            object = entry2;
            if (iterator.has("trackid")) {
                object = iterator.optString("trackid");
            }
            object = PreloadInfo.newBuilder((String)object);
            if ((iterator = Gl.d(iterator.optString("params"))) != null && iterator.size() > 0) {
                for (Map.Entry entry2 : iterator.entrySet()) {
                    ((PreloadInfo.Builder)object).setAdditionalParams((String)entry2.getKey(), (String)entry2.getValue());
                }
            }
            iterator = ((PreloadInfo.Builder)object).build();
        }
        return iterator;
    }

    /*
     * Unable to fully structure code
     */
    public YandexMetricaConfig a(String var1_1) {
        block19: {
            if (TextUtils.isEmpty((CharSequence)var1_1)) break block19;
            var3_4 = new JSONObject((String)var1_1);
            var1_1 = YandexMetricaConfig.newConfigBuilder(var3_4.getString("apikey"));
            if (var3_4.has("app_version")) {
                var1_1.withAppVersion(var3_4.optString("app_version"));
            }
            if (var3_4.has("session_timeout")) {
                var1_1.withSessionTimeout(var3_4.getInt("session_timeout"));
            }
            var1_1.withLocation(this.b(var3_4.optString("location")));
            var1_1.withPreloadInfo(this.c(var3_4.optString("preload_info")));
            if (var3_4.has("logs") && var3_4.optBoolean("logs")) {
                var1_1.withLogs();
            }
            if (var3_4.has("crash_enabled")) {
                var1_1.withCrashReporting(var3_4.optBoolean("crash_enabled"));
            }
            if (var3_4.has("crash_native_enabled")) {
                var1_1.withNativeCrashReporting(var3_4.optBoolean("crash_native_enabled"));
            }
            if (var3_4.has("location_enabled")) {
                var1_1.withLocationTracking(var3_4.optBoolean("location_enabled"));
            }
            if (var3_4.has("max_reports_in_db_count")) {
                var1_1.withMaxReportsInDatabaseCount(var3_4.optInt("max_reports_in_db_count"));
            }
            if (!var3_4.has("error_environment") || (var4_5 = Gl.d(var3_4.optString("error_environment"))) == null) ** GOTO lbl36
            for (Map.Entry var4_5 : var4_5.entrySet()) {
                var1_1.withErrorEnvironmentValue((String)var4_5.getKey(), (String)var4_5.getValue());
            }
lbl36:
            // 2 sources

            if (var3_4.has("first_activation_as_update")) {
                var1_1.handleFirstActivationAsUpdate(var3_4.optBoolean("first_activation_as_update"));
            }
            if (var3_4.has("statistics_sending")) {
                var1_1.withStatisticsSending(var3_4.optBoolean("statistics_sending"));
            }
            if (!(var2_7 = var3_4.has("user_profile_id"))) ** GOTO lbl46
            try {
                var1_1.withUserProfileID(var3_4.optString("user_profile_id", null));
lbl46:
                // 2 sources

                if (var3_4.has("revenue_auto_tracking_enabled")) {
                    var1_1.withRevenueAutoTrackingEnabled(var3_4.optBoolean("revenue_auto_tracking_enabled"));
                }
                if (var3_4.has("sessions_auto_tracking_enabled")) {
                    var1_1.withSessionsAutoTrackingEnabled(var3_4.optBoolean("sessions_auto_tracking_enabled"));
                }
                if (var3_4.has("app_open_tracking_enabled")) {
                    var1_1.withAppOpenTrackingEnabled(var3_4.optBoolean("app_open_tracking_enabled"));
                }
                var1_1 = var1_1.build();
                ** GOTO lbl60
            }
            catch (Throwable var1_3) {
                ** continue;
            }
        }
lbl58:
        // 3 sources

        while (true) {
            var1_1 = null;
lbl60:
            // 2 sources

            return var1_1;
        }
        catch (Throwable var1_2) {}
        ** GOTO lbl58
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String a(YandexMetricaConfig object) {
        void var2_9;
        JSONObject jSONObject;
        block5: {
            PreloadInfo preloadInfo;
            try {
                jSONObject = new JSONObject();
                jSONObject.put("apikey", (Object)((YandexMetricaConfig)object).apiKey);
                jSONObject.put("app_version", (Object)((YandexMetricaConfig)object).appVersion);
                jSONObject.put("session_timeout", (Object)((YandexMetricaConfig)object).sessionTimeout);
                jSONObject.put("location", (Object)this.a(((YandexMetricaConfig)object).location));
                preloadInfo = ((YandexMetricaConfig)object).preloadInfo;
                if (preloadInfo == null) break block5;
            }
            catch (Throwable throwable) {
                return "";
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("trackid", (Object)preloadInfo.getTrackingId());
                jSONObject2.put("params", (Object)Gl.e(preloadInfo.getAdditionalParams()));
                String string = jSONObject2.toString();
            }
            catch (Throwable throwable) {}
        }
        Object var2_8 = null;
        jSONObject.put("preload_info", (Object)var2_9);
        jSONObject.put("logs", (Object)((YandexMetricaConfig)object).logs);
        jSONObject.put("crash_enabled", (Object)((YandexMetricaConfig)object).crashReporting);
        jSONObject.put("crash_native_enabled", (Object)((YandexMetricaConfig)object).nativeCrashReporting);
        jSONObject.put("location_enabled", (Object)((YandexMetricaConfig)object).locationTracking);
        jSONObject.put("max_reports_in_db_count", (Object)((YandexMetricaConfig)object).maxReportsInDatabaseCount);
        jSONObject.put("error_environment", (Object)Gl.e(((YandexMetricaConfig)object).errorEnvironment));
        jSONObject.put("first_activation_as_update", (Object)((YandexMetricaConfig)object).firstActivationAsUpdate);
        jSONObject.put("statistics_sending", (Object)((YandexMetricaConfig)object).statisticsSending);
        jSONObject.put("user_profile_id", (Object)((YandexMetricaConfig)object).userProfileID);
        jSONObject.put("revenue_auto_tracking_enabled", (Object)((YandexMetricaConfig)object).revenueAutoTrackingEnabled);
        jSONObject.put("sessions_auto_tracking_enabled", (Object)((YandexMetricaConfig)object).sessionsAutoTrackingEnabled);
        jSONObject.put("app_open_tracking_enabled", (Object)((YandexMetricaConfig)object).appOpenTrackingEnabled);
        return jSONObject.toString();
    }
}

