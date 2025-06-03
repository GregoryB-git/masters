package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;

/* loaded from: classes.dex */
public final class AFd1sSDK extends AFd1oSDK<String> {

    @NonNull
    private final String afInfoLog;
    private final AFf1cSDK getLevel;

    public AFd1sSDK(@NonNull AFc1xSDK aFc1xSDK, @NonNull String str, AFf1cSDK aFf1cSDK) {
        super(AFd1vSDK.IMPRESSIONS, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, aFc1xSDK, str);
        this.afInfoLog = str;
        this.getLevel = aFf1cSDK;
    }

    @Override // com.appsflyer.internal.AFd1oSDK, com.appsflyer.internal.AFd1zSDK
    public final boolean AFInAppEventParameterName() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final boolean afInfoLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final AppsFlyerRequestListener afRDLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final AFc1qSDK<String> values(@NonNull String str) {
        return ((AFd1oSDK) this).AFLogger.AFInAppEventParameterName(this.afInfoLog);
    }

    @Override // com.appsflyer.internal.AFd1oSDK, com.appsflyer.internal.AFd1zSDK
    public final void values() {
        super.values();
        AFc1gSDK<Result> aFc1gSDK = ((AFd1oSDK) this).afErrorLog;
        if (aFc1gSDK != 0) {
            int statusCode = aFc1gSDK.getStatusCode();
            if (statusCode == 200) {
                StringBuilder sb = new StringBuilder("Cross promotion impressions success: ");
                sb.append(this.afInfoLog);
                AFLogger.afInfoLog(sb.toString(), false);
                return;
            }
            if (statusCode != 301 && statusCode != 302) {
                StringBuilder sb2 = new StringBuilder("call to ");
                sb2.append(this.afInfoLog);
                sb2.append(" failed: ");
                sb2.append(statusCode);
                AFLogger.afInfoLog(sb2.toString());
                return;
            }
            StringBuilder sb3 = new StringBuilder("Cross promotion redirection success: ");
            sb3.append(this.afInfoLog);
            AFLogger.afInfoLog(sb3.toString(), false);
            String AFInAppEventType = aFc1gSDK.AFInAppEventType("Location");
            AFf1cSDK aFf1cSDK = this.getLevel;
            if (aFf1cSDK == null || AFInAppEventType == null) {
                return;
            }
            aFf1cSDK.AFInAppEventType = AFInAppEventType;
            Context context = aFf1cSDK.AFKeystoreWrapper.get();
            if (context != null) {
                try {
                    if (aFf1cSDK.AFInAppEventType != null) {
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aFf1cSDK.AFInAppEventType)).setFlags(268435456));
                    }
                } catch (Exception e7) {
                    AFLogger.afErrorLog("Failed to open cross promotion url, does OS have browser installed?".concat(String.valueOf(e7)), e7);
                }
            }
        }
    }
}
