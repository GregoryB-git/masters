// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d4;

import java.util.ArrayList;
import java.util.Iterator;
import A2.m;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import S3.e;

public class i implements Iterable
{
    public static final e r;
    public final n o;
    public e p;
    public final h q;
    
    static {
        r = new e(Collections.emptyList(), null);
    }
    
    public i(final n o, final h q) {
        this.q = q;
        this.o = o;
        this.p = null;
    }
    
    public i(final n o, final h q, final e p3) {
        this.q = q;
        this.o = o;
        this.p = p3;
    }
    
    public static i d(final n n) {
        return new i(n, q.j());
    }
    
    public static i f(final n n, final h h) {
        return new i(n, h);
    }
    
    public i D(final b b, final n n) {
        final n n2 = this.o.N(b, n);
        final e p2 = this.p;
        final e r = i.r;
        if (m.a(p2, r) && !this.q.e(n)) {
            return new i(n2, this.q, r);
        }
        final e p3 = this.p;
        if (p3 != null && !m.a(p3, r)) {
            e e = this.p.i(new d4.m(b, this.o.v(b)));
            if (!n.isEmpty()) {
                e = e.g(new d4.m(b, n));
            }
            return new i(n2, this.q, e);
        }
        return new i(n2, this.q, null);
    }
    
    public i M(final n n) {
        return new i(this.o.J(n), this.q, this.p);
    }
    
    public Iterator P() {
        this.a();
        if (m.a(this.p, i.r)) {
            return this.o.P();
        }
        return this.p.P();
    }
    
    public final void a() {
        if (this.p == null) {
            if (!this.q.equals(j.j())) {
                final ArrayList<d4.m> list = new ArrayList<d4.m>();
                final Iterator<d4.m> iterator = this.o.iterator();
                int n = 0;
                while (iterator.hasNext()) {
                    final d4.m m = iterator.next();
                    if (n == 0 && !this.q.e(m.d())) {
                        n = 0;
                    }
                    else {
                        n = 1;
                    }
                    list.add(new d4.m(m.c(), m.d()));
                }
                if (n != 0) {
                    this.p = new e(list, this.q);
                    return;
                }
            }
            this.p = i.r;
        }
    }
    
    public d4.m g() {
        if (!(this.o instanceof c)) {
            return null;
        }
        this.a();
        if (m.a(this.p, i.r)) {
            final b t = ((c)this.o).T();
            return new d4.m(t, this.o.v(t));
        }
        return (d4.m)this.p.d();
    }
    
    public d4.m i() {
        if (!(this.o instanceof c)) {
            return null;
        }
        this.a();
        if (m.a(this.p, i.r)) {
            final b u = ((c)this.o).U();
            return new d4.m(u, this.o.v(u));
        }
        return (d4.m)this.p.a();
    }
    
    @Override
    public Iterator iterator() {
        this.a();
        if (m.a(this.p, i.r)) {
            return this.o.iterator();
        }
        return this.p.iterator();
    }
    
    public n k() {
        return this.o;
    }
    
    public b q(final b b, final n n, final h obj) {
        if (!this.q.equals(j.j()) && !this.q.equals(obj)) {
            throw new IllegalArgumentException("Index not available in IndexedNode!");
        }
        this.a();
        if (m.a(this.p, i.r)) {
            return this.o.I(b);
        }
        final d4.m m = (d4.m)this.p.f(new d4.m(b, n));
        if (m != null) {
            return m.c();
        }
        return null;
    }
    
    public boolean s(final h h) {
        return this.q == h;
    }
}
