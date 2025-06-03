package com.appsflyer.internal;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes.dex */
public final class AFd1jSDK extends AFd1oSDK<String> {
    private final AFe1fSDK afInfoLog;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AFd1jSDK(@androidx.annotation.NonNull com.appsflyer.internal.AFe1fSDK r8, @androidx.annotation.NonNull com.appsflyer.internal.AFc1xSDK r9) {
        /*
            r7 = this;
            com.appsflyer.internal.AFd1vSDK r0 = r8.AFLogger$LogLevel
            if (r0 == 0) goto L6
        L4:
            r2 = r0
            goto L9
        L6:
            com.appsflyer.internal.AFd1vSDK r0 = com.appsflyer.internal.AFd1vSDK.CACHED_EVENT
            goto L4
        L9:
            r0 = 1
            com.appsflyer.internal.AFd1vSDK[] r3 = new com.appsflyer.internal.AFd1vSDK[r0]
            com.appsflyer.internal.AFd1vSDK r0 = com.appsflyer.internal.AFd1vSDK.RC_CDN
            r1 = 0
            r3[r1] = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.AFInAppEventType
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            java.lang.String r1 = valueOf(r8)
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            java.lang.String r6 = r8.AFInAppEventType
            r1 = r7
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r7.afInfoLog = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1jSDK.<init>(com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFc1xSDK):void");
    }

    private static String valueOf(AFe1fSDK aFe1fSDK) {
        try {
            return new URL(aFe1fSDK.afRDLog).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK, com.appsflyer.internal.AFd1zSDK
    public final boolean AFInAppEventParameterName() {
        ResponseNetwork responseNetwork;
        AFd1vSDK aFd1vSDK = this.afInfoLog.AFLogger$LogLevel;
        if (aFd1vSDK == null) {
            aFd1vSDK = AFd1vSDK.CACHED_EVENT;
        }
        return (aFd1vSDK == AFd1vSDK.ARS_VALIDATE && (responseNetwork = ((AFd1oSDK) this).afErrorLog) != null && responseNetwork.getStatusCode() == 424) || super.AFInAppEventParameterName();
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final boolean afInfoLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final AppsFlyerRequestListener afRDLog() {
        return this.afInfoLog.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final AFc1qSDK<String> values(@NonNull String str) {
        String encodeToString = Base64.encodeToString(this.afInfoLog.AFKeystoreWrapper(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(encodeToString)));
        this.afRDLog.valueOf(this.afInfoLog.afRDLog, encodeToString);
        return ((AFd1oSDK) this).AFLogger.values(this.afInfoLog);
    }
}
