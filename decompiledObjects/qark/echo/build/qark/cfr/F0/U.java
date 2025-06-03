/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package F0;

import F0.T;
import F0.b;
import F0.s;
import g0.a;

public final class U {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public void a(T t8, T.a a8) {
        if (this.c > 0) {
            t8.b(this.d, this.e, this.f, this.g, a8);
            this.c = 0;
        }
    }

    public void b() {
        this.b = false;
        this.c = 0;
    }

    public void c(T t8, long l8, int n8, int n9, int n10, T.a a8) {
        int n11;
        boolean bl = this.g <= n9 + n10;
        a.g(bl, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (!this.b) {
            return;
        }
        int n12 = this.c;
        this.c = n11 = n12 + 1;
        if (n12 == 0) {
            this.d = l8;
            this.e = n8;
            this.f = 0;
        }
        this.f += n9;
        this.g = n10;
        if (n11 >= 16) {
            this.a(t8, a8);
        }
    }

    public void d(s s8) {
        if (this.b) {
            return;
        }
        s8.n(this.a, 0, 10);
        s8.h();
        if (b.j(this.a) == 0) {
            return;
        }
        this.b = true;
    }
}

