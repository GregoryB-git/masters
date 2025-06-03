package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFb1uSDK {
    private final boolean AFInAppEventType;
    final long AFKeystoreWrapper;
    final String valueOf;

    public AFb1uSDK() {
    }

    public AFb1uSDK(String str, long j7, boolean z7) {
        this.valueOf = str;
        this.AFKeystoreWrapper = j7;
        this.AFInAppEventType = z7;
    }

    public static boolean AFInAppEventType(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean values(String str) {
        return str == null || str.length() == 0;
    }

    public final boolean AFKeystoreWrapper() {
        return this.AFInAppEventType;
    }
}
