// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y0;

import F0.N;
import android.util.Pair;
import T0.l;
import g0.M;

public final class c implements g
{
    public final long[] a;
    public final long[] b;
    public final long c;
    
    public c(final long[] a, final long[] b, long j0) {
        this.a = a;
        this.b = b;
        if (j0 == -9223372036854775807L) {
            j0 = g0.M.J0(b[b.length - 1]);
        }
        this.c = j0;
    }
    
    public static c a(long n, final l l, final long n2) {
        final int length = l.s.length;
        final int n3 = length + 1;
        final long[] array = new long[n3];
        final long[] array2 = new long[n3];
        array[0] = n;
        final long n4 = 0L;
        array2[0] = 0L;
        int i = 1;
        long n5 = n;
        n = n4;
        while (i <= length) {
            final int q = l.q;
            final int[] s = l.s;
            final int n6 = i - 1;
            n5 += q + s[n6];
            n += l.r + l.t[n6];
            array[i] = n5;
            array2[i] = n;
            ++i;
        }
        return new c(array, array2, n2);
    }
    
    public static Pair b(final long l, final long[] array, final long[] array2) {
        final int h = g0.M.h(array, l, true, true);
        final long i = array[h];
        final long j = array2[h];
        final int n = h + 1;
        Long n2;
        Long n3;
        if (n == array.length) {
            n2 = i;
            n3 = j;
        }
        else {
            final long n4 = array[n];
            final long n5 = array2[n];
            double n6;
            if (n4 == i) {
                n6 = 0.0;
            }
            else {
                n6 = (l - (double)i) / (n4 - i);
            }
            final long n7 = (long)(n6 * (n5 - j));
            n2 = l;
            n3 = n7 + j;
        }
        return Pair.create((Object)n2, (Object)n3);
    }
    
    @Override
    public long c(final long n) {
        return g0.M.J0((long)b(n, this.a, this.b).second);
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
    public M.a j(final long n) {
        final Pair b = b(g0.M.i1(g0.M.q(n, 0L, this.c)), this.b, this.a);
        return new M.a(new N(g0.M.J0((long)b.first), (long)b.second));
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
