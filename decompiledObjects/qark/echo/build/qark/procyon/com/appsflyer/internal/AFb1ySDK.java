// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.nio.charset.Charset;
import android.util.Base64;
import com.appsflyer.AFLogger;

public final class AFb1ySDK
{
    public AFe1qSDK AFInAppEventParameterName;
    public long AFInAppEventType;
    public final AFb1dSDK AFKeystoreWrapper;
    public long valueOf;
    
    public AFb1ySDK() {
    }
    
    public AFb1ySDK(final AFb1dSDK afKeystoreWrapper) {
        this.AFKeystoreWrapper = afKeystoreWrapper;
        this.AFInAppEventParameterName = this.AFInAppEventType();
        this.valueOf = afKeystoreWrapper.valueOf("af_rc_timestamp", 0L);
        this.AFInAppEventType = afKeystoreWrapper.valueOf("af_rc_max_age", 0L);
    }
    
    private AFe1qSDK AFInAppEventType() {
        final String values = this.AFKeystoreWrapper.values("af_remote_config", null);
        if (values == null) {
            AFLogger.afDebugLog("CFG: No configuration found in cache");
            return null;
        }
        try {
            return new AFe1qSDK(new String(Base64.decode(values, 2), Charset.defaultCharset()));
        }
        catch (Exception ex) {
            AFLogger.afErrorLog("CFG: Error reading malformed configuration from cache, requires fetching from remote again", ex, true);
            return null;
        }
    }
}
