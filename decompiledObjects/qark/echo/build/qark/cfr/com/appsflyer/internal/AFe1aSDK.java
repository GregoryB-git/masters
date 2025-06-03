/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.appsflyer.internal;

public final class AFe1aSDK
extends Enum<AFe1aSDK> {
    public static final /* enum */ AFe1aSDK AFInAppEventType;
    public static final /* enum */ AFe1aSDK AFKeystoreWrapper;
    private static final /* synthetic */ AFe1aSDK[] valueOf;

    static {
        AFe1aSDK aFe1aSDK;
        AFe1aSDK aFe1aSDK2;
        AFInAppEventType = aFe1aSDK = new AFe1aSDK();
        AFKeystoreWrapper = aFe1aSDK2 = new AFe1aSDK();
        valueOf = new AFe1aSDK[]{aFe1aSDK, aFe1aSDK2};
    }

    private AFe1aSDK() {
    }

    public static AFe1aSDK valueOf(String string2) {
        return (AFe1aSDK)Enum.valueOf(AFe1aSDK.class, (String)string2);
    }

    public static AFe1aSDK[] values() {
        return (AFe1aSDK[])valueOf.clone();
    }
}

