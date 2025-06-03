/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Enum
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Void
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.h;

public final class B
extends Enum {
    public static final /* enum */ B A;
    public static final /* synthetic */ B[] B;
    public static final /* enum */ B r;
    public static final /* enum */ B s;
    public static final /* enum */ B t;
    public static final /* enum */ B u;
    public static final /* enum */ B v;
    public static final /* enum */ B w;
    public static final /* enum */ B x;
    public static final /* enum */ B y;
    public static final /* enum */ B z;
    public final Class o;
    public final Class p;
    public final Object q;

    static {
        B b8;
        B b9;
        B b10;
        B b11;
        B b12;
        B b13;
        B b14;
        B b15;
        B b16;
        r = b10 = new B(Void.class, Void.class, null);
        Object object = Integer.TYPE;
        s = b8 = new B((Class)object, Integer.class, 0);
        t = b15 = new B(Long.TYPE, Long.class, 0L);
        u = b11 = new B(Float.TYPE, Float.class, (Object)Float.valueOf((float)0.0f));
        v = b16 = new B(Double.TYPE, Double.class, 0.0);
        w = b9 = new B(Boolean.TYPE, Boolean.class, (Object)Boolean.FALSE);
        x = b13 = new B(String.class, String.class, "");
        y = b12 = new B(h.class, h.class, h.p);
        z = object = new B((Class)object, Integer.class, null);
        A = b14 = new B(Object.class, Object.class, null);
        B = new B[]{b10, b8, b15, b11, b16, b9, b13, b12, object, b14};
    }

    public B(Class class_, Class class_2, Object object) {
        this.o = class_;
        this.p = class_2;
        this.q = object;
    }

    public static B valueOf(String string2) {
        return (B)Enum.valueOf(B.class, (String)string2);
    }

    public static B[] values() {
        return (B[])B.clone();
    }

    public Class c() {
        return this.p;
    }
}

