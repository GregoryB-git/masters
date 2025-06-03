/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.concurrent.TimeUnit
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1gSDK;
import com.appsflyer.internal.AFb1ySDK;
import com.appsflyer.internal.AFe1qSDK;
import java.util.concurrent.TimeUnit;

public final class AFe1zSDK {
    private static final long AFKeystoreWrapper = TimeUnit.HOURS.toSeconds(24L);
    private final AFb1gSDK AFInAppEventParameterName;
    private final AFb1ySDK values;

    public AFe1zSDK(AFb1gSDK aFb1gSDK, AFb1ySDK aFb1ySDK) {
        this.AFInAppEventParameterName = aFb1gSDK;
        this.values = aFb1ySDK;
    }

    public final boolean AFInAppEventParameterName() {
        if (this.values.AFInAppEventParameterName == null) {
            AFLogger.afInfoLog("CFG: active config is missing - fetching from CDN");
            return true;
        }
        long l8 = System.currentTimeMillis();
        AFb1ySDK aFb1ySDK = this.values;
        if (l8 - aFb1ySDK.valueOf > TimeUnit.SECONDS.toMillis(aFb1ySDK.AFInAppEventType)) {
            return true;
        }
        return false;
    }

    public final long AFKeystoreWrapper() {
        String string2 = this.AFInAppEventParameterName.AFInAppEventType("com.appsflyer.rc.cache.max-age-fallback");
        if (string2 != null) {
            try {
                long l8 = Long.parseLong((String)string2);
                return l8;
            }
            catch (NumberFormatException numberFormatException) {
                StringBuilder stringBuilder = new StringBuilder("Can't read maxAgeFallback from Manifest: ");
                stringBuilder.append(numberFormatException.getMessage());
                AFLogger.afErrorLog(stringBuilder.toString(), (Throwable)numberFormatException);
                return AFKeystoreWrapper;
            }
        }
        return AFKeystoreWrapper;
    }

    public final boolean valueOf() {
        return Boolean.parseBoolean((String)this.AFInAppEventParameterName.AFInAppEventType("com.appsflyer.rc.staging"));
    }

    public final boolean values() {
        return Boolean.parseBoolean((String)this.AFInAppEventParameterName.AFInAppEventType("com.appsflyer.rc.sandbox"));
    }
}

