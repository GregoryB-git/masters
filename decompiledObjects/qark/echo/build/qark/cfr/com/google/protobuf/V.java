/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.protobuf;

public final class V
extends Enum {
    public static final /* enum */ V o = new V();
    public static final /* enum */ V p = new V();
    public static final /* synthetic */ V[] q;

    static {
        q = V.c();
    }

    public static /* synthetic */ V[] c() {
        return new V[]{o, p};
    }

    public static V valueOf(String string2) {
        return (V)Enum.valueOf(V.class, (String)string2);
    }

    public static V[] values() {
        return (V[])q.clone();
    }
}

