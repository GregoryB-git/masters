/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.d4;
import com.google.android.gms.internal.measurement.e4;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.i2;
import com.google.android.gms.internal.measurement.k2;

public final class j2
extends Enum
implements e4 {
    public static final /* enum */ j2 p;
    public static final /* enum */ j2 q;
    public static final /* enum */ j2 r;
    public static final /* enum */ j2 s;
    public static final /* enum */ j2 t;
    public static final /* enum */ j2 u;
    public static final d4 v;
    public static final /* synthetic */ j2[] w;
    public final int o;

    static {
        j2 j22;
        j2 j23;
        j2 j24;
        j2 j25;
        j2 j26;
        j2 j27;
        p = j24 = new j2(0);
        q = j22 = new j2(1);
        r = j25 = new j2(2);
        s = j26 = new j2(3);
        t = j23 = new j2(4);
        u = j27 = new j2(5);
        w = new j2[]{j24, j22, j25, j26, j23, j27};
        v = new i2();
    }

    public j2(int n9) {
        this.o = n9;
    }

    public static j2 c(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            if (n8 != 5) {
                                return null;
                            }
                            return u;
                        }
                        return t;
                    }
                    return s;
                }
                return r;
            }
            return q;
        }
        return p;
    }

    public static g4 e() {
        return k2.a;
    }

    public static j2[] values() {
        return (j2[])w.clone();
    }

    @Override
    public final int a() {
        return this.o;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        stringBuilder.append(j2.class.getName());
        stringBuilder.append('@');
        stringBuilder.append(Integer.toHexString((int)System.identityHashCode((Object)this)));
        stringBuilder.append(" number=");
        stringBuilder.append(this.o);
        stringBuilder.append(" name=");
        stringBuilder.append(this.name());
        stringBuilder.append('>');
        return stringBuilder.toString();
    }
}

