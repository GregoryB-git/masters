/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package h0;

import g0.a;

public final class e {
    public byte[] a;
    public int b;
    public int c;
    public int d;

    public e(byte[] arrby, int n8, int n9) {
        this.i(arrby, n8, n9);
    }

    public final void a() {
        int n8;
        int n9 = this.c;
        boolean bl = n9 >= 0 && (n9 < (n8 = this.b) || n9 == n8 && this.d == 0);
        a.f(bl);
    }

    public boolean b(int n8) {
        int n9 = this.c;
        int n10 = n8 / 8;
        int n11 = n9 + n10;
        int n12 = this.d + n8 - n10 * 8;
        n8 = n11;
        n10 = n12;
        if (n12 > 7) {
            n8 = n11 + 1;
            n10 = n12 - 8;
        }
        boolean bl = true;
        n11 = n8;
        n8 = n9;
        while ((n9 = n8 + 1) <= n11 && n11 < this.b) {
            n8 = n9;
            if (!this.j(n9)) continue;
            ++n11;
            n8 = n9 + 2;
        }
        n8 = this.b;
        if (n11 >= n8) {
            if (n11 == n8 && n10 == 0) {
                return true;
            }
            bl = false;
        }
        return bl;
    }

    public boolean c() {
        int n8 = this.c;
        int n9 = this.d;
        boolean bl = false;
        int n10 = 0;
        while (this.c < this.b && !this.d()) {
            ++n10;
        }
        boolean bl2 = this.c == this.b;
        this.c = n8;
        this.d = n9;
        boolean bl3 = bl;
        if (!bl2) {
            bl3 = bl;
            if (this.b(n10 * 2 + 1)) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public boolean d() {
        boolean bl = (this.a[this.c] & 128 >> this.d) != 0;
        this.k();
        return bl;
    }

    public int e(int n8) {
        int n9;
        int n10;
        int n11;
        byte[] arrby;
        this.d += n8;
        int n12 = 0;
        do {
            n10 = this.d;
            n11 = 2;
            if (n10 <= 8) break;
            this.d = n9 = n10 - 8;
            arrby = this.a;
            n10 = this.c;
            n12 |= (arrby[n10] & 255) << n9;
            if (!this.j(n10 + 1)) {
                n11 = 1;
            }
            this.c = n10 + n11;
        } while (true);
        arrby = this.a;
        n9 = this.c;
        byte by = arrby[n9];
        if (n10 == 8) {
            this.d = 0;
            if (!this.j(n9 + 1)) {
                n11 = 1;
            }
            this.c = n9 + n11;
        }
        this.a();
        return -1 >>> 32 - n8 & (n12 | (by & 255) >> 8 - n10);
    }

    public final int f() {
        int n8 = 0;
        int n9 = 0;
        while (!this.d()) {
            ++n9;
        }
        if (n9 > 0) {
            n8 = this.e(n9);
        }
        return (1 << n9) - 1 + n8;
    }

    public int g() {
        int n8 = this.f();
        int n9 = n8 % 2 == 0 ? -1 : 1;
        return n9 * ((n8 + 1) / 2);
    }

    public int h() {
        return this.f();
    }

    public void i(byte[] arrby, int n8, int n9) {
        this.a = arrby;
        this.c = n8;
        this.b = n9;
        this.d = 0;
        this.a();
    }

    public final boolean j(int n8) {
        byte[] arrby;
        if (2 <= n8 && n8 < this.b && (arrby = this.a)[n8] == 3 && arrby[n8 - 2] == 0 && arrby[n8 - 1] == 0) {
            return true;
        }
        return false;
    }

    public void k() {
        int n8 = this.d;
        int n9 = 1;
        this.d = ++n8;
        if (n8 == 8) {
            this.d = 0;
            n8 = this.c;
            if (this.j(n8 + 1)) {
                n9 = 2;
            }
            this.c = n8 + n9;
        }
        this.a();
    }

    public void l(int n8) {
        int n9;
        int n10 = this.c;
        int n11 = n8 / 8;
        this.c = n9 = n10 + n11;
        this.d = n11 = this.d + (n8 - n11 * 8);
        n8 = n10;
        if (n11 > 7) {
            this.c = n9 + 1;
            this.d = n11 - 8;
            n8 = n10;
        }
        while ((n10 = n8 + 1) <= this.c) {
            n8 = n10;
            if (!this.j(n10)) continue;
            ++this.c;
            n8 = n10 + 2;
        }
        this.a();
    }
}

