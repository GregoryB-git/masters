/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package X0;

import F0.s;

public final class g {
    public static final long[] d = new long[]{128L, 64L, 32L, 16L, 8L, 4L, 2L, 1L};
    public final byte[] a = new byte[8];
    public int b;
    public int c;

    public static long a(byte[] arrby, int n8, boolean bl) {
        long l8;
        long l9 = l8 = (long)arrby[0] & 255L;
        if (bl) {
            l9 = l8 & d[n8 - 1];
        }
        for (int i8 = 1; i8 < n8; ++i8) {
            l9 = l9 << 8 | (long)arrby[i8] & 255L;
        }
        return l9;
    }

    public static int c(int n8) {
        long[] arrl;
        int n9 = 0;
        while (n9 < (arrl = d).length) {
            int n10;
            long l8 = arrl[n9];
            long l9 = n8;
            n9 = n10 = n9 + 1;
            if ((l8 & l9) == 0L) continue;
            return n10;
        }
        return -1;
    }

    public int b() {
        return this.c;
    }

    public long d(s s8, boolean bl, boolean bl2, int n8) {
        int n9;
        if (this.b == 0) {
            if (!s8.d(this.a, 0, 1, bl)) {
                return -1L;
            }
            this.c = n9 = g.c(this.a[0] & 255);
            if (n9 != -1) {
                this.b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        if ((n9 = this.c) > n8) {
            this.b = 0;
            return -2L;
        }
        if (n9 != 1) {
            s8.readFully(this.a, 1, n9 - 1);
        }
        this.b = 0;
        return g.a(this.a, this.c, bl2);
    }

    public void e() {
        this.b = 0;
        this.c = 0;
    }
}

