// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V3;

import Q3.r;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.Objects;
import d4.o;
import V2.j;
import java.util.Map;
import d4.n;
import a4.i;
import X3.d;
import java.util.concurrent.ExecutorService;
import Q3.e;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import Y3.a;
import Y3.b;
import c4.c;
import a4.g;
import Y3.k;
import Y3.f;
import T3.h;

public class m implements a
{
    public final p a;
    public final f b;
    public h c;
    public t d;
    public u e;
    public k f;
    public boolean g;
    public final g h;
    public final V3.f i;
    public final c j;
    public final c k;
    public final c l;
    public long m;
    public long n;
    public x o;
    public x p;
    public Q3.h q;
    public boolean r;
    public long s;
    
    public m(final p a, final V3.f i, final Q3.h q) {
        this.b = new f(new b(), 0L);
        this.g = false;
        this.m = 0L;
        this.n = 1L;
        this.r = false;
        this.s = 0L;
        this.a = a;
        this.i = i;
        this.q = q;
        this.j = i.q("RepoOperation");
        this.k = i.q("Transaction");
        this.l = i.q("DataOperation");
        this.h = new g(i);
        this.i0(new Runnable() {
            @Override
            public void run() {
                V3.m.this.H();
            }
        });
    }
    
    public static /* synthetic */ x B(final m m) {
        return m.p;
    }
    
    public static Q3.c I(final String s, final String s2) {
        if (s != null) {
            return Q3.c.d(s, s2);
        }
        return null;
    }
    
    public static /* synthetic */ V3.f j(final m m) {
        return m.i;
    }
    
    public static /* synthetic */ u k(final m m) {
        return m.e;
    }
    
    public static /* synthetic */ h n(final m m) {
        return m.c;
    }
    
    public static /* synthetic */ f p(final m m) {
        return m.b;
    }
    
    public static /* synthetic */ k q(final m m) {
        return m.f;
    }
    
    public static /* synthetic */ t t(final m m) {
        return m.d;
    }
    
    public static /* synthetic */ x w(final m m) {
        return m.o;
    }
    
    public final void C(final long n, final V3.k k, final Q3.c c) {
        if (c != null && c.f() == -25) {
            return;
        }
        final List s = this.p.s(n, c == null ^ true, true, this.b);
        if (s.size() > 0) {
            this.d0(k);
        }
        this.Y(s);
    }
    
    public void D(final V3.h h) {
        final d4.b z = h.e().e().Z();
        x x;
        if (z != null && z.equals(V3.c.a)) {
            x = this.o;
        }
        else {
            x = this.p;
        }
        this.Y(x.t(h));
    }
    
    public final void E(final List list, final k k) {
        final List list2 = (List)k.g();
        if (list2 != null) {
            list.addAll(list2);
        }
        k.c((k.c)new k.c() {
            @Override
            public void a(final k k) {
                V3.m.this.E(list, k);
            }
        });
    }
    
    public final List F(final k k) {
        final ArrayList<Comparable> list = new ArrayList<Comparable>();
        this.E(list, k);
        Collections.sort(list);
        return list;
    }
    
    public void G(final e.e e, final Q3.c c, final V3.k k) {
        if (e != null) {
            final d4.b x = k.X();
            V3.k a0 = k;
            if (x != null) {
                a0 = k;
                if (x.s()) {
                    a0 = k.a0();
                }
            }
            this.X(new Runnable() {
                public final /* synthetic */ e q = Q3.k.c(this, a0);
                
                @Override
                public void run() {
                    e.a(c, this.q);
                }
            });
        }
    }
    
    public final void H() {
        final p a = this.a;
        this.c = this.i.E(new T3.f(a.a, a.c, a.b), this);
        this.i.m().b(((Y3.c)this.i.v()).d(), (V3.A.b)new V3.A.b() {});
        this.i.l().b(((Y3.c)this.i.v()).d(), (V3.A.b)new V3.A.b() {});
        this.c.a();
        final X3.e t = this.i.t(this.a.a);
        this.d = new t();
        this.e = new u();
        this.f = new k();
        this.o = new x(this.i, new d(), (x.s)new x.s() {
            @Override
            public void a(final i i, final y y) {
            }
            
            @Override
            public void b(final i i, final y y, final T3.g g, final p p4) {
                V3.m.this.i0(new Runnable() {
                    @Override
                    public void run() {
                        final n a = V3.m.t(V3.m.this).a(i.e());
                        if (!a.isEmpty()) {
                            V3.m.this.Y(V3.m.w(V3.m.this).A(i.e(), a));
                            p4.a(null);
                        }
                    }
                });
            }
        });
        this.p = new x(this.i, t, (x.s)new x.s() {
            @Override
            public void a(final i i, final y y) {
                V3.m.n(V3.m.this).l(i.e().S(), i.d().k());
            }
            
            @Override
            public void b(final i i, final y y, final T3.g g, final p p4) {
                final h n = V3.m.n(V3.m.this);
                final List s = i.e().S();
                final Map k = i.d().k();
                Long value;
                if (y != null) {
                    value = y.a();
                }
                else {
                    value = null;
                }
                n.k(s, k, g, value, new T3.p() {
                    @Override
                    public void a(final String s, final String s2) {
                        V3.m.this.Y(p4.a(I(s, s2)));
                    }
                });
            }
        });
        this.e0(t);
        final d4.b c = V3.c.c;
        final Boolean false = Boolean.FALSE;
        this.p0(c, false);
        this.p0(V3.c.d, false);
    }
    
    public final k J(V3.k c0) {
        k k;
        for (k = this.f; !c0.isEmpty() && k.g() == null; k = k.k(new V3.k(new d4.b[] { c0.Z() })), c0 = c0.c0()) {}
        return k;
    }
    
    public final n K(final V3.k k) {
        return this.L(k, new ArrayList());
    }
    
    public final n L(final V3.k k, final List list) {
        n n;
        if ((n = this.p.J(k, list)) == null) {
            n = d4.g.W();
        }
        return n;
    }
    
    public final long M() {
        final long n = this.n;
        this.n = 1L + n;
        return n;
    }
    
    public x N() {
        return this.p;
    }
    
    public j O(final Q3.p p) {
        final V2.k k = new V2.k();
        this.i0(new Runnable() {
            @Override
            public void run() {
                final n n = V3.m.B(V3.m.this).N(p.u());
                if (n != null) {
                    k.c(Q3.k.a(p.t(), d4.i.d(n)));
                    return;
                }
                V3.m.B(V3.m.this).Z(p.u());
                final Q3.b q = V3.m.B(V3.m.this).Q(p);
                if (q.b()) {
                    V3.m.this.h0(new V3.n(k, q), 3000L);
                }
                V3.m.n(V3.m.this).d(p.s().S(), p.u().d().k()).c(((Y3.c)V3.m.j(V3.m.this).v()).d(), new V3.o(this, k, q, p, V3.m.this));
            }
        });
        return k.a();
    }
    
    public void P() {
        this.c.j("repo_interrupt");
    }
    
    public void Q(final i i, final boolean b) {
        this.R(i, b, false);
    }
    
    public void R(final i i, final boolean b, final boolean b2) {
        Y3.m.f(i.e().isEmpty() || !i.e().Z().equals(V3.c.a));
        this.p.O(i, b, b2);
    }
    
    public final long S() {
        final long s = this.s;
        this.s = 1L + s;
        return s;
    }
    
    public void T(final V3.k k, final e.e e) {
        this.c.m(k.S(), new T3.p() {
            @Override
            public void a(final String s, final String s2) {
                final Q3.c y = I(s, s2);
                if (y == null) {
                    V3.m.k(V3.m.this).c(k);
                }
                V3.m.this.G(e, y, k);
            }
        });
    }
    
    public void U(final V3.k k, final n n, final e.e e) {
        this.c.h(k.S(), n.L(true), new T3.p() {
            @Override
            public void a(final String s, final String s2) {
                final Q3.c y = I(s, s2);
                V3.m.this.q0("onDisconnect().setValue", k, y);
                if (y == null) {
                    V3.m.k(V3.m.this).d(k, n);
                }
                V3.m.this.G(e, y, k);
            }
        });
    }
    
    public void V(final V3.k k, final Map map, final e.e e, final Map map2) {
        this.c.b(k.S(), map2, new T3.p() {
            @Override
            public void a(final String s, final String s2) {
                final Q3.c y = I(s, s2);
                V3.m.this.q0("onDisconnect().updateChildren", k, y);
                if (y == null) {
                    for (final Map.Entry<V3.k, V> entry : map.entrySet()) {
                        V3.m.k(V3.m.this).d(k.T(entry.getKey()), (n)entry.getValue());
                    }
                }
                V3.m.this.G(e, y, k);
            }
        });
    }
    
    public void W(final d4.b b, final Object o) {
        this.p0(b, o);
    }
    
    public void X(final Runnable runnable) {
        this.i.F();
        this.i.o().b(runnable);
    }
    
    public final void Y(final List list) {
        if (!list.isEmpty()) {
            this.h.b(list);
        }
    }
    
    public final void Z(final k k) {
        List<z> list = (List<z>)k.g();
        if (list != null) {
            int i = 0;
            while (i < list.size()) {
                if (z.n(list.get(i)) == A.r) {
                    list.remove(i);
                }
                else {
                    ++i;
                }
            }
            if (list.size() <= 0) {
                list = null;
            }
            k.j(list);
        }
        k.c((k.c)new k.c() {
            @Override
            public void a(final k k) {
                V3.m.this.Z(k);
            }
        });
    }
    
    @Override
    public void a() {
        this.W(V3.c.d, Boolean.TRUE);
    }
    
    public void a0() {
        if (this.j.f()) {
            this.j.b("Purging writes", new Object[0]);
        }
        this.Y(this.p.U());
        this.g(V3.k.Y(), -25);
        this.c.e();
    }
    
    @Override
    public void b(final Map map) {
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            this.p0(d4.b.j(entry.getKey()), entry.getValue());
        }
    }
    
    public void b0(final V3.h h) {
        x x;
        if (V3.c.a.equals(h.e().e().Z())) {
            x = this.o;
        }
        else {
            x = this.p;
        }
        this.Y(x.V(h));
    }
    
    @Override
    public void c(List list, final Object obj, final boolean b, final Long n) {
        final V3.k k = new V3.k(list);
        if (this.j.f()) {
            final c j = this.j;
            final StringBuilder sb = new StringBuilder();
            sb.append("onDataUpdate: ");
            sb.append(k);
            j.b(sb.toString(), new Object[0]);
        }
        if (this.l.f()) {
            final c i = this.j;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("onDataUpdate: ");
            sb2.append(k);
            sb2.append(" ");
            sb2.append(obj);
            i.b(sb2.toString(), new Object[0]);
        }
        ++this.m;
        Label_0288: {
            if (n == null) {
                break Label_0288;
            }
            while (true) {
                try {
                    final y y = new y(n);
                    if (b) {
                        final HashMap<V3.k, n> hashMap = new HashMap<V3.k, n>();
                        for (final Map.Entry<K, Object> entry : ((Map)obj).entrySet()) {
                            hashMap.put(new V3.k((String)entry.getKey()), d4.o.a(entry.getValue()));
                        }
                        list = this.p.E(k, hashMap, y);
                    }
                    else {
                        list = this.p.F(k, d4.o.a(obj), y);
                    }
                Block_8_Outer:
                    while (true) {
                        while (true) {
                        Label_0315:
                            while (true) {
                                if (list.size() > 0) {
                                    this.d0(k);
                                }
                                this.Y(list);
                                return;
                                Label_0376: {
                                    final HashMap<V3.k, n> hashMap2;
                                    list = this.p.z(k, hashMap2);
                                }
                                continue Block_8_Outer;
                                final HashMap<V3.k, n> hashMap2 = new HashMap<V3.k, n>();
                                final Iterator<Map.Entry<K, Object>> iterator2 = ((Map)obj).entrySet().iterator();
                                break Label_0315;
                                final Map.Entry<K, Object> entry2 = iterator2.next();
                                hashMap2.put(new V3.k((String)entry2.getKey()), d4.o.a(entry2.getValue()));
                                break Label_0315;
                                Label_0390:
                                list = this.p.A(k, d4.o.a(obj));
                                continue Block_8_Outer;
                            }
                            continue;
                        }
                        final Q3.d d;
                        this.j.c("FIREBASE INTERNAL ERROR", d);
                        return;
                        continue Block_8_Outer;
                    }
                }
                // iftrue(Label_0376:, !iterator2.hasNext())
                // iftrue(Label_0390:, !b)
                catch (Q3.d d) {
                    continue;
                }
                break;
            }
        }
    }
    
    public final void c0(final List list, final V3.k k) {
        if (list.isEmpty()) {
            return;
        }
        final ArrayList<m$m> list2 = new ArrayList<m$m>();
        final ArrayList<Long> list3 = new ArrayList<Long>();
        final Iterator<z> iterator = list.iterator();
        while (iterator.hasNext()) {
            list3.add(z.p(iterator.next()));
        }
        final Iterator<z> iterator2 = list.iterator();
        int n;
        while (true) {
            final boolean hasNext = iterator2.hasNext();
            n = 0;
            boolean b = false;
            if (!hasNext) {
                break;
            }
            final z z = iterator2.next();
            final V3.k b2 = k.b0(k, V3.m.z.w(z));
            final ArrayList list4 = new ArrayList();
            Y3.m.f(b2 != null);
            Q3.c c = null;
            Label_0513: {
                while (true) {
                    List s = null;
                    Label_0263: {
                        if (V3.m.z.n(z) != A.t) {
                            if (V3.m.z.n(z) == A.p) {
                                if (V3.m.z.s(z) >= 25) {
                                    c = Q3.c.c("maxretries");
                                    s = this.p.s(V3.m.z.p(z), true, false, this.b);
                                    break Label_0263;
                                }
                                final n l = this.L(V3.m.z.w(z), list3);
                                V3.m.z.e(z, l);
                                final Q3.m b3 = Q3.k.b(l);
                                r.c a = null;
                                try {
                                    V3.m.z.x(z).a(b3);
                                }
                                finally {
                                    final Throwable t;
                                    this.j.c("Caught Throwable.", t);
                                    c = Q3.c.b(t);
                                    a = Q3.r.a();
                                }
                                if (!a.b()) {
                                    list4.addAll(this.p.s(V3.m.z.p(z), true, false, this.b));
                                    b = true;
                                    break Label_0513;
                                }
                                final long p2 = V3.m.z.p(z);
                                final Map c2 = V3.s.c(this.b);
                                final n a2 = a.a();
                                final n i = V3.s.i(a2, l, c2);
                                V3.m.z.j(z, a2);
                                V3.m.z.m(z, i);
                                V3.m.z.r(z, this.M());
                                list3.remove(p2);
                                list4.addAll(this.p.I(V3.m.z.w(z), a2, i, V3.m.z.p(z), V3.m.z.F(z), false));
                                list4.addAll(this.p.s(p2, true, false, this.b));
                            }
                            c = null;
                            break Label_0513;
                        }
                        final Q3.c c3 = c = V3.m.z.C(z);
                        if (c3.f() != -25) {
                            final List s2 = this.p.s(V3.m.z.p(z), true, false, this.b);
                            c = c3;
                            s = s2;
                            break Label_0263;
                        }
                        b = true;
                        break Label_0513;
                    }
                    list4.addAll(s);
                    continue;
                }
            }
            this.Y(list4);
            if (!b) {
                continue;
            }
            V3.m.z.o(z, A.r);
            final Q3.b a3 = Q3.k.a(Q3.k.c(this, V3.m.z.w(z)), d4.i.d(V3.m.z.c(z)));
            this.i0(new Runnable() {
                @Override
                public void run() {
                    final m p = V3.m.this;
                    p.b0(new D(p, z.z(z), a4.i.a(z.w(z))));
                }
            });
            list2.add(new Runnable() {
                @Override
                public void run() {
                    z.x(z).b(c, false, a3);
                }
            });
        }
        this.Z(this.f);
        for (int j = n; j < list2.size(); ++j) {
            this.X((Runnable)list2.get(j));
        }
        this.j0();
    }
    
    @Override
    public void d() {
        this.W(V3.c.d, Boolean.FALSE);
        this.g0();
    }
    
    public final V3.k d0(final V3.k k) {
        final k j = this.J(k);
        final V3.k f = j.f();
        this.c0(this.F(j), f);
        return f;
    }
    
    @Override
    public void e(final boolean b) {
        this.W(V3.c.c, b);
    }
    
    public final void e0(final X3.e e) {
        final List d = e.d();
        final Map c = V3.s.c(this.b);
        final Iterator<B> iterator = d.iterator();
        long d2 = Long.MIN_VALUE;
        while (iterator.hasNext()) {
            final B b = iterator.next();
            final T3.p p = new T3.p() {
                @Override
                public void a(final String s, final String s2) {
                    final Q3.c y = I(s, s2);
                    V3.m.this.q0("Persisted write", b.c(), y);
                    V3.m.this.C(b.d(), b.c(), y);
                }
            };
            if (d2 >= b.d()) {
                throw new IllegalStateException("Write ids were not in order.");
            }
            d2 = b.d();
            this.n = b.d() + 1L;
            if (b.e()) {
                if (this.j.f()) {
                    final c j = this.j;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Restoring overwrite with id ");
                    sb.append(b.d());
                    j.b(sb.toString(), new Object[0]);
                }
                this.c.r(b.c().S(), b.b().L(true), p);
                this.p.I(b.c(), b.b(), V3.s.g(b.b(), this.p, b.c(), c), b.d(), true, false);
            }
            else {
                if (this.j.f()) {
                    final c i = this.j;
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Restoring merge with id ");
                    sb2.append(b.d());
                    i.b(sb2.toString(), new Object[0]);
                }
                this.c.f(b.c().S(), b.a().U(true), p);
                this.p.H(b.c(), b.a(), V3.s.f(b.a(), this.p, b.c(), c), b.d(), false);
            }
        }
    }
    
    @Override
    public void f(List list, final List obj, final Long n) {
        final V3.k k = new V3.k(list);
        if (this.j.f()) {
            final c j = this.j;
            final StringBuilder sb = new StringBuilder();
            sb.append("onRangeMergeUpdate: ");
            sb.append(k);
            j.b(sb.toString(), new Object[0]);
        }
        if (this.l.f()) {
            final c i = this.j;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("onRangeMergeUpdate: ");
            sb2.append(k);
            sb2.append(" ");
            sb2.append(obj);
            i.b(sb2.toString(), new Object[0]);
        }
        ++this.m;
        final ArrayList<d4.s> list2 = new ArrayList<d4.s>(obj.size());
        final Iterator<T3.o> iterator = obj.iterator();
        while (iterator.hasNext()) {
            list2.add(new d4.s(iterator.next()));
        }
        final x p3 = this.p;
        if (n != null) {
            list = p3.G(k, list2, new y(n));
        }
        else {
            list = p3.B(k, list2);
        }
        if (list.size() > 0) {
            this.d0(k);
        }
        this.Y(list);
    }
    
    public void f0() {
        this.c.p("repo_interrupt");
    }
    
    public final V3.k g(final V3.k obj, final int n) {
        final V3.k f = this.J(obj).f();
        if (this.k.f()) {
            final c j = this.j;
            final StringBuilder sb = new StringBuilder();
            sb.append("Aborting transactions for path: ");
            sb.append(obj);
            sb.append(". Affected: ");
            sb.append(f);
            j.b(sb.toString(), new Object[0]);
        }
        final k k = this.f.k(obj);
        k.a((k.b)new k.b() {
            @Override
            public boolean a(final k k) {
                V3.m.this.h(k, n);
                return false;
            }
        });
        this.h(k, n);
        k.d((k.c)new k.c() {
            @Override
            public void a(final k k) {
                V3.m.this.h(k, n);
            }
        });
        return f;
    }
    
    public final void g0() {
        final Map c = V3.s.c(this.b);
        final ArrayList list = new ArrayList();
        this.e.b(V3.k.Y(), (u.d)new u.d() {
            @Override
            public void a(V3.k l, n i) {
                i = V3.s.i(i, V3.m.B(V3.m.this).J(l, new ArrayList()), c);
                list.addAll(V3.m.B(V3.m.this).A(l, i));
                l = V3.m.this.g(l, -9);
                V3.m.this.d0(l);
            }
        });
        this.e = new u();
        this.Y(list);
    }
    
    public final void h(final k k, final int n) {
        final List list = (List)k.g();
        final ArrayList list2 = new ArrayList();
        if (list != null) {
            final ArrayList<m$q> list3 = new ArrayList<m$q>();
            Q3.c c;
            if (n == -9) {
                c = Q3.c.c("overriddenBySet");
            }
            else {
                final boolean b = n == -25;
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown transaction abort reason: ");
                sb.append(n);
                Y3.m.g(b, sb.toString());
                c = Q3.c.a(-25);
            }
            int i = 0;
            int n2 = -1;
            while (i < list.size()) {
                final z z = list.get(i);
                final A n3 = V3.m.z.n(z);
                final A s = A.s;
                if (n3 != s) {
                    if (V3.m.z.n(z) == A.q) {
                        Y3.m.f(n2 == i - 1);
                        V3.m.z.o(z, s);
                        V3.m.z.D(z, c);
                        n2 = i;
                    }
                    else {
                        Y3.m.f(V3.m.z.n(z) == A.p);
                        this.b0(new D(this, V3.m.z.z(z), a4.i.a(V3.m.z.w(z))));
                        if (n == -9) {
                            list2.addAll(this.p.s(V3.m.z.p(z), true, false, this.b));
                        }
                        else {
                            final boolean b2 = n == -25;
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("Unknown transaction abort reason: ");
                            sb2.append(n);
                            Y3.m.g(b2, sb2.toString());
                        }
                        list3.add(new Runnable() {
                            @Override
                            public void run() {
                                z.x(z).b(c, false, null);
                            }
                        });
                    }
                }
                ++i;
            }
            Object subList;
            if (n2 == -1) {
                subList = null;
            }
            else {
                subList = list.subList(0, n2 + 1);
            }
            k.j(subList);
            this.Y(list2);
            final Iterator<Runnable> iterator = list3.iterator();
            while (iterator.hasNext()) {
                this.X(iterator.next());
            }
        }
    }
    
    public void h0(final Runnable runnable, final long n) {
        this.i.F();
        this.i.v().b(runnable, n);
    }
    
    public void i0(final Runnable runnable) {
        this.i.F();
        this.i.v().c(runnable);
    }
    
    public final void j0() {
        final k f = this.f;
        this.Z(f);
        this.k0(f);
    }
    
    public final void k0(final k k) {
        if (k.g() != null) {
            final List f = this.F(k);
            Y3.m.f(f.size() > 0);
            final Boolean true = Boolean.TRUE;
            final Iterator<z> iterator = f.iterator();
            while (true) {
                do {
                    final Boolean false = true;
                    if (iterator.hasNext()) {
                        continue;
                    }
                    if (false) {
                        this.l0(f, k.f());
                    }
                    return;
                } while (z.n(iterator.next()) == A.p);
                final Boolean false = Boolean.FALSE;
                continue;
            }
        }
        if (k.h()) {
            k.c((k.c)new k.c() {
                @Override
                public void a(final k k) {
                    V3.m.this.k0(k);
                }
            });
        }
    }
    
    public final void l0(final List list, final V3.k k) {
        final ArrayList<Long> list2 = new ArrayList<Long>();
        final Iterator<z> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(z.p(iterator.next()));
        }
        n n = this.L(k, list2);
        String r;
        if (!this.g) {
            r = n.R();
        }
        else {
            r = "badhash";
        }
        final Iterator<z> iterator2 = list.iterator();
        while (true) {
            final boolean hasNext = iterator2.hasNext();
            boolean b = true;
            if (!hasNext) {
                break;
            }
            final z z = iterator2.next();
            if (V3.m.z.n(z) != A.p) {
                b = false;
            }
            Y3.m.f(b);
            V3.m.z.o(z, A.q);
            V3.m.z.u(z);
            n = n.y(k.b0(k, V3.m.z.w(z)), V3.m.z.h(z));
        }
        this.c.n(k.S(), n.L(true), r, new T3.p() {
            @Override
            public void a(final String s, final String s2) {
                final Q3.c y = I(s, s2);
                V3.m.this.q0("Transaction", k, y);
                final ArrayList list = new ArrayList();
                if (y == null) {
                    final ArrayList<m$i$a> list2 = new ArrayList<m$i$a>();
                    for (final z z : list) {
                        z.o(z, A.r);
                        list.addAll(V3.m.B(V3.m.this).s(z.p(z), false, false, V3.m.p(V3.m.this)));
                        list2.add(new Runnable() {
                            public final /* synthetic */ Q3.b p = Q3.k.a(Q3.k.c(V3.m.this, z.w(z)), d4.i.d(z.l(z)));
                            
                            @Override
                            public void run() {
                                z.x(z).b(null, true, this.p);
                            }
                        });
                        final m d = V3.m.this;
                        d.b0(new D(d, z.z(z), a4.i.a(z.w(z))));
                    }
                    final m d2 = V3.m.this;
                    d2.Z(V3.m.q(d2).k(k));
                    V3.m.this.j0();
                    V3.m.this.Y(list);
                    for (int i = 0; i < list2.size(); ++i) {
                        V3.m.this.X((Runnable)list2.get(i));
                    }
                }
                else {
                    if (y.f() == -1) {
                        for (final z z2 : list) {
                            A a;
                            if (z.n(z2) == A.s) {
                                a = A.t;
                            }
                            else {
                                a = A.p;
                            }
                            z.o(z2, a);
                        }
                    }
                    else {
                        for (final z z3 : list) {
                            z.o(z3, A.t);
                            z.D(z3, y);
                        }
                    }
                    V3.m.this.d0(k);
                }
            }
        });
    }
    
    public void m0(final V3.k k, final n obj, final e.e e) {
        if (this.j.f()) {
            final c j = this.j;
            final StringBuilder sb = new StringBuilder();
            sb.append("set: ");
            sb.append(k);
            j.b(sb.toString(), new Object[0]);
        }
        if (this.l.f()) {
            final c l = this.l;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("set: ");
            sb2.append(k);
            sb2.append(" ");
            sb2.append(obj);
            l.b(sb2.toString(), new Object[0]);
        }
        final n i = V3.s.i(obj, this.p.J(k, new ArrayList()), V3.s.c(this.b));
        final long m = this.M();
        this.Y(this.p.I(k, obj, i, m, true, true));
        this.c.r(k.S(), obj.L(true), new T3.p() {
            @Override
            public void a(final String s, final String s2) {
                final Q3.c y = I(s, s2);
                V3.m.this.q0("setValue", k, y);
                V3.m.this.C(m, k, y);
                V3.m.this.G(e, y, k);
            }
        });
        this.d0(this.g(k, -9));
    }
    
    public void n0(final V3.k k, final r.b b, final boolean b2) {
        if (this.j.f()) {
            final c j = this.j;
            final StringBuilder sb = new StringBuilder();
            sb.append("transaction: ");
            sb.append(k);
            j.b(sb.toString(), new Object[0]);
        }
        if (this.l.f()) {
            final c i = this.j;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("transaction: ");
            sb2.append(k);
            i.b(sb2.toString(), new Object[0]);
        }
        if (this.i.C() && !this.r) {
            this.r = true;
            this.k.e("runTransaction() usage detected while persistence is enabled. Please be aware that transactions *will not* be persisted across database restarts.  See https://www.firebase.com/docs/android/guide/offline-capabilities.html#section-handling-transactions-offline for more details.");
        }
        final e c = Q3.k.c(this, k);
        final Q3.s s = new Q3.s() {
            @Override
            public void a(final Q3.c c) {
            }
            
            @Override
            public void b(final Q3.b b) {
            }
        };
        this.D(new D(this, s, c.u()));
        final z z = new z(k, b, s, A.o, b2, this.S(), null);
        final n l = this.K(k);
        V3.m.z.e(z, l);
        final Q3.m b3 = Q3.k.b(l);
        Q3.c c2 = null;
        r.c c3 = null;
        try {
            if (b.a(b3) == null) {
                throw new NullPointerException("Transaction returned null as result");
            }
        }
        finally {
            final Throwable t;
            this.j.c("Caught Throwable.", t);
            final Q3.c b4 = Q3.c.b(t);
            final r.c a = Q3.r.a();
            c2 = b4;
            c3 = a;
        }
        if (!c3.b()) {
            V3.m.z.j(z, null);
            V3.m.z.m(z, null);
            this.X(new Runnable() {
                public final /* synthetic */ Q3.b q = Q3.k.a(c, d4.i.d(z.c(z)));
                
                @Override
                public void run() {
                    b.b(c2, false, this.q);
                }
            });
            return;
        }
        V3.m.z.o(z, A.p);
        final k m = this.f.k(k);
        List<z> list;
        if ((list = (List<z>)m.g()) == null) {
            list = new ArrayList<z>();
        }
        list.add(z);
        m.j(list);
        final Map c4 = V3.s.c(this.b);
        final n a2 = c3.a();
        final n i2 = V3.s.i(a2, V3.m.z.c(z), c4);
        V3.m.z.j(z, a2);
        V3.m.z.m(z, i2);
        V3.m.z.r(z, this.M());
        this.Y(this.p.I(k, a2, i2, V3.m.z.p(z), b2, false));
        this.j0();
    }
    
    public void o0(final V3.k k, final V3.b b, final e.e e, final Map obj) {
        if (this.j.f()) {
            final c j = this.j;
            final StringBuilder sb = new StringBuilder();
            sb.append("update: ");
            sb.append(k);
            j.b(sb.toString(), new Object[0]);
        }
        if (this.l.f()) {
            final c l = this.l;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("update: ");
            sb2.append(k);
            sb2.append(" ");
            sb2.append(obj);
            l.b(sb2.toString(), new Object[0]);
        }
        if (b.isEmpty()) {
            if (this.j.f()) {
                this.j.b("update called with no changes. No-op", new Object[0]);
            }
            this.G(e, null, k);
            return;
        }
        final V3.b f = V3.s.f(b, this.p, k, V3.s.c(this.b));
        final long m = this.M();
        this.Y(this.p.H(k, b, f, m, true));
        this.c.f(k.S(), obj, new T3.p() {
            @Override
            public void a(final String s, final String s2) {
                final Q3.c y = I(s, s2);
                V3.m.this.q0("updateChildren", k, y);
                V3.m.this.C(m, k, y);
                V3.m.this.G(e, y, k);
            }
        });
        final Iterator iterator = b.iterator();
        while (iterator.hasNext()) {
            this.d0(this.g(k.T(iterator.next().getKey()), -9));
        }
    }
    
    public final void p0(final d4.b b, final Object o) {
        if (b.equals(V3.c.b)) {
            this.b.b((long)o);
        }
        final V3.k k = new V3.k(new d4.b[] { V3.c.a, b });
        try {
            final n a = o.a(o);
            this.d.c(k, a);
            this.Y(this.o.A(k, a));
        }
        catch (Q3.d d) {
            this.j.c("Failed to parse info update", d);
        }
    }
    
    public final void q0(final String str, final V3.k k, final Q3.c c) {
        if (c != null && c.f() != -1 && c.f() != -25) {
            final c j = this.j;
            final StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" at ");
            sb.append(k.toString());
            sb.append(" failed: ");
            sb.append(c.toString());
            j.i(sb.toString());
        }
    }
    
    @Override
    public String toString() {
        return this.a.toString();
    }
    
    public enum A
    {
        o("INITIALIZING", 0), 
        p("RUN", 1), 
        q("SENT", 2), 
        r("COMPLETED", 3), 
        s("SENT_NEEDS_ABORT", 4), 
        t("NEEDS_ABORT", 5);
        
        public A(final String name, final int ordinal) {
        }
    }
    
    public static class z implements Comparable
    {
        public V3.k o;
        public r.b p;
        public Q3.s q;
        public A r;
        public long s;
        public boolean t;
        public int u;
        public Q3.c v;
        public long w;
        public n x;
        public n y;
        public n z;
        
        public z(final V3.k o, final r.b p6, final Q3.s q, final A r, final boolean t, final long s) {
            this.o = o;
            this.p = p6;
            this.q = q;
            this.r = r;
            this.u = 0;
            this.t = t;
            this.s = s;
            this.v = null;
            this.x = null;
            this.y = null;
            this.z = null;
        }
        
        public static /* synthetic */ Q3.c C(final z z) {
            return z.v;
        }
        
        public static /* synthetic */ Q3.c D(final z z, final Q3.c v) {
            return z.v = v;
        }
        
        public static /* synthetic */ boolean F(final z z) {
            return z.t;
        }
        
        public static /* synthetic */ n c(final z z) {
            return z.x;
        }
        
        public static /* synthetic */ n e(final z z, final n x) {
            return z.x = x;
        }
        
        public static /* synthetic */ n h(final z z) {
            return z.y;
        }
        
        public static /* synthetic */ n j(final z z, final n y) {
            return z.y = y;
        }
        
        public static /* synthetic */ n l(final z z) {
            return z.z;
        }
        
        public static /* synthetic */ n m(final z z, final n z2) {
            return z.z = z2;
        }
        
        public static /* synthetic */ A n(final z z) {
            return z.r;
        }
        
        public static /* synthetic */ A o(final z z, final A r) {
            return z.r = r;
        }
        
        public static /* synthetic */ long p(final z z) {
            return z.w;
        }
        
        public static /* synthetic */ long r(final z z, final long w) {
            return z.w = w;
        }
        
        public static /* synthetic */ int s(final z z) {
            return z.u;
        }
        
        public static /* synthetic */ int u(final z z) {
            return z.u++;
        }
        
        public static /* synthetic */ V3.k w(final z z) {
            return z.o;
        }
        
        public static /* synthetic */ r.b x(final z z) {
            return z.p;
        }
        
        public static /* synthetic */ Q3.s z(final z z) {
            return z.q;
        }
        
        public int G(final z z) {
            final long s = this.s;
            final long s2 = z.s;
            if (s < s2) {
                return -1;
            }
            if (s == s2) {
                return 0;
            }
            return 1;
        }
    }
}
