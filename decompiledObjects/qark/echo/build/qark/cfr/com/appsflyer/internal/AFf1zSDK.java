/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFf1wSDK;

public final class AFf1zSDK {
    @NonNull
    public final String AFInAppEventParameterName;
    public final String AFInAppEventType;
    public final long AFKeystoreWrapper;
    public final String AFLogger;
    public final Throwable afDebugLog;
    public final AFf1wSDK afInfoLog;
    public final long valueOf;
    public final int values;

    public AFf1zSDK(String string2, @NonNull String string3, long l8, long l9, int n8, AFf1wSDK aFf1wSDK, String string4, Throwable throwable) {
        this.AFInAppEventType = string2;
        this.AFInAppEventParameterName = string3;
        this.AFKeystoreWrapper = l8;
        this.valueOf = l9;
        this.values = n8;
        this.afInfoLog = aFf1wSDK;
        this.AFLogger = string4;
        this.afDebugLog = throwable;
    }
}

