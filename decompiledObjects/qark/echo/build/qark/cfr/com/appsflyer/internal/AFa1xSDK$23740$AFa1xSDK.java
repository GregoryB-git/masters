/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.appsflyer.internal;

public final class AFa1xSDK$23740$AFa1xSDK
extends Enum<AFa1xSDK$23740$AFa1xSDK> {
    public static final /* enum */ AFa1xSDK$23740$AFa1xSDK AFInAppEventParameterName;
    private static final /* synthetic */ AFa1xSDK$23740$AFa1xSDK[] AFInAppEventType;
    public static final /* enum */ AFa1xSDK$23740$AFa1xSDK values;
    public String AFKeystoreWrapper;

    static {
        AFa1xSDK$23740$AFa1xSDK aFa1xSDK$23740$AFa1xSDK;
        AFa1xSDK$23740$AFa1xSDK aFa1xSDK$23740$AFa1xSDK2;
        values = aFa1xSDK$23740$AFa1xSDK2 = new AFa1xSDK$23740$AFa1xSDK("xps");
        AFInAppEventParameterName = aFa1xSDK$23740$AFa1xSDK = new AFa1xSDK$23740$AFa1xSDK("frd");
        AFInAppEventType = new AFa1xSDK$23740$AFa1xSDK[]{aFa1xSDK$23740$AFa1xSDK2, aFa1xSDK$23740$AFa1xSDK};
    }

    private AFa1xSDK$23740$AFa1xSDK(String string3) {
        this.AFKeystoreWrapper = string3;
    }

    public static AFa1xSDK$23740$AFa1xSDK valueOf(String string2) {
        return (AFa1xSDK$23740$AFa1xSDK)Enum.valueOf(AFa1xSDK$23740$AFa1xSDK.class, (String)string2);
    }

    public static AFa1xSDK$23740$AFa1xSDK[] values() {
        return (AFa1xSDK$23740$AFa1xSDK[])AFInAppEventType.clone();
    }
}

