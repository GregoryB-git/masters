package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public final class AFb1vSDK {

    @NotNull
    private final Map<String, Object> AFInAppEventParameterName;

    @NotNull
    private final String AFInAppEventType;
    private final PackageManager values;

    public AFb1vSDK() {
    }

    public AFb1vSDK(AFb1bSDK aFb1bSDK, AFb1gSDK aFb1gSDK) {
        Intrinsics.checkNotNullParameter(aFb1bSDK, "");
        Intrinsics.checkNotNullParameter(aFb1gSDK, "");
        this.AFInAppEventParameterName = new LinkedHashMap();
        Context context = aFb1bSDK.AFInAppEventType;
        this.values = context != null ? context.getPackageManager() : null;
        String packageName = aFb1gSDK.valueOf.AFInAppEventType.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        this.AFInAppEventType = packageName;
    }

    public static JSONObject AFKeystoreWrapper(String str) {
        JSONObject valueOf = AFa1rSDK.valueOf(str);
        if (valueOf != null) {
            try {
                boolean z7 = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
                boolean optBoolean = valueOf.optBoolean("monitor", false);
                AFb1tSDK afErrorLogForExcManagerOnly = AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly();
                if (!optBoolean || z7) {
                    afErrorLogForExcManagerOnly.AFInAppEventType();
                    afErrorLogForExcManagerOnly.values();
                } else {
                    afErrorLogForExcManagerOnly.AFKeystoreWrapper();
                }
                if (valueOf.has("ol_id")) {
                    String optString = valueOf.optString("ol_scheme", null);
                    String optString2 = valueOf.optString("ol_domain", null);
                    String optString3 = valueOf.optString("ol_ver", null);
                    if (optString != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_SCHEME, optString);
                    }
                    if (optString2 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_DOMAIN, optString2);
                    }
                    if (optString3 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_VERSION, optString3);
                    }
                }
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("Error in handleResponse: ");
                sb.append(th.getMessage());
                AFLogger.afErrorLogForExcManagerOnly(sb.toString(), th);
                AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventType();
                AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().values();
            }
        }
        return valueOf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        r2 = r3.getInstallSourceInfo(r2);
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.Object> AFInAppEventParameterName() {
        /*
            r5 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.AFInAppEventParameterName
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6b
            android.content.pm.PackageManager r0 = r5.values     // Catch: java.lang.Exception -> L1c
            if (r0 == 0) goto L22
            java.lang.String r1 = r5.AFInAppEventType     // Catch: java.lang.Exception -> L1c
            java.lang.String r0 = r0.getInstallerPackageName(r1)     // Catch: java.lang.Exception -> L1c
            if (r0 == 0) goto L22
            java.util.Map<java.lang.String, java.lang.Object> r1 = r5.AFInAppEventParameterName     // Catch: java.lang.Exception -> L1c
            java.lang.String r2 = "installer_package"
            r1.put(r2, r0)     // Catch: java.lang.Exception -> L1c
            goto L22
        L1c:
            r0 = move-exception
            java.lang.String r1 = "Exception while getting the app's installer package. "
            com.appsflyer.AFLogger.afErrorLog(r1, r0)
        L22:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L6b
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.AFInAppEventParameterName
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.lang.String r2 = r5.AFInAppEventType
            android.content.pm.PackageManager r3 = r5.values
            if (r3 == 0) goto L66
            android.content.pm.InstallSourceInfo r2 = com.appsflyer.internal.k.a(r3, r2)
            if (r2 == 0) goto L66
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.lang.String r3 = com.appsflyer.internal.l.a(r2)
            if (r3 == 0) goto L50
            java.lang.String r4 = "initiating_package"
            r1.put(r4, r3)
        L50:
            java.lang.String r3 = com.appsflyer.internal.m.a(r2)
            if (r3 == 0) goto L5b
            java.lang.String r4 = "installing_package"
            r1.put(r4, r3)
        L5b:
            java.lang.String r2 = com.appsflyer.internal.n.a(r2)
            if (r2 == 0) goto L66
            java.lang.String r3 = "originating_package"
            r1.put(r3, r2)
        L66:
            java.lang.String r2 = "install_source_info"
            r0.put(r2, r1)
        L6b:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.AFInAppEventParameterName
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1vSDK.AFInAppEventParameterName():java.util.Map");
    }
}
