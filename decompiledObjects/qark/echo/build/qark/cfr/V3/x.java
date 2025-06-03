/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Void
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.Callable
 */
package V3;

import S3.h;
import T3.a;
import T3.g;
import V3.B;
import V3.F;
import V3.G;
import V3.b;
import V3.f;
import V3.h;
import V3.k;
import V3.v;
import V3.w;
import V3.y;
import X3.e;
import Y3.d;
import Y3.m;
import a4.e;
import a4.j;
import c4.c;
import d4.i;
import d4.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

public class x {
    public d a = d.d();
    public final F b = new F();
    public final Map c = new HashMap();
    public final Map d = new HashMap();
    public final Set e = new HashSet();
    public final s f;
    public final e g;
    public final c h;
    public long i = 1L;

    public x(f f8, e e8, s s8) {
        this.f = s8;
        this.g = e8;
        this.h = f8.q("SyncTree");
    }

    public static /* synthetic */ n a(x x8, a4.i i8) {
        return x8.P(i8);
    }

    public List A(final k k8, final n n8) {
        return (List)this.g.g(new Callable(){

            public List a() {
                x.this.g.j(a4.i.a(k8), n8);
                return x.this.y(new W3.f(W3.e.e, k8, n8));
            }
        });
    }

    public List B(k k8, List object) {
        Object object2 = (v)this.a.s(k8);
        if (object2 == null) {
            return Collections.emptyList();
        }
        if ((object2 = object2.e()) != null) {
            object2 = object2.i();
            Iterator iterator = object.iterator();
            object = object2;
            while (iterator.hasNext()) {
                object = ((d4.s)iterator.next()).a((n)object);
            }
            return this.A(k8, (n)object);
        }
        return Collections.emptyList();
    }

    public List C(final y y8) {
        return (List)this.g.g(new Callable(){

            public List a() {
                a4.i i8 = x.this.S(y8);
                if (i8 != null) {
                    x.this.g.p(i8);
                    W3.b b8 = new W3.b(W3.e.a(i8.d()), k.Y());
                    return x.this.D(i8, b8);
                }
                return Collections.emptyList();
            }
        });
    }

    public final List D(a4.i object, W3.d d8) {
        v v8 = (v)this.a.s((k)(object = object.e()));
        boolean bl = v8 != null;
        m.g(bl, "Missing sync point for query tag that we're tracking");
        return v8.b(d8, this.b.h((k)object), null);
    }

    public List E(final k k8, final Map map, final y y8) {
        return (List)this.g.g(new Callable(){

            public List a() {
                a4.i i8 = x.this.S(y8);
                if (i8 != null) {
                    Object object = k.b0(i8.e(), k8);
                    b b8 = b.D(map);
                    x.this.g.f(k8, b8);
                    object = new W3.c(W3.e.a(i8.d()), (k)object, b8);
                    return x.this.D(i8, (W3.d)object);
                }
                return Collections.emptyList();
            }
        });
    }

    public List F(final k k8, final n n8, final y y8) {
        return (List)this.g.g(new Callable(){

            public List a() {
                a4.i i8 = x.this.S(y8);
                if (i8 != null) {
                    k k82 = k.b0(i8.e(), k8);
                    Object object = k82.isEmpty() ? i8 : a4.i.a(k8);
                    x.this.g.j((a4.i)object, n8);
                    object = new W3.f(W3.e.a(i8.d()), k82, n8);
                    return x.this.D(i8, (W3.d)object);
                }
                return Collections.emptyList();
            }
        });
    }

    public List G(k k8, List object, y y8) {
        Object object2 = this.S(y8);
        if (object2 != null) {
            m.f(k8.equals(object2.e()));
            v v8 = (v)this.a.s(object2.e());
            boolean bl = false;
            boolean bl2 = v8 != null;
            m.g(bl2, "Missing sync point for query tag that we're tracking");
            object2 = v8.l((a4.i)object2);
            bl2 = bl;
            if (object2 != null) {
                bl2 = true;
            }
            m.g(bl2, "Missing view for query tag that we're tracking");
            object2 = object2.i();
            v8 = object.iterator();
            object = object2;
            while (v8.hasNext()) {
                object = ((d4.s)v8.next()).a((n)object);
            }
            return this.F(k8, (n)object, y8);
        }
        return Collections.emptyList();
    }

    public List H(final k k8, final b b8, final b b9, final long l8, final boolean bl) {
        return (List)this.g.g(new Callable(){

            public List a() {
                if (bl) {
                    x.this.g.c(k8, b8, l8);
                }
                x.this.b.a(k8, b9, l8);
                return x.this.y(new W3.c(W3.e.d, k8, b9));
            }
        });
    }

    public List I(final k k8, final n n8, final n n9, final long l8, final boolean bl, final boolean bl2) {
        boolean bl3 = bl || !bl2;
        m.g(bl3, "We shouldn't be persisting non-visible writes.");
        return (List)this.g.g(new Callable(){

            public List a() {
                if (bl2) {
                    x.this.g.e(k8, n8, l8);
                }
                x.this.b.b(k8, n9, l8, bl);
                if (!bl) {
                    return Collections.emptyList();
                }
                return x.this.y(new W3.f(W3.e.d, k8, n9));
            }
        });
    }

    public n J(k k8, List list) {
        Object object;
        d d8 = this.a;
        Object object2 = (v)d8.getValue();
        k k9 = k.Y();
        object2 = null;
        k k10 = k8;
        do {
            object = k10.Z();
            k10 = k10.c0();
            k9 = k9.U((d4.b)object);
            k k11 = k.b0(k9, k8);
            d8 = object != null ? d8.D((d4.b)object) : d.d();
            v v8 = (v)d8.getValue();
            object = object2;
            if (v8 != null) {
                object = v8.d(k11);
            }
            if (k10.isEmpty()) break;
            object2 = object;
        } while (object == null);
        return this.b.d(k8, (n)object, list, true);
    }

    public final List K(d d8) {
        ArrayList arrayList = new ArrayList();
        this.L(d8, (List)arrayList);
        return arrayList;
    }

    public final void L(d d8, List list) {
        v v8 = (v)d8.getValue();
        if (v8 != null && v8.h()) {
            list.add((Object)v8.e());
            return;
        }
        if (v8 != null) {
            list.addAll((Collection)v8.f());
        }
        d8 = d8.M().iterator();
        while (d8.hasNext()) {
            this.L((d)((Map.Entry)d8.next()).getValue(), list);
        }
    }

    public final y M() {
        long l8 = this.i;
        this.i = 1L + l8;
        return new y(l8);
    }

    public n N(a4.i i8) {
        return (n)this.g.g(new w(this, i8));
    }

    public void O(a4.i i8, boolean bl, boolean bl2) {
        if (bl && !this.e.contains((Object)i8)) {
            this.u(new q(i8), bl2);
            this.e.add((Object)i8);
            return;
        }
        if (!bl && this.e.contains((Object)i8)) {
            this.W(new q(i8), bl2);
            this.e.remove((Object)i8);
        }
    }

    public final /* synthetic */ n P(a4.i i8) {
        boolean bl;
        k k8 = i8.e();
        Object object = this.a;
        Object object2 = null;
        Object object3 = k8;
        boolean bl2 = false;
        do {
            boolean bl3 = object.isEmpty();
            bl = true;
            if (bl3) break;
            v v8 = (v)object.getValue();
            n n8 = object2;
            boolean bl4 = bl2;
            if (v8 != null) {
                if (object2 == null) {
                    object2 = v8.d((k)object3);
                }
                if (!bl2 && !v8.h()) {
                    bl4 = false;
                    n8 = object2;
                } else {
                    bl4 = true;
                    n8 = object2;
                }
            }
            object2 = object3.isEmpty() ? d4.b.j("") : object3.Z();
            object = object.D((d4.b)object2);
            object3 = object3.c0();
            object2 = n8;
            bl2 = bl4;
        } while (true);
        object3 = (v)this.a.s(k8);
        if (object3 == null) {
            object3 = new v(this.g);
            this.a = this.a.W(k8, object3);
        } else if (object2 == null) {
            object2 = object3.d(k.Y());
        }
        object = object2 != null ? object2 : d4.g.W();
        object = i.f((n)object, i8.c());
        if (object2 == null) {
            bl = false;
        }
        object2 = new a4.a((i)object, bl, false);
        return object3.g(i8, this.b.h(k8), (a4.a)object2).d();
    }

    public Q3.b Q(Q3.p p8) {
        return Q3.k.a(p8.t(), this.g.k(p8.u()).a());
    }

    public final a4.i R(a4.i i8) {
        a4.i i9 = i8;
        if (i8.g()) {
            i9 = i8;
            if (!i8.f()) {
                i9 = a4.i.a(i8.e());
            }
        }
        return i9;
    }

    public final a4.i S(y y8) {
        return (a4.i)this.c.get((Object)y8);
    }

    public List T(a4.i i8, Q3.c c8) {
        return this.X(i8, null, c8, false);
    }

    public List U() {
        return (List)this.g.g(new Callable(){

            public List a() {
                x.this.g.a();
                if (x.this.b.k().isEmpty()) {
                    return Collections.emptyList();
                }
                d d8 = new d((Object)Boolean.TRUE);
                return x.this.y(new W3.a(k.Y(), d8, true));
            }
        });
    }

    public List V(h h8) {
        return this.X(h8.e(), h8, null, false);
    }

    public List W(h h8, boolean bl) {
        return this.X(h8.e(), h8, null, bl);
    }

    public final List X(final a4.i i8, final h h8, final Q3.c c8, final boolean bl) {
        return (List)this.g.g(new Callable(){

            public List a() {
                Object object;
                block13 : {
                    Object object2;
                    boolean bl6;
                    boolean bl2;
                    List list;
                    Object object32;
                    Object object4;
                    block12 : {
                        boolean bl3;
                        block14 : {
                            object2 = i8.e();
                            object32 = (v)x.this.a.s((k)object2);
                            object = object4 = new ArrayList();
                            if (object32 == null) break block13;
                            if (i8.f()) break block14;
                            object = object4;
                            if (!object32.k(i8)) break block13;
                        }
                        object = object32.j(i8, h8, c8);
                        if (object32.i()) {
                            object4 = x.this;
                            ((x)object4).a = ((x)object4).a.U((k)object2);
                        }
                        list = (List)object.a();
                        object4 = (List)object.b();
                        object = list.iterator();
                        block0 : do {
                            bl2 = false;
                            while (object.hasNext()) {
                                object32 = (a4.i)object.next();
                                x.this.g.i(i8);
                                if (!bl2 && !object32.g()) continue block0;
                                bl2 = true;
                            }
                            break;
                        } while (true);
                        if (bl) {
                            return null;
                        }
                        object = x.this.a;
                        boolean bl4 = object.getValue() != null && ((v)object.getValue()).h();
                        Iterator iterator = object2.iterator();
                        do {
                            bl6 = bl4;
                            if (!iterator.hasNext()) break block12;
                            object32 = object.D((d4.b)iterator.next());
                            bl3 = bl4 || object32.getValue() != null && ((v)object32.getValue()).h();
                            bl6 = bl3;
                            if (bl3) break block12;
                            object = object32;
                            bl4 = bl3;
                        } while (!object32.isEmpty());
                        bl6 = bl3;
                    }
                    if (bl2 && !bl6 && !(object = x.this.a.Y((k)object2)).isEmpty()) {
                        object = x.this.K((d)object).iterator();
                        while (object.hasNext()) {
                            object2 = (j)object.next();
                            object32 = new r((j)object2);
                            object2 = object2.h();
                            x.this.f.b(x.this.R((a4.i)object2), ((r)object32).b, (g)object32, (p)object32);
                        }
                    }
                    if (!bl6 && !list.isEmpty() && c8 == null) {
                        if (bl2) {
                            x.this.f.a(x.this.R(i8), null);
                        } else {
                            for (Object object32 : list) {
                                object2 = x.this.b0((a4.i)object32);
                                boolean bl5 = object2 != null;
                                m.f(bl5);
                                x.this.f.a(x.this.R((a4.i)object32), (y)object2);
                            }
                        }
                    }
                    x.this.Y(list);
                    object = object4;
                }
                return object;
            }
        });
    }

    public final void Y(List list) {
        for (a4.i i8 : list) {
            if (i8.g()) continue;
            y y8 = this.b0(i8);
            boolean bl = y8 != null;
            m.f(bl);
            this.d.remove((Object)i8);
            this.c.remove((Object)y8);
        }
    }

    public void Z(final a4.i i8) {
        this.g.g(new Callable(){

            public Void a() {
                x.this.g.m(i8);
                return null;
            }
        });
    }

    public final void a0(a4.i object, j object2) {
        k k8 = object.e();
        y y8 = this.b0((a4.i)object);
        object2 = new r((j)object2);
        this.f.b(this.R((a4.i)object), y8, (g)object2, (p)object2);
        object = this.a.Y(k8);
        if (y8 != null) {
            m.g(((v)object.getValue()).h() ^ true, "If we're adding a query, it shouldn't be shadowed");
            return;
        }
        object.q(new d.c(){

            public Void b(k object, v object2, Void void_) {
                if (!object.isEmpty() && object2.h()) {
                    object = object2.e().h();
                    x.this.f.a(x.this.R((a4.i)object), x.this.b0((a4.i)object));
                } else {
                    object = object2.f().iterator();
                    while (object.hasNext()) {
                        object2 = ((j)object.next()).h();
                        x.this.f.a(x.this.R((a4.i)object2), x.this.b0((a4.i)object2));
                    }
                }
                return null;
            }
        });
    }

    public y b0(a4.i i8) {
        return (y)this.d.get((Object)i8);
    }

    public List s(final long l8, final boolean bl, final boolean bl2, final Y3.a a8) {
        return (List)this.g.g(new Callable(){

            public List a() {
                d d8;
                if (bl2) {
                    x.this.g.b(l8);
                }
                B b8 = x.this.b.i(l8);
                boolean bl3 = x.this.b.m(l8);
                if (b8.f() && !bl) {
                    Map d9 = V3.s.c(a8);
                    if (b8.e()) {
                        n n8 = V3.s.g(b8.b(), x.this, b8.c(), d9);
                        x.this.g.n(b8.c(), n8);
                    } else {
                        b b9 = V3.s.f(b8.a(), x.this, b8.c(), d9);
                        x.this.g.h(b8.c(), b9);
                    }
                }
                if (!bl3) {
                    return Collections.emptyList();
                }
                d d9 = d.d();
                if (b8.e()) {
                    d8 = d9.W(k.Y(), (Object)Boolean.TRUE);
                } else {
                    Iterator iterator = b8.a().iterator();
                    do {
                        void var2_8;
                        d8 = var2_8;
                        if (!iterator.hasNext()) break;
                        d d10 = var2_8.W((k)((Map.Entry)iterator.next()).getKey(), (Object)Boolean.TRUE);
                    } while (true);
                }
                return x.this.y(new W3.a(b8.c(), d8, bl));
            }
        });
    }

    public List t(h h8) {
        return this.u(h8, false);
    }

    public List u(final h h8, final boolean bl) {
        return (List)this.g.g(new Callable(){

            public List a() {
                a4.i i8 = h8.e();
                k k8 = i8.e();
                Object object = x.this.a;
                Object object2 = null;
                Object object3 = k8;
                boolean bl4 = false;
                while (!object.isEmpty()) {
                    v v8 = (v)object.getValue();
                    Object object4 = object2;
                    boolean bl2 = bl4;
                    if (v8 != null) {
                        if (object2 == null) {
                            object2 = v8.d((k)object3);
                        }
                        if (!bl4 && !v8.h()) {
                            bl2 = false;
                            object4 = object2;
                        } else {
                            bl2 = true;
                            object4 = object2;
                        }
                    }
                    object2 = object3.isEmpty() ? d4.b.j("") : object3.Z();
                    object = object.D((d4.b)object2);
                    object3 = object3.c0();
                    object2 = object4;
                    bl4 = bl2;
                }
                object3 = (v)x.this.a.s(k8);
                if (object3 == null) {
                    object3 = new v(x.this.g);
                    object = x.this;
                    ((x)object).a = ((x)object).a.W(k8, object3);
                } else {
                    bl4 = bl4 || object3.h();
                    if (object2 == null) {
                        object2 = object3.d(k.Y());
                    }
                }
                x.this.g.m(i8);
                if (object2 != null) {
                    object2 = new a4.a(i.f((n)object2, i8.c()), true, false);
                } else {
                    object = x.this.g.k(i8);
                    if (object.f()) {
                        object2 = object;
                    } else {
                        object2 = d4.g.W();
                        for (v v8 : x.this.a.Y(k8).M()) {
                            Object object5 = (v)((d)v8.getValue()).getValue();
                            if (object5 == null || (object5 = object5.d(k.Y())) == null) continue;
                            object2 = object2.N((d4.b)v8.getKey(), (n)object5);
                        }
                        for (Object object4 : object.b()) {
                            if (object2.Q(object4.c())) continue;
                            object2 = object2.N(object4.c(), object4.d());
                        }
                        object2 = new a4.a(i.f((n)object2, i8.c()), false, false);
                    }
                }
                boolean bl3 = object3.k(i8);
                if (!bl3 && !i8.g()) {
                    m.g(x.this.d.containsKey((Object)i8) ^ true, "View does not exist but we have a tag");
                    object = x.this.M();
                    x.this.d.put((Object)i8, object);
                    x.this.c.put(object, (Object)i8);
                }
                object = x.this.b.h(k8);
                object2 = object3.a(h8, (G)object, (a4.a)object2);
                if (!(bl3 || bl4 || bl)) {
                    object3 = object3.l(i8);
                    x.this.a0(i8, (j)object3);
                }
                return object2;
            }
        });
    }

    public List v(final k k8) {
        return (List)this.g.g(new Callable(){

            public List a() {
                x.this.g.p(a4.i.a(k8));
                return x.this.y(new W3.b(W3.e.e, k8));
            }
        });
    }

    public final List w(final W3.d d8, d d9, n n8, final G g8) {
        v v8 = (v)d9.getValue();
        final n n9 = n8;
        if (n8 == null) {
            n9 = n8;
            if (v8 != null) {
                n9 = v8.d(k.Y());
            }
        }
        n8 = new ArrayList();
        d9.M().q(new h.b((List)n8){
            public final /* synthetic */ List d;
            {
                this.d = list;
            }

            public void b(d4.b object, d d82) {
                n n8 = n9;
                n8 = n8 != null ? n8.v((d4.b)object) : null;
                G g82 = g8.h((d4.b)object);
                if ((object = d8.d((d4.b)object)) != null) {
                    this.d.addAll((Collection)x.this.w((W3.d)object, d82, n8, g82));
                }
            }
        });
        if (v8 != null) {
            n8.addAll((Collection)v8.b(d8, g8, n9));
        }
        return n8;
    }

    public final List x(W3.d d8, d object, n n8, G g8) {
        if (d8.a().isEmpty()) {
            return this.w(d8, (d)object, n8, g8);
        }
        v v8 = (v)object.getValue();
        n n9 = n8;
        if (n8 == null) {
            n9 = n8;
            if (v8 != null) {
                n9 = v8.d(k.Y());
            }
        }
        n8 = new ArrayList();
        d4.b b8 = d8.a().Z();
        W3.d d9 = d8.d(b8);
        d d10 = (d)object.M().d(b8);
        if (d10 != null && d9 != null) {
            object = n9 != null ? n9.v(b8) : null;
            n8.addAll((Collection)this.x(d9, d10, (n)object, g8.h(b8)));
        }
        if (v8 != null) {
            n8.addAll((Collection)v8.b(d8, g8, n9));
        }
        return n8;
    }

    public final List y(W3.d d8) {
        return this.x(d8, this.a, null, this.b.h(k.Y()));
    }

    public List z(final k k8, final Map map) {
        return (List)this.g.g(new Callable(){

            public List a() {
                b b8 = b.D(map);
                x.this.g.f(k8, b8);
                return x.this.y(new W3.c(W3.e.e, k8, b8));
            }
        });
    }

    public static interface p {
        public List a(Q3.c var1);
    }

    public static class q
    extends h {
        public a4.i d;

        public q(a4.i i8) {
            this.d = i8;
        }

        @Override
        public h a(a4.i i8) {
            return new q(i8);
        }

        @Override
        public a4.d b(a4.c c8, a4.i i8) {
            return null;
        }

        @Override
        public void c(Q3.c c8) {
        }

        @Override
        public void d(a4.d d8) {
        }

        @Override
        public a4.i e() {
            return this.d;
        }

        public boolean equals(Object object) {
            if (object instanceof q && ((q)object).d.equals(this.d)) {
                return true;
            }
            return false;
        }

        @Override
        public boolean f(h h8) {
            return h8 instanceof q;
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        @Override
        public boolean i(e.a a8) {
            return false;
        }
    }

    public class r
    implements g,
    p {
        public final j a;
        public final y b;

        public r(j j8) {
            this.a = j8;
            this.b = x.this.b0(j8.h());
        }

        @Override
        public List a(Q3.c object) {
            if (object == null) {
                object = this.a.h();
                y y8 = this.b;
                if (y8 != null) {
                    return x.this.C(y8);
                }
                return x.this.v(object.e());
            }
            c c8 = x.this.h;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Listen at ");
            stringBuilder.append((Object)this.a.h().e());
            stringBuilder.append(" failed: ");
            stringBuilder.append(object.toString());
            c8.i(stringBuilder.toString());
            return x.this.T(this.a.h(), (Q3.c)object);
        }

        @Override
        public a b() {
            d4.d d8 = d4.d.b(this.a.i());
            List list = d8.e();
            ArrayList arrayList = new ArrayList(list.size());
            list = list.iterator();
            while (list.hasNext()) {
                arrayList.add((Object)((k)list.next()).S());
            }
            return new a((List)arrayList, d8.d());
        }

        @Override
        public boolean c() {
            if (Y3.e.b(this.a.i()) > 1024L) {
                return true;
            }
            return false;
        }

        @Override
        public String d() {
            return this.a.i().R();
        }
    }

    public static interface s {
        public void a(a4.i var1, y var2);

        public void b(a4.i var1, y var2, g var3, p var4);
    }

}

