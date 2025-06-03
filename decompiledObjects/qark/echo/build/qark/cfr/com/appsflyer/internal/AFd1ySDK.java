/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.appsflyer.internal;

public final class AFd1ySDK
extends Enum<AFd1ySDK> {
    public static final /* enum */ AFd1ySDK AFInAppEventParameterName;
    public static final /* enum */ AFd1ySDK AFInAppEventType;
    public static final /* enum */ AFd1ySDK valueOf;
    private static final /* synthetic */ AFd1ySDK[] values;

    static {
        AFd1ySDK aFd1ySDK;
        AFd1ySDK aFd1ySDK2;
        AFd1ySDK aFd1ySDK3;
        AFInAppEventParameterName = aFd1ySDK2 = new AFd1ySDK();
        valueOf = aFd1ySDK = new AFd1ySDK();
        AFInAppEventType = aFd1ySDK3 = new AFd1ySDK();
        values = new AFd1ySDK[]{aFd1ySDK2, aFd1ySDK, aFd1ySDK3};
    }

    private AFd1ySDK() {
    }

    public static AFd1ySDK valueOf(String string2) {
        return (AFd1ySDK)Enum.valueOf(AFd1ySDK.class, (String)string2);
    }

    public static AFd1ySDK[] values() {
        return (AFd1ySDK[])values.clone();
    }
}

