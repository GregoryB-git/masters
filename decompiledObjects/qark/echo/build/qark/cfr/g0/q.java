/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.util.NoSuchElementException
 */
package g0;

import g0.a;
import java.util.NoSuchElementException;

public final class q {
    public int a;
    public int b;
    public int c;
    public long[] d;
    public int e;

    public q() {
        this(16);
    }

    public q(int n8) {
        boolean bl = n8 >= 0 && n8 <= 1073741824;
        a.a(bl);
        int n9 = n8;
        if (n8 == 0) {
            n9 = 1;
        }
        n8 = n9;
        if (Integer.bitCount((int)n9) != 1) {
            n8 = Integer.highestOneBit((int)(n9 - 1)) << 1;
        }
        this.a = 0;
        this.b = -1;
        this.c = 0;
        long[] arrl = new long[n8];
        this.d = arrl;
        this.e = arrl.length - 1;
    }

    public void a() {
        this.a = 0;
        this.b = -1;
        this.c = 0;
    }

    public long b() {
        if (this.c != 0) {
            return this.d[this.a];
        }
        throw new NoSuchElementException();
    }

    public boolean c() {
        if (this.c == 0) {
            return true;
        }
        return false;
    }

    public long d() {
        int n8 = this.c;
        if (n8 != 0) {
            long[] arrl = this.d;
            int n9 = this.a;
            long l8 = arrl[n9];
            this.a = this.e & n9 + 1;
            this.c = n8 - 1;
            return l8;
        }
        throw new NoSuchElementException();
    }
}

