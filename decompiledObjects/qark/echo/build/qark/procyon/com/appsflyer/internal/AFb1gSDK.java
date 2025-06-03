// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import android.os.BaseBundle;
import android.content.pm.PackageItemInfo;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import android.os.Bundle;

public final class AFb1gSDK
{
    private static String values = "262";
    private Bundle AFInAppEventParameterName;
    public final AFb1dSDK AFInAppEventType;
    public final AFb1bSDK valueOf;
    
    public AFb1gSDK(final AFb1bSDK valueOf, final AFb1dSDK afInAppEventType) {
        this.AFInAppEventParameterName = null;
        this.valueOf = valueOf;
        this.AFInAppEventType = afInAppEventType;
    }
    
    public static String AFKeystoreWrapper() {
        return AppsFlyerProperties.getInstance().getString("AppUserId");
    }
    
    public static String valueOf() {
        final StringBuilder sb = new StringBuilder("version: 6.12.2 (build ");
        sb.append(AFb1gSDK.values);
        sb.append(")");
        return sb.toString();
    }
    
    public final String AFInAppEventType(final String s) {
        final Throwable t;
        Label_0073: {
            try {
                if (this.AFInAppEventParameterName == null) {
                    this.AFInAppEventParameterName = ((PackageItemInfo)this.valueOf.AFInAppEventType.getPackageManager().getApplicationInfo(this.valueOf.AFInAppEventType.getPackageName(), 128)).metaData;
                }
            }
            finally {
                break Label_0073;
            }
            final Bundle afInAppEventParameterName = this.AFInAppEventParameterName;
            if (afInAppEventParameterName != null) {
                final Object value = ((BaseBundle)afInAppEventParameterName).get((String)t);
                if (value != null) {
                    return value.toString();
                }
            }
            return null;
        }
        final StringBuilder sb = new StringBuilder("Could not load manifest metadata!");
        sb.append(t.getMessage());
        AFLogger.afErrorLog(sb.toString(), t);
        return null;
    }
    
    public final boolean AFKeystoreWrapper(String afInAppEventType) {
        afInAppEventType = this.AFInAppEventType(afInAppEventType);
        return afInAppEventType != null && Boolean.parseBoolean(afInAppEventType);
    }
    
    public final String values() {
        String s;
        if ((s = AppsFlyerProperties.getInstance().getString("channel")) == null) {
            s = this.AFInAppEventType("CHANNEL");
        }
        String s2;
        if ((s2 = s) != null) {
            s2 = s;
            if (s.equals("")) {
                s2 = null;
            }
        }
        return s2;
    }
}
