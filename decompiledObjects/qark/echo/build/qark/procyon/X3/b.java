// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X3;

import Y3.m;
import java.util.Set;
import d4.g;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import d4.n;
import java.util.List;
import V3.k;
import c4.c;

public class b implements e
{
    public final f a;
    public final i b;
    public final c c;
    public final a d;
    public long e;
    
    public b(final V3.f f, final f f2, final a a) {
        this(f, f2, a, new Y3.b());
    }
    
    public b(final V3.f f, final f a, final a d, final Y3.a a2) {
        this.e = 0L;
        this.a = a;
        final c q = f.q("Persistence");
        this.c = q;
        this.b = new i(a, q, a2);
        this.d = d;
    }
    
    @Override
    public void a() {
        this.a.a();
    }
    
    @Override
    public void b(final long n) {
        this.a.b(n);
    }
    
    @Override
    public void c(final k k, final V3.b b, final long n) {
        this.a.c(k, b, n);
    }
    
    @Override
    public List d() {
        return this.a.d();
    }
    
    @Override
    public void e(final k k, final n n, final long n2) {
        this.a.e(k, n, n2);
    }
    
    @Override
    public void f(final k k, final V3.b b) {
        this.a.o(k, b);
        this.q();
    }
    
    @Override
    public Object g(final Callable callable) {
        this.a.g();
        try {
            final Object call = callable.call();
            this.a.p();
            this.a.f();
            return call;
        }
        finally {
            try {
                final Throwable cause;
                this.c.c("Caught Throwable.", cause);
                throw new RuntimeException(cause);
            }
            finally {
                this.a.f();
            }
        }
    }
    
    @Override
    public void h(final k k, final V3.b b) {
        for (final Map.Entry<k, V> entry : b) {
            this.n(k.T(entry.getKey()), (n)entry.getValue());
        }
    }
    
    @Override
    public void i(final a4.i i) {
        this.b.x(i);
    }
    
    @Override
    public void j(final a4.i i, final n n) {
        if (i.g()) {
            this.a.t(i.e(), n);
        }
        else {
            this.a.s(i.e(), n);
        }
        this.p(i);
        this.q();
    }
    
    @Override
    public a4.a k(final a4.i i) {
        Set<d4.b> set;
        boolean b;
        if (this.b.n(i)) {
            final h j = this.b.i(i);
            if (!i.g() && j != null && j.d) {
                set = (Set<d4.b>)this.a.i(j.a);
            }
            else {
                set = null;
            }
            b = true;
        }
        else {
            set = (Set<d4.b>)this.b.j(i.e());
            b = false;
        }
        final n q = this.a.q(i.e());
        if (set != null) {
            final g w = g.W();
            final Iterator<d4.b> iterator = set.iterator();
            n n = w;
            while (iterator.hasNext()) {
                final d4.b b2 = iterator.next();
                n = n.N(b2, q.v(b2));
            }
            return new a4.a(d4.i.f(n, i.c()), b, true);
        }
        return new a4.a(d4.i.f(q, i.c()), b, false);
    }
    
    @Override
    public void l(final a4.i i, final Set set, final Set set2) {
        final boolean g = i.g();
        boolean b = true;
        m.g(g ^ true, "We should only track keys for filtered queries.");
        final h j = this.b.i(i);
        if (j == null || !j.e) {
            b = false;
        }
        m.g(b, "We only expect tracked keys for currently-active queries.");
        this.a.r(j.a, set, set2);
    }
    
    @Override
    public void m(final a4.i i) {
        this.b.u(i);
    }
    
    @Override
    public void n(final k k, final n n) {
        if (!this.b.l(k)) {
            this.a.t(k, n);
            this.b.g(k);
        }
    }
    
    @Override
    public void o(final a4.i i, final Set set) {
        final boolean g = i.g();
        boolean b = true;
        m.g(g ^ true, "We should only track keys for filtered queries.");
        final h j = this.b.i(i);
        if (j == null || !j.e) {
            b = false;
        }
        m.g(b, "We only expect tracked keys for currently-active queries.");
        this.a.k(j.a, set);
    }
    
    @Override
    public void p(final a4.i i) {
        if (i.g()) {
            this.b.t(i.e());
            return;
        }
        this.b.w(i);
    }
    
    public final void q() {
        final long e = this.e + 1L;
        this.e = e;
        if (this.d.d(e)) {
            if (this.c.f()) {
                this.c.b("Reached prune check threshold.", new Object[0]);
            }
            this.e = 0L;
            long l = this.a.l();
            if (this.c.f()) {
                final c c = this.c;
                final StringBuilder sb = new StringBuilder();
                sb.append("Cache size: ");
                sb.append(l);
                c.b(sb.toString(), new Object[0]);
            }
            int n2;
            long i;
            for (int n = 1; n != 0 && this.d.a(l, this.b.f()); n = n2, l = i) {
                final X3.g p = this.b.p(this.d);
                if (p.e()) {
                    this.a.m(k.Y(), p);
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
                i = this.a.l();
                n = n2;
                l = i;
                if (this.c.f()) {
                    final c c2 = this.c;
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Cache size after prune: ");
                    sb2.append(i);
                    c2.b(sb2.toString(), new Object[0]);
                }
            }
        }
    }
}
