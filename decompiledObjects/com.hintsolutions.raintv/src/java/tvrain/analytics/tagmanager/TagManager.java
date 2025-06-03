/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.net.ConnectivityManager
 *  android.os.Bundle
 *  androidx.core.app.NotificationManagerCompat
 *  com.facebook.appevents.AppEventsLogger
 *  com.google.android.gms.tagmanager.ContainerHolder
 *  com.google.android.gms.tagmanager.DataLayer
 *  com.google.android.gms.tagmanager.TagManager
 *  com.google.firebase.analytics.FirebaseAnalytics
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.URL
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Map$Entry
 */
package tvrain.analytics.tagmanager;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.os.Bundle;
import androidx.core.app.NotificationManagerCompat;
import com.facebook.appevents.AppEventsLogger;
import com.google.android.gms.tagmanager.ContainerHolder;
import com.google.android.gms.tagmanager.DataLayer;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import ru.tvrain.core.data.ScheduleProgram;
import tvrain.analytics.tagmanager.AppMetrica;
import tvrain.analytics.tagmanager.ContainerHolderSingleton;
import tvrain.managers.UserManager;
import tvrain.utils.CurrentlyOnAirGetter;

public class TagManager {
    private static final String CONTAINER_ID = "GTM-KCXHXJCX";
    private static final long TIMEOUT_FOR_CONTAINER_OPEN_MILLISECONDS = 2000L;
    private static String appVersionName;
    private Context context;
    private CurrentlyOnAirGetter currentlyOnAirGetter;
    private FirebaseAnalytics mFirebaseAnalytics;
    private UserManager userManager;

    public TagManager(Context context, UserManager userManager, CurrentlyOnAirGetter currentlyOnAirGetter) {
        this.userManager = userManager;
        this.context = context;
        this.currentlyOnAirGetter = currentlyOnAirGetter;
        this.mFirebaseAnalytics = FirebaseAnalytics.getInstance((Context)context);
    }

    private void clearDataLayer(DataLayer dataLayer) {
        dataLayer.push("currently_on_air", null);
        dataLayer.push("on_air_closed_open", null);
        dataLayer.push("auth", null);
        dataLayer.push("user_id", null);
        dataLayer.push("joined", null);
        dataLayer.push("subscriber", null);
        dataLayer.push("paid_days", null);
        dataLayer.push("samplerate", null);
        dataLayer.push("ecommerce", null);
        dataLayer.push("video_id", null);
        dataLayer.push("length", null);
        dataLayer.push("quality", null);
        dataLayer.push("paid", null);
        dataLayer.push("video_title", null);
        dataLayer.push("screenname", null);
        dataLayer.push("eventlabel", null);
        dataLayer.push("eventaction", null);
        dataLayer.push("doc", null);
        dataLayer.push("category", null);
        dataLayer.push("has_video", null);
        dataLayer.push("full_version", null);
        dataLayer.push("referrer", null);
        dataLayer.push("published", null);
        dataLayer.push("auth_type", null);
        dataLayer.push("link", null);
        dataLayer.push("live_type", null);
        dataLayer.push("eventname", null);
        dataLayer.push("event", null);
    }

    public static long getSendPlaybackInterval() {
        ContainerHolder containerHolder = ContainerHolderSingleton.getContainerHolder();
        if (containerHolder != null && containerHolder.getContainer() != null) {
            return containerHolder.getContainer().getLong("default_duration");
        }
        return 0L;
    }

    private static void initVersionCode(Application application) {
        try {
            application = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            application = null;
        }
        if (application != null) {
            appVersionName = application.versionName;
        }
    }

    private boolean isNetworkAvailable() {
        Object object = (ConnectivityManager)this.context.getSystemService("connectivity");
        object = object != null ? object.getActiveNetworkInfo() : null;
        boolean bl = object != null && object.isConnected();
        return bl;
    }

    private void logPixel(Map<String, Object> map) {
        Object object;
        AppEventsLogger appEventsLogger;
        block6: {
            Object object2;
            block5: {
                appEventsLogger = AppEventsLogger.newLogger((Context)this.context);
                object2 = map.containsKey((Object)"event") ? map.get((Object)"event") : null;
                if (object2 == null) break block5;
                object = object2;
                if (!object2.equals((Object)"event")) break block6;
            }
            object = object2;
            if (map.containsKey((Object)"eventname")) {
                object = map.get((Object)"eventname");
            }
        }
        if (object != null) {
            appEventsLogger.logEvent(object.toString(), this.paramsToBundle(map));
        }
    }

    private Bundle mapToBundle(Map<String, Object> iterator) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : iterator.entrySet()) {
            Object object = entry.getValue();
            if (object instanceof Integer) {
                bundle.putInt((String)entry.getKey(), ((Integer)object).intValue());
                continue;
            }
            if (object instanceof String) {
                bundle.putString((String)entry.getKey(), (String)object);
                continue;
            }
            if (!(object instanceof Boolean)) continue;
            bundle.putBoolean((String)entry.getKey(), ((Boolean)object).booleanValue());
        }
        return bundle;
    }

    private Map<String, Object> prepareParams(Map<String, Object> map) {
        Map<String, Object> map2 = this.prepareUserParams(map);
        Object object = this.currentlyOnAirGetter;
        if (object != null && (object = ((CurrentlyOnAirGetter)object).getCurrentlyOnAir()) != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(((ScheduleProgram)object).getScheduleStart());
            stringBuilder.append(" / ");
            stringBuilder.append(((ScheduleProgram)object).program_name);
            map2.put((Object)"currently_on_air", (Object)stringBuilder.toString());
        }
        map2.put((Object)"online", (Object)TagManager.renderGTMBoolean(this.isNetworkAvailable()));
        object = this.context.getResources().getConfiguration().orientation == 2 ? "landscape" : "portrait";
        map2.put((Object)"orientation", object);
        map2.put((Object)"push_enabled", (Object)TagManager.renderGTMBoolean(NotificationManagerCompat.from((Context)this.context).areNotificationsEnabled()));
        object = ContainerHolderSingleton.getContainerHolder();
        if (object != null && object.getContainer() != null) {
            map2.put((Object)"samplerate", (Object)Long.valueOf((long)object.getContainer().getLong("samplerate")).toString());
        }
        if ((object = appVersionName) != null) {
            map2.put((Object)"app_version", object);
        }
        map2.putAll(map);
        return map2;
    }

    private Map<String, Object> prepareUserParams(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        Object object = this.userManager;
        if (object != null) {
            if (((UserManager)object).hasUserInfo()) {
                object = this.userManager.isOnAir() ? "open" : "closed";
                hashMap.put((Object)"on_air_closed_open", object);
            }
            boolean bl = this.userManager.isAuthorized();
            hashMap.put((Object)"auth", (Object)TagManager.renderGTMBoolean(bl));
            if (bl) {
                hashMap.put((Object)"user_id", (Object)this.userManager.getUserId());
                object = this.userManager.getCreateTime();
                if (object != null) {
                    hashMap.put((Object)"joined", object);
                }
            }
        }
        hashMap.putAll(map);
        return hashMap;
    }

    public static String renderGTMBoolean(boolean bl) {
        String string2 = bl ? "1" : "0";
        return string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String sanitizeDomain(String string2) {
        String string3;
        String string4 = "";
        try {
            URL uRL = new URL(string2);
            string2 = string3 = uRL.getHost();
        }
        catch (Exception exception) {
            return string4;
        }
        string2 = string4 = string3.replaceAll("\\.", "_");
        try {
            return string4 = string4.replaceAll("\\W", "");
        }
        catch (Exception exception) {
            // empty catch block
        }
        return string2;
    }

    public static void setupGTM(Application application) {
        com.google.android.gms.tagmanager.TagManager.getInstance((Context)application);
        TagManager.initVersionCode(application);
    }

    public void log(Map<String, Object> object) {
        Map<String, Object> map = this.prepareParams((Map<String, Object>)object);
        AppMetrica.log(map);
        this.logPixel(map);
        object = object.get((Object)"eventname");
        object = object != null ? object.toString() : "";
        map.remove((Object)"eventname");
        this.mFirebaseAnalytics.logEvent(object, this.mapToBundle(map));
    }

    public void logConnectionError(String string2, String string3, String string4) {
        string3 = z2.o("ce__", this.sanitizeDomain(string2));
        this.log((Map<String, Object>)new HashMap<String, Object>(this, string3.substring(0, Math.min((int)string3.length(), (int)40)), string4, string2){
            public final TagManager this$0;
            public final String val$domain;
            public final String val$errorMessage;
            public final String val$sanitizedEventName;
            {
                this.this$0 = tagManager;
                this.val$sanitizedEventName = string2;
                this.val$errorMessage = string3;
                this.val$domain = string4;
                this.put("eventname", string2);
                this.put("event", "connection_error");
                this.put("eventcode", "eventcode");
                this.put("eventlabel", string3);
                this.put("hostname", string4);
            }
        });
    }

    public void logError(String string2, String string3, String string4) {
        this.logEvent("error", string2, (Map<String, Object>)DataLayer.mapOf((Object[])new Object[]{"eventaction", string3, "eventlabel", string4}));
    }

    public void logEvent(String string2, String string3, Map<String, Object> hashMap) {
        HashMap hashMap2 = hashMap;
        if (hashMap == null) {
            hashMap2 = new HashMap();
        }
        hashMap2.put((Object)"event", (Object)"event");
        if (string3 != null) {
            hashMap2.put((Object)"screenname", (Object)string3);
        }
        hashMap2.put((Object)"eventname", (Object)string2);
        this.log((Map<String, Object>)hashMap2);
    }

    public void logOpenView(String string2) {
        this.logOpenView(string2, (Map<String, Object>)new HashMap());
    }

    public void logOpenView(String string2, Map<String, Object> map) {
        map.put((Object)"event", (Object)"screenview");
        map.put((Object)"screenname", (Object)string2);
        this.log(map);
    }

    public Bundle paramsToBundle(Map<String, Object> iterator) {
        if (iterator != null && iterator.size() != 0) {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : iterator.entrySet()) {
                if (entry.getValue() == null) continue;
                if (entry.getValue() instanceof Integer) {
                    bundle.putInt((String)entry.getKey(), ((Integer)entry.getValue()).intValue());
                    continue;
                }
                if (entry.getValue() instanceof Float) {
                    bundle.putFloat((String)entry.getKey(), ((Float)entry.getValue()).floatValue());
                    continue;
                }
                if (entry.getValue() instanceof Double) {
                    bundle.putDouble((String)entry.getKey(), ((Double)entry.getValue()).doubleValue());
                    continue;
                }
                if (entry.getValue() instanceof Long) {
                    bundle.putLong((String)entry.getKey(), ((Long)entry.getValue()).longValue());
                    continue;
                }
                if (!(entry.getValue() instanceof String)) continue;
                bundle.putString((String)entry.getKey(), entry.getValue().toString());
            }
            return bundle;
        }
        return null;
    }

    public void stop() {
        this.userManager = null;
    }
}

