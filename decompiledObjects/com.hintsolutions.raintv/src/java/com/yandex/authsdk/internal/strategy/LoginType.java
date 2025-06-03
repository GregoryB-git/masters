/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.authsdk.internal.strategy;

public final class LoginType
extends Enum<LoginType> {
    private static final LoginType[] $VALUES;
    public static final /* enum */ LoginType BROWSER;
    public static final /* enum */ LoginType NATIVE;
    public static final /* enum */ LoginType WEBVIEW;

    static {
        LoginType loginType;
        LoginType loginType2;
        LoginType loginType3;
        NATIVE = loginType3 = new LoginType();
        BROWSER = loginType2 = new LoginType();
        WEBVIEW = loginType = new LoginType();
        $VALUES = new LoginType[]{loginType3, loginType2, loginType};
    }

    public static LoginType valueOf(String string2) {
        return (LoginType)Enum.valueOf(LoginType.class, (String)string2);
    }

    public static LoginType[] values() {
        return (LoginType[])$VALUES.clone();
    }
}

