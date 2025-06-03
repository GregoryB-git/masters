/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Deprecated
 *  java.lang.String
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFa1qSDK;
import com.appsflyer.internal.AFd1vSDK;

public final class AFe1fSDK
extends AFa1qSDK {
    public final AFd1vSDK AFLogger$LogLevel;

    @Deprecated
    public AFe1fSDK() {
        this.AFLogger$LogLevel = null;
    }

    public AFe1fSDK(String string2, byte[] arrby, String string3, AFd1vSDK aFd1vSDK) {
        super(null, string2, Boolean.FALSE);
        this.AFInAppEventType = string3;
        this.valueOf(arrby);
        this.AFLogger$LogLevel = aFd1vSDK;
    }

    @Override
    public final AFd1vSDK AFInAppEventType() {
        AFd1vSDK aFd1vSDK = this.AFLogger$LogLevel;
        if (aFd1vSDK != null) {
            return aFd1vSDK;
        }
        return AFd1vSDK.AFKeystoreWrapper;
    }
}

