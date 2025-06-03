/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.crypto.tink.shaded.protobuf;

public final class Z
extends Enum {
    public static final /* enum */ Z o;
    public static final /* enum */ Z p;
    public static final /* synthetic */ Z[] q;

    static {
        Z z8;
        Z z9;
        o = z9 = new Z();
        p = z8 = new Z();
        q = new Z[]{z9, z8};
    }

    public static Z valueOf(String string2) {
        return (Z)Enum.valueOf(Z.class, (String)string2);
    }

    public static Z[] values() {
        return (Z[])q.clone();
    }
}

