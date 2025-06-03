/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.networktasks.api;

public final class RequestBodyEncryptionMode
extends Enum {
    public static final /* enum */ RequestBodyEncryptionMode AES_RSA;
    public static final /* enum */ RequestBodyEncryptionMode NONE;
    private static final RequestBodyEncryptionMode[] a;

    static {
        RequestBodyEncryptionMode requestBodyEncryptionMode;
        RequestBodyEncryptionMode requestBodyEncryptionMode2;
        NONE = requestBodyEncryptionMode2 = new RequestBodyEncryptionMode("NONE", 0);
        AES_RSA = requestBodyEncryptionMode = new RequestBodyEncryptionMode("AES_RSA", 1);
        a = new RequestBodyEncryptionMode[]{requestBodyEncryptionMode2, requestBodyEncryptionMode};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private RequestBodyEncryptionMode() {
        void var2_-1;
        void var1_-1;
    }

    public static RequestBodyEncryptionMode valueOf(String string) {
        return (RequestBodyEncryptionMode)Enum.valueOf(RequestBodyEncryptionMode.class, (String)string);
    }

    public static RequestBodyEncryptionMode[] values() {
        return (RequestBodyEncryptionMode[])a.clone();
    }
}

