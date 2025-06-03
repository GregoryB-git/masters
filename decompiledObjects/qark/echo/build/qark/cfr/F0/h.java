/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package F0;

import F0.M;
import F0.N;
import java.util.Arrays;

public final class h
implements M {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public h(int[] arrn, long[] arrl, long[] arrl2, long[] arrl3) {
        int n8;
        this.b = arrn;
        this.c = arrl;
        this.d = arrl2;
        this.e = arrl3;
        this.a = n8 = arrn.length;
        if (n8 > 0) {
            this.f = arrl2[n8 - 1] + arrl3[n8 - 1];
            return;
        }
        this.f = 0L;
    }

    public int a(long l8) {
        return g0.M.h(this.e, l8, true, true);
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public M.a j(long l8) {
        int n8 = this.a(l8);
        N n9 = new N(this.e[n8], this.c[n8]);
        if (n9.a < l8 && n8 != this.a - 1) {
            long[] arrl = this.e;
            return new M.a(n9, new N(arrl[n8], this.c[++n8]));
        }
        return new M.a(n9);
    }

    @Override
    public long l() {
        return this.f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ChunkIndex(length=");
        stringBuilder.append(this.a);
        stringBuilder.append(", sizes=");
        stringBuilder.append(Arrays.toString((int[])this.b));
        stringBuilder.append(", offsets=");
        stringBuilder.append(Arrays.toString((long[])this.c));
        stringBuilder.append(", timeUs=");
        stringBuilder.append(Arrays.toString((long[])this.e));
        stringBuilder.append(", durationsUs=");
        stringBuilder.append(Arrays.toString((long[])this.d));
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

