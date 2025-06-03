/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.networktasks.api;

public final class NetworkTask$Method
extends Enum {
    public static final /* enum */ NetworkTask$Method GET;
    public static final /* enum */ NetworkTask$Method POST;
    private static final NetworkTask$Method[] a;

    static {
        NetworkTask$Method networkTask$Method;
        NetworkTask$Method networkTask$Method2;
        GET = networkTask$Method2 = new NetworkTask$Method("GET", 0);
        POST = networkTask$Method = new NetworkTask$Method("POST", 1);
        a = new NetworkTask$Method[]{networkTask$Method2, networkTask$Method};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private NetworkTask$Method() {
        void var2_-1;
        void var1_-1;
    }

    public static NetworkTask$Method valueOf(String string) {
        return (NetworkTask$Method)Enum.valueOf(NetworkTask$Method.class, (String)string);
    }

    public static NetworkTask$Method[] values() {
        return (NetworkTask$Method[])a.clone();
    }
}

