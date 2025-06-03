/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

public final class V3
extends Enum {
    public static final /* enum */ V3 p;
    public static final /* enum */ V3 q;
    public static final /* enum */ V3 r;
    public static final /* enum */ V3 s;
    public static final /* synthetic */ V3[] t;
    public final boolean o;

    static {
        V3 v32;
        V3 v33;
        V3 v34;
        V3 v35;
        p = v34 = new V3(false);
        q = v35 = new V3(true);
        r = v33 = new V3(true);
        s = v32 = new V3(false);
        t = new V3[]{v34, v35, v33, v32};
    }

    public V3(boolean bl) {
        this.o = bl;
    }

    public static V3[] values() {
        return (V3[])t.clone();
    }
}

