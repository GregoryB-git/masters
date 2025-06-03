// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y0;

import F0.N;
import g0.o;
import g0.M;
import g0.z;
import F0.I;

public final class h implements g
{
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final int e;
    
    public h(final long[] a, final long[] b, final long c, final long d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static h a(final long lng, long b, final I.a a, final z z) {
        z.U(10);
        final int p4 = z.p();
        if (p4 <= 0) {
            return null;
        }
        final int d = a.d;
        final long n = p4;
        int n2;
        if (d >= 32000) {
            n2 = 1152;
        }
        else {
            n2 = 576;
        }
        final long w0 = g0.M.W0(n, n2 * 1000000L, d);
        final int m = z.M();
        final int i = z.M();
        final int j = z.M();
        z.U(2);
        final long n3 = b + a.c;
        final long[] array = new long[m];
        final long[] array2 = new long[m];
        int k = 0;
        long n4 = b;
        b = n3;
        while (k < m) {
            array[k] = k * w0 / m;
            array2[k] = Math.max(n4, b);
            int n5;
            if (j != 1) {
                if (j != 2) {
                    if (j != 3) {
                        if (j != 4) {
                            return null;
                        }
                        n5 = z.K();
                    }
                    else {
                        n5 = z.J();
                    }
                }
                else {
                    n5 = z.M();
                }
            }
            else {
                n5 = z.G();
            }
            n4 += n5 * (long)i;
            ++k;
        }
        if (lng != -1L && lng != n4) {
            final StringBuilder sb = new StringBuilder();
            sb.append("VBRI data size mismatch: ");
            sb.append(lng);
            sb.append(", ");
            sb.append(n4);
            o.h("VbriSeeker", sb.toString());
        }
        return new h(array, array2, w0, n4, a.f);
    }
    
    @Override
    public long c(final long n) {
        return this.a[g0.M.h(this.b, n, true, true)];
    }
    
    @Override
    public long f() {
        return this.d;
    }
    
    @Override
    public boolean h() {
        return true;
    }
    
    @Override
    public M.a j(final long n) {
        final int h = g0.M.h(this.a, n, true, true);
        final N n2 = new N(this.a[h], this.b[h]);
        if (n2.a < n && h != this.a.length - 1) {
            final long[] a = this.a;
            final int n3 = h + 1;
            return new M.a(n2, new N(a[n3], this.b[n3]));
        }
        return new M.a(n2);
    }
    
    @Override
    public int k() {
        return this.e;
    }
    
    @Override
    public long l() {
        return this.c;
    }
}
