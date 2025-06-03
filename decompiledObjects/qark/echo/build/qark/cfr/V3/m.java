/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Comparable
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Objects
 *  java.util.Set
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 */
package V3;

import Q3.e;
import Q3.r;
import T3.h;
import V3.A;
import V3.B;
import V3.D;
import V3.b;
import V3.c;
import V3.f;
import V3.h;
import V3.j;
import V3.k;
import V3.n;
import V3.o;
import V3.p;
import V3.r;
import V3.s;
import V3.t;
import V3.u;
import V3.x;
import V3.y;
import X3.d;
import X3.e;
import Y3.a;
import Y3.k;
import d4.g;
import d4.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

public class m
implements h.a {
    public final p a;
    public final Y3.f b = new Y3.f(new Y3.b(), 0L);
    public T3.h c;
    public t d;
    public u e;
    public Y3.k f;
    public boolean g = false;
    public final a4.g h;
    public final f i;
    public final c4.c j;
    public final c4.c k;
    public final c4.c l;
    public long m = 0L;
    public long n = 1L;
    public x o;
    public x p;
    public Q3.h q;
    public boolean r = false;
    public long s = 0L;

    public m(p p8, f f8, Q3.h h8) {
        this.a = p8;
        this.i = f8;
        this.q = h8;
        this.j = f8.q("RepoOperation");
        this.k = f8.q("Transaction");
        this.l = f8.q("DataOperation");
        this.h = new a4.g(f8);
        this.i0(new Runnable(){

            public void run() {
                m.this.H();
            }
        });
    }

    public static Q3.c I(String string2, String string3) {
        if (string2 != null) {
            return Q3.c.d(string2, string3);
        }
        return null;
    }

    public final void C(long l8, k k8, Q3.c c8) {
        if (c8 != null && c8.f() == -25) {
            return;
        }
        boolean bl = c8 == null;
        c8 = this.p.s(l8, bl ^ true, true, this.b);
        if (c8.size() > 0) {
            this.d0(k8);
        }
        this.Y((List)c8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void D(h h8) {
        Object object = h8.e().e().Z();
        object = object != null && object.equals(c.a) ? this.o : this.p;
        h8 = object.t(h8);
        this.Y((List)h8);
    }

    public final void E(final List list, Y3.k k8) {
        List list2 = (List)k8.g();
        if (list2 != null) {
            list.addAll((Collection)list2);
        }
        k8.c(new k.c(){

            @Override
            public void a(Y3.k k8) {
                m.this.E(list, k8);
            }
        });
    }

    public final List F(Y3.k k8) {
        ArrayList arrayList = new ArrayList();
        this.E((List)arrayList, k8);
        Collections.sort((List)arrayList);
        return arrayList;
    }

    public void G(final e.e e8, final Q3.c c8, k k8) {
        if (e8 != null) {
            d4.b b8 = k8.X();
            k k9 = k8;
            if (b8 != null) {
                k9 = k8;
                if (b8.s()) {
                    k9 = k8.a0();
                }
            }
            this.X(new Runnable(Q3.k.c(this, k9)){
                public final /* synthetic */ Q3.e q;
                {
                    this.q = e9;
                }

                public void run() {
                    e8.a(c8, this.q);
                }
            });
        }
    }

    public final void H() {
        Object object = this.a;
        object = new T3.f(object.a, object.c, object.b);
        this.c = this.i.E((T3.f)object, this);
        this.i.m().b((ExecutorService)((Y3.c)this.i.v()).d(), new A.b(){});
        this.i.l().b((ExecutorService)((Y3.c)this.i.v()).d(), new A.b(){});
        this.c.a();
        object = this.i.t(this.a.a);
        this.d = new t();
        this.e = new u();
        this.f = new Y3.k();
        this.o = new x(this.i, new d(), new x.s(){

            @Override
            public void a(a4.i i8, y y8) {
            }

            @Override
            public void b(final a4.i i8, y y8, T3.g g8, final x.p p8) {
                m.this.i0(new Runnable(){

                    public void run() {
                        d4.n n8 = m.this.d.a(i8.e());
                        if (!n8.isEmpty()) {
                            n8 = m.this.o.A(i8.e(), n8);
                            m.this.Y((List)n8);
                            p8.a(null);
                        }
                    }
                });
            }

        });
        this.p = new x(this.i, (e)object, new x.s(){

            @Override
            public void a(a4.i i8, y y8) {
                m.this.c.l(i8.e().S(), i8.d().k());
            }

            @Override
            public void b(a4.i i8, y y8, T3.g g8, final x.p p8) {
                T3.h h8 = m.this.c;
                List list = i8.e().S();
                Map map = i8.d().k();
                i8 = y8 != null ? Long.valueOf((long)y8.a()) : null;
                h8.k(list, map, g8, (Long)i8, new T3.p(){

                    @Override
                    public void a(String object, String string2) {
                        object = m.I((String)object, string2);
                        object = p8.a((Q3.c)object);
                        m.this.Y((List)object);
                    }
                });
            }

        });
        this.e0((e)object);
        object = c.c;
        Boolean bl = Boolean.FALSE;
        this.p0((d4.b)object, (Object)bl);
        this.p0(c.d, (Object)bl);
    }

    public final Y3.k J(k k8) {
        Y3.k k9 = this.f;
        while (!k8.isEmpty() && k9.g() == null) {
            k9 = k9.k(new k(k8.Z()));
            k8 = k8.c0();
        }
        return k9;
    }

    public final d4.n K(k k8) {
        return this.L(k8, (List)new ArrayList());
    }

    public final d4.n L(k object, List object2) {
        object = object2 = this.p.J((k)object, (List)object2);
        if (object2 == null) {
            object = g.W();
        }
        return object;
    }

    public final long M() {
        long l8 = this.n;
        this.n = 1L + l8;
        return l8;
    }

    public x N() {
        return this.p;
    }

    public V2.j O(final Q3.p p8) {
        final V2.k k8 = new V2.k();
        this.i0(new Runnable(){

            public static /* synthetic */ void a( y8, V2.k k82, Q3.b b8, Q3.p p82, m m8, V2.j j8) {
                y8.d(k82, b8, p82, m8, j8);
            }

            public static /* synthetic */ void b(V2.k k82, Q3.b b8) {
                k82.e(b8);
            }

            public final /* synthetic */ void d(V2.k k82, Q3.b b8, Q3.p p82, m m8, V2.j object) {
                if (k82.a().m()) {
                    return;
                }
                if (!object.n()) {
                    if (b8.b()) {
                        k82.c(b8);
                        return;
                    }
                    b8 = object.i();
                    Objects.requireNonNull((Object)b8);
                    k82.b((Exception)b8);
                    return;
                }
                object = d4.o.a(object.j());
                a4.i i8 = p82.u();
                m.this.R(i8, true, true);
                b8 = i8.g() ? m.this.p.A(i8.e(), (d4.n)object) : m.this.p.F(i8.e(), (d4.n)object, m.this.N().b0(i8));
                m8.Y((List)b8);
                k82.c(Q3.k.a(p82.t(), i.f((d4.n)object, p82.u().c())));
                m.this.R(i8, false, true);
            }

            public void run() {
                Object object = m.this.p.N(p8.u());
                if (object != null) {
                    k8.c(Q3.k.a(p8.t(), i.d((d4.n)object)));
                    return;
                }
                m.this.p.Z(p8.u());
                object = m.this.p.Q(p8);
                if (object.b()) {
                    m.this.h0(new n(k8, (Q3.b)object), 3000L);
                }
                m.this.c.d(p8.s().S(), p8.u().d().k()).c((Executor)((Y3.c)m.this.i.v()).d(), new o(this, k8, (Q3.b)object, p8, this));
            }
        });
        return k8.a();
    }

    public void P() {
        this.c.j("repo_interrupt");
    }

    public void Q(a4.i i8, boolean bl) {
        this.R(i8, bl, false);
    }

    public void R(a4.i i8, boolean bl, boolean bl2) {
        boolean bl3 = i8.e().isEmpty() || !i8.e().Z().equals(c.a);
        Y3.m.f(bl3);
        this.p.O(i8, bl, bl2);
    }

    public final long S() {
        long l8 = this.s;
        this.s = 1L + l8;
        return l8;
    }

    public void T(final k k8, final e.e e8) {
        this.c.m(k8.S(), new T3.p(){

            @Override
            public void a(String object, String string2) {
                if ((object = m.I((String)object, string2)) == null) {
                    m.this.e.c(k8);
                }
                m.this.G(e8, (Q3.c)object, k8);
            }
        });
    }

    public void U(final k k8, final d4.n n8, final e.e e8) {
        this.c.h(k8.S(), n8.L(true), new T3.p(){

            @Override
            public void a(String object, String string2) {
                object = m.I((String)object, string2);
                m.this.q0("onDisconnect().setValue", k8, (Q3.c)object);
                if (object == null) {
                    m.this.e.d(k8, n8);
                }
                m.this.G(e8, (Q3.c)object, k8);
            }
        });
    }

    public void V(final k k8, final Map map, final e.e e8, Map map2) {
        this.c.b(k8.S(), map2, new T3.p(){

            @Override
            public void a(String object, String string2) {
                object = m.I((String)object, string2);
                m.this.q0("onDisconnect().updateChildren", k8, (Q3.c)object);
                if (object == null) {
                    for (Map.Entry entry : map.entrySet()) {
                        m.this.e.d(k8.T((k)entry.getKey()), (d4.n)entry.getValue());
                    }
                }
                m.this.G(e8, (Q3.c)object, k8);
            }
        });
    }

    public void W(d4.b b8, Object object) {
        this.p0(b8, object);
    }

    public void X(Runnable runnable) {
        this.i.F();
        this.i.o().b(runnable);
    }

    public final void Y(List list) {
        if (!list.isEmpty()) {
            this.h.b(list);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void Z(Y3.k k8) {
        List list = (List)k8.g();
        if (list != null) {
            int n8 = 0;
            while (n8 < list.size()) {
                if (((z)list.get(n8)).r == A.r) {
                    list.remove(n8);
                    continue;
                }
                ++n8;
            }
            if (list.size() <= 0) {
                list = null;
            }
            k8.j((Object)list);
        }
        k8.c(new k.c(){

            @Override
            public void a(Y3.k k8) {
                m.this.Z(k8);
            }
        });
    }

    @Override
    public void a() {
        this.W(c.d, (Object)Boolean.TRUE);
    }

    public void a0() {
        if (this.j.f()) {
            this.j.b("Purging writes", new Object[0]);
        }
        this.Y(this.p.U());
        this.g(k.Y(), -25);
        this.c.e();
    }

    @Override
    public void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.p0(d4.b.j((String)entry.getKey()), entry.getValue());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void b0(h h8) {
        x x8 = c.a.equals(h8.e().e().Z()) ? this.o : this.p;
        h8 = x8.V(h8);
        this.Y((List)h8);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void c(List var1_1, Object var2_3, boolean var3_4, Long var4_5) {
        var5_6 = new k((List)var1_1);
        if (this.j.f()) {
            var1_1 = this.j;
            var6_7 = new StringBuilder();
            var6_7.append("onDataUpdate: ");
            var6_7.append((Object)var5_6);
            var1_1.b(var6_7.toString(), new Object[0]);
        }
        if (this.l.f()) {
            var1_1 = this.j;
            var6_7 = new StringBuilder();
            var6_7.append("onDataUpdate: ");
            var6_7.append((Object)var5_6);
            var6_7.append(" ");
            var6_7.append(var2_3);
            var1_1.b(var6_7.toString(), new Object[0]);
        }
        ++this.m;
        if (var4_5 == null) ** GOTO lbl31
        try {
            block11 : {
                var1_1 = new y(var4_5);
                if (var3_4) {
                    var4_5 = new HashMap();
                    for (Object var6_7 : ((Map)var2_3).entrySet()) {
                        var7_8 = d4.o.a(var6_7.getValue());
                        var4_5.put((Object)new k((String)var6_7.getKey()), (Object)var7_8);
                    }
                    var1_1 = this.p.E(var5_6, (Map)var4_5, (y)var1_1);
                } else {
                    var2_3 = d4.o.a(var2_3);
                    var1_1 = this.p.F(var5_6, (d4.n)var2_3, (y)var1_1);
                }
                break block11;
lbl31: // 1 sources:
                if (var3_4) {
                    var1_1 = new HashMap();
                    for (Long var4_5 : ((Map)var2_3).entrySet()) {
                        var6_7 = d4.o.a(var4_5.getValue());
                        var1_1.put((Object)new k((String)var4_5.getKey()), var6_7);
                    }
                    var1_1 = this.p.z(var5_6, (Map)var1_1);
                } else {
                    var1_1 = d4.o.a(var2_3);
                    var1_1 = this.p.A(var5_6, (d4.n)var1_1);
                }
            }
            if (var1_1.size() > 0) {
                this.d0(var5_6);
            }
            this.Y((List)var1_1);
            return;
        }
        catch (Q3.d var1_2) {}
        this.j.c("FIREBASE INTERNAL ERROR", (Throwable)var1_2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void c0(List var1_1, k var2_3) {
        if (var1_1.isEmpty()) {
            return;
        }
        var10_4 = new ArrayList();
        var11_5 = new ArrayList();
        var8_6 = var1_1.iterator();
        while (var8_6.hasNext()) {
            var11_5.add((Object)z.p((z)var8_6.next()));
        }
        var12_7 = var1_1.iterator();
        do {
            block11 : {
                var5_10 = var12_7.hasNext();
                var4_9 = 0;
                var3_8 = 0;
                if (!var5_10) break;
                var13_13 = (z)var12_7.next();
                var1_1 = k.b0(var2_3, z.w(var13_13));
                var14_14 = new ArrayList();
                var5_10 = var1_1 != null;
                Y3.m.f(var5_10);
                if (z.n(var13_13) != A.t) break block11;
                var1_1 = var8_6 = z.C(var13_13);
                if (var8_6.f() == -25) ** GOTO lbl33
                var9_12 = this.p.s(z.p(var13_13), true, false, this.b);
                var1_1 = var8_6;
                var8_6 = var9_12;
                ** GOTO lbl32
            }
            if (z.n(var13_13) != A.p) ** GOTO lbl60
            if (z.s(var13_13) >= 25) {
                var1_1 = Q3.c.c("maxretries");
                var8_6 = this.p.s(z.p(var13_13), true, false, this.b);
lbl32: // 2 sources:
                var14_14.addAll((Collection)var8_6);
lbl33: // 2 sources:
                var3_8 = 1;
            } else {
                var9_12 = this.L(z.w(var13_13), (List)var11_5);
                z.e(var13_13, var9_12);
                var1_1 = Q3.k.b(var9_12);
                try {
                    var8_6 = z.x(var13_13).a((Q3.m)var1_1);
                    var1_1 = null;
                }
                catch (Throwable var1_2) {
                    this.j.c("Caught Throwable.", var1_2);
                    var1_1 = Q3.c.b(var1_2);
                    var8_6 = Q3.r.a();
                }
                if (!var8_6.b()) {
                    var14_14.addAll((Collection)this.p.s(z.p(var13_13), true, false, this.b));
                    var3_8 = 1;
                } else {
                    var6_11 = z.p(var13_13);
                    var1_1 = s.c(this.b);
                    var8_6 = var8_6.a();
                    var1_1 = s.i((d4.n)var8_6, var9_12, (Map)var1_1);
                    z.j(var13_13, (d4.n)var8_6);
                    z.m(var13_13, (d4.n)var1_1);
                    z.r(var13_13, this.M());
                    var11_5.remove((Object)var6_11);
                    var14_14.addAll((Collection)this.p.I(z.w(var13_13), (d4.n)var8_6, (d4.n)var1_1, z.p(var13_13), z.F(var13_13), false));
                    var14_14.addAll((Collection)this.p.s(var6_11, true, false, this.b));
lbl60: // 2 sources:
                    var1_1 = null;
                }
            }
            this.Y((List)var14_14);
            if (var3_8 == 0) continue;
            z.o(var13_13, A.r);
            var8_6 = Q3.k.a(Q3.k.c(this, z.w(var13_13)), i.d(z.c(var13_13)));
            this.i0(new Runnable(){

                public void run() {
                    m m8 = m.this;
                    m8.b0(new D(m8, var13_13.q, a4.i.a(var13_13.o)));
                }
            });
            var10_4.add((Object)new Runnable((Q3.c)var1_1, (Q3.b)var8_6){
                public final /* synthetic */ Q3.c p;
                public final /* synthetic */ Q3.b q;
                {
                    this.p = c8;
                    this.q = b8;
                }

                public void run() {
                    var13_13.p.b(this.p, false, this.q);
                }
            });
        } while (true);
        this.Z(this.f);
        var3_8 = var4_9;
        do {
            if (var3_8 >= var10_4.size()) {
                this.j0();
                return;
            }
            this.X((Runnable)var10_4.get(var3_8));
            ++var3_8;
        } while (true);
    }

    @Override
    public void d() {
        this.W(c.d, (Object)Boolean.FALSE);
        this.g0();
    }

    public final k d0(k object) {
        object = this.J((k)object);
        k k8 = object.f();
        this.c0(this.F((Y3.k)object), k8);
        return k8;
    }

    @Override
    public void e(boolean bl) {
        this.W(c.c, bl);
    }

    public final void e0(e e8) {
        List list = e8.d();
        e8 = s.c(this.b);
        list = list.iterator();
        long l8 = Long.MIN_VALUE;
        while (list.hasNext()) {
            final B b8 = (B)list.next();
            Object object = new T3.p(){

                @Override
                public void a(String object, String string2) {
                    object = m.I((String)object, string2);
                    m.this.q0("Persisted write", b8.c(), (Q3.c)object);
                    m.this.C(b8.d(), b8.c(), (Q3.c)object);
                }
            };
            if (l8 < b8.d()) {
                c4.c c8;
                StringBuilder stringBuilder;
                l8 = b8.d();
                this.n = b8.d() + 1L;
                if (b8.e()) {
                    if (this.j.f()) {
                        c8 = this.j;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Restoring overwrite with id ");
                        stringBuilder.append(b8.d());
                        c8.b(stringBuilder.toString(), new Object[0]);
                    }
                    this.c.r(b8.c().S(), b8.b().L(true), (T3.p)object);
                    object = s.g(b8.b(), this.p, b8.c(), (Map)e8);
                    this.p.I(b8.c(), b8.b(), (d4.n)object, b8.d(), true, false);
                    continue;
                }
                if (this.j.f()) {
                    c8 = this.j;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Restoring merge with id ");
                    stringBuilder.append(b8.d());
                    c8.b(stringBuilder.toString(), new Object[0]);
                }
                this.c.f(b8.c().S(), b8.a().U(true), (T3.p)object);
                object = s.f(b8.a(), this.p, b8.c(), (Map)e8);
                this.p.H(b8.c(), b8.a(), (b)object, b8.d(), false);
                continue;
            }
            throw new IllegalStateException("Write ids were not in order.");
        }
    }

    @Override
    public void f(List object, List object2, Long l8) {
        StringBuilder stringBuilder;
        k k8 = new k((List)object);
        if (this.j.f()) {
            object = this.j;
            stringBuilder = new StringBuilder();
            stringBuilder.append("onRangeMergeUpdate: ");
            stringBuilder.append((Object)k8);
            object.b(stringBuilder.toString(), new Object[0]);
        }
        if (this.l.f()) {
            object = this.j;
            stringBuilder = new StringBuilder();
            stringBuilder.append("onRangeMergeUpdate: ");
            stringBuilder.append((Object)k8);
            stringBuilder.append(" ");
            stringBuilder.append(object2);
            object.b(stringBuilder.toString(), new Object[0]);
        }
        ++this.m;
        object = new ArrayList(object2.size());
        object2 = object2.iterator();
        while (object2.hasNext()) {
            object.add((Object)new d4.s((T3.o)object2.next()));
        }
        object2 = this.p;
        object = l8 != null ? object2.G(k8, (List)object, new y(l8)) : object2.B(k8, (List)object);
        if (object.size() > 0) {
            this.d0(k8);
        }
        this.Y((List)object);
    }

    public void f0() {
        this.c.p("repo_interrupt");
    }

    public final k g(k object, final int n8) {
        k k8 = this.J((k)object).f();
        if (this.k.f()) {
            c4.c c8 = this.j;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Aborting transactions for path: ");
            stringBuilder.append(object);
            stringBuilder.append(". Affected: ");
            stringBuilder.append((Object)k8);
            c8.b(stringBuilder.toString(), new Object[0]);
        }
        object = this.f.k((k)object);
        object.a(new k.b(){

            @Override
            public boolean a(Y3.k k8) {
                m.this.h(k8, n8);
                return false;
            }
        });
        this.h((Y3.k)object, n8);
        object.d(new k.c(){

            @Override
            public void a(Y3.k k8) {
                m.this.h(k8, n8);
            }
        });
        return k8;
    }

    public final void g0() {
        final Map map = s.c(this.b);
        ArrayList arrayList = new ArrayList();
        this.e.b(k.Y(), new u.d((List)arrayList){
            public final /* synthetic */ List b;
            {
                this.b = list;
            }

            @Override
            public void a(k k8, d4.n n8) {
                n8 = s.i(n8, m.this.p.J(k8, (List)new ArrayList()), map);
                this.b.addAll((Collection)m.this.p.A(k8, n8));
                k8 = m.this.g(k8, -9);
                m.this.d0(k8);
            }
        });
        this.e = new u();
        this.Y((List)arrayList);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void h(Y3.k k8, int n8) {
        List list = (List)k8.g();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            boolean bl;
            Q3.c c8;
            ArrayList arrayList2 = new ArrayList();
            if (n8 == -9) {
                c8 = Q3.c.c("overriddenBySet");
            } else {
                bl = n8 == -25;
                c8 = new StringBuilder();
                c8.append("Unknown transaction abort reason: ");
                c8.append(n8);
                Y3.m.g(bl, c8.toString());
                c8 = Q3.c.a(-25);
            }
            int n9 = -1;
            for (int i8 = 0; i8 < list.size(); ++i8) {
                A a8;
                final z z8 = (z)list.get(i8);
                A a9 = z8.r;
                if (a9 == (a8 = A.s)) continue;
                if (z8.r == A.q) {
                    bl = n9 == i8 - 1;
                    Y3.m.f(bl);
                    z8.r = a8;
                    z8.v = c8;
                    n9 = i8;
                    continue;
                }
                bl = z8.r == A.p;
                Y3.m.f(bl);
                this.b0(new D(this, z8.q, a4.i.a(z8.o)));
                if (n8 == -9) {
                    arrayList.addAll((Collection)this.p.s(z8.w, true, false, this.b));
                } else {
                    bl = n8 == -25;
                    a9 = new StringBuilder();
                    a9.append("Unknown transaction abort reason: ");
                    a9.append(n8);
                    Y3.m.g(bl, a9.toString());
                }
                arrayList2.add((Object)new Runnable(){

                    public void run() {
                        z8.p.b(c8, false, null);
                    }
                });
            }
            c8 = n9 == -1 ? null : list.subList(0, n9 + 1);
            k8.j(c8);
            this.Y((List)arrayList);
            k8 = arrayList2.iterator();
            while (k8.hasNext()) {
                this.X((Runnable)k8.next());
            }
        }
    }

    public void h0(Runnable runnable, long l8) {
        this.i.F();
        this.i.v().b(runnable, l8);
    }

    public void i0(Runnable runnable) {
        this.i.F();
        this.i.v().c(runnable);
    }

    public final void j0() {
        Y3.k k8 = this.f;
        this.Z(k8);
        this.k0(k8);
    }

    public final void k0(Y3.k k8) {
        if ((List)k8.g() != null) {
            Boolean bl;
            List list;
            block5 : {
                list = this.F(k8);
                boolean bl2 = list.size() > 0;
                Y3.m.f(bl2);
                Boolean bl3 = Boolean.TRUE;
                Iterator iterator = list.iterator();
                do {
                    bl = bl3;
                    if (!iterator.hasNext()) break block5;
                } while (((z)iterator.next()).r == A.p);
                bl = Boolean.FALSE;
            }
            if (bl.booleanValue()) {
                this.l0(list, k8.f());
                return;
            }
        } else if (k8.h()) {
            k8.c(new k.c(){

                @Override
                public void a(Y3.k k8) {
                    m.this.k0(k8);
                }
            });
        }
    }

    public final void l0(final List list, final k k8) {
        Object object = new ArrayList();
        Object object2 = list.iterator();
        while (object2.hasNext()) {
            object.add((Object)((z)object2.next()).w);
        }
        object2 = this.L(k8, (List)object);
        object = !this.g ? object2.R() : "badhash";
        Iterator iterator = list.iterator();
        do {
            boolean bl = iterator.hasNext();
            boolean bl2 = true;
            if (!bl) break;
            z z8 = (z)iterator.next();
            if (z8.r != A.p) {
                bl2 = false;
            }
            Y3.m.f(bl2);
            z8.r = A.q;
            z.u(z8);
            object2 = object2.y(k.b0(k8, z8.o), z8.y);
        } while (true);
        object2 = object2.L(true);
        this.c.n(k8.S(), object2, (String)object, new T3.p(){

            /*
             * Enabled aggressive block sorting
             */
            @Override
            public void a(String object, String object2) {
                object2 = m.I((String)object, (String)object2);
                m.this.q0("Transaction", k8, (Q3.c)object2);
                object = new ArrayList();
                if (object2 == null) {
                    object2 = new ArrayList();
                    for (final z z8 : list) {
                        z8.r = A.r;
                        object.addAll((Collection)m.this.p.s(z8.w, false, false, m.this.b));
                        Object object3 = z8.z;
                        object2.add((Object)new Runnable(Q3.k.a(Q3.k.c(this, z8.o), i.d((d4.n)object3))){
                            public final /* synthetic */ Q3.b p;
                            {
                                this.p = b8;
                            }

                            public void run() {
                                z8.p.b(null, true, this.p);
                            }
                        });
                        object3 = m.this;
                        object3.b0(new D((m)object3, z8.q, a4.i.a(z8.o)));
                    }
                    m m8 = m.this;
                    m8.Z(m8.f.k(k8));
                    m.this.j0();
                    this.Y((List)object);
                    int n8 = 0;
                    while (n8 < object2.size()) {
                        m.this.X((Runnable)object2.get(n8));
                        ++n8;
                    }
                    return;
                }
                if (object2.f() != -1) {
                    for (z z9 : list) {
                        z9.r = A.t;
                        z9.v = (Q3.c)object2;
                    }
                } else {
                    for (z z10 : list) {
                        object = z10.r == A.s ? A.t : A.p;
                        z10.r = (A)((Object)object);
                    }
                }
                m.this.d0(k8);
            }

        });
    }

    public void m0(final k k8, d4.n n8, final e.e e8) {
        StringBuilder stringBuilder;
        Object object;
        if (this.j.f()) {
            object = this.j;
            stringBuilder = new StringBuilder();
            stringBuilder.append("set: ");
            stringBuilder.append((Object)k8);
            object.b(stringBuilder.toString(), new Object[0]);
        }
        if (this.l.f()) {
            object = this.l;
            stringBuilder = new StringBuilder();
            stringBuilder.append("set: ");
            stringBuilder.append((Object)k8);
            stringBuilder.append(" ");
            stringBuilder.append((Object)n8);
            object.b(stringBuilder.toString(), new Object[0]);
        }
        object = s.c(this.b);
        object = s.i(n8, this.p.J(k8, (List)new ArrayList()), (Map)object);
        final long l8 = this.M();
        this.Y(this.p.I(k8, n8, (d4.n)object, l8, true, true));
        this.c.r(k8.S(), n8.L(true), new T3.p(){

            @Override
            public void a(String object, String string2) {
                object = m.I((String)object, string2);
                m.this.q0("setValue", k8, (Q3.c)object);
                m.this.C(l8, k8, (Q3.c)object);
                m.this.G(e8, (Q3.c)object, k8);
            }
        });
        this.d0(this.g(k8, -9));
    }

    public void n0(k k8, r.b object, boolean bl) {
        Object object2;
        Object object3;
        z z8;
        Q3.e e8;
        Object object4;
        block8 : {
            if (this.j.f()) {
                object2 = this.j;
                object4 = new StringBuilder();
                object4.append("transaction: ");
                object4.append((Object)k8);
                object2.b(object4.toString(), new Object[0]);
            }
            if (this.l.f()) {
                object2 = this.j;
                object4 = new StringBuilder();
                object4.append("transaction: ");
                object4.append((Object)k8);
                object2.b(object4.toString(), new Object[0]);
            }
            if (this.i.C() && !this.r) {
                this.r = true;
                this.k.e("runTransaction() usage detected while persistence is enabled. Please be aware that transactions *will not* be persisted across database restarts.  See https://www.firebase.com/docs/android/guide/offline-capabilities.html#section-handling-transactions-offline for more details.");
            }
            e8 = Q3.k.c(this, k8);
            object2 = new Q3.s(){

                @Override
                public void a(Q3.c c8) {
                }

                @Override
                public void b(Q3.b b8) {
                }
            };
            this.D(new D(this, (Q3.s)object2, e8.u()));
            z8 = new z(k8, (r.b)object, (Q3.s)object2, A.o, bl, this.S(), null);
            object2 = this.K(k8);
            z8.x = (d4.n)object2;
            object2 = Q3.k.b((d4.n)object2);
            object2 = object.a((Q3.m)object2);
            if (object2 == null) break block8;
            object3 = null;
        }
        try {
            throw new NullPointerException("Transaction returned null as result");
        }
        catch (Throwable throwable) {
            this.j.c("Caught Throwable.", throwable);
            object2 = Q3.c.b(throwable);
            object4 = Q3.r.a();
            object3 = object2;
            object2 = object4;
        }
        if (!object2.b()) {
            z8.y = null;
            z8.z = null;
            this.X(new Runnable((r.b)object, (Q3.c)object3, Q3.k.a(e8, i.d(z8.x))){
                public final /* synthetic */ r.b o;
                public final /* synthetic */ Q3.c p;
                public final /* synthetic */ Q3.b q;
                {
                    this.o = b8;
                    this.p = c8;
                    this.q = b9;
                }

                public void run() {
                    this.o.b(this.p, false, this.q);
                }
            });
            return;
        }
        z8.r = A.p;
        object3 = this.f.k(k8);
        object = object4 = (List)object3.g();
        if (object4 == null) {
            object = new ArrayList();
        }
        object.add((Object)z8);
        object3.j(object);
        object = s.c(this.b);
        object2 = object2.a();
        object = s.i((d4.n)object2, z8.x, (Map)object);
        z8.y = (d4.n)object2;
        z8.z = (d4.n)object;
        z8.w = this.M();
        this.Y(this.p.I(k8, (d4.n)object2, (d4.n)object, z8.w, bl, false));
        this.j0();
    }

    public void o0(final k k8, b b8, final e.e e8, Map map) {
        Object object;
        StringBuilder stringBuilder;
        if (this.j.f()) {
            object = this.j;
            stringBuilder = new StringBuilder();
            stringBuilder.append("update: ");
            stringBuilder.append((Object)k8);
            object.b(stringBuilder.toString(), new Object[0]);
        }
        if (this.l.f()) {
            object = this.l;
            stringBuilder = new StringBuilder();
            stringBuilder.append("update: ");
            stringBuilder.append((Object)k8);
            stringBuilder.append(" ");
            stringBuilder.append((Object)map);
            object.b(stringBuilder.toString(), new Object[0]);
        }
        if (b8.isEmpty()) {
            if (this.j.f()) {
                this.j.b("update called with no changes. No-op", new Object[0]);
            }
            this.G(e8, null, k8);
            return;
        }
        object = s.c(this.b);
        object = s.f(b8, this.p, k8, (Map)object);
        final long l8 = this.M();
        this.Y(this.p.H(k8, b8, (b)object, l8, true));
        this.c.f(k8.S(), map, new T3.p(){

            @Override
            public void a(String object, String string2) {
                object = m.I((String)object, string2);
                m.this.q0("updateChildren", k8, (Q3.c)object);
                m.this.C(l8, k8, (Q3.c)object);
                m.this.G(e8, (Q3.c)object, k8);
            }
        });
        b8 = b8.iterator();
        while (b8.hasNext()) {
            this.d0(this.g(k8.T((k)((Map.Entry)b8.next()).getKey()), -9));
        }
    }

    public final void p0(d4.b object, Object object2) {
        if (object.equals(c.b)) {
            this.b.b((Long)object2);
        }
        object = new k(new d4.b[]{c.a, object});
        try {
            object2 = d4.o.a(object2);
            this.d.c((k)object, (d4.n)object2);
            this.Y(this.o.A((k)object, (d4.n)object2));
            return;
        }
        catch (Q3.d d8) {
            this.j.c("Failed to parse info update", (Throwable)d8);
            return;
        }
    }

    public final void q0(String string2, k k8, Q3.c c8) {
        if (c8 != null && c8.f() != -1 && c8.f() != -25) {
            c4.c c9 = this.j;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(" at ");
            stringBuilder.append(k8.toString());
            stringBuilder.append(" failed: ");
            stringBuilder.append(c8.toString());
            c9.i(stringBuilder.toString());
        }
    }

    public String toString() {
        return this.a.toString();
    }

    public static final class A
    extends Enum {
        public static final /* enum */ A o;
        public static final /* enum */ A p;
        public static final /* enum */ A q;
        public static final /* enum */ A r;
        public static final /* enum */ A s;
        public static final /* enum */ A t;
        public static final /* synthetic */ A[] u;

        static {
            A a8;
            A a9;
            A a10;
            A a11;
            A a12;
            A a13;
            o = a9 = new A();
            p = a10 = new A();
            q = a13 = new A();
            r = a8 = new A();
            s = a12 = new A();
            t = a11 = new A();
            u = new A[]{a9, a10, a13, a8, a12, a11};
        }

        public static A valueOf(String string2) {
            return (A)Enum.valueOf(A.class, (String)string2);
        }

        public static A[] values() {
            return (A[])u.clone();
        }
    }

    public static class z
    implements Comparable {
        public k o;
        public r.b p;
        public Q3.s q;
        public A r;
        public long s;
        public boolean t;
        public int u;
        public Q3.c v;
        public long w;
        public d4.n x;
        public d4.n y;
        public d4.n z;

        public z(k k8, r.b b8, Q3.s s8, A a8, boolean bl, long l8) {
            this.o = k8;
            this.p = b8;
            this.q = s8;
            this.r = a8;
            this.u = 0;
            this.t = bl;
            this.s = l8;
            this.v = null;
            this.x = null;
            this.y = null;
            this.z = null;
        }

        public /* synthetic */ z(k k8, r.b b8, Q3.s s8, A a8, boolean bl, long l8,  k9) {
            this(k8, b8, s8, a8, bl, l8);
        }

        public static /* synthetic */ Q3.c C(z z8) {
            return z8.v;
        }

        public static /* synthetic */ boolean F(z z8) {
            return z8.t;
        }

        public static /* synthetic */ int s(z z8) {
            return z8.u;
        }

        public static /* synthetic */ int u(z z8) {
            int n8 = z8.u;
            z8.u = n8 + 1;
            return n8;
        }

        public int G(z z8) {
            long l8 = this.s;
            long l9 = z8.s;
            if (l8 < l9) {
                return -1;
            }
            if (l8 == l9) {
                return 0;
            }
            return 1;
        }
    }

}

