// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T3;

import java.util.Collections;
import java.util.Collection;
import V2.g;
import java.util.concurrent.Executor;
import V2.m;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import V2.j;
import V2.k;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import U3.a;
import java.util.concurrent.ScheduledExecutorService;
import java.util.List;
import java.util.Map;
import java.util.HashSet;
import java.util.concurrent.ScheduledFuture;

public class n implements b.a, h
{
    public static long H;
    public String A;
    public long B;
    public int C;
    public int D;
    public ScheduledFuture E;
    public long F;
    public boolean G;
    public final h.a a;
    public final f b;
    public String c;
    public HashSet d;
    public boolean e;
    public long f;
    public b g;
    public k h;
    public long i;
    public long j;
    public long k;
    public Map l;
    public List m;
    public Map n;
    public Map o;
    public Map p;
    public String q;
    public boolean r;
    public String s;
    public boolean t;
    public final T3.c u;
    public final T3.d v;
    public final T3.d w;
    public final ScheduledExecutorService x;
    public final c4.c y;
    public final a z;
    
    public n(final T3.c u, final f b, final h.a a) {
        this.d = new HashSet();
        this.e = true;
        this.h = T3.n.k.o;
        this.i = 0L;
        this.j = 0L;
        this.k = 0L;
        this.B = 0L;
        this.C = 0;
        this.D = 0;
        this.E = null;
        this.a = a;
        this.u = u;
        final ScheduledExecutorService e = u.e();
        this.x = e;
        this.v = u.c();
        this.w = u.a();
        this.b = b;
        this.p = new HashMap();
        this.l = new HashMap();
        this.n = new HashMap();
        this.o = new ConcurrentHashMap();
        this.m = new ArrayList();
        this.z = new a.b(e, u.f(), "ConnectionRetryHelper").d(1000L).e(1.3).c(30000L).b(0.7).a();
        final long h = T3.n.H;
        T3.n.H = 1L + h;
        final c4.d f = u.f();
        final StringBuilder sb = new StringBuilder();
        sb.append("pc_");
        sb.append(h);
        this.y = new c4.c(f, "PersistentConnection", sb.toString());
        this.A = null;
        this.U();
    }
    
    public static /* synthetic */ String B(final n n, final String q) {
        return n.q = q;
    }
    
    public static /* synthetic */ boolean C(final n n, final boolean r) {
        return n.r = r;
    }
    
    public static /* synthetic */ h.a D(final n n) {
        return n.a;
    }
    
    public static /* synthetic */ c4.c E(final n n) {
        return n.y;
    }
    
    public static /* synthetic */ b F(final n n) {
        return n.g;
    }
    
    public static /* synthetic */ a G(final n n) {
        return n.z;
    }
    
    public static /* synthetic */ Map H(final n n) {
        return n.n;
    }
    
    public static /* synthetic */ Map J(final n n) {
        return n.o;
    }
    
    public static /* synthetic */ Map L(final n n) {
        return n.p;
    }
    
    public static /* synthetic */ ScheduledFuture N(final n n, final ScheduledFuture e) {
        return n.E = e;
    }
    
    public static /* synthetic */ k P(final n n, final k h) {
        return n.h = h;
    }
    
    public static /* synthetic */ int x(final n n) {
        return n.C;
    }
    
    public static /* synthetic */ int y(final n n, final int c) {
        return n.C = c;
    }
    
    public static /* synthetic */ int z(final n n) {
        return n.C++;
    }
    
    public final void A0(final String s, final List list, final Object o, final T3.p p4) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("p", T3.e.d(list));
        hashMap.put("d", (String)o);
        this.t0(s, hashMap, (j)new j() {
            @Override
            public void a(final Map map) {
                final String s = map.get("s");
                String s3;
                String s4;
                if (!s.equals("ok")) {
                    final String s2 = map.get("d");
                    s3 = s;
                    s4 = s2;
                }
                else {
                    s3 = null;
                    s4 = null;
                }
                final T3.p a = p4;
                if (a != null) {
                    a.a(s3, s4);
                }
            }
        });
    }
    
    public final void B0(final long l) {
        T3.e.b(this.R(), "sendPut called when we can't send writes (we're disconnected or writes are paused).", new Object[0]);
        final o o = this.n.get(l);
        final T3.p c = o.c();
        final String b = o.b();
        o.e();
        this.t0(b, o.d(), (j)new j() {
            @Override
            public void a(final Map obj) {
                if (T3.n.E(T3.n.this).f()) {
                    final c4.c e = T3.n.E(T3.n.this);
                    final StringBuilder sb = new StringBuilder();
                    sb.append(b);
                    sb.append(" response: ");
                    sb.append(obj);
                    e.b(sb.toString(), new Object[0]);
                }
                if (T3.n.H(T3.n.this).get(l) == o) {
                    T3.n.H(T3.n.this).remove(l);
                    if (c != null) {
                        final String s = obj.get("s");
                        if (s.equals("ok")) {
                            c.a(null, null);
                        }
                        else {
                            c.a(s, obj.get("d"));
                        }
                    }
                }
                else if (T3.n.E(T3.n.this).f()) {
                    final c4.c e2 = T3.n.E(T3.n.this);
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Ignoring on complete for put ");
                    sb2.append(l);
                    sb2.append(" because it was removed already.");
                    e2.b(sb2.toString(), new Object[0]);
                }
                T3.n.this.U();
            }
        });
    }
    
    public final void C0(final String s, final boolean b, final Map map, final j j) {
        final long h0 = this.h0();
        final HashMap<String, Long> hashMap = new HashMap<String, Long>();
        hashMap.put("r", h0);
        hashMap.put("a", (Long)s);
        hashMap.put("b", (Long)map);
        this.g.m(hashMap, b);
        this.l.put(h0, j);
    }
    
    public final void D0(final Map map) {
        if (!map.isEmpty()) {
            final HashMap<String, Map> hashMap = new HashMap<String, Map>();
            hashMap.put("c", map);
            this.t0("s", hashMap, (j)new j() {
                @Override
                public void a(final Map map) {
                    final String str = map.get("s");
                    if (!str.equals("ok")) {
                        final String str2 = map.get("d");
                        if (T3.n.E(T3.n.this).f()) {
                            final c4.c e = T3.n.E(T3.n.this);
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Failed to send stats: ");
                            sb.append(str);
                            sb.append(" (message: ");
                            sb.append(str2);
                            sb.append(")");
                            e.b(sb.toString(), new Object[0]);
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
    
    public final void E0(final n n) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("p", T3.e.d(T3.n.p.a(n.a(n))));
        final Long e = n.e();
        if (e != null) {
            hashMap.put("q", (String)T3.n.p.b(n.d()));
            hashMap.put("t", (String)e);
        }
        this.t0("n", hashMap, null);
    }
    
    public boolean F0() {
        return this.d.size() == 0;
    }
    
    public final void G0() {
        if (this.F0()) {
            final k h = this.h;
            T3.e.b(h == T3.n.k.o, "Not in disconnected state: %s", h);
            final boolean r = this.r;
            final boolean t = this.t;
            this.y.b("Scheduling connection attempt", new Object[0]);
            this.r = false;
            this.t = false;
            this.z.c(new i(this, r, t));
        }
    }
    
    public final void H0(final List list, final p p2) {
        if (list.contains("no_index")) {
            final StringBuilder sb = new StringBuilder();
            sb.append("\".indexOn\": \"");
            sb.append(T3.n.p.b(p2).get("i"));
            sb.append('\"');
            final String string = sb.toString();
            final c4.c y = this.y;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Using an unspecified index. Your data will be downloaded and filtered on the client. Consider adding '");
            sb2.append(string);
            sb2.append("' at ");
            sb2.append(T3.e.d(T3.n.p.a(p2)));
            sb2.append(" to your security and Firebase Database rules for better performance");
            y.i(sb2.toString());
        }
    }
    
    public final boolean Q() {
        return this.h == T3.n.k.s;
    }
    
    public final boolean R() {
        return this.h == T3.n.k.s;
    }
    
    public final void S() {
        final ArrayList<o> list = new ArrayList<o>();
        final Iterator<Map.Entry<K, o>> iterator = this.n.entrySet().iterator();
        while (iterator.hasNext()) {
            final o o = iterator.next().getValue();
            if (o.d().containsKey("h") && o.f()) {
                list.add(o);
                iterator.remove();
            }
        }
        final Iterator<Object> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().c().a("disconnected", null);
        }
    }
    
    public final boolean T() {
        final k h = this.h;
        return h == T3.n.k.r || h == T3.n.k.s;
    }
    
    public final void U() {
        if (this.a0()) {
            final ScheduledFuture e = this.E;
            if (e != null) {
                e.cancel(false);
            }
            this.E = this.x.schedule(new Runnable() {
                @Override
                public void run() {
                    T3.n.N(T3.n.this, null);
                    if (T3.n.this.Z()) {
                        T3.n.this.j("connection_idle");
                        return;
                    }
                    T3.n.this.U();
                }
            }, 60000L, TimeUnit.MILLISECONDS);
            return;
        }
        if (this.b0("connection_idle")) {
            T3.e.a(this.a0() ^ true);
            this.p("connection_idle");
        }
    }
    
    public final V2.j V(final boolean b) {
        final V2.k k = new V2.k();
        this.y.b("Trying to fetch app check token", new Object[0]);
        this.w.a(b, (T3.d.a)new T3.d.a() {
            @Override
            public void a(final String s) {
                k.c(s);
            }
        });
        return k.a();
    }
    
    public final V2.j W(final boolean b) {
        final V2.k k = new V2.k();
        this.y.b("Trying to fetch auth token", new Object[0]);
        this.v.a(b, (T3.d.a)new T3.d.a() {
            @Override
            public void a(final String s) {
                k.c(s);
            }
        });
        return k.a();
    }
    
    public final Map X(final List list, final Object o, final String s) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("p", T3.e.d(list));
        hashMap.put("d", (String)o);
        if (s != null) {
            hashMap.put("h", s);
        }
        return hashMap;
    }
    
    public final void Y(final long n) {
        if (this.y.f()) {
            this.y.b("handling timestamp", new Object[0]);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final HashMap<String, Long> hashMap = new HashMap<String, Long>();
        hashMap.put("serverTimeOffset", n - currentTimeMillis);
        this.a.b(hashMap);
    }
    
    public final boolean Z() {
        final long currentTimeMillis = System.currentTimeMillis();
        return this.a0() && currentTimeMillis > this.F + 60000L;
    }
    
    @Override
    public void a() {
        this.G0();
    }
    
    public final boolean a0() {
        return this.p.isEmpty() && this.o.isEmpty() && this.l.isEmpty() && !this.G && this.n.isEmpty();
    }
    
    @Override
    public void b(final List list, final Map map, final T3.p p3) {
        this.G = true;
        if (this.R()) {
            this.A0("om", list, map, p3);
        }
        else {
            this.m.add(new l("om", list, map, p3, null));
        }
        this.U();
    }
    
    public boolean b0(final String o) {
        return this.d.contains(o);
    }
    
    @Override
    public void c(final long n, final String a) {
        if (this.y.f()) {
            this.y.b("onReady", new Object[0]);
        }
        this.f = System.currentTimeMillis();
        this.Y(n);
        if (this.e) {
            this.x0();
        }
        this.s0();
        this.e = false;
        this.A = a;
        this.a.a();
    }
    
    @Override
    public V2.j d(final List list, final Map map) {
        final p p2 = new p(list, map);
        final V2.k k = new V2.k();
        final long j = this.j;
        this.j = 1L + j;
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("p", T3.e.d(T3.n.p.a(p2)));
        hashMap.put("q", (String)T3.n.p.b(p2));
        this.o.put(j, new m("g", hashMap, new T3.j(k), null));
        if (this.Q()) {
            this.y0(j);
        }
        this.U();
        return k.a();
    }
    
    @Override
    public void e() {
        for (final o o : this.n.values()) {
            if (T3.n.o.a(o) != null) {
                T3.n.o.a(o).a("write_canceled", null);
            }
        }
        for (final l l : this.m) {
            if (T3.n.l.a(l) != null) {
                T3.n.l.a(l).a("write_canceled", null);
            }
        }
        this.n.clear();
        this.m.clear();
        if (!this.T()) {
            this.G = false;
        }
        this.U();
    }
    
    @Override
    public void f(final List list, final Map map, final T3.p p3) {
        this.o0("m", list, map, null, p3);
    }
    
    @Override
    public void g(final b.b b) {
        final boolean f = this.y.f();
        final boolean b2 = false;
        if (f) {
            final c4.c y = this.y;
            final StringBuilder sb = new StringBuilder();
            sb.append("Got on disconnect due to ");
            sb.append(b.name());
            y.b(sb.toString(), new Object[0]);
        }
        this.h = T3.n.k.o;
        this.g = null;
        this.G = false;
        this.l.clear();
        this.S();
        if (this.F0()) {
            final long currentTimeMillis = System.currentTimeMillis();
            final long f2 = this.f;
            boolean b3 = b2;
            if (f2 > 0L) {
                b3 = b2;
                if (currentTimeMillis - f2 > 30000L) {
                    b3 = true;
                }
            }
            if (b == b.b.o || b3) {
                this.z.e();
            }
            this.G0();
        }
        this.f = 0L;
        this.a.d();
    }
    
    @Override
    public void h(final List list, final Object o, final T3.p p3) {
        this.G = true;
        if (this.R()) {
            this.A0("o", list, o, p3);
        }
        else {
            this.m.add(new l("o", list, o, p3, null));
        }
        this.U();
    }
    
    public final long h0() {
        final long k = this.k;
        this.k = 1L + k;
        return k;
    }
    
    @Override
    public void i(final Map obj) {
        if (obj.containsKey("r")) {
            final j j = this.l.remove((long)obj.get("r"));
            if (j != null) {
                j.a((Map)obj.get("b"));
            }
        }
        else {
            if (obj.containsKey("error")) {
                return;
            }
            if (obj.containsKey("a")) {
                this.k0((String)obj.get("a"), (Map)obj.get("b"));
                return;
            }
            if (this.y.f()) {
                final c4.c y = this.y;
                final StringBuilder sb = new StringBuilder();
                sb.append("Ignoring unknown message: ");
                sb.append(obj);
                y.b(sb.toString(), new Object[0]);
            }
        }
    }
    
    public final void i0(final String str, final String str2) {
        final c4.c y = this.y;
        final StringBuilder sb = new StringBuilder();
        sb.append("App check token revoked: ");
        sb.append(str);
        sb.append(" (");
        sb.append(str2);
        sb.append(")");
        y.b(sb.toString(), new Object[0]);
        this.s = null;
        this.t = true;
    }
    
    @Override
    public void j(final String s) {
        if (this.y.f()) {
            final c4.c y = this.y;
            final StringBuilder sb = new StringBuilder();
            sb.append("Connection interrupted for: ");
            sb.append(s);
            y.b(sb.toString(), new Object[0]);
        }
        this.d.add(s);
        final b g = this.g;
        if (g != null) {
            g.c();
            this.g = null;
        }
        else {
            this.z.b();
            this.h = T3.n.k.o;
        }
        this.z.e();
    }
    
    public final void j0(final String str, final String str2) {
        final c4.c y = this.y;
        final StringBuilder sb = new StringBuilder();
        sb.append("Auth token revoked: ");
        sb.append(str);
        sb.append(" (");
        sb.append(str2);
        sb.append(")");
        y.b(sb.toString(), new Object[0]);
        this.q = null;
        this.r = true;
        this.a.e(false);
        this.g.c();
    }
    
    @Override
    public void k(final List list, final Map map, final T3.g g, final Long n, final T3.p p5) {
        final p p6 = new p(list, map);
        if (this.y.f()) {
            final c4.c y = this.y;
            final StringBuilder sb = new StringBuilder();
            sb.append("Listening on ");
            sb.append(p6);
            y.b(sb.toString(), new Object[0]);
        }
        T3.e.b(this.p.containsKey(p6) ^ true, "listen() called twice for same QuerySpec.", new Object[0]);
        if (this.y.f()) {
            final c4.c y2 = this.y;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Adding listen query: ");
            sb2.append(p6);
            y2.b(sb2.toString(), new Object[0]);
        }
        final n n2 = new n(p5, p6, n, g, null);
        this.p.put(p6, n2);
        if (this.T()) {
            this.z0(n2);
        }
        this.U();
    }
    
    public final void k0(String str, final Map obj) {
        if (this.y.f()) {
            final c4.c y = this.y;
            final StringBuilder sb = new StringBuilder();
            sb.append("handleServerMessage: ");
            sb.append(str);
            sb.append(" ");
            sb.append(obj);
            y.b(sb.toString(), new Object[0]);
        }
        if (!str.equals("d") && !str.equals("m")) {
            if (str.equals("rm")) {
                final String str2 = obj.get("p");
                final List e = T3.e.e(str2);
                final String value = obj.get("d");
                final Long c = T3.e.c(obj.get("t"));
                final List<Map> list = (List<Map>)value;
                final ArrayList<T3.o> list2 = new ArrayList<T3.o>();
                for (final Map<K, String> map : list) {
                    str = map.get("s");
                    final String s = map.get("e");
                    List e2 = null;
                    List e3;
                    if (str != null) {
                        e3 = T3.e.e(str);
                    }
                    else {
                        e3 = null;
                    }
                    if (s != null) {
                        e2 = T3.e.e(s);
                    }
                    list2.add(new T3.o(e3, e2, map.get("m")));
                }
                if (!list2.isEmpty()) {
                    this.a.f(e, list2, c);
                    return;
                }
                if (this.y.f()) {
                    final c4.c y2 = this.y;
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Ignoring empty range merge for path ");
                    sb2.append(str2);
                    y2.b(sb2.toString(), new Object[0]);
                }
            }
            else {
                if (str.equals("c")) {
                    this.l0(T3.e.e(obj.get("p")));
                    return;
                }
                if (str.equals("ac")) {
                    this.j0(obj.get("s"), obj.get("d"));
                    return;
                }
                if (str.equals("apc")) {
                    this.i0(obj.get("s"), obj.get("d"));
                    return;
                }
                if (str.equals("sd")) {
                    this.m0(obj);
                    return;
                }
                if (this.y.f()) {
                    final c4.c y3 = this.y;
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Unrecognized action from server: ");
                    sb3.append(str);
                    y3.b(sb3.toString(), new Object[0]);
                }
            }
        }
        else {
            final boolean equals = str.equals("m");
            str = obj.get("p");
            final String value2 = obj.get("d");
            final Long c2 = T3.e.c(obj.get("t"));
            if (equals && value2 instanceof Map && ((Map)value2).size() == 0) {
                if (this.y.f()) {
                    final c4.c y4 = this.y;
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("ignoring empty merge for path ");
                    sb4.append(str);
                    y4.b(sb4.toString(), new Object[0]);
                }
            }
            else {
                this.a.c(T3.e.e(str), value2, equals, c2);
            }
        }
    }
    
    @Override
    public void l(final List list, final Map map) {
        final p obj = new p(list, map);
        if (this.y.f()) {
            final c4.c y = this.y;
            final StringBuilder sb = new StringBuilder();
            sb.append("unlistening on ");
            sb.append(obj);
            y.b(sb.toString(), new Object[0]);
        }
        final n p2 = this.p0(obj);
        if (p2 != null && this.T()) {
            this.E0(p2);
        }
        this.U();
    }
    
    public final void l0(final List list) {
        final Collection q0 = this.q0(list);
        if (q0 != null) {
            final Iterator<n> iterator = q0.iterator();
            while (iterator.hasNext()) {
                T3.n.n.b(iterator.next()).a("permission_denied", null);
            }
        }
    }
    
    @Override
    public void m(final List list, final T3.p p2) {
        if (this.R()) {
            this.A0("oc", list, null, p2);
        }
        else {
            this.m.add(new l("oc", list, null, p2, null));
        }
        this.U();
    }
    
    public final void m0(final Map map) {
        this.y.e(map.get("msg"));
    }
    
    @Override
    public void n(final List list, final Object o, final String s, final T3.p p4) {
        this.o0("p", list, o, s, p4);
    }
    
    public void n0(final String q, final String s) {
        final k h = this.h;
        T3.e.b(h == T3.n.k.p, "Trying to open network connection while in the wrong state: %s", h);
        if (q == null) {
            this.a.e(false);
        }
        this.q = q;
        this.s = s;
        this.h = T3.n.k.q;
        (this.g = new b(this.u, this.b, this.c, (b.a)this, this.A, s)).k();
    }
    
    @Override
    public void o(final String c) {
        this.c = c;
    }
    
    public final void o0(final String s, final List list, final Object o, final String s2, final T3.p p5) {
        final Map x = this.X(list, o, s2);
        final long i = this.i;
        this.i = 1L + i;
        this.n.put(i, new o(s, x, p5, null));
        if (this.R()) {
            this.B0(i);
        }
        this.F = System.currentTimeMillis();
        this.U();
    }
    
    @Override
    public void p(final String s) {
        if (this.y.f()) {
            final c4.c y = this.y;
            final StringBuilder sb = new StringBuilder();
            sb.append("Connection no longer interrupted for: ");
            sb.append(s);
            y.b(sb.toString(), new Object[0]);
        }
        this.d.remove(s);
        if (this.F0() && this.h == T3.n.k.o) {
            this.G0();
        }
    }
    
    public final n p0(final p p) {
        if (this.y.f()) {
            final c4.c y = this.y;
            final StringBuilder sb = new StringBuilder();
            sb.append("removing query ");
            sb.append(p);
            y.b(sb.toString(), new Object[0]);
        }
        if (!this.p.containsKey(p)) {
            if (this.y.f()) {
                final c4.c y2 = this.y;
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Trying to remove listener for QuerySpec ");
                sb2.append(p);
                sb2.append(" but no listener exists.");
                y2.b(sb2.toString(), new Object[0]);
            }
            return null;
        }
        final n n = this.p.get(p);
        this.p.remove(p);
        this.U();
        return n;
    }
    
    @Override
    public void q(final String str) {
        if (str.equals("Invalid appcheck token")) {
            final int d = this.D;
            if (d < 3L) {
                this.D = d + 1;
                final c4.c y = this.y;
                final StringBuilder sb = new StringBuilder();
                sb.append("Detected invalid AppCheck token. Reconnecting (");
                sb.append(3L - this.D);
                sb.append(" attempts remaining)");
                y.i(sb.toString());
                return;
            }
        }
        final c4.c y2 = this.y;
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Firebase Database connection was forcefully killed by the server. Will not attempt reconnect. Reason: ");
        sb2.append(str);
        y2.i(sb2.toString());
        this.j("server_kill");
    }
    
    public final Collection q0(final List obj) {
        if (this.y.f()) {
            final c4.c y = this.y;
            final StringBuilder sb = new StringBuilder();
            sb.append("removing all listens at path ");
            sb.append(obj);
            y.b(sb.toString(), new Object[0]);
        }
        final ArrayList<n> list = new ArrayList<n>();
        for (final Map.Entry<p, V> entry : this.p.entrySet()) {
            final p p = entry.getKey();
            final n n = (n)entry.getValue();
            if (T3.n.p.a(p).equals(obj)) {
                list.add(n);
            }
        }
        final Iterator<Object> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            this.p.remove(iterator2.next().d());
        }
        this.U();
        return list;
    }
    
    @Override
    public void r(final List list, final Object o, final T3.p p3) {
        this.o0("p", list, o, null, p3);
    }
    
    public final void r0() {
        final k h = this.h;
        T3.e.b(h == T3.n.k.s, "Should be connected if we're restoring state, but we are: %s", h);
        if (this.y.f()) {
            this.y.b("Restoring outstanding listens", new Object[0]);
        }
        for (final n n : this.p.values()) {
            if (this.y.f()) {
                final c4.c y = this.y;
                final StringBuilder sb = new StringBuilder();
                sb.append("Restoring listen ");
                sb.append(n.d());
                y.b(sb.toString(), new Object[0]);
            }
            this.z0(n);
        }
        if (this.y.f()) {
            this.y.b("Restoring writes.", new Object[0]);
        }
        final ArrayList<Long> list = new ArrayList<Long>(this.n.keySet());
        Collections.sort((List<Comparable>)list);
        final Iterator<Long> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            this.B0(iterator2.next());
        }
        for (final l l : this.m) {
            this.A0(l.b(), l.e(), l.c(), l.d());
        }
        this.m.clear();
        if (this.y.f()) {
            this.y.b("Restoring reads.", new Object[0]);
        }
        final ArrayList<Long> list2 = new ArrayList<Long>(this.o.keySet());
        Collections.sort((List<Comparable>)list2);
        final Iterator<Long> iterator4 = list2.iterator();
        while (iterator4.hasNext()) {
            this.y0(iterator4.next());
        }
    }
    
    public final void s0() {
        if (this.y.f()) {
            this.y.b("calling restore tokens", new Object[0]);
        }
        final k h = this.h;
        T3.e.b(h == T3.n.k.q, "Wanted to restore tokens, but was in wrong state: %s", h);
        if (this.q != null) {
            if (this.y.f()) {
                this.y.b("Restoring auth.", new Object[0]);
            }
            this.h = T3.n.k.r;
            this.v0();
            return;
        }
        if (this.y.f()) {
            this.y.b("Not restoring auth because auth token is null.", new Object[0]);
        }
        this.h = T3.n.k.s;
        this.u0(true);
    }
    
    public final void t0(final String s, final Map map, final j j) {
        this.C0(s, false, map, j);
    }
    
    public final void u0(final boolean b) {
        if (this.s == null) {
            this.r0();
            return;
        }
        T3.e.b(this.T(), "Must be connected to send auth, but was: %s", this.h);
        if (this.y.f()) {
            this.y.b("Sending app check.", new Object[0]);
        }
        final T3.m m = new T3.m(this, b);
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        T3.e.b(this.s != null, "App check token must be set!", new Object[0]);
        hashMap.put("token", this.s);
        this.C0("appcheck", true, hashMap, (j)m);
    }
    
    public final void v0() {
        this.w0(true);
    }
    
    public final void w0(final boolean b) {
        T3.e.b(this.T(), "Must be connected to send auth, but was: %s", this.h);
        if (this.y.f()) {
            this.y.b("Sending auth.", new Object[0]);
        }
        final j j = new j() {
            @Override
            public void a(final Map map) {
                final String str = map.get("s");
                if (str.equals("ok")) {
                    T3.n.P(T3.n.this, T3.n.k.s);
                    T3.n.y(T3.n.this, 0);
                    T3.n.this.u0(b);
                    return;
                }
                T3.n.B(T3.n.this, null);
                T3.n.C(T3.n.this, true);
                T3.n.D(T3.n.this).e(false);
                final String str2 = map.get("d");
                final c4.c e = T3.n.E(T3.n.this);
                final StringBuilder sb = new StringBuilder();
                sb.append("Authentication failed: ");
                sb.append(str);
                sb.append(" (");
                sb.append(str2);
                sb.append(")");
                e.b(sb.toString(), new Object[0]);
                T3.n.F(T3.n.this).c();
                if (str.equals("invalid_token")) {
                    T3.n.z(T3.n.this);
                    if (T3.n.x(T3.n.this) >= 3L) {
                        T3.n.G(T3.n.this).d();
                        T3.n.E(T3.n.this).i("Provided authentication credentials are invalid. This usually indicates your FirebaseApp instance was not initialized correctly. Make sure your google-services.json file has the correct firebase_url and api_key. You can re-download google-services.json from https://console.firebase.google.com/.");
                    }
                }
            }
        };
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        final f4.a c = f4.a.c(this.q);
        String s;
        if (c != null) {
            hashMap.put("cred", c.b());
            if (c.a() != null) {
                hashMap.put("authvar", (String)c.a());
            }
            s = "gauth";
        }
        else {
            hashMap.put("cred", this.q);
            s = "auth";
        }
        this.C0(s, true, hashMap, (j)j);
    }
    
    public final void x0() {
        final HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        final boolean i = this.u.i();
        final Integer value = 1;
        if (i) {
            hashMap.put("persistence.android.enabled", value);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("sdk.android.");
        sb.append(this.u.d().replace('.', '-'));
        hashMap.put(sb.toString(), value);
        if (this.y.f()) {
            this.y.b("Sending first connection stats", new Object[0]);
        }
        this.D0(hashMap);
    }
    
    public final void y0(final Long obj) {
        T3.e.b(this.Q(), "sendGet called when we can't send gets", new Object[0]);
        final m m = this.o.get(obj);
        if (!m.f() && this.y.f()) {
            final c4.c y = this.y;
            final StringBuilder sb = new StringBuilder();
            sb.append("get");
            sb.append(obj);
            sb.append(" cancelled, ignoring.");
            y.b(sb.toString(), new Object[0]);
            return;
        }
        this.t0("g", m.e(), (j)new j() {
            @Override
            public void a(final Map map) {
                if (T3.n.J(T3.n.this).get(obj) == m) {
                    T3.n.J(T3.n.this).remove(obj);
                    m.d().a(map);
                    return;
                }
                if (T3.n.E(T3.n.this).f()) {
                    final c4.c e = T3.n.E(T3.n.this);
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Ignoring on complete for get ");
                    sb.append(obj);
                    sb.append(" because it was removed already.");
                    e.b(sb.toString(), new Object[0]);
                }
            }
        });
    }
    
    public final void z0(final n n) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("p", T3.e.d(T3.n.p.a(n.d())));
        final Long e = n.e();
        if (e != null) {
            hashMap.put("q", (String)T3.n.p.b(n.a(n)));
            hashMap.put("t", (String)e);
        }
        final T3.g c = n.c();
        hashMap.put("h", c.d());
        if (c.c()) {
            final a b = c.b();
            final ArrayList<String> list = new ArrayList<String>();
            final Iterator iterator = b.b().iterator();
            while (iterator.hasNext()) {
                list.add(T3.e.d(iterator.next()));
            }
            final HashMap<String, ArrayList<String>> hashMap2 = new HashMap<String, ArrayList<String>>();
            hashMap2.put("hs", (ArrayList<String>)b.a());
            hashMap2.put("ps", list);
            hashMap.put("ch", (String)hashMap2);
        }
        this.t0("q", hashMap, (j)new j() {
            @Override
            public void a(final Map map) {
                final String s = map.get("s");
                if (s.equals("ok")) {
                    final Map map2 = (Map)map.get("d");
                    if (map2.containsKey("w")) {
                        T3.n.this.H0(map2.get("w"), T3.n.n.a(n));
                    }
                }
                if (T3.n.L(T3.n.this).get(n.d()) == n) {
                    if (!s.equals("ok")) {
                        T3.n.this.p0(n.d());
                        T3.n.n.b(n).a(s, map.get("d"));
                        return;
                    }
                    T3.n.n.b(n).a(null, null);
                }
            }
        });
    }
    
    public interface j
    {
        void a(final Map p0);
    }
    
    public enum k
    {
        o("Disconnected", 0), 
        p("GettingToken", 1), 
        q("Connecting", 2), 
        r("Authenticating", 3), 
        s("Connected", 4);
        
        public k(final String name, final int ordinal) {
        }
    }
    
    public static class l
    {
        public final String a;
        public final List b;
        public final Object c;
        public final T3.p d;
        
        public l(final String a, final List b, final Object c, final T3.p d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        public static /* synthetic */ T3.p a(final l l) {
            return l.d;
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
    
    public static class m
    {
        public final Map a;
        public final j b;
        public boolean c;
        
        public m(final String s, final Map a, final j b) {
            this.a = a;
            this.b = b;
            this.c = false;
        }
        
        public final j d() {
            return this.b;
        }
        
        public final Map e() {
            return this.a;
        }
        
        public final boolean f() {
            return !this.c && (this.c = true);
        }
    }
    
    public static class n
    {
        public final T3.p a;
        public final p b;
        public final T3.g c;
        public final Long d;
        
        public n(final T3.p a, final p b, final Long d, final T3.g c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        public static /* synthetic */ p a(final n n) {
            return n.b;
        }
        
        public static /* synthetic */ T3.p b(final n n) {
            return n.a;
        }
        
        public T3.g c() {
            return this.c;
        }
        
        public p d() {
            return this.b;
        }
        
        public Long e() {
            return this.d;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.b.toString());
            sb.append(" (Tag: ");
            sb.append(this.d);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static class o
    {
        public String a;
        public Map b;
        public T3.p c;
        public boolean d;
        
        public o(final String a, final Map b, final T3.p c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public static /* synthetic */ T3.p a(final o o) {
            return o.c;
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
    
    public static class p
    {
        public final List a;
        public final Map b;
        
        public p(final List a, final Map b) {
            this.a = a;
            this.b = b;
        }
        
        public static /* synthetic */ List a(final p p) {
            return p.a;
        }
        
        public static /* synthetic */ Map b(final p p) {
            return p.b;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof p)) {
                return false;
            }
            final p p = (p)o;
            return this.a.equals(p.a) && this.b.equals(p.b);
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode() * 31 + this.b.hashCode();
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(T3.e.d(this.a));
            sb.append(" (params: ");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }
}
