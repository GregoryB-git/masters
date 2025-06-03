/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package Z0;

import Z0.s;
import g0.a;

public final class v {
    public final s a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public v(s s8, long[] arrl, int[] arrn, int n8, long[] arrl2, int[] arrn2, long l8) {
        int n9 = arrn.length;
        int n10 = arrl2.length;
        boolean bl = false;
        boolean bl2 = n9 == n10;
        a.a(bl2);
        bl2 = arrl.length == arrl2.length;
        a.a(bl2);
        bl2 = bl;
        if (arrn2.length == arrl2.length) {
            bl2 = true;
        }
        a.a(bl2);
        this.a = s8;
        this.c = arrl;
        this.d = arrn;
        this.e = n8;
        this.f = arrl2;
        this.g = arrn2;
        this.h = l8;
        this.b = arrl.length;
        if (arrn2.length > 0) {
            n8 = arrn2.length - 1;
            arrn2[n8] = arrn2[n8] | 536870912;
        }
    }

    public int a(long l8) {
        for (int i8 = g0.M.h((long[])this.f, (long)l8, (boolean)true, (boolean)false); i8 >= 0; --i8) {
            if ((this.g[i8] & 1) == 0) continue;
            return i8;
        }
        return -1;
    }

    public int b(long l8) {
        for (int i8 = g0.M.d((long[])this.f, (long)l8, (boolean)true, (boolean)false); i8 < this.f.length; ++i8) {
            if ((this.g[i8] & 1) == 0) continue;
            return i8;
        }
        return -1;
    }
}

