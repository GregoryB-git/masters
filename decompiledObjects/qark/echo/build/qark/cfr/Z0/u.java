/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package Z0;

import F0.s;
import Z0.d;
import Z0.t;
import g0.z;

public final class u {
    public d a;
    public long b;
    public long c;
    public long d;
    public int e;
    public int f;
    public long[] g = new long[0];
    public int[] h = new int[0];
    public int[] i = new int[0];
    public long[] j = new long[0];
    public boolean[] k = new boolean[0];
    public boolean l;
    public boolean[] m = new boolean[0];
    public t n;
    public final z o = new z();
    public boolean p;
    public long q;
    public boolean r;

    public void a(s s8) {
        s8.readFully(this.o.e(), 0, this.o.g());
        this.o.T(0);
        this.p = false;
    }

    public void b(z z8) {
        z8.l(this.o.e(), 0, this.o.g());
        this.o.T(0);
        this.p = false;
    }

    public long c(int n8) {
        return this.j[n8];
    }

    public void d(int n8) {
        this.o.P(n8);
        this.l = true;
        this.p = true;
    }

    public void e(int n8, int n9) {
        this.e = n8;
        this.f = n9;
        if (this.h.length < n8) {
            this.g = new long[n8];
            this.h = new int[n8];
        }
        if (this.i.length < n9) {
            n8 = n9 * 125 / 100;
            this.i = new int[n8];
            this.j = new long[n8];
            this.k = new boolean[n8];
            this.m = new boolean[n8];
        }
    }

    public void f() {
        this.e = 0;
        this.q = 0L;
        this.r = false;
        this.l = false;
        this.p = false;
        this.n = null;
    }

    public boolean g(int n8) {
        if (this.l && this.m[n8]) {
            return true;
        }
        return false;
    }
}

