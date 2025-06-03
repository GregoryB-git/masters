/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.PreloadInfo;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.i;
import com.yandex.metrica.impl.ob.Gl;
import com.yandex.metrica.impl.ob.Kl;
import com.yandex.metrica.impl.ob.Ol;
import com.yandex.metrica.impl.ob.la;
import com.yandex.metrica.impl.ob.ra;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ga
implements la<YandexMetricaConfig> {
    @NonNull
    private final Ol a;
    @NonNull
    private final ra b;

    @VisibleForTesting
    public ga(@NonNull Ol ol, @NonNull ra ra2) {
        this.a = ol;
        this.b = ra2;
    }

    @Override
    @Nullable
    private JSONObject a(@Nullable Location location) throws JSONException {
        if (location == null) {
            return null;
        }
        return new JSONObject().putOpt("provider", (Object)location.getProvider()).put("timestamp", location.getTime()).put("precision", (double)location.getAccuracy()).put("altitude", location.getAltitude()).put("lon", location.getLongitude()).put("lat", location.getLatitude()).put("direction", (double)location.getBearing()).put("speed", (double)location.getSpeed());
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @NonNull
    public JSONObject a(@Nullable Object object) {
        Object object2;
        YandexMetricaConfig yandexMetricaConfig = (YandexMetricaConfig)object;
        JSONObject jSONObject = new JSONObject();
        try {
            object2 = new JSONObject();
            if (yandexMetricaConfig != null) {
                object = object2.put("api_key", (Object)yandexMetricaConfig.apiKey);
                object = object.putOpt("app_version", (Object)yandexMetricaConfig.appVersion);
                object = object.putOpt("session_timeout", (Object)yandexMetricaConfig.sessionTimeout);
                object = object.putOpt("crash_reporting", (Object)yandexMetricaConfig.crashReporting);
                object = object.putOpt("native_crash_reporting", (Object)yandexMetricaConfig.nativeCrashReporting);
                object = object.putOpt("location", (Object)this.a(yandexMetricaConfig.location));
                object = object.putOpt("location_tracking", (Object)yandexMetricaConfig.locationTracking);
                JSONObject jSONObject2 = object.putOpt("logs", (Object)yandexMetricaConfig.logs);
                PreloadInfo preloadInfo = yandexMetricaConfig.preloadInfo;
                if (preloadInfo == null) {
                    object = null;
                } else {
                    object = new JSONObject();
                    object = object.putOpt("tracking_id", (Object)preloadInfo.getTrackingId()).putOpt("additional_parameters", (Object)Gl.f(preloadInfo.getAdditionalParams()));
                }
                object = jSONObject2.putOpt("preload_info", object);
                object = object.putOpt("first_activation_as_update", (Object)yandexMetricaConfig.firstActivationAsUpdate);
                object = object.putOpt("statistics_sending", (Object)yandexMetricaConfig.statisticsSending);
                object = object.putOpt("max_reports_in_database_count", (Object)yandexMetricaConfig.maxReportsInDatabaseCount);
                object = object.putOpt("error_environment", (Object)Gl.f(yandexMetricaConfig.errorEnvironment));
                object = object.putOpt("user_profile_id", (Object)yandexMetricaConfig.userProfileID);
                object = object.putOpt("revenue_auto_tracking_enabled", (Object)yandexMetricaConfig.revenueAutoTrackingEnabled);
                object = object.putOpt("sessions_auto_tracking_enabled", (Object)yandexMetricaConfig.sessionsAutoTrackingEnabled);
                object.putOpt("app_open_tracking_enabled", (Object)yandexMetricaConfig.appOpenTrackingEnabled);
                if (yandexMetricaConfig instanceof i) {
                    yandexMetricaConfig = (i)yandexMetricaConfig;
                    object = object2.putOpt("device_type", (Object)((i)yandexMetricaConfig).a);
                    object = object.putOpt("clids", (Object)Gl.f(((i)yandexMetricaConfig).b));
                    jSONObject2 = object.putOpt("distribution_referrer", (Object)((i)yandexMetricaConfig).c);
                    object = ((i)yandexMetricaConfig).d;
                    object = object == null ? null : (object.isEmpty() ? new JSONArray() : Gl.b(object));
                    object = jSONObject2.putOpt("custom_hosts", object);
                    object = object.putOpt("app_build_number", (Object)((i)yandexMetricaConfig).e);
                    object = object.putOpt("dispatch_period_seconds", (Object)((i)yandexMetricaConfig).f);
                    object = object.putOpt("max_reports_count", (Object)((i)yandexMetricaConfig).g);
                    object = object.putOpt("app_environment", (Object)Gl.f(((i)yandexMetricaConfig).h));
                    object = object.putOpt("preload_info_auto_tracking", (Object)((i)yandexMetricaConfig).i);
                    object = object.putOpt("permissions_collection", (Object)((i)yandexMetricaConfig).j);
                    object = object.putOpt("anr_monitoring", (Object)((i)yandexMetricaConfig).k);
                    this.b.getClass();
                    object = object.putOpt("pulse_config", null);
                    object = object.putOpt("rtm_config", null);
                    boolean bl2 = ((i)yandexMetricaConfig).l != null;
                    object.put("crash_transformer_set", bl2);
                }
            }
            object = jSONObject.putOpt("config", object2);
            object2 = this.a;
        }
        catch (Throwable throwable) {
            return jSONObject;
        }
        object2 = (Kl)object2;
        {
            object.putOpt("process_name", (Object)((Kl)object2).b());
            return jSONObject;
        }
    }
}

