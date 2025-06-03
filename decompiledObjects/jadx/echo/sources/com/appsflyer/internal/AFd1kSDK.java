package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
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

/* loaded from: classes.dex */
public final class AFd1kSDK extends AFd1zSDK<Map<String, Object>> {
    private static final int afRDLog = (int) TimeUnit.SECONDS.toMillis(2);
    private final Map<String, Object> AFLogger;
    private final List<String> AFLogger$LogLevel;
    private Map<String, Object> afDebugLog;
    private final Uri afErrorLog;
    private final Context afInfoLog;

    public AFd1kSDK(@NonNull Context context, @NonNull Map<String, Object> map, @NonNull Uri uri, @NonNull List<String> list) {
        super(AFd1vSDK.RESOLVE_ESP, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, "ResolveEsp");
        this.afInfoLog = context;
        this.AFLogger = map;
        this.afErrorLog = uri;
        this.AFLogger$LogLevel = list;
    }

    private static Map<String, Object> AFKeystoreWrapper(Uri uri) {
        HashMap hashMap = new HashMap();
        try {
            StringBuilder sb = new StringBuilder("ESP deeplink resolving is started: ");
            sb.append(uri.toString());
            AFLogger.afDebugLog(sb.toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection()));
            httpURLConnection.setInstanceFollowRedirects(false);
            int i7 = afRDLog;
            httpURLConnection.setReadTimeout(i7);
            httpURLConnection.setConnectTimeout(i7);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.12.2");
            int responseCode = httpURLConnection.getResponseCode();
            hashMap.put("status", Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                hashMap.put("res", httpURLConnection.getHeaderField("Location"));
            }
            httpURLConnection.disconnect();
            AFLogger.afDebugLog("ESP deeplink resolving is finished");
        } catch (Throwable th) {
            hashMap.put("error", th.getLocalizedMessage());
            AFLogger.afErrorLog(th.getMessage(), th);
        }
        return hashMap;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final boolean AFInAppEventParameterName() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final long AFInAppEventType() {
        return 60000L;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    @NonNull
    public final AFd1ySDK valueOf() {
        if (AFInAppEventParameterName(this.afErrorLog.toString())) {
            long currentTimeMillis = System.currentTimeMillis();
            String obj = this.afErrorLog.toString();
            ArrayList arrayList = new ArrayList();
            Integer num = null;
            int i7 = 0;
            String str = null;
            while (i7 < 5) {
                Map<String, Object> AFKeystoreWrapper = AFKeystoreWrapper(Uri.parse(obj));
                String str2 = (String) AFKeystoreWrapper.get("res");
                Integer num2 = (Integer) AFKeystoreWrapper.get("status");
                String str3 = (String) AFKeystoreWrapper.get("error");
                if (str2 == null || !AFInAppEventParameterName(str2)) {
                    str = str3;
                    obj = str2;
                    num = num2;
                    break;
                }
                if (i7 < 4) {
                    arrayList.add(str2);
                }
                i7++;
                str = str3;
                obj = str2;
                num = num2;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("res", obj != null ? obj : "");
            hashMap.put("status", Integer.valueOf(num != null ? num.intValue() : -1));
            if (str != null) {
                hashMap.put("error", str);
            }
            if (!arrayList.isEmpty()) {
                hashMap.put("redirects", arrayList);
            }
            hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            synchronized (this.AFLogger) {
                this.AFLogger.put("af_deeplink_r", hashMap);
                this.AFLogger.put("af_deeplink", this.afErrorLog.toString());
            }
            AFa1eSDK.valueOf().valueOf(this.afInfoLog, this.AFLogger, obj != null ? Uri.parse(obj) : this.afErrorLog);
            this.afDebugLog = hashMap;
        } else {
            AFa1eSDK.valueOf().valueOf(this.afInfoLog, this.AFLogger, this.afErrorLog);
        }
        return AFd1ySDK.SUCCESS;
    }

    private boolean AFInAppEventParameterName(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder sb = new StringBuilder("Validate if link ");
        sb.append(str);
        sb.append(" belongs to ESP domains: ");
        sb.append(this.AFLogger$LogLevel);
        AFLogger.afRDLog(sb.toString());
        try {
            return this.AFLogger$LogLevel.contains(new URL(str).getHost());
        } catch (MalformedURLException e7) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e7);
            return false;
        }
    }
}
