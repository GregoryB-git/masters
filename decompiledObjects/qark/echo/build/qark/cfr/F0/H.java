/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 */
package F0;

import F0.M;
import F0.N;
import g0.a;

public final class H
implements M {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final boolean d;

    public H(long[] arrl, long[] arrl2, long l8) {
        boolean bl = arrl.length == arrl2.length;
        a.a(bl);
        int n8 = arrl2.length;
        bl = n8 > 0;
        this.d = bl;
        if (bl && arrl2[0] > 0L) {
            int n9 = n8 + 1;
            long[] arrl3 = new long[n9];
            this.a = arrl3;
            long[] arrl4 = new long[n9];
            this.b = arrl4;
            System.arraycopy((Object)arrl, (int)0, (Object)arrl3, (int)1, (int)n8);
            System.arraycopy((Object)arrl2, (int)0, (Object)arrl4, (int)1, (int)n8);
        } else {
            this.a = arrl;
            this.b = arrl2;
        }
        this.c = l8;
    }

    @Override
    public boolean h() {
        return this.d;
    }

    @Override
    public M.a j(long l8) {
        if (!this.d) {
            return new M.a(N.c);
        }
        int n8 = g0.M.h(this.b, l8, true, true);
        N n9 = new N(this.b[n8], this.a[n8]);
        if (n9.a != l8 && n8 != this.b.length - 1) {
            long[] arrl = this.b;
            return new M.a(n9, new N(arrl[n8], this.a[++n8]));
        }
        return new M.a(n9);
    }

    @Override
    public long l() {
        return this.c;
    }
}

