/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package Z0;

import Z0.t;
import d0.q;

public final class s {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final q f;
    public final int g;
    public final long[] h;
    public final long[] i;
    public final int j;
    public final t[] k;

    public s(int n8, int n9, long l8, long l9, long l10, q q8, int n10, t[] arrt, int n11, long[] arrl, long[] arrl2) {
        this.a = n8;
        this.b = n9;
        this.c = l8;
        this.d = l9;
        this.e = l10;
        this.f = q8;
        this.g = n10;
        this.k = arrt;
        this.j = n11;
        this.h = arrl;
        this.i = arrl2;
    }

    public t a(int n8) {
        t[] arrt = this.k;
        if (arrt == null) {
            return null;
        }
        return arrt[n8];
    }
}

