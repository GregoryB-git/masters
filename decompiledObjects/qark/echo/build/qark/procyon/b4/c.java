// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package b4;

import java.util.Iterator;
import d4.r;
import d4.g;
import d4.m;
import V3.k;
import d4.b;
import d4.n;
import d4.i;
import d4.h;

public class c implements d
{
    public final e a;
    public final h b;
    public final int c;
    public final boolean d;
    
    public c(final a4.h h) {
        this.a = new e(h);
        this.b = h.d();
        this.c = h.i();
        this.d = (h.r() ^ true);
    }
    
    @Override
    public i a(final i i, final n n) {
        return i;
    }
    
    @Override
    public d b() {
        return this.a.b();
    }
    
    @Override
    public i c(final i i, final b b, final n n, final k k, final a a, final b4.a a2) {
        n w = n;
        if (!this.a.k(new m(b, n))) {
            w = g.W();
        }
        if (i.k().v(b).equals(w)) {
            return i;
        }
        if (i.k().E() < this.c) {
            return this.a.b().c(i, b, w, k, a, a2);
        }
        return this.g(i, b, w, a, a2);
    }
    
    @Override
    public boolean d() {
        return true;
    }
    
    @Override
    public h e() {
        return this.b;
    }
    
    @Override
    public i f(final i i, i d, final b4.a a) {
        i f;
        if (!d.k().B() && !d.k().isEmpty()) {
            final i m = d.M(r.a());
            Iterator iterator;
            m j;
            m k;
            int n;
            if (this.d) {
                iterator = d.P();
                j = this.a.g();
                k = this.a.i();
                n = -1;
            }
            else {
                iterator = d.iterator();
                j = this.a.i();
                k = this.a.g();
                n = 1;
            }
            int n2 = 0;
            int n3 = 0;
            d = m;
            while (true) {
                f = d;
                if (!iterator.hasNext()) {
                    break;
                }
                final m l = iterator.next();
                int n4;
                if ((n4 = n2) == 0) {
                    n4 = n2;
                    if (this.b.compare(j, l) * n <= 0) {
                        n4 = 1;
                    }
                }
                if (n4 != 0 && n3 < this.c && this.b.compare(l, k) * n <= 0) {
                    ++n3;
                    n2 = n4;
                }
                else {
                    d = d.D(l.c(), g.W());
                    n2 = n4;
                }
            }
        }
        else {
            f = i.f(g.W(), this.b);
        }
        return this.a.b().f(i, f, a);
    }
    
    public final i g(i d, b b, n n, final a a, final b4.a a2) {
        final int e = d.k().E();
        final int c = this.c;
        int a3 = 1;
        Y3.m.f(e == c);
        final m m = new m(b, n);
        m i;
        if (this.d) {
            i = d.g();
        }
        else {
            i = d.i();
        }
        final boolean k = this.a.k(m);
        if (d.k().Q(b)) {
            final n v = d.k().v(b);
            m a4;
            while (true) {
                a4 = a.a(this.b, i, this.d);
                if (a4 == null) {
                    break;
                }
                i = a4;
                if (a4.c().equals(b)) {
                    continue;
                }
                if (!d.k().Q(a4.c())) {
                    break;
                }
                i = a4;
            }
            if (a4 != null) {
                a3 = this.b.a(a4, m, this.d);
            }
            if (k && !n.isEmpty() && a3 >= 0) {
                if (a2 != null) {
                    a2.b(a4.c.e(b, n, v));
                }
                return d.D(b, n);
            }
            if (a2 != null) {
                a2.b(a4.c.h(b, v));
            }
            i j;
            d = (j = d.D(b, g.W()));
            if (a4 == null) {
                return j;
            }
            j = d;
            if (!this.a.k(a4)) {
                return j;
            }
            if (a2 != null) {
                a2.b(a4.c.c(a4.c(), a4.d()));
            }
            b = a4.c();
            n = a4.d();
        }
        else {
            if (n.isEmpty()) {
                return d;
            }
            if (!k || this.b.a(i, m, this.d) < 0) {
                return d;
            }
            if (a2 != null) {
                a2.b(a4.c.h(i.c(), i.d()));
                a2.b(a4.c.c(b, n));
            }
            d = d.D(b, n);
            b = i.c();
            n = g.W();
        }
        return d.D(b, n);
    }
}
