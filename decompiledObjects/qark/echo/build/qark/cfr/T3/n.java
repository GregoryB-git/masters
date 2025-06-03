/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
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
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 */
package T3;

import T3.a;
import T3.b;
import T3.c;
import T3.d;
import T3.e;
import T3.f;
import T3.g;
import T3.h;
import T3.i;
import U3.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class n
implements b.a,
h {
    public static long H;
    public String A;
    public long B = 0L;
    public int C = 0;
    public int D = 0;
    public ScheduledFuture E = null;
    public long F;
    public boolean G;
    public final h.a a;
    public final f b;
    public String c;
    public HashSet d = new HashSet();
    public boolean e = true;
    public long f;
    public b g;
    public k h = k.o;
    public long i = 0L;
    public long j = 0L;
    public long k = 0L;
    public Map l;
    public List m;
    public Map n;
    public Map o;
    public Map p;
    public String q;
    public boolean r;
    public String s;
    public boolean t;
    public final c u;
    public final d v;
    public final d w;
    public final ScheduledExecutorService x;
    public final c4.c y;
    public final U3.a z;

    public n(c object, f f8, h.a a8) {
        this.a = a8;
        this.u = object;
        a8 = object.e();
        this.x = a8;
        this.v = object.c();
        this.w = object.a();
        this.b = f8;
        this.p = new HashMap();
        this.l = new HashMap();
        this.n = new HashMap();
        this.o = new ConcurrentHashMap();
        this.m = new ArrayList();
        this.z = new a.b((ScheduledExecutorService)a8, object.f(), "ConnectionRetryHelper").d(1000L).e(1.3).c(30000L).b(0.7).a();
        long l8 = H;
        H = 1L + l8;
        object = object.f();
        f8 = new StringBuilder();
        f8.append("pc_");
        f8.append(l8);
        this.y = new c4.c((c4.d)object, "PersistentConnection", f8.toString());
        this.A = null;
        this.U();
    }

    public static /* synthetic */ void c0(V2.k k8, Map map) {
        if (((String)map.get((Object)"s")).equals((Object)"ok")) {
            k8.c(map.get((Object)"d"));
            return;
        }
        k8.b(new Exception((String)map.get((Object)"d")));
    }

    public static /* synthetic */ void s(n n8, boolean bl, Map map) {
        n8.d0(bl, map);
    }

    public static /* synthetic */ void t(n n8, long l8, V2.j j8, V2.j j9, Void void_) {
        n8.e0(l8, j8, j9, void_);
    }

    public static /* synthetic */ void u(V2.k k8, Map map) {
        n.c0(k8, map);
    }

    public static /* synthetic */ void v(n n8, boolean bl, boolean bl2) {
        n8.g0(bl, bl2);
    }

    public static /* synthetic */ void w(n n8, long l8, Exception exception) {
        n8.f0(l8, exception);
    }

    public static /* synthetic */ int z(n n8) {
        int n9 = n8.C;
        n8.C = n9 + 1;
        return n9;
    }

    public final void A0(String string2, List list, Object object, final T3.p p8) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"p", (Object)e.d(list));
        hashMap.put((Object)"d", object);
        this.t0(string2, (Map)hashMap, new j(){

            @Override
            public void a(Map object) {
                Object object2;
                Object object3 = (String)object.get((Object)"s");
                if (!object3.equals((Object)"ok")) {
                    object2 = (String)object.get((Object)"d");
                    object = object3;
                    object3 = object2;
                } else {
                    object = null;
                    object3 = null;
                }
                object2 = p8;
                if (object2 != null) {
                    object2.a((String)object, (String)object3);
                }
            }
        });
    }

    public final void B0(final long l8) {
        e.b(this.R(), "sendPut called when we can't send writes (we're disconnected or writes are paused).", new Object[0]);
        final o o8 = (o)this.n.get((Object)l8);
        final T3.p p8 = o8.c();
        final String string2 = o8.b();
        o8.e();
        this.t0(string2, o8.d(), new j(){

            @Override
            public void a(Map object) {
                Object object2;
                if (n.this.y.f()) {
                    object2 = n.this.y;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string2);
                    stringBuilder.append(" response: ");
                    stringBuilder.append(object);
                    object2.b(stringBuilder.toString(), new Object[0]);
                }
                if ((o)n.this.n.get((Object)l8) == o8) {
                    n.this.n.remove((Object)l8);
                    if (p8 != null) {
                        object2 = (String)object.get((Object)"s");
                        if (object2.equals((Object)"ok")) {
                            p8.a(null, null);
                        } else {
                            object = (String)object.get((Object)"d");
                            p8.a((String)object2, (String)object);
                        }
                    }
                } else if (n.this.y.f()) {
                    object = n.this.y;
                    object2 = new StringBuilder();
                    object2.append("Ignoring on complete for put ");
                    object2.append(l8);
                    object2.append(" because it was removed already.");
                    object.b(object2.toString(), new Object[0]);
                }
                n.this.U();
            }
        });
    }

    public final void C0(String string2, boolean bl, Map map, j j8) {
        long l8 = this.h0();
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"r", (Object)l8);
        hashMap.put((Object)"a", (Object)string2);
        hashMap.put((Object)"b", (Object)map);
        this.g.m((Map)hashMap, bl);
        this.l.put((Object)l8, (Object)j8);
    }

    public final void D0(Map map) {
        if (!map.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"c", (Object)map);
            this.t0("s", (Map)hashMap, new j(){

                @Override
                public void a(Map object) {
                    String string2 = (String)object.get((Object)"s");
                    if (!string2.equals((Object)"ok")) {
                        object = (String)object.get((Object)"d");
                        if (n.this.y.f()) {
                            c4.c c8 = n.this.y;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Failed to send stats: ");
                            stringBuilder.append(string2);
                            stringBuilder.append(" (message: ");
                            stringBuilder.append((String)object);
                            stringBuilder.append(")");
                            c8.b(stringBuilder.toString(), new Object[0]);
                        }
                    }
                }
            });
            return;
        }
        if (this.y.f()) {
            this.y.b("Not sending stats because stats are empty", new Object[0]);
        }
    }

    public final void E0(n n8) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"p", (Object)e.d(n8.b.a));
        Long l8 = n8.e();
        if (l8 != null) {
            hashMap.put((Object)"q", (Object)n8.d().b);
            hashMap.put((Object)"t", (Object)l8);
        }
        this.t0("n", (Map)hashMap, null);
    }

    public boolean F0() {
        if (this.d.size() == 0) {
            return true;
        }
        return false;
    }

    public final void G0() {
        if (this.F0()) {
            k k8 = this.h;
            boolean bl = k8 == k.o;
            e.b(bl, "Not in disconnected state: %s", new Object[]{k8});
            bl = this.r;
            boolean bl2 = this.t;
            this.y.b("Scheduling connection attempt", new Object[0]);
            this.r = false;
            this.t = false;
            this.z.c(new i(this, bl, bl2));
        }
    }

    public final void H0(List object, p p8) {
        if (object.contains((Object)"no_index")) {
            object = new StringBuilder();
            object.append("\".indexOn\": \"");
            object.append(p8.b.get((Object)"i"));
            object.append('\"');
            object = object.toString();
            c4.c c8 = this.y;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Using an unspecified index. Your data will be downloaded and filtered on the client. Consider adding '");
            stringBuilder.append((String)object);
            stringBuilder.append("' at ");
            stringBuilder.append(e.d(p8.a));
            stringBuilder.append(" to your security and Firebase Database rules for better performance");
            c8.i(stringBuilder.toString());
        }
    }

    public final boolean Q() {
        if (this.h == k.s) {
            return true;
        }
        return false;
    }

    public final boolean R() {
        if (this.h == k.s) {
            return true;
        }
        return false;
    }

    public final void S() {
        ArrayList arrayList = new ArrayList();
        Iterator iterator = this.n.entrySet().iterator();
        while (iterator.hasNext()) {
            o o8 = (o)((Map.Entry)iterator.next()).getValue();
            if (!o8.d().containsKey((Object)"h") || !o8.f()) continue;
            arrayList.add((Object)o8);
            iterator.remove();
        }
        arrayList = arrayList.iterator();
        while (arrayList.hasNext()) {
            ((o)arrayList.next()).c().a("disconnected", null);
        }
    }

    public final boolean T() {
        k k8 = this.h;
        if (k8 != k.r && k8 != k.s) {
            return false;
        }
        return true;
    }

    public final void U() {
        if (this.a0()) {
            ScheduledFuture scheduledFuture = this.E;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.E = this.x.schedule(new Runnable(){

                public void run() {
                    n.this.E = null;
                    if (n.this.Z()) {
                        n.this.j("connection_idle");
                        return;
                    }
                    n.this.U();
                }
            }, 60000L, TimeUnit.MILLISECONDS);
            return;
        }
        if (this.b0("connection_idle")) {
            e.a(this.a0() ^ true);
            this.p("connection_idle");
        }
    }

    public final V2.j V(boolean bl) {
        final V2.k k8 = new V2.k();
        this.y.b("Trying to fetch app check token", new Object[0]);
        this.w.a(bl, new d.a(){

            @Override
            public void a(String string2) {
                k8.c(string2);
            }
        });
        return k8.a();
    }

    public final V2.j W(boolean bl) {
        final V2.k k8 = new V2.k();
        this.y.b("Trying to fetch auth token", new Object[0]);
        this.v.a(bl, new d.a(){

            @Override
            public void a(String string2) {
                k8.c(string2);
            }
        });
        return k8.a();
    }

    public final Map X(List list, Object object, String string2) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"p", (Object)e.d(list));
        hashMap.put((Object)"d", object);
        if (string2 != null) {
            hashMap.put((Object)"h", (Object)string2);
        }
        return hashMap;
    }

    public final void Y(long l8) {
        if (this.y.f()) {
            this.y.b("handling timestamp", new Object[0]);
        }
        long l9 = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"serverTimeOffset", (Object)(l8 - l9));
        this.a.b((Map)hashMap);
    }

    public final boolean Z() {
        long l8 = System.currentTimeMillis();
        if (this.a0() && l8 > this.F + 60000L) {
            return true;
        }
        return false;
    }

    @Override
    public void a() {
        this.G0();
    }

    public final boolean a0() {
        if (this.p.isEmpty() && this.o.isEmpty() && this.l.isEmpty() && !this.G && this.n.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public void b(List list, Map map, T3.p p8) {
        this.G = true;
        if (this.R()) {
            this.A0("om", list, (Object)map, p8);
        } else {
            this.m.add((Object)new l("om", list, (Object)map, p8, null));
        }
        this.U();
    }

    public boolean b0(String string2) {
        return this.d.contains((Object)string2);
    }

    @Override
    public void c(long l8, String string2) {
        if (this.y.f()) {
            this.y.b("onReady", new Object[0]);
        }
        this.f = System.currentTimeMillis();
        this.Y(l8);
        if (this.e) {
            this.x0();
        }
        this.s0();
        this.e = false;
        this.A = string2;
        this.a.a();
    }

    @Override
    public V2.j d(List object, Map object2) {
        object2 = new p((List)object, (Map)object2);
        object = new V2.k();
        long l8 = this.j;
        this.j = 1L + l8;
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"p", (Object)e.d(((p)object2).a));
        hashMap.put((Object)"q", (Object)((p)object2).b);
        object2 = new m("g", (Map)hashMap, new T3.j((V2.k)object), null);
        this.o.put((Object)l8, object2);
        if (this.Q()) {
            this.y0(l8);
        }
        this.U();
        return object.a();
    }

    public final /* synthetic */ void d0(boolean bl, Map object) {
        String string2 = (String)object.get((Object)"s");
        if (string2.equals((Object)"ok")) {
            this.D = 0;
        } else {
            this.s = null;
            this.t = true;
            object = (String)object.get((Object)"d");
            c4.c c8 = this.y;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("App check failed: ");
            stringBuilder.append(string2);
            stringBuilder.append(" (");
            stringBuilder.append((String)object);
            stringBuilder.append(")");
            c8.b(stringBuilder.toString(), new Object[0]);
        }
        if (bl) {
            this.r0();
        }
    }

    @Override
    public void e() {
        for (Object object : this.n.values()) {
            if (((o)object).c == null) continue;
            ((o)object).c.a("write_canceled", null);
        }
        for (Object object : this.m) {
            if (((l)object).d == null) continue;
            ((l)object).d.a("write_canceled", null);
        }
        this.n.clear();
        this.m.clear();
        if (!this.T()) {
            this.G = false;
        }
        this.U();
    }

    public final /* synthetic */ void e0(long l8, V2.j j8, V2.j j9, Void object) {
        if (l8 == this.B) {
            object = this.h;
            if (object == k.p) {
                this.y.b("Successfully fetched token, opening connection", new Object[0]);
                this.n0((String)j8.j(), (String)j9.j());
                return;
            }
            if (object == k.o) {
                this.y.b("Not opening connection after token refresh, because connection was set to disconnected", new Object[0]);
                return;
            }
        } else {
            this.y.b("Ignoring getToken result, because this was not the latest attempt.", new Object[0]);
        }
    }

    @Override
    public void f(List list, Map map, T3.p p8) {
        this.o0("m", list, (Object)map, null, p8);
    }

    public final /* synthetic */ void f0(long l8, Exception exception) {
        if (l8 == this.B) {
            this.h = k.o;
            c4.c c8 = this.y;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error fetching token: ");
            stringBuilder.append((Object)exception);
            c8.b(stringBuilder.toString(), new Object[0]);
            this.G0();
            return;
        }
        this.y.b("Ignoring getToken error, because this was not the latest attempt.", new Object[0]);
    }

    @Override
    public void g(b.b b8) {
        boolean bl = this.y.f();
        boolean bl2 = false;
        if (bl) {
            c4.c c8 = this.y;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Got on disconnect due to ");
            stringBuilder.append(b8.name());
            c8.b(stringBuilder.toString(), new Object[0]);
        }
        this.h = k.o;
        this.g = null;
        this.G = false;
        this.l.clear();
        this.S();
        if (this.F0()) {
            long l8 = System.currentTimeMillis();
            long l9 = this.f;
            boolean bl3 = bl2;
            if (l9 > 0L) {
                bl3 = bl2;
                if (l8 - l9 > 30000L) {
                    bl3 = true;
                }
            }
            if (b8 == b.b.o || bl3) {
                this.z.e();
            }
            this.G0();
        }
        this.f = 0L;
        this.a.d();
    }

    public final /* synthetic */ void g0(boolean bl, boolean bl2) {
        long l8;
        Object object = this.h;
        boolean bl3 = object == k.o;
        e.b(bl3, "Not in disconnected state: %s", object);
        this.h = k.p;
        this.B = l8 = this.B + 1L;
        object = this.W(bl);
        V2.j j8 = this.V(bl2);
        V2.m.g(new V2.j[]{object, j8}).e((Executor)this.x, new T3.k(this, l8, (V2.j)object, j8)).d((Executor)this.x, new T3.l(this, l8));
    }

    @Override
    public void h(List list, Object object, T3.p p8) {
        this.G = true;
        if (this.R()) {
            this.A0("o", list, object, p8);
        } else {
            this.m.add((Object)new l("o", list, object, p8, null));
        }
        this.U();
    }

    public final long h0() {
        long l8 = this.k;
        this.k = 1L + l8;
        return l8;
    }

    @Override
    public void i(Map map) {
        if (map.containsKey((Object)"r")) {
            long l8 = ((Integer)map.get((Object)"r")).intValue();
            j j8 = (j)this.l.remove((Object)l8);
            if (j8 != null) {
                j8.a((Map)map.get((Object)"b"));
                return;
            }
        } else {
            if (map.containsKey((Object)"error")) {
                return;
            }
            if (map.containsKey((Object)"a")) {
                this.k0((String)map.get((Object)"a"), (Map)map.get((Object)"b"));
                return;
            }
            if (this.y.f()) {
                c4.c c8 = this.y;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Ignoring unknown message: ");
                stringBuilder.append((Object)map);
                c8.b(stringBuilder.toString(), new Object[0]);
            }
        }
    }

    public final void i0(String string2, String string3) {
        c4.c c8 = this.y;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("App check token revoked: ");
        stringBuilder.append(string2);
        stringBuilder.append(" (");
        stringBuilder.append(string3);
        stringBuilder.append(")");
        c8.b(stringBuilder.toString(), new Object[0]);
        this.s = null;
        this.t = true;
    }

    @Override
    public void j(String object) {
        if (this.y.f()) {
            c4.c c8 = this.y;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Connection interrupted for: ");
            stringBuilder.append((String)object);
            c8.b(stringBuilder.toString(), new Object[0]);
        }
        this.d.add(object);
        object = this.g;
        if (object != null) {
            object.c();
            this.g = null;
        } else {
            this.z.b();
            this.h = k.o;
        }
        this.z.e();
    }

    public final void j0(String string2, String string3) {
        c4.c c8 = this.y;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Auth token revoked: ");
        stringBuilder.append(string2);
        stringBuilder.append(" (");
        stringBuilder.append(string3);
        stringBuilder.append(")");
        c8.b(stringBuilder.toString(), new Object[0]);
        this.q = null;
        this.r = true;
        this.a.e(false);
        this.g.c();
    }

    @Override
    public void k(List object, Map object2, g g8, Long l8, T3.p p8) {
        StringBuilder stringBuilder;
        object = new p((List)object, (Map)object2);
        if (this.y.f()) {
            object2 = this.y;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Listening on ");
            stringBuilder.append(object);
            object2.b(stringBuilder.toString(), new Object[0]);
        }
        e.b(this.p.containsKey(object) ^ true, "listen() called twice for same QuerySpec.", new Object[0]);
        if (this.y.f()) {
            object2 = this.y;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Adding listen query: ");
            stringBuilder.append(object);
            object2.b(stringBuilder.toString(), new Object[0]);
        }
        object2 = new n(p8, (p)object, l8, g8, null);
        this.p.put(object, object2);
        if (this.T()) {
            this.z0((n)object2);
        }
        this.U();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void k0(String object, Map object2) {
        Object object3;
        StringBuilder stringBuilder;
        if (this.y.f()) {
            object3 = this.y;
            stringBuilder = new StringBuilder();
            stringBuilder.append("handleServerMessage: ");
            stringBuilder.append((String)object);
            stringBuilder.append(" ");
            stringBuilder.append(object2);
            object3.b(stringBuilder.toString(), new Object[0]);
        }
        if (!object.equals((Object)"d") && !object.equals((Object)"m")) {
            if (object.equals((Object)"rm")) {
                object3 = (String)object2.get((Object)"p");
                stringBuilder = e.e((String)object3);
                object = object2.get((Object)"d");
                Long l8 = e.c(object2.get((Object)"t"));
                object = (List)object;
                ArrayList arrayList = new ArrayList();
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    Map map = (Map)iterator.next();
                    object = (String)map.get((Object)"s");
                    String string2 = (String)map.get((Object)"e");
                    object2 = null;
                    object = object != null ? e.e((String)object) : null;
                    if (string2 != null) {
                        object2 = e.e(string2);
                    }
                    arrayList.add((Object)new T3.o((List)object, (List)object2, map.get((Object)"m")));
                }
                if (arrayList.isEmpty()) {
                    if (!this.y.f()) return;
                    object = this.y;
                    object2 = new StringBuilder();
                    object2.append("Ignoring empty range merge for path ");
                    object2.append((String)object3);
                    object.b(object2.toString(), new Object[0]);
                    return;
                }
                this.a.f((List)stringBuilder, (List)arrayList, l8);
                return;
            }
            if (object.equals((Object)"c")) {
                this.l0(e.e((String)object2.get((Object)"p")));
                return;
            }
            if (object.equals((Object)"ac")) {
                this.j0((String)object2.get((Object)"s"), (String)object2.get((Object)"d"));
                return;
            }
            if (object.equals((Object)"apc")) {
                this.i0((String)object2.get((Object)"s"), (String)object2.get((Object)"d"));
                return;
            }
            if (object.equals((Object)"sd")) {
                this.m0((Map)object2);
                return;
            }
            if (!this.y.f()) return;
            object2 = this.y;
            object3 = new StringBuilder();
            object3.append("Unrecognized action from server: ");
            object3.append((String)object);
            object2.b(object3.toString(), new Object[0]);
            return;
        }
        boolean bl = object.equals((Object)"m");
        object = (String)object2.get((Object)"p");
        object3 = object2.get((Object)"d");
        object2 = e.c(object2.get((Object)"t"));
        if (bl && object3 instanceof Map && ((Map)object3).size() == 0) {
            if (!this.y.f()) return;
            object2 = this.y;
            object3 = new StringBuilder();
            object3.append("ignoring empty merge for path ");
            object3.append((String)object);
            object2.b(object3.toString(), new Object[0]);
            return;
        }
        object = e.e((String)object);
        this.a.c((List)object, object3, bl, (Long)object2);
    }

    @Override
    public void l(List object, Map object2) {
        object = new p((List)object, (Map)object2);
        if (this.y.f()) {
            object2 = this.y;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unlistening on ");
            stringBuilder.append(object);
            object2.b(stringBuilder.toString(), new Object[0]);
        }
        if ((object = this.p0((p)object)) != null && this.T()) {
            this.E0((n)object);
        }
        this.U();
    }

    public final void l0(List list) {
        if ((list = this.q0(list)) != null) {
            list = list.iterator();
            while (list.hasNext()) {
                ((n)list.next()).a.a("permission_denied", null);
            }
        }
    }

    @Override
    public void m(List list, T3.p p8) {
        if (this.R()) {
            this.A0("oc", list, null, p8);
        } else {
            this.m.add((Object)new l("oc", list, null, p8, null));
        }
        this.U();
    }

    public final void m0(Map map) {
        this.y.e((String)map.get((Object)"msg"));
    }

    @Override
    public void n(List list, Object object, String string2, T3.p p8) {
        this.o0("p", list, object, string2, p8);
    }

    public void n0(String object, String string2) {
        k k8 = this.h;
        boolean bl = k8 == k.p;
        e.b(bl, "Trying to open network connection while in the wrong state: %s", new Object[]{k8});
        if (object == null) {
            this.a.e(false);
        }
        this.q = object;
        this.s = string2;
        this.h = k.q;
        this.g = object = new b(this.u, this.b, this.c, this, this.A, string2);
        object.k();
    }

    @Override
    public void o(String string2) {
        this.c = string2;
    }

    public final void o0(String string2, List list, Object object, String string3, T3.p p8) {
        list = this.X(list, object, string3);
        long l8 = this.i;
        this.i = 1L + l8;
        this.n.put((Object)l8, (Object)new o(string2, (Map)list, p8, null));
        if (this.R()) {
            this.B0(l8);
        }
        this.F = System.currentTimeMillis();
        this.U();
    }

    @Override
    public void p(String string2) {
        if (this.y.f()) {
            c4.c c8 = this.y;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Connection no longer interrupted for: ");
            stringBuilder.append(string2);
            c8.b(stringBuilder.toString(), new Object[0]);
        }
        this.d.remove((Object)string2);
        if (this.F0() && this.h == k.o) {
            this.G0();
        }
    }

    public final n p0(p p8) {
        Object object;
        StringBuilder stringBuilder;
        if (this.y.f()) {
            object = this.y;
            stringBuilder = new StringBuilder();
            stringBuilder.append("removing query ");
            stringBuilder.append((Object)p8);
            object.b(stringBuilder.toString(), new Object[0]);
        }
        if (!this.p.containsKey((Object)p8)) {
            if (this.y.f()) {
                object = this.y;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Trying to remove listener for QuerySpec ");
                stringBuilder.append((Object)p8);
                stringBuilder.append(" but no listener exists.");
                object.b(stringBuilder.toString(), new Object[0]);
            }
            return null;
        }
        object = (n)this.p.get((Object)p8);
        this.p.remove((Object)p8);
        this.U();
        return object;
    }

    @Override
    public void q(String object) {
        int n8;
        if (object.equals((Object)"Invalid appcheck token") && (long)(n8 = this.D) < 3L) {
            this.D = n8 + 1;
            object = this.y;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Detected invalid AppCheck token. Reconnecting (");
            stringBuilder.append(3L - (long)this.D);
            stringBuilder.append(" attempts remaining)");
            object.i(stringBuilder.toString());
            return;
        }
        c4.c c8 = this.y;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Firebase Database connection was forcefully killed by the server. Will not attempt reconnect. Reason: ");
        stringBuilder.append((String)object);
        c8.i(stringBuilder.toString());
        this.j("server_kill");
    }

    public final Collection q0(List list) {
        c4.c c8;
        Object object;
        if (this.y.f()) {
            c8 = this.y;
            object = new StringBuilder();
            object.append("removing all listens at path ");
            object.append((Object)list);
            c8.b(object.toString(), new Object[0]);
        }
        c8 = new ArrayList();
        object = this.p.entrySet().iterator();
        while (object.hasNext()) {
            Object object2 = (Map.Entry)object.next();
            p p8 = (p)object2.getKey();
            object2 = (n)object2.getValue();
            if (!p8.a.equals((Object)list)) continue;
            c8.add(object2);
        }
        list = c8.iterator();
        while (list.hasNext()) {
            object = (n)list.next();
            this.p.remove((Object)object.d());
        }
        this.U();
        return c8;
    }

    @Override
    public void r(List list, Object object, T3.p p8) {
        this.o0("p", list, object, null, p8);
    }

    public final void r0() {
        k k8 = this.h;
        boolean bl = k8 == k.s;
        e.b(bl, "Should be connected if we're restoring state, but we are: %s", new Object[]{k8});
        if (this.y.f()) {
            this.y.b("Restoring outstanding listens", new Object[0]);
        }
        for (Object object : this.p.values()) {
            if (this.y.f()) {
                c4.c c8 = this.y;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Restoring listen ");
                stringBuilder.append((Object)object.d());
                c8.b(stringBuilder.toString(), new Object[0]);
            }
            this.z0((n)object);
        }
        if (this.y.f()) {
            this.y.b("Restoring writes.", new Object[0]);
        }
        k8 = new ArrayList((Collection)this.n.keySet());
        Collections.sort((List)k8);
        k8 = k8.iterator();
        while (k8.hasNext()) {
            this.B0((Long)k8.next());
        }
        for (Object object : this.m) {
            this.A0(object.b(), object.e(), object.c(), object.d());
        }
        this.m.clear();
        if (this.y.f()) {
            this.y.b("Restoring reads.", new Object[0]);
        }
        k8 = new ArrayList((Collection)this.o.keySet());
        Collections.sort((List)k8);
        k8 = k8.iterator();
        while (k8.hasNext()) {
            this.y0((Long)k8.next());
        }
    }

    public final void s0() {
        k k8;
        if (this.y.f()) {
            this.y.b("calling restore tokens", new Object[0]);
        }
        boolean bl = (k8 = this.h) == k.q;
        e.b(bl, "Wanted to restore tokens, but was in wrong state: %s", new Object[]{k8});
        if (this.q != null) {
            if (this.y.f()) {
                this.y.b("Restoring auth.", new Object[0]);
            }
            this.h = k.r;
            this.v0();
            return;
        }
        if (this.y.f()) {
            this.y.b("Not restoring auth because auth token is null.", new Object[0]);
        }
        this.h = k.s;
        this.u0(true);
    }

    public final void t0(String string2, Map map, j j8) {
        this.C0(string2, false, map, j8);
    }

    public final void u0(boolean bl) {
        if (this.s == null) {
            this.r0();
            return;
        }
        e.b(this.T(), "Must be connected to send auth, but was: %s", new Object[]{this.h});
        if (this.y.f()) {
            this.y.b("Sending app check.", new Object[0]);
        }
        T3.m m8 = new T3.m(this, bl);
        HashMap hashMap = new HashMap();
        bl = this.s != null;
        e.b(bl, "App check token must be set!", new Object[0]);
        hashMap.put((Object)"token", (Object)this.s);
        this.C0("appcheck", true, (Map)hashMap, m8);
    }

    public final void v0() {
        this.w0(true);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void w0(final boolean bl) {
        e.b(this.T(), "Must be connected to send auth, but was: %s", new Object[]{this.h});
        if (this.y.f()) {
            this.y.b("Sending auth.", new Object[0]);
        }
        j j8 = new j(){

            @Override
            public void a(Map object) {
                String string2 = (String)object.get((Object)"s");
                if (string2.equals((Object)"ok")) {
                    n.this.h = k.s;
                    n.this.C = 0;
                    n.this.u0(bl);
                    return;
                }
                n.this.q = null;
                n.this.r = true;
                n.this.a.e(false);
                object = (String)object.get((Object)"d");
                c4.c c8 = n.this.y;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Authentication failed: ");
                stringBuilder.append(string2);
                stringBuilder.append(" (");
                stringBuilder.append((String)object);
                stringBuilder.append(")");
                c8.b(stringBuilder.toString(), new Object[0]);
                n.this.g.c();
                if (string2.equals((Object)"invalid_token")) {
                    n.z(n.this);
                    if ((long)n.this.C >= 3L) {
                        n.this.z.d();
                        n.this.y.i("Provided authentication credentials are invalid. This usually indicates your FirebaseApp instance was not initialized correctly. Make sure your google-services.json file has the correct firebase_url and api_key. You can re-download google-services.json from https://console.firebase.google.com/.");
                    }
                }
            }
        };
        HashMap hashMap = new HashMap();
        Object object = f4.a.c(this.q);
        if (object != null) {
            hashMap.put((Object)"cred", (Object)object.b());
            if (object.a() != null) {
                hashMap.put((Object)"authvar", (Object)object.a());
            }
            object = "gauth";
        } else {
            hashMap.put((Object)"cred", (Object)this.q);
            object = "auth";
        }
        this.C0((String)object, true, (Map)hashMap, j8);
    }

    public final void x0() {
        HashMap hashMap = new HashMap();
        boolean bl = this.u.i();
        Integer n8 = 1;
        if (bl) {
            hashMap.put((Object)"persistence.android.enabled", (Object)n8);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("sdk.android.");
        stringBuilder.append(this.u.d().replace('.', '-'));
        hashMap.put((Object)stringBuilder.toString(), (Object)n8);
        if (this.y.f()) {
            this.y.b("Sending first connection stats", new Object[0]);
        }
        this.D0((Map)hashMap);
    }

    public final void y0(final Long l8) {
        e.b(this.Q(), "sendGet called when we can't send gets", new Object[0]);
        Object object = (m)this.o.get((Object)l8);
        if (!((m)object).f() && this.y.f()) {
            object = this.y;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("get");
            stringBuilder.append((Object)l8);
            stringBuilder.append(" cancelled, ignoring.");
            object.b(stringBuilder.toString(), new Object[0]);
            return;
        }
        this.t0("g", ((m)object).e(), new j((m)object){
            public final /* synthetic */ m b;
            {
                this.b = m8;
            }

            @Override
            public void a(Map object) {
                if ((m)n.this.o.get((Object)l8) == this.b) {
                    n.this.o.remove((Object)l8);
                    this.b.d().a((Map)object);
                    return;
                }
                if (n.this.y.f()) {
                    object = n.this.y;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Ignoring on complete for get ");
                    stringBuilder.append((Object)l8);
                    stringBuilder.append(" because it was removed already.");
                    object.b(stringBuilder.toString(), new Object[0]);
                }
            }
        });
    }

    public final void z0(final n n8) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"p", (Object)e.d(n8.d().a));
        Object object = n8.e();
        if (object != null) {
            hashMap.put((Object)"q", (Object)n8.b.b);
            hashMap.put((Object)"t", object);
        }
        object = n8.c();
        hashMap.put((Object)"h", (Object)object.d());
        if (object.c()) {
            object = object.b();
            ArrayList arrayList = new ArrayList();
            Iterator iterator = object.b().iterator();
            while (iterator.hasNext()) {
                arrayList.add((Object)e.d((List)iterator.next()));
            }
            iterator = new HashMap();
            iterator.put((Object)"hs", (Object)object.a());
            iterator.put((Object)"ps", (Object)arrayList);
            hashMap.put((Object)"ch", (Object)iterator);
        }
        this.t0("q", (Map)hashMap, new j(){

            @Override
            public void a(Map object) {
                Map map;
                String string2 = (String)object.get((Object)"s");
                if (string2.equals((Object)"ok") && (map = (Map)object.get((Object)"d")).containsKey((Object)"w")) {
                    map = (List)map.get((Object)"w");
                    n.this.H0((List)map, n8.b);
                }
                if ((n)n.this.p.get((Object)n8.d()) == n8) {
                    if (!string2.equals((Object)"ok")) {
                        n.this.p0(n8.d());
                        object = (String)object.get((Object)"d");
                        n8.a.a(string2, (String)object);
                        return;
                    }
                    n8.a.a(null, null);
                }
            }
        });
    }

    public static interface j {
        public void a(Map var1);
    }

    public static final class k
    extends Enum {
        public static final /* enum */ k o;
        public static final /* enum */ k p;
        public static final /* enum */ k q;
        public static final /* enum */ k r;
        public static final /* enum */ k s;
        public static final /* synthetic */ k[] t;

        static {
            k k8;
            k k9;
            k k10;
            k k11;
            k k12;
            o = k12 = new k();
            p = k10 = new k();
            q = k8 = new k();
            r = k11 = new k();
            s = k9 = new k();
            t = new k[]{k12, k10, k8, k11, k9};
        }

        public static k valueOf(String string2) {
            return (k)Enum.valueOf(k.class, (String)string2);
        }

        public static k[] values() {
            return (k[])t.clone();
        }
    }

    public static class l {
        public final String a;
        public final List b;
        public final Object c;
        public final T3.p d;

        public l(String string2, List list, Object object, T3.p p8) {
            this.a = string2;
            this.b = list;
            this.c = object;
            this.d = p8;
        }

        public /* synthetic */ l(String string2, List list, Object object, T3.p p8,  a8) {
            this(string2, list, object, p8);
        }

        public String b() {
            return this.a;
        }

        public Object c() {
            return this.c;
        }

        public T3.p d() {
            return this.d;
        }

        public List e() {
            return this.b;
        }
    }

    public static class m {
        public final Map a;
        public final j b;
        public boolean c;

        public m(String string2, Map map, j j8) {
            this.a = map;
            this.b = j8;
            this.c = false;
        }

        public /* synthetic */ m(String string2, Map map, j j8,  a8) {
            this(string2, map, j8);
        }

        public final j d() {
            return this.b;
        }

        public final Map e() {
            return this.a;
        }

        public final boolean f() {
            if (this.c) {
                return false;
            }
            this.c = true;
            return true;
        }
    }

    public static class n {
        public final T3.p a;
        public final p b;
        public final g c;
        public final Long d;

        public n(T3.p p8, p p9, Long l8, g g8) {
            this.a = p8;
            this.b = p9;
            this.c = g8;
            this.d = l8;
        }

        public /* synthetic */ n(T3.p p8, p p9, Long l8, g g8,  a8) {
            this(p8, p9, l8, g8);
        }

        public g c() {
            return this.c;
        }

        public p d() {
            return this.b;
        }

        public Long e() {
            return this.d;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.b.toString());
            stringBuilder.append(" (Tag: ");
            stringBuilder.append((Object)this.d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    public static class o {
        public String a;
        public Map b;
        public T3.p c;
        public boolean d;

        public o(String string2, Map map, T3.p p8) {
            this.a = string2;
            this.b = map;
            this.c = p8;
        }

        public /* synthetic */ o(String string2, Map map, T3.p p8,  a8) {
            this(string2, map, p8);
        }

        public String b() {
            return this.a;
        }

        public T3.p c() {
            return this.c;
        }

        public Map d() {
            return this.b;
        }

        public void e() {
            this.d = true;
        }

        public boolean f() {
            return this.d;
        }
    }

    public static class p {
        public final List a;
        public final Map b;

        public p(List list, Map map) {
            this.a = list;
            this.b = map;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof p)) {
                return false;
            }
            object = (p)object;
            if (!this.a.equals((Object)object.a)) {
                return false;
            }
            return this.b.equals((Object)object.b);
        }

        public int hashCode() {
            return this.a.hashCode() * 31 + this.b.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(e.d(this.a));
            stringBuilder.append(" (params: ");
            stringBuilder.append((Object)this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

}

