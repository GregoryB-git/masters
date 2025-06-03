// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import android.support.v4.media.a;
import java.util.Map;

public final class T implements e0
{
    public final O a;
    public final l0 b;
    public final boolean c;
    public final p d;
    
    public T(final l0 b, final p d, final O a) {
        this.b = b;
        this.c = d.e(a);
        this.d = d;
        this.a = a;
    }
    
    private int j(final l0 l0, final Object o) {
        return l0.i(l0.g(o));
    }
    
    private void k(final l0 l0, final p p5, final Object o, final d0 d0, final o o2) {
        final Object f = l0.f(o);
        final s d2 = p5.d(o);
        try {
            while (d0.p() != Integer.MAX_VALUE) {
                if (this.m(d0, o2, p5, d2, l0, f)) {
                    continue;
                }
            }
        }
        finally {
            l0.o(o, f);
        }
    }
    
    public static T l(final l0 l0, final p p3, final O o) {
        return new T(l0, p3, o);
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
        return this.d.c(o).k();
    }
    
    @Override
    public boolean d(final Object o, final Object o2) {
        return this.b.g(o).equals(this.b.g(o2)) && (!this.c || this.d.c(o).equals(this.d.c(o2)));
    }
    
    @Override
    public int e(final Object o) {
        int j = this.j(this.b, o);
        if (this.c) {
            j += this.d.c(o).f();
        }
        return j;
    }
    
    @Override
    public Object f() {
        return this.a.d().c();
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
    public void h(final Object o, final d0 d0, final o o2) {
        this.k(this.b, this.d, o, d0, o2);
    }
    
    @Override
    public void i(final Object o, final s0 s0) {
        final Iterator n = this.d.c(o).n();
        if (!n.hasNext()) {
            this.n(this.b, o, s0);
            return;
        }
        android.support.v4.media.a.a(n.next().getKey());
        throw null;
    }
    
    public final boolean m(final d0 d0, final o o, final p p6, final s s, final l0 l0, final Object o2) {
        final int e = d0.e();
        if (e == r0.a) {
            Object b = null;
            int w = 0;
            g u = null;
            while (true) {
                while (d0.p() != Integer.MAX_VALUE) {
                    final int e2 = d0.e();
                    if (e2 == r0.c) {
                        w = d0.w();
                        b = p6.b(o, this.a, w);
                    }
                    else if (e2 == r0.d) {
                        if (b != null) {
                            p6.h(d0, b, o, s);
                        }
                        else {
                            u = d0.u();
                        }
                    }
                    else {
                        if (d0.y()) {
                            continue;
                        }
                        if (d0.e() == r0.b) {
                            if (u != null) {
                                if (b != null) {
                                    p6.i(u, b, o, s);
                                    return true;
                                }
                                l0.d(o2, w, u);
                            }
                            return true;
                        }
                        throw z.a();
                    }
                }
                continue;
            }
        }
        if (r0.b(e) != 2) {
            return d0.y();
        }
        final Object b2 = p6.b(o, this.a, r0.a(e));
        if (b2 != null) {
            p6.h(d0, b2, o, s);
            return true;
        }
        return l0.m(o2, d0);
    }
    
    public final void n(final l0 l0, final Object o, final s0 s0) {
        l0.s(l0.g(o), s0);
    }
}
