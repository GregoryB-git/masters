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
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.g;

public final class A
extends Enum {
    public static final /* enum */ A A;
    public static final /* synthetic */ A[] B;
    public static final /* enum */ A r;
    public static final /* enum */ A s;
    public static final /* enum */ A t;
    public static final /* enum */ A u;
    public static final /* enum */ A v;
    public static final /* enum */ A w;
    public static final /* enum */ A x;
    public static final /* enum */ A y;
    public static final /* enum */ A z;
    public final Class o;
    public final Class p;
    public final Object q;

    static {
        A a8;
        A a9;
        A a10;
        A a11;
        A a12;
        A a13;
        A a14;
        A a15;
        A a16;
        r = a9 = new A(Void.class, Void.class, null);
        Object object = Integer.TYPE;
        s = a12 = new A((Class)object, Integer.class, 0);
        t = a16 = new A(Long.TYPE, Long.class, 0L);
        u = a15 = new A(Float.TYPE, Float.class, (Object)Float.valueOf((float)0.0f));
        v = a14 = new A(Double.TYPE, Double.class, 0.0);
        w = a8 = new A(Boolean.TYPE, Boolean.class, (Object)Boolean.FALSE);
        x = a11 = new A(String.class, String.class, "");
        y = a13 = new A(g.class, g.class, g.p);
        z = object = new A((Class)object, Integer.class, null);
        A = a10 = new A(Object.class, Object.class, null);
        B = new A[]{a9, a12, a16, a15, a14, a8, a11, a13, object, a10};
    }

    public A(Class class_, Class class_2, Object object) {
        this.o = class_;
        this.p = class_2;
        this.q = object;
    }

    public static A valueOf(String string2) {
        return (A)Enum.valueOf(A.class, (String)string2);
    }

    public static A[] values() {
        return (A[])B.clone();
    }

    public Class c() {
        return this.p;
    }
}

