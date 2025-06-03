/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package F0;

import g0.a;

public final class V {
    public final byte[] a;
    public final int b;
    public int c;
    public int d;

    public V(byte[] arrby) {
        this.a = arrby;
        this.b = arrby.length;
    }

    public final void a() {
        int n8;
        int n9 = this.c;
        boolean bl = n9 >= 0 && (n9 < (n8 = this.b) || n9 == n8 && this.d == 0);
        a.f(bl);
    }

    public int b() {
        return this.c * 8 + this.d;
    }

    public boolean c() {
        boolean bl = ((this.a[this.c] & 255) >> this.d & 1) == 1;
        this.e(1);
        return bl;
    }

    public int d(int n8) {
        int n9 = this.c;
        int n10 = Math.min((int)n8, (int)(8 - this.d));
        byte[] arrby = this.a;
        int n11 = n9 + 1;
        n9 = (arrby[n9] & 255) >> this.d & 255 >> 8 - n10;
        while (n10 < n8) {
            n9 |= (this.a[n11] & 255) << n10;
            n10 += 8;
            ++n11;
        }
        this.e(n8);
        return n9 & -1 >>> 32 - n8;
    }

    public void e(int n8) {
        int n9;
        int n10 = n8 / 8;
        this.c = n9 = this.c + n10;
        this.d = n8 = this.d + (n8 - n10 * 8);
        if (n8 > 7) {
            this.c = n9 + 1;
            this.d = n8 - 8;
        }
        this.a();
    }
}

