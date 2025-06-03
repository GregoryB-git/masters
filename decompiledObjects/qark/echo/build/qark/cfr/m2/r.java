/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Objects
 *  java.util.Set
 *  java.util.concurrent.Executor
 */
package m2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import c2.b;
import f2.i;
import g2.e;
import g2.f;
import g2.g;
import i2.a;
import i2.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import m2.g;
import m2.h;
import m2.i;
import m2.j;
import m2.k;
import m2.l;
import m2.m;
import m2.n;
import m2.o;
import m2.p;
import m2.q;
import m2.x;
import n2.d;
import o2.b;

public class r {
    public final Context a;
    public final e b;
    public final d c;
    public final x d;
    public final Executor e;
    public final o2.b f;
    public final p2.a g;
    public final p2.a h;
    public final n2.c i;

    public r(Context context, e e8, d d8, x x8, Executor executor, o2.b b8, p2.a a8, p2.a a9, n2.c c8) {
        this.a = context;
        this.b = e8;
        this.c = d8;
        this.d = x8;
        this.e = executor;
        this.f = b8;
        this.g = a8;
        this.h = a9;
        this.i = c8;
    }

    public static /* synthetic */ Iterable a(r r8, f2.p p8) {
        return r8.m(p8);
    }

    public static /* synthetic */ Object b(r r8, Iterable iterable, f2.p p8, long l8) {
        return r8.n(iterable, p8, l8);
    }

    public static /* synthetic */ Object c(r r8) {
        return r8.p();
    }

    public static /* synthetic */ Boolean d(r r8, f2.p p8) {
        return r8.l(p8);
    }

    public static /* synthetic */ Object e(r r8, Iterable iterable) {
        return r8.o(iterable);
    }

    public static /* synthetic */ Object f(r r8, f2.p p8, int n8) {
        return r8.s(p8, n8);
    }

    public static /* synthetic */ Object g(r r8, f2.p p8, long l8) {
        return r8.r(p8, l8);
    }

    public static /* synthetic */ Object h(r r8, Map map) {
        return r8.q(map);
    }

    public static /* synthetic */ void i(r r8, f2.p p8, int n8, Runnable runnable) {
        r8.t(p8, n8, runnable);
    }

    public f2.i j(g2.m m8) {
        Object object = this.f;
        n2.c c8 = this.i;
        Objects.requireNonNull((Object)c8);
        object = (a)object.a(new h(c8));
        return m8.a(f2.i.a().i(this.g.a()).k(this.h.a()).j("GDT_CLIENT_METRICS").h(new f2.h(b.b("proto"), object.f())).d());
    }

    public boolean k() {
        NetworkInfo networkInfo = ((ConnectivityManager)this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Boolean l(f2.p p8) {
        return this.c.j(p8);
    }

    public final /* synthetic */ Iterable m(f2.p p8) {
        return this.c.A(p8);
    }

    public final /* synthetic */ Object n(Iterable iterable, f2.p p8, long l8) {
        this.c.y(iterable);
        this.c.d(p8, this.g.a() + l8);
        return null;
    }

    public final /* synthetic */ Object o(Iterable iterable) {
        this.c.g(iterable);
        return null;
    }

    public final /* synthetic */ Object p() {
        this.i.e();
        return null;
    }

    public final /* synthetic */ Object q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.i.c(((Integer)entry.getValue()).intValue(), c.b.u, (String)entry.getKey());
        }
        return null;
    }

    public final /* synthetic */ Object r(f2.p p8, long l8) {
        this.c.d(p8, this.g.a() + l8);
        return null;
    }

    public final /* synthetic */ Object s(f2.p p8, int n8) {
        this.d.a(p8, n8 + 1);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void t(f2.p p8, int n8, Runnable runnable) {
        Throwable throwable2;
        block6 : {
            try {
                o2.b b8 = this.f;
                d d8 = this.c;
                Objects.requireNonNull((Object)d8);
                b8.a(new i(d8));
                if (!this.k()) {
                    this.f.a(new j(this, p8, n8));
                } else {
                    this.u(p8, n8);
                }
                break block6;
            }
            catch (o2.a a8) {}
            try {
                this.d.a(p8, n8 + 1);
            }
            catch (Throwable throwable2) {}
        }
        runnable.run();
        return;
        runnable.run();
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public g2.g u(f2.p p8, int n8) {
        g2.m m8 = this.b.a(p8.b());
        long l8 = 0L;
        Object object = g2.g.e(0L);
        do {
            Object object2;
            if (!((Boolean)this.f.a(new k(this, p8))).booleanValue()) {
                this.f.a(new q(this, p8, l8));
                return object;
            }
            Iterable iterable = (Iterable)this.f.a(new l(this, p8));
            if (!iterable.iterator().hasNext()) {
                return object;
            }
            if (m8 == null) {
                j2.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", p8);
                object2 = g2.g.a();
            } else {
                object2 = new ArrayList();
                object = iterable.iterator();
                while (object.hasNext()) {
                    object2.add((Object)((n2.k)object.next()).b());
                }
                if (p8.e()) {
                    object2.add((Object)this.j(m8));
                }
                object2 = m8.b(f.a().b((Iterable)object2).c(p8.c()).a());
            }
            if (object2.c() == g.a.p) {
                this.f.a(new m(this, iterable, p8, l8));
                this.d.b(p8, n8 + 1, true);
                return object2;
            }
            this.f.a(new n(this, iterable));
            if (object2.c() == g.a.o) {
                long l9;
                l8 = l9 = Math.max((long)l8, (long)object2.b());
                object = object2;
                if (!p8.e()) continue;
                this.f.a(new o(this));
                l8 = l9;
                object = object2;
                continue;
            }
            object = object2;
            if (object2.c() != g.a.r) continue;
            HashMap hashMap = new HashMap();
            iterable = iterable.iterator();
            while (iterable.hasNext()) {
                String string2 = ((n2.k)iterable.next()).b().j();
                object = !hashMap.containsKey((Object)string2) ? Integer.valueOf((int)1) : Integer.valueOf((int)((Integer)hashMap.get((Object)string2) + 1));
                hashMap.put((Object)string2, object);
            }
            this.f.a(new p(this, (Map)hashMap));
            object = object2;
        } while (true);
    }

    public void v(f2.p p8, int n8, Runnable runnable) {
        this.e.execute((Runnable)new g(this, p8, n8, runnable));
    }
}

