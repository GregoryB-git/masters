// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;

public final class AFe1zSDK
{
    private static final long AFKeystoreWrapper;
    private final AFb1gSDK AFInAppEventParameterName;
    private final AFb1ySDK values;
    
    static {
        AFKeystoreWrapper = TimeUnit.HOURS.toSeconds(24L);
    }
    
    public AFe1zSDK(final AFb1gSDK afInAppEventParameterName, final AFb1ySDK values) {
        this.AFInAppEventParameterName = afInAppEventParameterName;
        this.values = values;
    }
    
    public final boolean AFInAppEventParameterName() {
        if (this.values.AFInAppEventParameterName == null) {
            AFLogger.afInfoLog("CFG: active config is missing - fetching from CDN");
            return true;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final AFb1ySDK values = this.values;
        return currentTimeMillis - values.valueOf > TimeUnit.SECONDS.toMillis(values.AFInAppEventType);
    }
    
    public final long AFKeystoreWrapper() {
        final String afInAppEventType = this.AFInAppEventParameterName.AFInAppEventType("com.appsflyer.rc.cache.max-age-fallback");
        if (afInAppEventType != null) {
            try {
                return Long.parseLong(afInAppEventType);
            }
            catch (NumberFormatException ex) {
                final StringBuilder sb = new StringBuilder("Can't read maxAgeFallback from Manifest: ");
                sb.append(ex.getMessage());
                AFLogger.afErrorLog(sb.toString(), ex);
                return AFe1zSDK.AFKeystoreWrapper;
            }
        }
        return AFe1zSDK.AFKeystoreWrapper;
    }
    
    public final boolean valueOf() {
        return Boolean.parseBoolean(this.AFInAppEventParameterName.AFInAppEventType("com.appsflyer.rc.staging"));
    }
    
    public final boolean values() {
        return Boolean.parseBoolean(this.AFInAppEventParameterName.AFInAppEventType("com.appsflyer.rc.sandbox"));
    }
}
