// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import androidx.annotation.NonNull;

public final class AFf1zSDK
{
    @NonNull
    public final String AFInAppEventParameterName;
    public final String AFInAppEventType;
    public final long AFKeystoreWrapper;
    public final String AFLogger;
    public final Throwable afDebugLog;
    public final AFf1wSDK afInfoLog;
    public final long valueOf;
    public final int values;
    
    public AFf1zSDK(final String afInAppEventType, @NonNull final String afInAppEventParameterName, final long afKeystoreWrapper, final long valueOf, final int values, final AFf1wSDK afInfoLog, final String afLogger, final Throwable afDebugLog) {
        this.AFInAppEventType = afInAppEventType;
        this.AFInAppEventParameterName = afInAppEventParameterName;
        this.AFKeystoreWrapper = afKeystoreWrapper;
        this.valueOf = valueOf;
        this.values = values;
        this.afInfoLog = afInfoLog;
        this.AFLogger = afLogger;
        this.afDebugLog = afDebugLog;
    }
}
