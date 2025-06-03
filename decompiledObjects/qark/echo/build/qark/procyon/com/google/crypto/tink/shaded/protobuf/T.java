// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;
import android.support.v4.media.a;

public final class T implements e0
{
    public final O a;
    public final k0 b;
    public final boolean c;
    public final q d;
    
    public T(final k0 b, final q d, final O a) {
        this.b = b;
        this.c = d.e(a);
        this.d = d;
        this.a = a;
    }
    
    private int k(final k0 k0, final Object o) {
        return k0.i(k0.g(o));
    }
    
    private void l(final k0 k0, final q q, final Object o, final d0 d0, final p p5) {
        final Object f = k0.f(o);
        final t d2 = q.d(o);
        try {
            while (d0.p() != Integer.MAX_VALUE) {
                if (this.n(d0, p5, q, d2, k0, f)) {
                    continue;
                }
            }
        }
        finally {
            k0.o(o, f);
        }
    }
    
    public static T m(final k0 k0, final q q, final O o) {
        return new T(k0, q, o);
    }
    
    @Override
    public void a(final Object o, final Object o2) {
        g0.F(this.b, o, o2);
        if (this.c) {
            g0.D(this.d, o, o2);
        }
    }
    
    @Override
    public void b(final Object o) {
        this.b.j(o);
        this.d.f(o);
    }
    
    @Override
    public final boolean c(final Object o) {
        return this.d.c(o).e();
    }
    
    @Override
    public boolean d(final Object o, final Object o2) {
        return this.b.g(o).equals(this.b.g(o2)) && (!this.c || this.d.c(o).equals(this.d.c(o2)));
    }
    
    @Override
    public int e(final Object o) {
        int k = this.k(this.b, o);
        if (this.c) {
            k += this.d.c(o).b();
        }
        return k;
    }
    
    @Override
    public Object f() {
        final O a = this.a;
        if (a instanceof x) {
            return ((x)a).J();
        }
        return a.d().c();
    }
    
    @Override
    public int g(final Object o) {
        int hashCode = this.b.g(o).hashCode();
        if (this.c) {
            hashCode = hashCode * 53 + this.d.c(o).hashCode();
        }
        return hashCode;
    }
    
    @Override
    public void h(final Object o, final byte[] array, final int n, final int n2, final e.a a) {
        final x x = (x)o;
        if (x.unknownFields == l0.c()) {
            x.unknownFields = l0.k();
        }
        a.a(o);
        throw null;
    }
    
    @Override
    public void i(final Object o, final r0 r0) {
        final Iterator f = this.d.c(o).f();
        if (!f.hasNext()) {
            this.o(this.b, o, r0);
            return;
        }
        android.support.v4.media.a.a(f.next().getKey());
        throw null;
    }
    
    @Override
    public void j(final Object o, final d0 d0, final p p3) {
        this.l(this.b, this.d, o, d0, p3);
    }
    
    public final boolean n(final d0 d0, final p p6, final q q, final t t, final k0 k0, final Object o) {
        final int e = d0.e();
        if (e == q0.a) {
            Object b = null;
            int w = 0;
            h u = null;
            while (true) {
                while (d0.p() != Integer.MAX_VALUE) {
                    final int e2 = d0.e();
                    if (e2 == q0.c) {
                        w = d0.w();
                        b = q.b(p6, this.a, w);
                    }
                    else if (e2 == q0.d) {
                        if (b != null) {
                            q.h(d0, b, p6, t);
                        }
                        else {
                            u = d0.u();
                        }
                    }
                    else {
                        if (d0.y()) {
                            continue;
                        }
                        if (d0.e() == q0.b) {
                            if (u != null) {
                                if (b != null) {
                                    q.i(u, b, p6, t);
                                    return true;
                                }
                                k0.d(o, w, u);
                            }
                            return true;
                        }
                        throw A.b();
                    }
                }
                continue;
            }
        }
        if (q0.b(e) != 2) {
            return d0.y();
        }
        final Object b2 = q.b(p6, this.a, q0.a(e));
        if (b2 != null) {
            q.h(d0, b2, p6, t);
            return true;
        }
        return k0.m(o, d0);
    }
    
    public final void o(final k0 k0, final Object o, final r0 r0) {
        k0.s(k0.g(o), r0);
    }
}
