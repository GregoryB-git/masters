/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package Y0;

import F0.I;
import g0.M;
import g0.z;

public final class i {
    public final I.a a;
    public final long b;
    public final long c;
    public final int d;
    public final int e;
    public final long[] f;

    public i(I.a a8, long l8, long l9, long[] arrl, int n8, int n9) {
        this.a = new I.a(a8);
        this.b = l8;
        this.c = l9;
        this.f = arrl;
        this.d = n8;
        this.e = n9;
    }

    public static i b(I.a a8, z z8) {
        int n8;
        long[] arrl;
        int n9 = z8.p();
        int n10 = (n9 & 1) != 0 ? z8.K() : -1;
        long l8 = (n9 & 2) != 0 ? z8.I() : -1L;
        if ((n9 & 4) == 4) {
            arrl = new long[100];
            for (n8 = 0; n8 < 100; ++n8) {
                arrl[n8] = z8.G();
            }
        } else {
            arrl = null;
        }
        if ((n9 & 8) != 0) {
            z8.U(4);
        }
        if (z8.a() >= 24) {
            z8.U(21);
            n8 = z8.J();
            n9 = n8 & 4095;
            n8 = (16773120 & n8) >> 12;
        } else {
            n9 = n8 = -1;
        }
        return new i(a8, n10, l8, arrl, n8, n9);
    }

    public long a() {
        long l8 = this.b;
        if (l8 != -1L && l8 != 0L) {
            I.a a8 = this.a;
            return M.V0(l8 * (long)a8.g - 1L, a8.d);
        }
        return -9223372036854775807L;
    }
}

