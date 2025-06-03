/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.MalformedURLException
 *  java.net.URL
 *  java.net.URLConnection
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.TimeUnit
 */
package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.internal.AFd1ySDK;
import com.appsflyer.internal.AFd1zSDK;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class AFd1kSDK
extends AFd1zSDK<Map<String, Object>> {
    private static final int afRDLog = (int)TimeUnit.SECONDS.toMillis(2L);
    private final Map<String, Object> AFLogger;
    private final List<String> AFLogger$LogLevel;
    private Map<String, Object> afDebugLog;
    private final Uri afErrorLog;
    private final Context afInfoLog;

    public AFd1kSDK(@NonNull Context context, @NonNull Map<String, Object> map, @NonNull Uri uri, @NonNull List<String> list) {
        super(AFd1vSDK.AFLogger, new AFd1vSDK[]{AFd1vSDK.values}, "ResolveEsp");
        this.afInfoLog = context;
        this.AFLogger = map;
        this.afErrorLog = uri;
        this.AFLogger$LogLevel = list;
    }

    private boolean AFInAppEventParameterName(String string2) {
        if (string2.contains((CharSequence)"af_tranid=")) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder("Validate if link ");
        stringBuilder.append(string2);
        stringBuilder.append(" belongs to ESP domains: ");
        stringBuilder.append(this.AFLogger$LogLevel);
        AFLogger.afRDLog(stringBuilder.toString());
        try {
            boolean bl = this.AFLogger$LogLevel.contains((Object)new URL(string2).getHost());
            return bl;
        }
        catch (MalformedURLException malformedURLException) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", (Throwable)malformedURLException);
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Map<String, Object> AFKeystoreWrapper(Uri uri) {
        HashMap hashMap = new HashMap();
        try {
            StringBuilder stringBuilder = new StringBuilder("ESP deeplink resolving is started: ");
            stringBuilder.append(uri.toString());
            AFLogger.afDebugLog(stringBuilder.toString());
            uri = (HttpURLConnection)((URLConnection)FirebasePerfUrlConnection.instrument((Object)new URL(uri.toString()).openConnection()));
            uri.setInstanceFollowRedirects(false);
            int n8 = afRDLog;
            uri.setReadTimeout(n8);
            uri.setConnectTimeout(n8);
            uri.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            uri.setRequestProperty("af-esp", "6.12.2");
            n8 = uri.getResponseCode();
            hashMap.put((Object)"status", (Object)n8);
            if (300 <= n8 && n8 <= 305) {
                hashMap.put((Object)"res", (Object)uri.getHeaderField("Location"));
            }
            uri.disconnect();
            AFLogger.afDebugLog("ESP deeplink resolving is finished");
            return hashMap;
        }
        catch (Throwable throwable) {}
        hashMap.put((Object)"error", (Object)throwable.getLocalizedMessage());
        AFLogger.afErrorLog(throwable.getMessage(), throwable);
        return hashMap;
    }

    @Override
    public final boolean AFInAppEventParameterName() {
        return false;
    }

    @Override
    public final long AFInAppEventType() {
        return 60000L;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    @Override
    public final AFd1ySDK valueOf() {
        int n8;
        ArrayList arrayList;
        Object object2;
        long l8;
        Uri uri;
        Object object;
        Uri uri2;
        block7 : {
            if (!this.AFInAppEventParameterName(this.afErrorLog.toString())) {
                AFa1eSDK.valueOf().valueOf(this.afInfoLog, this.AFLogger, this.afErrorLog);
                return AFd1ySDK.AFInAppEventParameterName;
            }
            l8 = System.currentTimeMillis();
            object = this.afErrorLog.toString();
            arrayList = new ArrayList();
            uri = null;
            n8 = 0;
            object2 = null;
            do {
                uri2 = object;
                if (n8 >= 5) break block7;
                object2 = AFd1kSDK.AFKeystoreWrapper(Uri.parse((String)object));
                object = (String)object2.get((Object)"res");
                uri2 = (Integer)object2.get((Object)"status");
                object2 = (String)object2.get((Object)"error");
                if (object == null || !this.AFInAppEventParameterName((String)object)) break;
                if (n8 < 4) {
                    arrayList.add(object);
                }
                ++n8;
                uri = uri2;
            } while (true);
            uri = uri2;
            uri2 = object;
        }
        HashMap hashMap = new HashMap();
        object = uri2 != null ? uri2 : "";
        hashMap.put((Object)"res", object);
        n8 = uri != null ? uri.intValue() : -1;
        hashMap.put((Object)"status", (Object)n8);
        if (object2 != null) {
            hashMap.put((Object)"error", object2);
        }
        if (!arrayList.isEmpty()) {
            hashMap.put((Object)"redirects", (Object)arrayList);
        }
        hashMap.put((Object)"latency", (Object)(System.currentTimeMillis() - l8));
        object = this.AFLogger;
        synchronized (object) {
            this.AFLogger.put((Object)"af_deeplink_r", (Object)hashMap);
            this.AFLogger.put((Object)"af_deeplink", (Object)this.afErrorLog.toString());
        }
        object = AFa1eSDK.valueOf();
        object2 = this.afInfoLog;
        uri = this.AFLogger;
        uri2 = uri2 != null ? Uri.parse(uri2) : this.afErrorLog;
        object.valueOf((Context)object2, (Map<String, Object>)uri, uri2);
        this.afDebugLog = hashMap;
        return AFd1ySDK.AFInAppEventParameterName;
    }
}

