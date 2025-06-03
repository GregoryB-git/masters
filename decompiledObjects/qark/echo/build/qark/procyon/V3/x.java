// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V3;

import Q3.p;
import a4.a;
import d4.g;
import java.util.Collection;
import java.util.ArrayList;
import Y3.m;
import W3.b;
import java.util.Iterator;
import d4.s;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.List;
import a4.j;
import d4.n;
import a4.i;
import java.util.HashSet;
import java.util.HashMap;
import c4.c;
import X3.e;
import java.util.Set;
import java.util.Map;
import Y3.d;

public class x
{
    public d a;
    public final F b;
    public final Map c;
    public final Map d;
    public final Set e;
    public final s f;
    public final e g;
    public final c h;
    public long i;
    
    public x(final f f, final e g, final s f2) {
        this.i = 1L;
        this.a = Y3.d.d();
        this.b = new F();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashSet();
        this.f = f2;
        this.g = g;
        this.h = f.q("SyncTree");
    }
    
    public static /* synthetic */ c b(final x x) {
        return x.h;
    }
    
    public static /* synthetic */ e c(final x x) {
        return x.g;
    }
    
    public static /* synthetic */ s g(final x x) {
        return x.f;
    }
    
    public static /* synthetic */ F j(final x x) {
        return x.b;
    }
    
    public static /* synthetic */ d n(final x x) {
        return x.a;
    }
    
    public static /* synthetic */ d o(final x x, final d a) {
        return x.a = a;
    }
    
    public static /* synthetic */ Map p(final x x) {
        return x.d;
    }
    
    public static /* synthetic */ Map r(final x x) {
        return x.c;
    }
    
    public List A(final k k, final n n) {
        return (List)this.g.g(new Callable() {
            public List a() {
                x.c(x.this).j(a4.i.a(k), n);
                return x.this.y(new W3.f(W3.e.e, k, n));
            }
        });
    }
    
    public List B(final k k, final List list) {
        final v v = (v)this.a.s(k);
        if (v == null) {
            return Collections.emptyList();
        }
        final j e = v.e();
        if (e != null) {
            final n i = e.i();
            final Iterator<d4.s> iterator = list.iterator();
            n a = i;
            while (iterator.hasNext()) {
                a = iterator.next().a(a);
            }
            return this.A(k, a);
        }
        return Collections.emptyList();
    }
    
    public List C(final y y) {
        return (List)this.g.g(new Callable() {
            public List a() {
                final i l = x.this.S(y);
                if (l != null) {
                    x.c(x.this).p(l);
                    return x.this.D(l, new b(W3.e.a(l.d()), k.Y()));
                }
                return Collections.emptyList();
            }
        });
    }
    
    public final List D(final i i, final W3.d d) {
        final k e = i.e();
        final v v = (v)this.a.s(e);
        m.g(v != null, "Missing sync point for query tag that we're tracking");
        return v.b(d, this.b.h(e), null);
    }
    
    public List E(final k k, final Map map, final y y) {
        return (List)this.g.g(new Callable() {
            public List a() {
                final i l = x.this.S(y);
                if (l != null) {
                    final k b0 = k.b0(l.e(), k);
                    final V3.b d = V3.b.D(map);
                    x.c(x.this).f(k, d);
                    return x.this.D(l, new W3.c(W3.e.a(l.d()), b0, d));
                }
                return Collections.emptyList();
            }
        });
    }
    
    public List F(final k k, final n n, final y y) {
        return (List)this.g.g(new Callable() {
            public List a() {
                final i l = x.this.S(y);
                if (l != null) {
                    final k b0 = k.b0(l.e(), k);
                    i a;
                    if (b0.isEmpty()) {
                        a = l;
                    }
                    else {
                        a = a4.i.a(k);
                    }
                    x.c(x.this).j(a, n);
                    return x.this.D(l, new W3.f(W3.e.a(l.d()), b0, n));
                }
                return Collections.emptyList();
            }
        });
    }
    
    public List G(final k k, final List list, final y y) {
        final i s = this.S(y);
        if (s != null) {
            m.f(k.equals(s.e()));
            final v v = (v)this.a.s(s.e());
            final boolean b = false;
            m.g(v != null, "Missing sync point for query tag that we're tracking");
            final j l = v.l(s);
            boolean b2 = b;
            if (l != null) {
                b2 = true;
            }
            m.g(b2, "Missing view for query tag that we're tracking");
            final n i = l.i();
            final Iterator<d4.s> iterator = list.iterator();
            n a = i;
            while (iterator.hasNext()) {
                a = iterator.next().a(a);
            }
            return this.F(k, a, y);
        }
        return Collections.emptyList();
    }
    
    public List H(final k k, final V3.b b, final V3.b b2, final long n, final boolean b3) {
        return (List)this.g.g(new Callable() {
            public List a() {
                if (b3) {
                    x.c(x.this).c(k, b, n);
                }
                x.j(x.this).a(k, b2, n);
                return x.this.y(new W3.c(W3.e.d, k, b2));
            }
        });
    }
    
    public List I(final k k, final n n, final n n2, final long n3, final boolean b, final boolean b2) {
        m.g(b || !b2, "We shouldn't be persisting non-visible writes.");
        return (List)this.g.g(new Callable() {
            public List a() {
                if (b2) {
                    x.c(x.this).e(k, n, n3);
                }
                x.j(x.this).b(k, n2, n3, b);
                if (!b) {
                    return Collections.emptyList();
                }
                return x.this.y(new W3.f(W3.e.d, k, n2));
            }
        });
    }
    
    public n J(final k k, final List list) {
        d d = this.a;
        final v v = (v)d.getValue();
        k i = k.Y();
        n n = null;
        k c0 = k;
        n d2;
        do {
            final d4.b z = c0.Z();
            c0 = c0.c0();
            i = i.U(z);
            final k b0 = k.b0(i, k);
            if (z != null) {
                d = d.D(z);
            }
            else {
                d = Y3.d.d();
            }
            final v v2 = (v)d.getValue();
            d2 = n;
            if (v2 != null) {
                d2 = v2.d(b0);
            }
        } while (!c0.isEmpty() && (n = d2) == null);
        return this.b.d(k, d2, list, true);
    }
    
    public final List K(final d d) {
        final ArrayList list = new ArrayList();
        this.L(d, list);
        return list;
    }
    
    public final void L(final d d, final List list) {
        final v v = (v)d.getValue();
        if (v != null && v.h()) {
            list.add(v.e());
            return;
        }
        if (v != null) {
            list.addAll(v.f());
        }
        final Iterator iterator = d.M().iterator();
        while (iterator.hasNext()) {
            this.L(iterator.next().getValue(), list);
        }
    }
    
    public final y M() {
        final long i = this.i;
        this.i = 1L + i;
        return new y(i);
    }
    
    public n N(final i i) {
        return (n)this.g.g(new w(this, i));
    }
    
    public void O(final i i, final boolean b, final boolean b2) {
        if (b && !this.e.contains(i)) {
            this.u(new q(i), b2);
            this.e.add(i);
            return;
        }
        if (!b && this.e.contains(i)) {
            this.W(new q(i), b2);
            this.e.remove(i);
        }
    }
    
    public Q3.b Q(final Q3.p p) {
        return Q3.k.a(p.t(), this.g.k(p.u()).a());
    }
    
    public final i R(final i i) {
        i a = i;
        if (i.g()) {
            a = i;
            if (!i.f()) {
                a = i.a(i.e());
            }
        }
        return a;
    }
    
    public final i S(final y y) {
        return this.c.get(y);
    }
    
    public List T(final i i, final Q3.c c) {
        return this.X(i, null, c, false);
    }
    
    public List U() {
        return (List)this.g.g(new Callable() {
            public List a() {
                x.c(x.this).a();
                if (x.j(x.this).k().isEmpty()) {
                    return Collections.emptyList();
                }
                return x.this.y(new W3.a(k.Y(), new d(Boolean.TRUE), true));
            }
        });
    }
    
    public List V(final h h) {
        return this.X(h.e(), h, null, false);
    }
    
    public List W(final h h, final boolean b) {
        return this.X(h.e(), h, null, b);
    }
    
    public final List X(final i i, final h h, final Q3.c c, final boolean b) {
        return (List)this.g.g(new Callable() {
            public List a() {
                final k e = i.e();
                final v v = (v)x.n(x.this).s(e);
                ArrayList list2;
                final ArrayList list = list2 = new ArrayList();
                if (v != null) {
                    if (!i.f()) {
                        list2 = list;
                        if (!v.k(i)) {
                            return list2;
                        }
                    }
                    final Y3.g j = v.j(i, h, c);
                    if (v.i()) {
                        final x s = x.this;
                        x.o(s, x.n(s).U(e));
                    }
                    final List list3 = (List)j.a();
                    final List list4 = (List)j.b();
                    final Iterator<i> iterator = list3.iterator();
                    int n = 0;
                Label_0148:
                    while (true) {
                        n = 0;
                        while (iterator.hasNext()) {
                            final i i = iterator.next();
                            x.c(x.this).i(i);
                            if (n == 0 && !i.g()) {
                                continue Label_0148;
                            }
                            n = 1;
                        }
                        break;
                    }
                    if (b) {
                        return null;
                    }
                    d n2 = x.n(x.this);
                    boolean b;
                    if (n2.getValue() != null && ((v)n2.getValue()).h()) {
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    final Iterator iterator2 = e.iterator();
                    while (true) {
                        d d;
                        boolean b3;
                        do {
                            boolean b2 = b;
                            if (iterator2.hasNext()) {
                                d = n2.D(iterator2.next());
                                b3 = (b2 = ((b ? 1 : 0) != 0 || (d.getValue() != null && ((v)d.getValue()).h())));
                                if (!b3) {
                                    n2 = d;
                                    b = b3;
                                    continue;
                                }
                            }
                            if (n != 0 && !b2) {
                                final d y = x.n(x.this).Y(e);
                                if (!y.isEmpty()) {
                                    for (final j k : x.this.K(y)) {
                                        final r r = new r(k);
                                        x.g(x.this).b(x.this.R(k.h()), x.r.e(r), r, r);
                                    }
                                }
                            }
                            if (!b2 && !list3.isEmpty() && c == null) {
                                if (n != 0) {
                                    x.g(x.this).a(x.this.R(i), null);
                                }
                                else {
                                    for (final i l : list3) {
                                        final y b4 = x.this.b0(l);
                                        m.f(b4 != null);
                                        x.g(x.this).a(x.this.R(l), b4);
                                    }
                                }
                            }
                            x.this.Y(list3);
                            list2 = (ArrayList)list4;
                            return list2;
                        } while (!d.isEmpty());
                        boolean b2 = b3;
                        continue;
                    }
                }
                return list2;
            }
        });
    }
    
    public final void Y(final List list) {
        for (final i i : list) {
            if (!i.g()) {
                final y b0 = this.b0(i);
                m.f(b0 != null);
                this.d.remove(i);
                this.c.remove(b0);
            }
        }
    }
    
    public void Z(final i i) {
        this.g.g(new Callable() {
            public Void a() {
                x.c(x.this).m(i);
                return null;
            }
        });
    }
    
    public final void a0(final i i, final j j) {
        final k e = i.e();
        final y b0 = this.b0(i);
        final r r = new r(j);
        this.f.b(this.R(i), b0, r, r);
        final d y = this.a.Y(e);
        if (b0 != null) {
            m.g(((v)y.getValue()).h() ^ true, "If we're adding a query, it shouldn't be shadowed");
            return;
        }
        y.q((d.c)new d.c() {
            public Void b(final k k, final v v, final Void void1) {
                if (!k.isEmpty() && v.h()) {
                    final i h = v.e().h();
                    x.g(x.this).a(x.this.R(h), x.this.b0(h));
                }
                else {
                    final Iterator<j> iterator = v.f().iterator();
                    while (iterator.hasNext()) {
                        final i h2 = iterator.next().h();
                        x.g(x.this).a(x.this.R(h2), x.this.b0(h2));
                    }
                }
                return null;
            }
        });
    }
    
    public y b0(final i i) {
        return this.d.get(i);
    }
    
    public List s(final long n, final boolean b, final boolean b2, final Y3.a a) {
        return (List)this.g.g(new Callable() {
            public List a() {
                if (b2) {
                    x.c(x.this).b(n);
                }
                final B i = x.j(x.this).i(n);
                final boolean m = x.j(x.this).m(n);
                if (i.f() && !b) {
                    final Map c = V3.s.c(a);
                    if (i.e()) {
                        x.c(x.this).n(i.c(), V3.s.g(i.b(), x.this, i.c(), c));
                    }
                    else {
                        x.c(x.this).h(i.c(), V3.s.f(i.a(), x.this, i.c(), c));
                    }
                }
                if (!m) {
                    return Collections.emptyList();
                }
                d d = Y3.d.d();
                d w;
                if (i.e()) {
                    w = d.W(k.Y(), Boolean.TRUE);
                }
                else {
                    final Iterator iterator = i.a().iterator();
                    while (true) {
                        w = d;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        d = d.W(iterator.next().getKey(), Boolean.TRUE);
                    }
                }
                return x.this.y(new W3.a(i.c(), w, b));
            }
        });
    }
    
    public List t(final h h) {
        return this.u(h, false);
    }
    
    public List u(final h h, final boolean b) {
        return (List)this.g.g(new Callable() {
            public List a() {
                final i e = h.e();
                final k e2 = e.e();
                d d = x.n(x.this);
                n n = null;
                k c0 = e2;
                int n2 = 0;
                while (!d.isEmpty()) {
                    final v v = (v)d.getValue();
                    n n3 = n;
                    int n4 = n2;
                    if (v != null) {
                        if (n == null) {
                            n = v.d(c0);
                        }
                        if (n2 == 0 && !v.h()) {
                            n4 = 0;
                            n3 = n;
                        }
                        else {
                            n4 = 1;
                            n3 = n;
                        }
                    }
                    d4.b b;
                    if (c0.isEmpty()) {
                        b = d4.b.j("");
                    }
                    else {
                        b = c0.Z();
                    }
                    d = d.D(b);
                    c0 = c0.c0();
                    n = n3;
                    n2 = n4;
                }
                v v2 = (v)x.n(x.this).s(e2);
                if (v2 == null) {
                    v2 = new v(x.c(x.this));
                    final x q = x.this;
                    x.o(q, x.n(q).W(e2, v2));
                }
                else {
                    if (n2 == 0 && !v2.h()) {
                        n2 = 0;
                    }
                    else {
                        n2 = 1;
                    }
                    if (n == null) {
                        n = v2.d(k.Y());
                    }
                }
                x.c(x.this).m(e);
                a a;
                if (n != null) {
                    a = new a(d4.i.f(n, e.c()), true, false);
                }
                else {
                    final a k = x.c(x.this).k(e);
                    if (k.f()) {
                        a = k;
                    }
                    else {
                        n n5 = d4.g.W();
                        for (final Map.Entry<K, d> entry : x.n(x.this).Y(e2).M()) {
                            final v v3 = (v)entry.getValue().getValue();
                            if (v3 != null) {
                                final n d2 = v3.d(V3.k.Y());
                                if (d2 == null) {
                                    continue;
                                }
                                n5 = n5.N((d4.b)entry.getKey(), d2);
                            }
                        }
                        for (final d4.m m : k.b()) {
                            if (!n5.Q(m.c())) {
                                n5 = n5.N(m.c(), m.d());
                            }
                        }
                        a = new a(d4.i.f(n5, e.c()), false, false);
                    }
                }
                final boolean i = v2.k(e);
                if (!i && !e.g()) {
                    m.g(x.p(x.this).containsKey(e) ^ true, "View does not exist but we have a tag");
                    final y q2 = x.this.M();
                    x.p(x.this).put(e, q2);
                    x.r(x.this).put(q2, e);
                }
                final List a2 = v2.a(h, x.j(x.this).h(e2), a);
                if (!i && n2 == 0 && !b) {
                    x.this.a0(e, v2.l(e));
                }
                return a2;
            }
        });
    }
    
    public List v(final k k) {
        return (List)this.g.g(new Callable() {
            public List a() {
                x.c(x.this).p(a4.i.a(k));
                return x.this.y(new b(W3.e.e, k));
            }
        });
    }
    
    public final List w(final W3.d d, final d d2, final n n, final G g) {
        final v v = (v)d2.getValue();
        n d3 = n;
        if (n == null) {
            d3 = n;
            if (v != null) {
                d3 = v.d(k.Y());
            }
        }
        final ArrayList list = new ArrayList();
        d2.M().q(new S3.h.b() {
            public void b(final d4.b b, final d d) {
                final n a = d3;
                n v;
                if (a != null) {
                    v = a.v(b);
                }
                else {
                    v = null;
                }
                final G h = g.h(b);
                final W3.d d2 = d.d(b);
                if (d2 != null) {
                    list.addAll(x.this.w(d2, d, v, h));
                }
            }
        });
        if (v != null) {
            list.addAll(v.b(d, g, d3));
        }
        return list;
    }
    
    public final List x(final W3.d d, final d d2, final n n, final G g) {
        if (d.a().isEmpty()) {
            return this.w(d, d2, n, g);
        }
        final v v = (v)d2.getValue();
        n d3;
        if ((d3 = n) == null) {
            d3 = n;
            if (v != null) {
                d3 = v.d(k.Y());
            }
        }
        final ArrayList list = new ArrayList();
        final d4.b z = d.a().Z();
        final W3.d d4 = d.d(z);
        final d d5 = (d)d2.M().d(z);
        if (d5 != null && d4 != null) {
            n v2;
            if (d3 != null) {
                v2 = d3.v(z);
            }
            else {
                v2 = null;
            }
            list.addAll(this.x(d4, d5, v2, g.h(z)));
        }
        if (v != null) {
            list.addAll(v.b(d, g, d3));
        }
        return list;
    }
    
    public final List y(final W3.d d) {
        return this.x(d, this.a, null, this.b.h(k.Y()));
    }
    
    public List z(final k k, final Map map) {
        return (List)this.g.g(new Callable() {
            public List a() {
                final V3.b d = V3.b.D(map);
                x.c(x.this).f(k, d);
                return x.this.y(new W3.c(W3.e.e, k, d));
            }
        });
    }
    
    public interface p
    {
        List a(final Q3.c p0);
    }
    
    public static class q extends h
    {
        public i d;
        
        public q(final i d) {
            this.d = d;
        }
        
        @Override
        public h a(final i i) {
            return new q(i);
        }
        
        @Override
        public a4.d b(final a4.c c, final i i) {
            return null;
        }
        
        @Override
        public void c(final Q3.c c) {
        }
        
        @Override
        public void d(final a4.d d) {
        }
        
        @Override
        public i e() {
            return this.d;
        }
        
        @Override
        public boolean equals(final Object o) {
            return o instanceof q && ((q)o).d.equals(this.d);
        }
        
        @Override
        public boolean f(final h h) {
            return h instanceof q;
        }
        
        @Override
        public int hashCode() {
            return this.d.hashCode();
        }
        
        @Override
        public boolean i(final a4.e.a a) {
            return false;
        }
    }
    
    public class r implements g, p
    {
        public final j a;
        public final y b;
        
        public r(final j a) {
            this.a = a;
            this.b = x.this.b0(a.h());
        }
        
        public static /* synthetic */ y e(final r r) {
            return r.b;
        }
        
        @Override
        public List a(final Q3.c c) {
            if (c != null) {
                final c b = x.b(x.this);
                final StringBuilder sb = new StringBuilder();
                sb.append("Listen at ");
                sb.append(this.a.h().e());
                sb.append(" failed: ");
                sb.append(c.toString());
                b.i(sb.toString());
                return x.this.T(this.a.h(), c);
            }
            final i h = this.a.h();
            final y b2 = this.b;
            if (b2 != null) {
                return x.this.C(b2);
            }
            return x.this.v(h.e());
        }
        
        @Override
        public T3.a b() {
            final d4.d b = d4.d.b(this.a.i());
            final List e = b.e();
            final ArrayList list = new ArrayList<List>(e.size());
            final Iterator<k> iterator = e.iterator();
            while (iterator.hasNext()) {
                list.add(iterator.next().S());
            }
            return new T3.a(list, b.d());
        }
        
        @Override
        public boolean c() {
            return Y3.e.b(this.a.i()) > 1024L;
        }
        
        @Override
        public String d() {
            return this.a.i().R();
        }
    }
    
    public interface s
    {
        void a(final i p0, final y p1);
        
        void b(final i p0, final y p1, final T3.g p2, final p p3);
    }
}
