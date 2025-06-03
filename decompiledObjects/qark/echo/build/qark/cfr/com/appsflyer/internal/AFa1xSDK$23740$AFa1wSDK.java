/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.appsflyer.internal;

public final class AFa1xSDK$23740$AFa1wSDK
extends Enum<AFa1xSDK$23740$AFa1wSDK> {
    private static final /* synthetic */ AFa1xSDK$23740$AFa1wSDK[] AFInAppEventType;
    public static final /* enum */ AFa1xSDK$23740$AFa1wSDK valueOf;
    public static final /* enum */ AFa1xSDK$23740$AFa1wSDK values;
    public String AFKeystoreWrapper;

    static {
        AFa1xSDK$23740$AFa1wSDK aFa1xSDK$23740$AFa1wSDK;
        AFa1xSDK$23740$AFa1wSDK aFa1xSDK$23740$AFa1wSDK2;
        valueOf = aFa1xSDK$23740$AFa1wSDK2 = new AFa1xSDK$23740$AFa1wSDK("hk");
        values = aFa1xSDK$23740$AFa1wSDK = new AFa1xSDK$23740$AFa1wSDK("dbg");
        AFInAppEventType = new AFa1xSDK$23740$AFa1wSDK[]{aFa1xSDK$23740$AFa1wSDK2, aFa1xSDK$23740$AFa1wSDK};
    }

    private AFa1xSDK$23740$AFa1wSDK(String string3) {
        this.AFKeystoreWrapper = string3;
    }

    public static AFa1xSDK$23740$AFa1wSDK valueOf(String string2) {
        return (AFa1xSDK$23740$AFa1wSDK)Enum.valueOf(AFa1xSDK$23740$AFa1wSDK.class, (String)string2);
    }

    public static AFa1xSDK$23740$AFa1wSDK[] values() {
        return (AFa1xSDK$23740$AFa1wSDK[])AFInAppEventType.clone();
    }
}

