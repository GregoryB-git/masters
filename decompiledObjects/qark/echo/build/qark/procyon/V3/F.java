// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V3;

import java.util.Map;
import java.util.Collection;
import d4.h;
import d4.g;
import a4.a;
import Y3.m;
import d4.n;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import Y3.i;

public class F
{
    public static final i d;
    public b a;
    public List b;
    public Long c;
    
    static {
        d = new i() {
            public boolean b(final B b) {
                return b.f();
            }
        };
    }
    
    public F() {
        this.a = V3.b.s();
        this.b = new ArrayList();
        this.c = -1L;
    }
    
    public static b j(final List list, final i i, final k k) {
        final b s = b.s();
        final Iterator<B> iterator = list.iterator();
        b b = s;
        while (iterator.hasNext()) {
            final B b2 = iterator.next();
            if (i.a(b2)) {
                final k c = b2.c();
                n n = null;
                k l = null;
                Label_0082: {
                    if (!b2.e()) {
                        k j;
                        if (k.W(c)) {
                            j = k.b0(k, c);
                        }
                        else {
                            if (!c.W(k)) {
                                continue;
                            }
                            final k b3 = k.b0(c, k);
                            if (b3.isEmpty()) {
                                j = k.Y();
                            }
                            else {
                                n = b2.a().T(b3);
                                if (n != null) {
                                    l = k.Y();
                                    break Label_0082;
                                }
                                continue;
                            }
                        }
                        b = b.f(j, b2.a());
                        continue;
                    }
                    if (k.W(c)) {
                        l = k.b0(k, c);
                        n = b2.b();
                    }
                    else {
                        if (c.W(k)) {
                            b = b.a(k.Y(), b2.b().A(k.b0(c, k)));
                            continue;
                        }
                        continue;
                    }
                }
                b = b.a(l, n);
            }
        }
        return b;
    }
    
    public void a(final k k, final b b, final Long c) {
        m.f(c > this.c);
        this.b.add(new B(c, k, b));
        this.a = this.a.f(k, b);
        this.c = c;
    }
    
    public void b(final k k, final n n, final Long c, final boolean b) {
        m.f(c > this.c);
        this.b.add(new B(c, k, n, b));
        if (b) {
            this.a = this.a.a(k, n);
        }
        this.c = c;
    }
    
    public n c(k u, final d4.b b, final a a) {
        u = u.U(b);
        final n t = this.a.T(u);
        if (t != null) {
            return t;
        }
        if (a.c(b)) {
            return this.a.k(u).g(a.b().v(b));
        }
        return null;
    }
    
    public n d(final k k, n n, final List list, final boolean b) {
        if (list.isEmpty() && !b) {
            final n t = this.a.T(k);
            if (t != null) {
                return t;
            }
            final b i = this.a.k(k);
            if (i.isEmpty()) {
                return n;
            }
            if (n == null && !i.V(k.Y())) {
                return null;
            }
            if (n == null) {
                n = g.W();
            }
            return i.g(n);
        }
        else {
            final b j = this.a.k(k);
            if (!b && j.isEmpty()) {
                return n;
            }
            if (!b && n == null && !j.V(k.Y())) {
                return null;
            }
            final b l = j(this.b, new i() {
                public boolean b(final B b) {
                    return (b.f() || b) && !list.contains(b.d()) && (b.c().W(k) || k.W(b.c()));
                }
            }, k);
            if (n == null) {
                n = g.W();
            }
            return l.g(n);
        }
    }
    
    public n e(final k k, final n n) {
        n n2 = g.W();
        final n t = this.a.T(k);
        if (t != null) {
            n n3 = n2;
            if (!t.B()) {
                final Iterator<d4.m> iterator = t.iterator();
                while (true) {
                    n3 = n2;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final d4.m m = iterator.next();
                    n2 = n2.N(m.c(), m.d());
                }
            }
            return n3;
        }
        final b i = this.a.k(k);
        for (final d4.m j : n) {
            n2 = n2.N(j.c(), i.k(new k(new d4.b[] { j.c() })).g(j.d()));
        }
        for (final d4.m l : i.S()) {
            n2 = n2.N(l.c(), l.d());
        }
        return n2;
    }
    
    public n f(k t, final k k, final n n, final n n2) {
        m.g(n != null || n2 != null, "Either existingEventSnap or existingServerSnap must exist");
        t = t.T(k);
        if (this.a.V(t)) {
            return null;
        }
        final b i = this.a.k(t);
        if (i.isEmpty()) {
            return n2.A(k);
        }
        return i.g(n2.A(k));
    }
    
    public d4.m g(final k k, final n n, final d4.m m, final boolean b, final h h) {
        final b i = this.a.k(k);
        n n2 = i.T(k.Y());
        d4.m j = null;
        final d4.m l = null;
        if (n2 == null) {
            if (n == null) {
                return j;
            }
            n2 = i.g(n);
        }
        final Iterator<d4.m> iterator = n2.iterator();
        d4.m m2 = l;
        while (true) {
            j = m2;
            if (!iterator.hasNext()) {
                break;
            }
            final d4.m m3 = iterator.next();
            if (h.a(m3, m, b) <= 0 || (m2 != null && h.a(m3, m2, b) >= 0)) {
                continue;
            }
            m2 = m3;
        }
        return j;
    }
    
    public G h(final k k) {
        return new G(k, this);
    }
    
    public B i(final long n) {
        for (final B b : this.b) {
            if (b.d() == n) {
                return b;
            }
        }
        return null;
    }
    
    public List k() {
        final ArrayList list = new ArrayList(this.b);
        this.a = V3.b.s();
        this.b = new ArrayList();
        return list;
    }
    
    public final boolean l(final B b, final k k) {
        if (b.e()) {
            return b.c().W(k);
        }
        final Iterator iterator = b.a().iterator();
        while (iterator.hasNext()) {
            if (b.c().T(iterator.next().getKey()).W(k)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean m(final long n) {
        final Iterator<B> iterator = (Iterator<B>)this.b.iterator();
        int n2 = 0;
        while (true) {
            while (iterator.hasNext()) {
                final B b = iterator.next();
                if (b.d() == n) {
                    m.g(b != null, "removeWrite called with nonexistent writeId");
                    this.b.remove(b);
                    int f = b.f() ? 1 : 0;
                    int n3 = this.b.size() - 1;
                    int n4 = 0;
                    while (f != 0 && n3 >= 0) {
                        final B b2 = this.b.get(n3);
                        int n5 = n4;
                        int n6 = f;
                        if (b2.f()) {
                            if (n3 >= n2 && this.l(b2, b.c())) {
                                n6 = 0;
                                n5 = n4;
                            }
                            else {
                                n5 = n4;
                                n6 = f;
                                if (b.c().W(b2.c())) {
                                    n5 = 1;
                                    n6 = f;
                                }
                            }
                        }
                        --n3;
                        n4 = n5;
                        f = n6;
                    }
                    if (f == 0) {
                        return false;
                    }
                    if (n4 != 0) {
                        this.n();
                        return true;
                    }
                    if (b.e()) {
                        this.a = this.a.W(b.c());
                        return true;
                    }
                    final Iterator iterator2 = b.a().iterator();
                    while (iterator2.hasNext()) {
                        this.a = this.a.W(b.c().T(iterator2.next().getKey()));
                    }
                    return true;
                }
                else {
                    ++n2;
                }
            }
            final B b = null;
            continue;
        }
    }
    
    public final void n() {
        this.a = j(this.b, F.d, k.Y());
        long d;
        if (this.b.size() > 0) {
            final List b = this.b;
            d = b.get(b.size() - 1).d();
        }
        else {
            d = -1L;
        }
        this.c = d;
    }
    
    public n o(final k k) {
        return this.a.T(k);
    }
}
