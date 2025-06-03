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
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.q3;

public final class l4
extends Enum {
    public static final /* enum */ l4 A;
    public static final /* synthetic */ l4[] B;
    public static final /* enum */ l4 r;
    public static final /* enum */ l4 s;
    public static final /* enum */ l4 t;
    public static final /* enum */ l4 u;
    public static final /* enum */ l4 v;
    public static final /* enum */ l4 w;
    public static final /* enum */ l4 x;
    public static final /* enum */ l4 y;
    public static final /* enum */ l4 z;
    public final Class o;
    public final Class p;
    public final Object q;

    static {
        l4 l42;
        l4 l43;
        l4 l44;
        l4 l45;
        l4 l46;
        l4 l47;
        l4 l48;
        l4 l49;
        l4 l410;
        r = l48 = new l4(Void.class, Void.class, null);
        Object object = Integer.TYPE;
        s = l46 = new l4((Class)object, Integer.class, 0);
        t = l47 = new l4(Long.TYPE, Long.class, 0L);
        u = l43 = new l4(Float.TYPE, Float.class, (Object)Float.valueOf((float)0.0f));
        v = l42 = new l4(Double.TYPE, Double.class, 0.0);
        w = l410 = new l4(Boolean.TYPE, Boolean.class, (Object)Boolean.FALSE);
        x = l45 = new l4(String.class, String.class, "");
        y = l49 = new l4(q3.class, q3.class, q3.p);
        z = object = new l4((Class)object, Integer.class, null);
        A = l44 = new l4(Object.class, Object.class, null);
        B = new l4[]{l48, l46, l47, l43, l42, l410, l45, l49, object, l44};
    }

    public l4(Class class_, Class class_2, Object object) {
        this.o = class_;
        this.p = class_2;
        this.q = object;
    }

    public static l4[] values() {
        return (l4[])B.clone();
    }

    public final Class c() {
        return this.p;
    }
}

