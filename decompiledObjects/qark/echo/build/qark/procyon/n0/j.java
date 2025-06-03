// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n0;

import j0.i;
import k0.v0;
import g0.M;
import o0.f;
import Q0.c;
import d0.q;
import x0.Q;

public final class j implements Q
{
    public final q o;
    public final c p;
    public long[] q;
    public boolean r;
    public f s;
    public boolean t;
    public int u;
    public long v;
    
    public j(final f s, final q o, final boolean b) {
        this.o = o;
        this.s = s;
        this.p = new c();
        this.v = -9223372036854775807L;
        this.q = s.b;
        this.d(s, b);
    }
    
    @Override
    public void a() {
    }
    
    public String b() {
        return this.s.a();
    }
    
    public void c(long v) {
        final int d = M.d(this.q, v, true, false);
        this.u = d;
        if (!this.r || d != this.q.length) {
            v = -9223372036854775807L;
        }
        this.v = v;
    }
    
    public void d(final f s, final boolean r) {
        final int u = this.u;
        long n;
        if (u == 0) {
            n = -9223372036854775807L;
        }
        else {
            n = this.q[u - 1];
        }
        this.r = r;
        this.s = s;
        final long[] b = s.b;
        this.q = b;
        final long v = this.v;
        if (v != -9223372036854775807L) {
            this.c(v);
            return;
        }
        if (n != -9223372036854775807L) {
            this.u = M.d(b, n, false, false);
        }
    }
    
    @Override
    public boolean e() {
        return true;
    }
    
    @Override
    public int j(final v0 v0, final i i, final int n) {
        final int u = this.u;
        final boolean b = u == this.q.length;
        if (b && !this.r) {
            i.w(4);
            return -4;
        }
        if ((n & 0x2) != 0x0 || !this.t) {
            v0.b = this.o;
            this.t = true;
            return -5;
        }
        if (b) {
            return -3;
        }
        if ((n & 0x1) == 0x0) {
            this.u = u + 1;
        }
        if ((n & 0x4) == 0x0) {
            final byte[] a = this.p.a(this.s.a[u]);
            i.z(a.length);
            i.r.put(a);
        }
        i.t = this.q[u];
        i.w(1);
        return -4;
    }
    
    @Override
    public int m(final long n) {
        return (this.u = Math.max(this.u, M.d(this.q, n, true, false))) - this.u;
    }
}
