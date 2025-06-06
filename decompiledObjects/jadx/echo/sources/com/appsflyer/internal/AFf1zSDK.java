package com.appsflyer.internal;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
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

    public AFf1zSDK(String str, @NonNull String str2, long j7, long j8, int i7, AFf1wSDK aFf1wSDK, String str3, Throwable th) {
        this.AFInAppEventType = str;
        this.AFInAppEventParameterName = str2;
        this.AFKeystoreWrapper = j7;
        this.valueOf = j8;
        this.values = i7;
        this.afInfoLog = aFf1wSDK;
        this.AFLogger = str3;
        this.afDebugLog = th;
    }
}
