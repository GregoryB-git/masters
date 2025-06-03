/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 */
package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1dSDK;
import com.appsflyer.internal.AFe1qSDK;
import java.nio.charset.Charset;

public final class AFb1ySDK {
    public AFe1qSDK AFInAppEventParameterName;
    public long AFInAppEventType;
    public final AFb1dSDK AFKeystoreWrapper;
    public long valueOf;

    public AFb1ySDK() {
    }

    public AFb1ySDK(AFb1dSDK aFb1dSDK) {
        this.AFKeystoreWrapper = aFb1dSDK;
        this.AFInAppEventParameterName = this.AFInAppEventType();
        this.valueOf = aFb1dSDK.valueOf("af_rc_timestamp", 0L);
        this.AFInAppEventType = aFb1dSDK.valueOf("af_rc_max_age", 0L);
    }

    private AFe1qSDK AFInAppEventType() {
        Object object = this.AFKeystoreWrapper.values("af_remote_config", null);
        if (object == null) {
            AFLogger.afDebugLog("CFG: No configuration found in cache");
            return null;
        }
        try {
            object = new AFe1qSDK(new String(Base64.decode((String)object, (int)2), Charset.defaultCharset()));
            return object;
        }
        catch (Exception exception) {
            AFLogger.afErrorLog("CFG: Error reading malformed configuration from cache, requires fetching from remote again", (Throwable)exception, true);
            return null;
        }
    }
}

