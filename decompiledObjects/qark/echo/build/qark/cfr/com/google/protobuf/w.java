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
package com.google.protobuf;

import com.google.protobuf.f;

public final class w
extends Enum {
    public static final /* enum */ w A;
    public static final /* synthetic */ w[] B;
    public static final /* enum */ w r;
    public static final /* enum */ w s;
    public static final /* enum */ w t;
    public static final /* enum */ w u;
    public static final /* enum */ w v;
    public static final /* enum */ w w;
    public static final /* enum */ w x;
    public static final /* enum */ w y;
    public static final /* enum */ w z;
    public final Class o;
    public final Class p;
    public final Object q;

    static {
        r = new w(Void.class, Void.class, null);
        Class class_ = Integer.TYPE;
        s = new w(class_, Integer.class, 0);
        t = new w(Long.TYPE, Long.class, 0L);
        u = new w(Float.TYPE, Float.class, (Object)Float.valueOf((float)0.0f));
        v = new w(Double.TYPE, Double.class, 0.0);
        w = new w(Boolean.TYPE, Boolean.class, (Object)Boolean.FALSE);
        x = new w(String.class, String.class, "");
        y = new w(f.class, f.class, f.p);
        z = new w(class_, Integer.class, null);
        A = new w(Object.class, Object.class, null);
        B = w.c();
    }

    public w(Class class_, Class class_2, Object object) {
        this.o = class_;
        this.p = class_2;
        this.q = object;
    }

    public static /* synthetic */ w[] c() {
        return new w[]{r, s, t, u, v, w, x, y, z, A};
    }

    public static w valueOf(String string2) {
        return (w)Enum.valueOf(w.class, (String)string2);
    }

    public static w[] values() {
        return (w[])B.clone();
    }

    public Class e() {
        return this.p;
    }
}

