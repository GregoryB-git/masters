package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFc1bSDK.AnonymousClass4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFb1sSDK {
    public static Intent valueOf;
    public DeepLinkListener AFInAppEventParameterName;
    public String AFKeystoreWrapper;
    public String[] afDebugLog;
    public long afInfoLog;
    private final AFc1xSDK afRDLog;
    public Map<String, String> values;

    @NonNull
    public List<List<String>> AFInAppEventType = new ArrayList();

    @NonNull
    public final List<String> AFLogger = new ArrayList();

    public AFb1sSDK(@NonNull AFc1xSDK aFc1xSDK) {
        this.afRDLog = aFc1xSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[LOOP:0: B:42:0x0046->B:51:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean AFInAppEventParameterName(android.content.Intent r9, android.content.Context r10, java.util.Map<java.lang.String, java.lang.Object> r11) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1sSDK.AFInAppEventParameterName(android.content.Intent, android.content.Context, java.util.Map):boolean");
    }

    private static void AFKeystoreWrapper(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1eSDK.valueOf().AFInAppEventParameterName;
        if (appsFlyerConversionListener != null) {
            try {
                AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                appsFlyerConversionListener.onAttributionFailure(str);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    private Uri values(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri parse = Uri.parse(obj.toString());
                if (parse == null || parse.getScheme() == null || parse.getHost() == null) {
                    return null;
                }
                return parse;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException e7) {
                AFLogger.afErrorLogForExcManagerOnly("recursiveSearch error", e7);
                return null;
            }
        }
        return null;
    }

    public final void AFInAppEventType(DeepLinkResult deepLinkResult) {
        if (this.AFInAppEventParameterName == null) {
            AFLogger.afDebugLog("[DDL] skipping, no callback registered");
            return;
        }
        StringBuilder sb = new StringBuilder("[DDL] Calling onDeepLinking with:\n");
        sb.append(deepLinkResult.toString());
        AFLogger.afDebugLog(sb.toString());
        try {
            this.AFInAppEventParameterName.onDeepLinking(deepLinkResult);
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getLocalizedMessage(), th);
        }
    }

    public final void valueOf(Context context, Map<String, Object> map, Uri uri) {
        AFd1kSDK aFd1kSDK = new AFd1kSDK(context, map, uri, this.AFLogger);
        AFa1eSDK.valueOf().AFKeystoreWrapper(context);
        AFc1bSDK AFVersionDeclaration = this.afRDLog.AFVersionDeclaration();
        AFVersionDeclaration.AFKeystoreWrapper.execute(AFVersionDeclaration.new AnonymousClass4(aFd1kSDK));
        valueOf = null;
    }

    public final void AFInAppEventType(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (this.AFInAppEventParameterName == null) {
            AFKeystoreWrapper(map);
            return;
        }
        try {
            try {
                DeepLink AFKeystoreWrapper = DeepLink.AFKeystoreWrapper(map);
                AFKeystoreWrapper.valueOf.put("is_deferred", false);
                deepLinkResult = new DeepLinkResult(AFKeystoreWrapper, null);
            } catch (JSONException e7) {
                AFLogger.afErrorLog("[DDL] Error occurred", e7, true);
                deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
            }
            AFInAppEventType(deepLinkResult);
        } catch (Throwable th) {
            AFInAppEventType(new DeepLinkResult(null, null));
            throw th;
        }
    }

    public final void AFKeystoreWrapper(String str, DeepLinkResult.Error error) {
        if (this.AFInAppEventParameterName == null) {
            AFKeystoreWrapper(str);
        } else {
            AFLogger.afDebugLog("[DDL] Error occurred: ".concat(String.valueOf(str)));
            AFInAppEventType(new DeepLinkResult(null, error));
        }
    }

    public final void valueOf(Map<String, Object> map, Intent intent, Context context) {
        AFc1ySDK aFc1ySDK = (AFc1ySDK) this.afRDLog;
        if (context != null) {
            aFc1ySDK.valueOf.AFInAppEventType = context.getApplicationContext();
        }
        if (!AFInAppEventParameterName(intent, context, map) && this.AFInAppEventParameterName != null && this.afRDLog.AFInAppEventParameterName().AFInAppEventType.values("appsFlyerCount", 0) == 0 && !this.afRDLog.values().valueOf("ddl_sent")) {
            AFb1mSDK aFb1mSDK = new AFb1mSDK(this.afRDLog);
            AFc1bSDK AFVersionDeclaration = this.afRDLog.AFVersionDeclaration();
            AFVersionDeclaration.AFKeystoreWrapper.execute(AFVersionDeclaration.new AnonymousClass4(new AFd1mSDK(aFb1mSDK)));
        }
        this.afRDLog.values().values("ddl_sent", true);
    }

    private static void AFKeystoreWrapper(Map<String, String> map) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1eSDK.valueOf().AFInAppEventParameterName;
        if (appsFlyerConversionListener != null) {
            try {
                StringBuilder sb = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb.append(map.toString());
                AFLogger.afDebugLog(sb.toString());
                appsFlyerConversionListener.onAppOpenAttribution(map);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }
}
