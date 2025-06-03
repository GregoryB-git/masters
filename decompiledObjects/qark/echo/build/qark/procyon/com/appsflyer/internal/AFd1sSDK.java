// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import android.content.Intent;
import android.net.Uri;
import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import androidx.annotation.NonNull;

public final class AFd1sSDK extends AFd1oSDK<String>
{
    @NonNull
    private final String afInfoLog;
    private final AFf1cSDK getLevel;
    
    public AFd1sSDK(@NonNull final AFc1xSDK aFc1xSDK, @NonNull final String afInfoLog, final AFf1cSDK getLevel) {
        super(AFd1vSDK.onAppOpenAttributionNative, new AFd1vSDK[] { AFd1vSDK.values }, aFc1xSDK, afInfoLog);
        this.afInfoLog = afInfoLog;
        this.getLevel = getLevel;
    }
    
    @Override
    public final boolean AFInAppEventParameterName() {
        return false;
    }
    
    @Override
    public final boolean afInfoLog() {
        return false;
    }
    
    @Override
    public final AppsFlyerRequestListener afRDLog() {
        return null;
    }
    
    @Override
    public final AFc1qSDK<String> values(@NonNull final String s) {
        return super.AFLogger.AFInAppEventParameterName(this.afInfoLog);
    }
    
    @Override
    public final void values() {
        super.values();
        final AFc1gSDK<Result> afErrorLog = (AFc1gSDK<Result>)super.afErrorLog;
        if (afErrorLog != null) {
            final int statusCode = afErrorLog.getStatusCode();
            if (statusCode != 200) {
                if (statusCode != 301 && statusCode != 302) {
                    final StringBuilder sb = new StringBuilder("call to ");
                    sb.append(this.afInfoLog);
                    sb.append(" failed: ");
                    sb.append(statusCode);
                    com.appsflyer.AFLogger.afInfoLog(sb.toString());
                    return;
                }
                final StringBuilder sb2 = new StringBuilder("Cross promotion redirection success: ");
                sb2.append(this.afInfoLog);
                com.appsflyer.AFLogger.afInfoLog(sb2.toString(), false);
                final String afInAppEventType = afErrorLog.AFInAppEventType("Location");
                final AFf1cSDK getLevel = this.getLevel;
                if (getLevel != null && afInAppEventType != null) {
                    getLevel.AFInAppEventType = afInAppEventType;
                    final Context context = getLevel.AFKeystoreWrapper.get();
                    if (context != null) {
                        try {
                            if (getLevel.AFInAppEventType != null) {
                                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getLevel.AFInAppEventType)).setFlags(268435456));
                            }
                        }
                        catch (Exception obj) {
                            com.appsflyer.AFLogger.afErrorLog("Failed to open cross promotion url, does OS have browser installed?".concat(String.valueOf(obj)), obj);
                        }
                    }
                }
            }
            else {
                final StringBuilder sb3 = new StringBuilder("Cross promotion impressions success: ");
                sb3.append(this.afInfoLog);
                com.appsflyer.AFLogger.afInfoLog(sb3.toString(), false);
            }
        }
    }
}
