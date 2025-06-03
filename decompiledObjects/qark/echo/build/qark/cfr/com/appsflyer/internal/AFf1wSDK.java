/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Locale
 */
package com.appsflyer.internal;

import androidx.annotation.NonNull;
import java.util.Locale;

public final class AFf1wSDK
extends Enum<AFf1wSDK> {
    public static final /* enum */ AFf1wSDK AFInAppEventParameterName;
    private static final /* synthetic */ AFf1wSDK[] AFInAppEventType;
    public static final /* enum */ AFf1wSDK AFKeystoreWrapper;
    public static final /* enum */ AFf1wSDK valueOf;
    public static final /* enum */ AFf1wSDK values;

    static {
        AFf1wSDK aFf1wSDK;
        AFf1wSDK aFf1wSDK2;
        AFf1wSDK aFf1wSDK3;
        AFf1wSDK aFf1wSDK4;
        AFInAppEventParameterName = aFf1wSDK4 = new AFf1wSDK();
        AFKeystoreWrapper = aFf1wSDK2 = new AFf1wSDK();
        valueOf = aFf1wSDK = new AFf1wSDK();
        values = aFf1wSDK3 = new AFf1wSDK();
        AFInAppEventType = new AFf1wSDK[]{aFf1wSDK4, aFf1wSDK2, aFf1wSDK, aFf1wSDK3};
    }

    private AFf1wSDK() {
    }

    public static AFf1wSDK valueOf(String string2) {
        return (AFf1wSDK)Enum.valueOf(AFf1wSDK.class, (String)string2);
    }

    public static AFf1wSDK[] values() {
        return (AFf1wSDK[])AFInAppEventType.clone();
    }

    @NonNull
    public final String toString() {
        return super.toString().toLowerCase(Locale.getDefault());
    }
}

