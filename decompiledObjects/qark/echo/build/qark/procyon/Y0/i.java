// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y0;

import g0.M;
import g0.z;
import F0.I;

public final class i
{
    public final I.a a;
    public final long b;
    public final long c;
    public final int d;
    public final int e;
    public final long[] f;
    
    public i(final I.a a, final long b, final long c, final long[] f, final int d, final int e) {
        this.a = new I.a(a);
        this.b = b;
        this.c = c;
        this.f = f;
        this.d = d;
        this.e = e;
    }
    
    public static i b(final I.a a, final z z) {
        final int p2 = z.p();
        int k;
        if ((p2 & 0x1) != 0x0) {
            k = z.K();
        }
        else {
            k = -1;
        }
        long i;
        if ((p2 & 0x2) != 0x0) {
            i = z.I();
        }
        else {
            i = -1L;
        }
        long[] array;
        if ((p2 & 0x4) == 0x4) {
            array = new long[100];
            for (int j = 0; j < 100; ++j) {
                array[j] = z.G();
            }
        }
        else {
            array = null;
        }
        if ((p2 & 0x8) != 0x0) {
            z.U(4);
        }
        int n;
        int n2;
        if (z.a() >= 24) {
            z.U(21);
            final int l = z.J();
            n = (l & 0xFFF);
            n2 = (0xFFF000 & l) >> 12;
        }
        else {
            n2 = (n = -1);
        }
        return new i(a, k, i, array, n2, n);
    }
    
    public long a() {
        final long b = this.b;
        if (b != -1L && b != 0L) {
            final I.a a = this.a;
            return M.V0(b * a.g - 1L, a.d);
        }
        return -9223372036854775807L;
    }
}
