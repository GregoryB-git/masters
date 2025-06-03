/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.appsflyer.internal;

public final class AFd1dSDK
extends Enum<AFd1dSDK> {
    public static final /* enum */ AFd1dSDK AFInAppEventParameterName;
    public static final /* enum */ AFd1dSDK AFKeystoreWrapper;
    private static final /* synthetic */ AFd1dSDK[] valueOf;
    public static final /* enum */ AFd1dSDK values;

    static {
        AFd1dSDK aFd1dSDK;
        AFd1dSDK aFd1dSDK2;
        AFd1dSDK aFd1dSDK3;
        values = aFd1dSDK = new AFd1dSDK();
        AFKeystoreWrapper = aFd1dSDK3 = new AFd1dSDK();
        AFInAppEventParameterName = aFd1dSDK2 = new AFd1dSDK();
        valueOf = new AFd1dSDK[]{aFd1dSDK, aFd1dSDK3, aFd1dSDK2};
    }

    private AFd1dSDK() {
    }

    public static AFd1dSDK valueOf(String string2) {
        return (AFd1dSDK)Enum.valueOf(AFd1dSDK.class, (String)string2);
    }

    public static AFd1dSDK[] values() {
        return (AFd1dSDK[])valueOf.clone();
    }
}

