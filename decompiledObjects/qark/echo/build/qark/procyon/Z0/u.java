// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z0;

import F0.s;
import g0.z;

public final class u
{
    public d a;
    public long b;
    public long c;
    public long d;
    public int e;
    public int f;
    public long[] g;
    public int[] h;
    public int[] i;
    public long[] j;
    public boolean[] k;
    public boolean l;
    public boolean[] m;
    public t n;
    public final z o;
    public boolean p;
    public long q;
    public boolean r;
    
    public u() {
        this.g = new long[0];
        this.h = new int[0];
        this.i = new int[0];
        this.j = new long[0];
        this.k = new boolean[0];
        this.m = new boolean[0];
        this.o = new z();
    }
    
    public void a(final s s) {
        s.readFully(this.o.e(), 0, this.o.g());
        this.o.T(0);
        this.p = false;
    }
    
    public void b(final z z) {
        z.l(this.o.e(), 0, this.o.g());
        this.o.T(0);
        this.p = false;
    }
    
    public long c(final int n) {
        return this.j[n];
    }
    
    public void d(final int n) {
        this.o.P(n);
        this.l = true;
        this.p = true;
    }
    
    public void e(int e, final int f) {
        this.e = e;
        this.f = f;
        if (this.h.length < e) {
            this.g = new long[e];
            this.h = new int[e];
        }
        if (this.i.length < f) {
            e = f * 125 / 100;
            this.i = new int[e];
            this.j = new long[e];
            this.k = new boolean[e];
            this.m = new boolean[e];
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
    
    public boolean g(final int n) {
        return this.l && this.m[n];
    }
}
