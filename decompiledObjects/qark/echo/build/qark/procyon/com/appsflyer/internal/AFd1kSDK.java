// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.io.Serializable;
import java.util.ArrayList;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.net.MalformedURLException;
import java.net.URL;
import com.appsflyer.AFLogger;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;
import android.content.Context;
import android.net.Uri;
import java.util.List;
import java.util.Map;

public final class AFd1kSDK extends AFd1zSDK<Map<String, Object>>
{
    private static final int afRDLog;
    private final Map<String, Object> AFLogger;
    private final List<String> AFLogger$LogLevel;
    private Map<String, Object> afDebugLog;
    private final Uri afErrorLog;
    private final Context afInfoLog;
    
    static {
        afRDLog = (int)TimeUnit.SECONDS.toMillis(2L);
    }
    
    public AFd1kSDK(@NonNull final Context afInfoLog, @NonNull final Map<String, Object> afLogger, @NonNull final Uri afErrorLog, @NonNull final List<String> afLogger$LogLevel) {
        super(AFd1vSDK.AFLogger, new AFd1vSDK[] { AFd1vSDK.values }, "ResolveEsp");
        this.afInfoLog = afInfoLog;
        this.AFLogger = afLogger;
        this.afErrorLog = afErrorLog;
        this.AFLogger$LogLevel = afLogger$LogLevel;
    }
    
    private boolean AFInAppEventParameterName(final String s) {
        if (s.contains("af_tranid=")) {
            return false;
        }
        final StringBuilder sb = new StringBuilder("Validate if link ");
        sb.append(s);
        sb.append(" belongs to ESP domains: ");
        sb.append(this.AFLogger$LogLevel);
        com.appsflyer.AFLogger.afRDLog(sb.toString());
        try {
            return this.AFLogger$LogLevel.contains(new URL(s).getHost());
        }
        catch (MalformedURLException ex) {
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", ex);
            return false;
        }
    }
    
    private static Map<String, Object> AFKeystoreWrapper(final Uri uri) {
        final HashMap<String, Integer> hashMap = (HashMap<String, Integer>)new HashMap<String, Object>();
        while (true) {
            try {
                final StringBuilder sb = new StringBuilder("ESP deeplink resolving is started: ");
                sb.append(uri.toString());
                AFLogger.afDebugLog(sb.toString());
                final HttpURLConnection httpURLConnection = (HttpURLConnection)FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection());
                httpURLConnection.setInstanceFollowRedirects(false);
                final int afRDLog = AFd1kSDK.afRDLog;
                httpURLConnection.setReadTimeout(afRDLog);
                httpURLConnection.setConnectTimeout(afRDLog);
                httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
                httpURLConnection.setRequestProperty("af-esp", "6.12.2");
                final int responseCode = httpURLConnection.getResponseCode();
                hashMap.put("status", responseCode);
                if (300 <= responseCode && responseCode <= 305) {
                    hashMap.put("res", (Integer)httpURLConnection.getHeaderField("Location"));
                }
                httpURLConnection.disconnect();
                AFLogger.afDebugLog("ESP deeplink resolving is finished");
                return (Map<String, Object>)hashMap;
                final Throwable t;
                hashMap.put("error", (Integer)t.getLocalizedMessage());
                AFLogger.afErrorLog(t.getMessage(), t);
                return (Map<String, Object>)hashMap;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public final boolean AFInAppEventParameterName() {
        return false;
    }
    
    @Override
    public final long AFInAppEventType() {
        return 60000L;
    }
    
    @NonNull
    @Override
    public final AFd1ySDK valueOf() {
        if (!this.AFInAppEventParameterName(this.afErrorLog.toString())) {
            AFa1eSDK.valueOf().valueOf(this.afInfoLog, this.AFLogger, this.afErrorLog);
        }
        else {
            final long currentTimeMillis = System.currentTimeMillis();
            String string = this.afErrorLog.toString();
            final ArrayList list = new ArrayList<String>();
            Number n = null;
            int n2 = 0;
            Serializable s = null;
            String s2;
            while (true) {
                s2 = string;
                if (n2 >= 5) {
                    break;
                }
                final Map<String, Object> afKeystoreWrapper = AFKeystoreWrapper(Uri.parse(string));
                string = (String)afKeystoreWrapper.get("res");
                final Integer n3 = afKeystoreWrapper.get("status");
                s = (String)afKeystoreWrapper.get("error");
                if (string == null || !this.AFInAppEventParameterName(string)) {
                    n = n3;
                    s2 = string;
                    break;
                }
                if (n2 < 4) {
                    list.add(string);
                }
                ++n2;
                n = n3;
            }
            final HashMap<String, Long> afDebugLog = new HashMap<String, Long>();
            Serializable s3;
            if (s2 != null) {
                s3 = s2;
            }
            else {
                s3 = "";
            }
            afDebugLog.put("res", (Long)s3);
            int intValue;
            if (n != null) {
                intValue = n.intValue();
            }
            else {
                intValue = -1;
            }
            afDebugLog.put("status", Long.valueOf(Integer.valueOf(intValue)));
            if (s != null) {
                afDebugLog.put("error", (Long)s);
            }
            if (!list.isEmpty()) {
                afDebugLog.put("redirects", (ArrayList<String>)list);
            }
            afDebugLog.put("latency", System.currentTimeMillis() - currentTimeMillis);
            Object o = this.AFLogger;
            synchronized (o) {
                this.AFLogger.put("af_deeplink_r", afDebugLog);
                this.AFLogger.put("af_deeplink", this.afErrorLog.toString());
                // monitorexit(o)
                o = AFa1eSDK.valueOf();
                final Context afInfoLog = this.afInfoLog;
                final Map<String, Object> afLogger = this.AFLogger;
                Uri uri;
                if (s2 != null) {
                    uri = Uri.parse(s2);
                }
                else {
                    uri = this.afErrorLog;
                }
                ((AFa1eSDK)o).valueOf(afInfoLog, afLogger, uri);
                this.afDebugLog = (Map<String, Object>)afDebugLog;
            }
        }
        return AFd1ySDK.AFInAppEventParameterName;
    }
}
