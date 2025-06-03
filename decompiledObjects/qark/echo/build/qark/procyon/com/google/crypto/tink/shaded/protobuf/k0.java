// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.crypto.tink.shaded.protobuf;

public abstract class k0
{
    public abstract void a(final Object p0, final int p1, final int p2);
    
    public abstract void b(final Object p0, final int p1, final long p2);
    
    public abstract void c(final Object p0, final int p1, final Object p2);
    
    public abstract void d(final Object p0, final int p1, final h p2);
    
    public abstract void e(final Object p0, final int p1, final long p2);
    
    public abstract Object f(final Object p0);
    
    public abstract Object g(final Object p0);
    
    public abstract int h(final Object p0);
    
    public abstract int i(final Object p0);
    
    public abstract void j(final Object p0);
    
    public abstract Object k(final Object p0, final Object p1);
    
    public final void l(final Object o, final d0 d0) {
        while (d0.p() != Integer.MAX_VALUE && this.m(o, d0)) {}
    }
    
    public final boolean m(final Object o, final d0 d0) {
        final int e = d0.e();
        final int a = q0.a(e);
        final int b = q0.b(e);
        if (b == 0) {
            this.e(o, a, d0.E());
            return true;
        }
        if (b == 1) {
            this.b(o, a, d0.f());
            return true;
        }
        if (b == 2) {
            this.d(o, a, d0.u());
            return true;
        }
        if (b != 3) {
            if (b == 4) {
                return false;
            }
            if (b == 5) {
                this.a(o, a, d0.n());
                return true;
            }
            throw A.e();
        }
        else {
            final Object n = this.n();
            final int c = q0.c(a, 4);
            this.l(n, d0);
            if (c == d0.e()) {
                this.c(o, a, this.r(n));
                return true;
            }
            throw A.b();
        }
    }
    
    public abstract Object n();
    
    public abstract void o(final Object p0, final Object p1);
    
    public abstract void p(final Object p0, final Object p1);
    
    public abstract boolean q(final d0 p0);
    
    public abstract Object r(final Object p0);
    
    public abstract void s(final Object p0, final r0 p1);
    
    public abstract void t(final Object p0, final r0 p1);
}
