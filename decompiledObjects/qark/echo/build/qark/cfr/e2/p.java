/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package e2;

import android.util.SparseArray;

public final class p
extends Enum {
    public static final /* enum */ p p;
    public static final /* enum */ p q;
    public static final /* enum */ p r;
    public static final /* enum */ p s;
    public static final /* enum */ p t;
    public static final /* enum */ p u;
    public static final SparseArray v;
    public static final /* synthetic */ p[] w;
    public final int o;

    static {
        p p8;
        p p9;
        p p10;
        p p11;
        p p12;
        SparseArray sparseArray;
        p p13;
        p = p10 = new p(0);
        q = p12 = new p(1);
        r = p11 = new p(2);
        s = p8 = new p(3);
        t = p13 = new p(4);
        u = p9 = new p(-1);
        w = new p[]{p10, p12, p11, p8, p13, p9};
        v = sparseArray = new SparseArray();
        sparseArray.put(0, (Object)p10);
        sparseArray.put(1, (Object)p12);
        sparseArray.put(2, (Object)p11);
        sparseArray.put(3, (Object)p8);
        sparseArray.put(4, (Object)p13);
        sparseArray.put(-1, (Object)p9);
    }

    public p(int n9) {
        this.o = n9;
    }

    public static p valueOf(String string2) {
        return (p)Enum.valueOf(p.class, (String)string2);
    }

    public static p[] values() {
        return (p[])w.clone();
    }
}

