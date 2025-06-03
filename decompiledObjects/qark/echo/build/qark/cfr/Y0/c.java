/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  java.lang.Long
 *  java.lang.Object
 */
package Y0;

import F0.M;
import F0.N;
import T0.l;
import Y0.g;
import android.util.Pair;
import g0.M;

public final class c
implements g {
    public final long[] a;
    public final long[] b;
    public final long c;

    public c(long[] arrl, long[] arrl2, long l8) {
        this.a = arrl;
        this.b = arrl2;
        if (l8 == -9223372036854775807L) {
            l8 = M.J0(arrl2[arrl2.length - 1]);
        }
        this.c = l8;
    }

    public static c a(long l8, l l9, long l10) {
        int n8 = l9.s.length;
        int n9 = n8 + 1;
        long[] arrl = new long[n9];
        long[] arrl2 = new long[n9];
        arrl[0] = l8;
        long l11 = 0L;
        arrl2[0] = 0L;
        long l12 = l8;
        l8 = l11;
        for (n9 = 1; n9 <= n8; ++n9) {
            int n10 = l9.q;
            int[] arrn = l9.s;
            int n11 = n9 - 1;
            arrl[n9] = l12 += (long)(n10 + arrn[n11]);
            arrl2[n9] = l8 += (long)(l9.r + l9.t[n11]);
        }
        return new c(arrl, arrl2, l10);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Pair b(long l8, long[] l9, long[] l10) {
        int n8 = M.h((long[])l9, l8, true, true);
        Object object = l9[n8];
        Long l11 = l10[n8];
        if (++n8 == l9.length) {
            l9 = (long)object;
            l10 = (long)l11;
            do {
                return Pair.create((Object)l9, (Object)l10);
                break;
            } while (true);
        }
        Long l12 = l9[n8];
        Long l13 = l10[n8];
        double d8 = l12 == object ? 0.0 : ((double)l8 - (double)object) / (double)(l12 - object);
        object = (long)(d8 * (double)(l13 - l11));
        l9 = l8;
        l10 = (long)(object + l11);
        return Pair.create((Object)l9, (Object)l10);
    }

    @Override
    public long c(long l8) {
        return M.J0((Long)c.b((long)l8, (long[])this.a, (long[])this.b).second);
    }

    @Override
    public long f() {
        return -1L;
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public M.a j(long l8) {
        Pair pair = c.b(M.i1(M.q(l8, 0L, this.c)), this.b, this.a);
        return new M.a(new N(M.J0((Long)pair.first), (Long)pair.second));
    }

    @Override
    public int k() {
        return -2147483647;
    }

    @Override
    public long l() {
        return this.c;
    }
}

