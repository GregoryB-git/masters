/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package Y0;

import F0.I;
import F0.M;
import F0.N;
import Y0.g;
import g0.M;
import g0.o;
import g0.z;

public final class h
implements g {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final int e;

    public h(long[] arrl, long[] arrl2, long l8, long l9, int n8) {
        this.a = arrl;
        this.b = arrl2;
        this.c = l8;
        this.d = l9;
        this.e = n8;
    }

    public static h a(long l8, long l9, I.a a8, z z8) {
        z8.U(10);
        int n8 = z8.p();
        if (n8 <= 0) {
            return null;
        }
        int n9 = a8.d;
        long l10 = n8;
        n8 = n9 >= 32000 ? 1152 : 576;
        long l11 = M.W0(l10, (long)n8 * 1000000L, n9);
        int n10 = z8.M();
        n9 = z8.M();
        int n11 = z8.M();
        z8.U(2);
        long l12 = l9 + (long)a8.c;
        long[] arrl = new long[n10];
        long[] arrl2 = new long[n10];
        l10 = l9;
        l9 = l12;
        for (int i8 = 0; i8 < n10; ++i8) {
            arrl[i8] = (long)i8 * l11 / (long)n10;
            arrl2[i8] = Math.max((long)l10, (long)l9);
            if (n11 != 1) {
                if (n11 != 2) {
                    if (n11 != 3) {
                        if (n11 != 4) {
                            return null;
                        }
                        n8 = z8.K();
                    } else {
                        n8 = z8.J();
                    }
                } else {
                    n8 = z8.M();
                }
            } else {
                n8 = z8.G();
            }
            l10 += (long)n8 * (long)n9;
        }
        if (l8 != -1L && l8 != l10) {
            z8 = new StringBuilder();
            z8.append("VBRI data size mismatch: ");
            z8.append(l8);
            z8.append(", ");
            z8.append(l10);
            o.h("VbriSeeker", z8.toString());
        }
        return new h(arrl, arrl2, l11, l10, a8.f);
    }

    @Override
    public long c(long l8) {
        return this.a[M.h(this.b, l8, true, true)];
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
    public M.a j(long l8) {
        int n8 = M.h(this.a, l8, true, true);
        N n9 = new N(this.a[n8], this.b[n8]);
        if (n9.a < l8 && n8 != this.a.length - 1) {
            long[] arrl = this.a;
            return new M.a(n9, new N(arrl[n8], this.b[++n8]));
        }
        return new M.a(n9);
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

