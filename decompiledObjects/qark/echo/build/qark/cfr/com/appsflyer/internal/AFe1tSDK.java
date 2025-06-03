/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.appsflyer.internal;

public final class AFe1tSDK
extends Enum<AFe1tSDK> {
    public static final /* enum */ AFe1tSDK AFInAppEventParameterName;
    public static final /* enum */ AFe1tSDK AFInAppEventType;
    private static final /* synthetic */ AFe1tSDK[] valueOf;
    public static final /* enum */ AFe1tSDK values;

    static {
        AFe1tSDK aFe1tSDK;
        AFe1tSDK aFe1tSDK2;
        AFe1tSDK aFe1tSDK3;
        AFInAppEventParameterName = aFe1tSDK = new AFe1tSDK();
        AFInAppEventType = aFe1tSDK2 = new AFe1tSDK();
        values = aFe1tSDK3 = new AFe1tSDK();
        valueOf = new AFe1tSDK[]{aFe1tSDK, aFe1tSDK2, aFe1tSDK3};
    }

    private AFe1tSDK() {
    }

    public static AFe1tSDK valueOf(String string2) {
        return (AFe1tSDK)Enum.valueOf(AFe1tSDK.class, (String)string2);
    }

    public static AFe1tSDK[] values() {
        return (AFe1tSDK[])valueOf.clone();
    }
}

