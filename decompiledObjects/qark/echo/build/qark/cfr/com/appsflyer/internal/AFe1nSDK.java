/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.appsflyer.internal;

public final class AFe1nSDK
extends Enum<AFe1nSDK> {
    public static final /* enum */ AFe1nSDK AFInAppEventParameterName;
    public static final /* enum */ AFe1nSDK AFInAppEventType;
    public static final /* enum */ AFe1nSDK AFKeystoreWrapper;
    private static final /* synthetic */ AFe1nSDK[] valueOf;
    public static final /* enum */ AFe1nSDK values;

    static {
        AFe1nSDK aFe1nSDK;
        AFe1nSDK aFe1nSDK2;
        AFe1nSDK aFe1nSDK3;
        AFe1nSDK aFe1nSDK4;
        AFInAppEventParameterName = aFe1nSDK4 = new AFe1nSDK();
        values = aFe1nSDK2 = new AFe1nSDK();
        AFInAppEventType = aFe1nSDK = new AFe1nSDK();
        AFKeystoreWrapper = aFe1nSDK3 = new AFe1nSDK();
        valueOf = new AFe1nSDK[]{aFe1nSDK4, aFe1nSDK2, aFe1nSDK, aFe1nSDK3};
    }

    private AFe1nSDK() {
    }

    public static AFe1nSDK valueOf(String string2) {
        return (AFe1nSDK)Enum.valueOf(AFe1nSDK.class, (String)string2);
    }

    public static AFe1nSDK[] values() {
        return (AFe1nSDK[])valueOf.clone();
    }
}

