package T3;

import T3.b;
import T3.d;
import T3.h;
import U3.a;
import V2.AbstractC0659j;
import V2.C0660k;
import V2.InterfaceC0655f;
import V2.InterfaceC0656g;
import c4.C0851c;
import f4.C1291a;
import j3.C1371a;
import j3.C1372b;
import j3.C1373c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class n implements b.a, T3.h {

    /* renamed from: H, reason: collision with root package name */
    public static long f6117H;

    /* renamed from: A, reason: collision with root package name */
    public String f6118A;

    /* renamed from: F, reason: collision with root package name */
    public long f6123F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f6124G;

    /* renamed from: a, reason: collision with root package name */
    public final h.a f6125a;

    /* renamed from: b, reason: collision with root package name */
    public final T3.f f6126b;

    /* renamed from: c, reason: collision with root package name */
    public String f6127c;

    /* renamed from: f, reason: collision with root package name */
    public long f6130f;

    /* renamed from: g, reason: collision with root package name */
    public T3.b f6131g;

    /* renamed from: l, reason: collision with root package name */
    public Map f6136l;

    /* renamed from: m, reason: collision with root package name */
    public List f6137m;

    /* renamed from: n, reason: collision with root package name */
    public Map f6138n;

    /* renamed from: o, reason: collision with root package name */
    public Map f6139o;

    /* renamed from: p, reason: collision with root package name */
    public Map f6140p;

    /* renamed from: q, reason: collision with root package name */
    public String f6141q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6142r;

    /* renamed from: s, reason: collision with root package name */
    public String f6143s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6144t;

    /* renamed from: u, reason: collision with root package name */
    public final T3.c f6145u;

    /* renamed from: v, reason: collision with root package name */
    public final T3.d f6146v;

    /* renamed from: w, reason: collision with root package name */
    public final T3.d f6147w;

    /* renamed from: x, reason: collision with root package name */
    public final ScheduledExecutorService f6148x;

    /* renamed from: y, reason: collision with root package name */
    public final C0851c f6149y;

    /* renamed from: z, reason: collision with root package name */
    public final U3.a f6150z;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f6128d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public boolean f6129e = true;

    /* renamed from: h, reason: collision with root package name */
    public k f6132h = k.Disconnected;

    /* renamed from: i, reason: collision with root package name */
    public long f6133i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f6134j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f6135k = 0;

    /* renamed from: B, reason: collision with root package name */
    public long f6119B = 0;

    /* renamed from: C, reason: collision with root package name */
    public int f6120C = 0;

    /* renamed from: D, reason: collision with root package name */
    public int f6121D = 0;

    /* renamed from: E, reason: collision with root package name */
    public ScheduledFuture f6122E = null;

    public class a implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C0660k f6151a;

        public a(C0660k c0660k) {
            this.f6151a = c0660k;
        }

        @Override // T3.d.a
        public void a(String str) {
            this.f6151a.c(str);
        }
    }

    public class b implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C0660k f6153a;

        public b(C0660k c0660k) {
            this.f6153a = c0660k;
        }

        @Override // T3.d.a
        public void a(String str) {
            this.f6153a.c(str);
        }
    }

    public class c implements j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ T3.p f6155a;

        public c(T3.p pVar) {
            this.f6155a = pVar;
        }

        @Override // T3.n.j
        public void a(Map map) {
            String str;
            String str2 = (String) map.get("s");
            if (str2.equals("ok")) {
                str2 = null;
                str = null;
            } else {
                str = (String) map.get("d");
            }
            T3.p pVar = this.f6155a;
            if (pVar != null) {
                pVar.a(str2, str);
            }
        }
    }

    public class d implements j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f6157a;

        public d(boolean z7) {
            this.f6157a = z7;
        }

        @Override // T3.n.j
        public void a(Map map) {
            String str = (String) map.get("s");
            if (str.equals("ok")) {
                n.this.f6132h = k.Connected;
                n.this.f6120C = 0;
                n.this.u0(this.f6157a);
                return;
            }
            n.this.f6141q = null;
            n.this.f6142r = true;
            n.this.f6125a.e(false);
            String str2 = (String) map.get("d");
            n.this.f6149y.b("Authentication failed: " + str + " (" + str2 + ")", new Object[0]);
            n.this.f6131g.c();
            if (str.equals("invalid_token")) {
                n.z(n.this);
                if (n.this.f6120C >= 3) {
                    n.this.f6150z.d();
                    n.this.f6149y.i("Provided authentication credentials are invalid. This usually indicates your FirebaseApp instance was not initialized correctly. Make sure your google-services.json file has the correct firebase_url and api_key. You can re-download google-services.json from https://console.firebase.google.com/.");
                }
            }
        }
    }

    public class e implements j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f6159a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f6160b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f6161c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ T3.p f6162d;

        public e(String str, long j7, o oVar, T3.p pVar) {
            this.f6159a = str;
            this.f6160b = j7;
            this.f6161c = oVar;
            this.f6162d = pVar;
        }

        @Override // T3.n.j
        public void a(Map map) {
            if (n.this.f6149y.f()) {
                n.this.f6149y.b(this.f6159a + " response: " + map, new Object[0]);
            }
            if (((o) n.this.f6138n.get(Long.valueOf(this.f6160b))) == this.f6161c) {
                n.this.f6138n.remove(Long.valueOf(this.f6160b));
                if (this.f6162d != null) {
                    String str = (String) map.get("s");
                    if (str.equals("ok")) {
                        this.f6162d.a(null, null);
                    } else {
                        this.f6162d.a(str, (String) map.get("d"));
                    }
                }
            } else if (n.this.f6149y.f()) {
                n.this.f6149y.b("Ignoring on complete for put " + this.f6160b + " because it was removed already.", new Object[0]);
            }
            n.this.U();
        }
    }

    public class f implements j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Long f6164a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f6165b;

        public f(Long l7, m mVar) {
            this.f6164a = l7;
            this.f6165b = mVar;
        }

        @Override // T3.n.j
        public void a(Map map) {
            if (((m) n.this.f6139o.get(this.f6164a)) == this.f6165b) {
                n.this.f6139o.remove(this.f6164a);
                this.f6165b.d().a(map);
            } else if (n.this.f6149y.f()) {
                n.this.f6149y.b("Ignoring on complete for get " + this.f6164a + " because it was removed already.", new Object[0]);
            }
        }
    }

    public class g implements j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C0102n f6167a;

        public g(C0102n c0102n) {
            this.f6167a = c0102n;
        }

        @Override // T3.n.j
        public void a(Map map) {
            String str = (String) map.get("s");
            if (str.equals("ok")) {
                Map map2 = (Map) map.get("d");
                if (map2.containsKey("w")) {
                    n.this.H0((List) map2.get("w"), this.f6167a.f6185b);
                }
            }
            if (((C0102n) n.this.f6140p.get(this.f6167a.d())) == this.f6167a) {
                if (str.equals("ok")) {
                    this.f6167a.f6184a.a(null, null);
                    return;
                }
                n.this.p0(this.f6167a.d());
                this.f6167a.f6184a.a(str, (String) map.get("d"));
            }
        }
    }

    public class h implements j {
        public h() {
        }

        @Override // T3.n.j
        public void a(Map map) {
            String str = (String) map.get("s");
            if (str.equals("ok")) {
                return;
            }
            String str2 = (String) map.get("d");
            if (n.this.f6149y.f()) {
                n.this.f6149y.b("Failed to send stats: " + str + " (message: " + str2 + ")", new Object[0]);
            }
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.f6122E = null;
            if (n.this.Z()) {
                n.this.j("connection_idle");
            } else {
                n.this.U();
            }
        }
    }

    public interface j {
        void a(Map map);
    }

    public enum k {
        Disconnected,
        GettingToken,
        Connecting,
        Authenticating,
        Connected
    }

    public static class l {

        /* renamed from: a, reason: collision with root package name */
        public final String f6177a;

        /* renamed from: b, reason: collision with root package name */
        public final List f6178b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f6179c;

        /* renamed from: d, reason: collision with root package name */
        public final T3.p f6180d;

        public l(String str, List list, Object obj, T3.p pVar) {
            this.f6177a = str;
            this.f6178b = list;
            this.f6179c = obj;
            this.f6180d = pVar;
        }

        public String b() {
            return this.f6177a;
        }

        public Object c() {
            return this.f6179c;
        }

        public T3.p d() {
            return this.f6180d;
        }

        public List e() {
            return this.f6178b;
        }

        public /* synthetic */ l(String str, List list, Object obj, T3.p pVar, a aVar) {
            this(str, list, obj, pVar);
        }
    }

    public static class m {

        /* renamed from: a, reason: collision with root package name */
        public final Map f6181a;

        /* renamed from: b, reason: collision with root package name */
        public final j f6182b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f6183c;

        public m(String str, Map map, j jVar) {
            this.f6181a = map;
            this.f6182b = jVar;
            this.f6183c = false;
        }

        public final j d() {
            return this.f6182b;
        }

        public final Map e() {
            return this.f6181a;
        }

        public final boolean f() {
            if (this.f6183c) {
                return false;
            }
            this.f6183c = true;
            return true;
        }

        public /* synthetic */ m(String str, Map map, j jVar, a aVar) {
            this(str, map, jVar);
        }
    }

    /* renamed from: T3.n$n, reason: collision with other inner class name */
    public static class C0102n {

        /* renamed from: a, reason: collision with root package name */
        public final T3.p f6184a;

        /* renamed from: b, reason: collision with root package name */
        public final p f6185b;

        /* renamed from: c, reason: collision with root package name */
        public final T3.g f6186c;

        /* renamed from: d, reason: collision with root package name */
        public final Long f6187d;

        public C0102n(T3.p pVar, p pVar2, Long l7, T3.g gVar) {
            this.f6184a = pVar;
            this.f6185b = pVar2;
            this.f6186c = gVar;
            this.f6187d = l7;
        }

        public T3.g c() {
            return this.f6186c;
        }

        public p d() {
            return this.f6185b;
        }

        public Long e() {
            return this.f6187d;
        }

        public String toString() {
            return this.f6185b.toString() + " (Tag: " + this.f6187d + ")";
        }

        public /* synthetic */ C0102n(T3.p pVar, p pVar2, Long l7, T3.g gVar, a aVar) {
            this(pVar, pVar2, l7, gVar);
        }
    }

    public static class o {

        /* renamed from: a, reason: collision with root package name */
        public String f6188a;

        /* renamed from: b, reason: collision with root package name */
        public Map f6189b;

        /* renamed from: c, reason: collision with root package name */
        public T3.p f6190c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f6191d;

        public o(String str, Map map, T3.p pVar) {
            this.f6188a = str;
            this.f6189b = map;
            this.f6190c = pVar;
        }

        public String b() {
            return this.f6188a;
        }

        public T3.p c() {
            return this.f6190c;
        }

        public Map d() {
            return this.f6189b;
        }

        public void e() {
            this.f6191d = true;
        }

        public boolean f() {
            return this.f6191d;
        }

        public /* synthetic */ o(String str, Map map, T3.p pVar, a aVar) {
            this(str, map, pVar);
        }
    }

    public static class p {

        /* renamed from: a, reason: collision with root package name */
        public final List f6192a;

        /* renamed from: b, reason: collision with root package name */
        public final Map f6193b;

        public p(List list, Map map) {
            this.f6192a = list;
            this.f6193b = map;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            if (this.f6192a.equals(pVar.f6192a)) {
                return this.f6193b.equals(pVar.f6193b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f6192a.hashCode() * 31) + this.f6193b.hashCode();
        }

        public String toString() {
            return T3.e.d(this.f6192a) + " (params: " + this.f6193b + ")";
        }
    }

    public n(T3.c cVar, T3.f fVar, h.a aVar) {
        this.f6125a = aVar;
        this.f6145u = cVar;
        ScheduledExecutorService e7 = cVar.e();
        this.f6148x = e7;
        this.f6146v = cVar.c();
        this.f6147w = cVar.a();
        this.f6126b = fVar;
        this.f6140p = new HashMap();
        this.f6136l = new HashMap();
        this.f6138n = new HashMap();
        this.f6139o = new ConcurrentHashMap();
        this.f6137m = new ArrayList();
        this.f6150z = new a.b(e7, cVar.f(), "ConnectionRetryHelper").d(1000L).e(1.3d).c(30000L).b(0.7d).a();
        long j7 = f6117H;
        f6117H = 1 + j7;
        this.f6149y = new C0851c(cVar.f(), "PersistentConnection", "pc_" + j7);
        this.f6118A = null;
        U();
    }

    public static /* synthetic */ void c0(C0660k c0660k, Map map) {
        if (((String) map.get("s")).equals("ok")) {
            c0660k.c(map.get("d"));
        } else {
            c0660k.b(new Exception((String) map.get("d")));
        }
    }

    public static /* synthetic */ int z(n nVar) {
        int i7 = nVar.f6120C;
        nVar.f6120C = i7 + 1;
        return i7;
    }

    public final void A0(String str, List list, Object obj, T3.p pVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("p", T3.e.d(list));
        hashMap.put("d", obj);
        t0(str, hashMap, new c(pVar));
    }

    public final void B0(long j7) {
        T3.e.b(R(), "sendPut called when we can't send writes (we're disconnected or writes are paused).", new Object[0]);
        o oVar = (o) this.f6138n.get(Long.valueOf(j7));
        T3.p c7 = oVar.c();
        String b7 = oVar.b();
        oVar.e();
        t0(b7, oVar.d(), new e(b7, j7, oVar, c7));
    }

    public final void C0(String str, boolean z7, Map map, j jVar) {
        long h02 = h0();
        HashMap hashMap = new HashMap();
        hashMap.put("r", Long.valueOf(h02));
        hashMap.put(C1371a.f15434e, str);
        hashMap.put(C1372b.f15446b, map);
        this.f6131g.m(hashMap, z7);
        this.f6136l.put(Long.valueOf(h02), jVar);
    }

    public final void D0(Map map) {
        if (map.isEmpty()) {
            if (this.f6149y.f()) {
                this.f6149y.b("Not sending stats because stats are empty", new Object[0]);
            }
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(C1373c.f15449d, map);
            t0("s", hashMap, new h());
        }
    }

    public final void E0(C0102n c0102n) {
        HashMap hashMap = new HashMap();
        hashMap.put("p", T3.e.d(c0102n.f6185b.f6192a));
        Long e7 = c0102n.e();
        if (e7 != null) {
            hashMap.put("q", c0102n.d().f6193b);
            hashMap.put("t", e7);
        }
        t0("n", hashMap, null);
    }

    public boolean F0() {
        return this.f6128d.size() == 0;
    }

    public final void G0() {
        if (F0()) {
            k kVar = this.f6132h;
            T3.e.b(kVar == k.Disconnected, "Not in disconnected state: %s", kVar);
            final boolean z7 = this.f6142r;
            final boolean z8 = this.f6144t;
            this.f6149y.b("Scheduling connection attempt", new Object[0]);
            this.f6142r = false;
            this.f6144t = false;
            this.f6150z.c(new Runnable() { // from class: T3.i
                @Override // java.lang.Runnable
                public final void run() {
                    n.this.g0(z7, z8);
                }
            });
        }
    }

    public final void H0(List list, p pVar) {
        if (list.contains("no_index")) {
            String str = "\".indexOn\": \"" + pVar.f6193b.get("i") + '\"';
            this.f6149y.i("Using an unspecified index. Your data will be downloaded and filtered on the client. Consider adding '" + str + "' at " + T3.e.d(pVar.f6192a) + " to your security and Firebase Database rules for better performance");
        }
    }

    public final boolean Q() {
        return this.f6132h == k.Connected;
    }

    public final boolean R() {
        return this.f6132h == k.Connected;
    }

    public final void S() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f6138n.entrySet().iterator();
        while (it.hasNext()) {
            o oVar = (o) ((Map.Entry) it.next()).getValue();
            if (oVar.d().containsKey("h") && oVar.f()) {
                arrayList.add(oVar);
                it.remove();
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((o) it2.next()).c().a("disconnected", null);
        }
    }

    public final boolean T() {
        k kVar = this.f6132h;
        return kVar == k.Authenticating || kVar == k.Connected;
    }

    public final void U() {
        if (a0()) {
            ScheduledFuture scheduledFuture = this.f6122E;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f6122E = this.f6148x.schedule(new i(), 60000L, TimeUnit.MILLISECONDS);
            return;
        }
        if (b0("connection_idle")) {
            T3.e.a(!a0());
            p("connection_idle");
        }
    }

    public final AbstractC0659j V(boolean z7) {
        C0660k c0660k = new C0660k();
        this.f6149y.b("Trying to fetch app check token", new Object[0]);
        this.f6147w.a(z7, new b(c0660k));
        return c0660k.a();
    }

    public final AbstractC0659j W(boolean z7) {
        C0660k c0660k = new C0660k();
        this.f6149y.b("Trying to fetch auth token", new Object[0]);
        this.f6146v.a(z7, new a(c0660k));
        return c0660k.a();
    }

    public final Map X(List list, Object obj, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("p", T3.e.d(list));
        hashMap.put("d", obj);
        if (str != null) {
            hashMap.put("h", str);
        }
        return hashMap;
    }

    public final void Y(long j7) {
        if (this.f6149y.f()) {
            this.f6149y.b("handling timestamp", new Object[0]);
        }
        long currentTimeMillis = j7 - System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("serverTimeOffset", Long.valueOf(currentTimeMillis));
        this.f6125a.b(hashMap);
    }

    public final boolean Z() {
        return a0() && System.currentTimeMillis() > this.f6123F + 60000;
    }

    @Override // T3.h
    public void a() {
        G0();
    }

    public final boolean a0() {
        return this.f6140p.isEmpty() && this.f6139o.isEmpty() && this.f6136l.isEmpty() && !this.f6124G && this.f6138n.isEmpty();
    }

    @Override // T3.h
    public void b(List list, Map map, T3.p pVar) {
        this.f6124G = true;
        if (R()) {
            A0("om", list, map, pVar);
        } else {
            this.f6137m.add(new l("om", list, map, pVar, null));
        }
        U();
    }

    public boolean b0(String str) {
        return this.f6128d.contains(str);
    }

    @Override // T3.b.a
    public void c(long j7, String str) {
        if (this.f6149y.f()) {
            this.f6149y.b("onReady", new Object[0]);
        }
        this.f6130f = System.currentTimeMillis();
        Y(j7);
        if (this.f6129e) {
            x0();
        }
        s0();
        this.f6129e = false;
        this.f6118A = str;
        this.f6125a.a();
    }

    @Override // T3.h
    public AbstractC0659j d(List list, Map map) {
        p pVar = new p(list, map);
        final C0660k c0660k = new C0660k();
        long j7 = this.f6134j;
        this.f6134j = 1 + j7;
        HashMap hashMap = new HashMap();
        hashMap.put("p", T3.e.d(pVar.f6192a));
        hashMap.put("q", pVar.f6193b);
        this.f6139o.put(Long.valueOf(j7), new m("g", hashMap, new j() { // from class: T3.j
            @Override // T3.n.j
            public final void a(Map map2) {
                n.c0(C0660k.this, map2);
            }
        }, null));
        if (Q()) {
            y0(Long.valueOf(j7));
        }
        U();
        return c0660k.a();
    }

    public final /* synthetic */ void d0(boolean z7, Map map) {
        String str = (String) map.get("s");
        if (str.equals("ok")) {
            this.f6121D = 0;
        } else {
            this.f6143s = null;
            this.f6144t = true;
            String str2 = (String) map.get("d");
            this.f6149y.b("App check failed: " + str + " (" + str2 + ")", new Object[0]);
        }
        if (z7) {
            r0();
        }
    }

    @Override // T3.h
    public void e() {
        for (o oVar : this.f6138n.values()) {
            if (oVar.f6190c != null) {
                oVar.f6190c.a("write_canceled", null);
            }
        }
        for (l lVar : this.f6137m) {
            if (lVar.f6180d != null) {
                lVar.f6180d.a("write_canceled", null);
            }
        }
        this.f6138n.clear();
        this.f6137m.clear();
        if (!T()) {
            this.f6124G = false;
        }
        U();
    }

    public final /* synthetic */ void e0(long j7, AbstractC0659j abstractC0659j, AbstractC0659j abstractC0659j2, Void r7) {
        if (j7 != this.f6119B) {
            this.f6149y.b("Ignoring getToken result, because this was not the latest attempt.", new Object[0]);
            return;
        }
        k kVar = this.f6132h;
        if (kVar == k.GettingToken) {
            this.f6149y.b("Successfully fetched token, opening connection", new Object[0]);
            n0((String) abstractC0659j.j(), (String) abstractC0659j2.j());
        } else if (kVar == k.Disconnected) {
            this.f6149y.b("Not opening connection after token refresh, because connection was set to disconnected", new Object[0]);
        }
    }

    @Override // T3.h
    public void f(List list, Map map, T3.p pVar) {
        o0("m", list, map, null, pVar);
    }

    public final /* synthetic */ void f0(long j7, Exception exc) {
        if (j7 != this.f6119B) {
            this.f6149y.b("Ignoring getToken error, because this was not the latest attempt.", new Object[0]);
            return;
        }
        this.f6132h = k.Disconnected;
        this.f6149y.b("Error fetching token: " + exc, new Object[0]);
        G0();
    }

    @Override // T3.b.a
    public void g(b.EnumC0101b enumC0101b) {
        boolean z7 = false;
        if (this.f6149y.f()) {
            this.f6149y.b("Got on disconnect due to " + enumC0101b.name(), new Object[0]);
        }
        this.f6132h = k.Disconnected;
        this.f6131g = null;
        this.f6124G = false;
        this.f6136l.clear();
        S();
        if (F0()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j7 = this.f6130f;
            long j8 = currentTimeMillis - j7;
            if (j7 > 0 && j8 > 30000) {
                z7 = true;
            }
            if (enumC0101b == b.EnumC0101b.SERVER_RESET || z7) {
                this.f6150z.e();
            }
            G0();
        }
        this.f6130f = 0L;
        this.f6125a.d();
    }

    public final /* synthetic */ void g0(boolean z7, boolean z8) {
        k kVar = this.f6132h;
        T3.e.b(kVar == k.Disconnected, "Not in disconnected state: %s", kVar);
        this.f6132h = k.GettingToken;
        final long j7 = this.f6119B + 1;
        this.f6119B = j7;
        final AbstractC0659j W6 = W(z7);
        final AbstractC0659j V6 = V(z8);
        V2.m.g(W6, V6).e(this.f6148x, new InterfaceC0656g() { // from class: T3.k
            @Override // V2.InterfaceC0656g
            public final void a(Object obj) {
                n.this.e0(j7, W6, V6, (Void) obj);
            }
        }).d(this.f6148x, new InterfaceC0655f() { // from class: T3.l
            @Override // V2.InterfaceC0655f
            public final void d(Exception exc) {
                n.this.f0(j7, exc);
            }
        });
    }

    @Override // T3.h
    public void h(List list, Object obj, T3.p pVar) {
        this.f6124G = true;
        if (R()) {
            A0("o", list, obj, pVar);
        } else {
            this.f6137m.add(new l("o", list, obj, pVar, null));
        }
        U();
    }

    public final long h0() {
        long j7 = this.f6135k;
        this.f6135k = 1 + j7;
        return j7;
    }

    @Override // T3.b.a
    public void i(Map map) {
        if (map.containsKey("r")) {
            j jVar = (j) this.f6136l.remove(Long.valueOf(((Integer) map.get("r")).intValue()));
            if (jVar != null) {
                jVar.a((Map) map.get(C1372b.f15446b));
                return;
            }
            return;
        }
        if (map.containsKey("error")) {
            return;
        }
        if (map.containsKey(C1371a.f15434e)) {
            k0((String) map.get(C1371a.f15434e), (Map) map.get(C1372b.f15446b));
            return;
        }
        if (this.f6149y.f()) {
            this.f6149y.b("Ignoring unknown message: " + map, new Object[0]);
        }
    }

    public final void i0(String str, String str2) {
        this.f6149y.b("App check token revoked: " + str + " (" + str2 + ")", new Object[0]);
        this.f6143s = null;
        this.f6144t = true;
    }

    @Override // T3.h
    public void j(String str) {
        if (this.f6149y.f()) {
            this.f6149y.b("Connection interrupted for: " + str, new Object[0]);
        }
        this.f6128d.add(str);
        T3.b bVar = this.f6131g;
        if (bVar != null) {
            bVar.c();
            this.f6131g = null;
        } else {
            this.f6150z.b();
            this.f6132h = k.Disconnected;
        }
        this.f6150z.e();
    }

    public final void j0(String str, String str2) {
        this.f6149y.b("Auth token revoked: " + str + " (" + str2 + ")", new Object[0]);
        this.f6141q = null;
        this.f6142r = true;
        this.f6125a.e(false);
        this.f6131g.c();
    }

    @Override // T3.h
    public void k(List list, Map map, T3.g gVar, Long l7, T3.p pVar) {
        p pVar2 = new p(list, map);
        if (this.f6149y.f()) {
            this.f6149y.b("Listening on " + pVar2, new Object[0]);
        }
        T3.e.b(!this.f6140p.containsKey(pVar2), "listen() called twice for same QuerySpec.", new Object[0]);
        if (this.f6149y.f()) {
            this.f6149y.b("Adding listen query: " + pVar2, new Object[0]);
        }
        C0102n c0102n = new C0102n(pVar, pVar2, l7, gVar, null);
        this.f6140p.put(pVar2, c0102n);
        if (T()) {
            z0(c0102n);
        }
        U();
    }

    public final void k0(String str, Map map) {
        if (this.f6149y.f()) {
            this.f6149y.b("handleServerMessage: " + str + " " + map, new Object[0]);
        }
        if (str.equals("d") || str.equals("m")) {
            boolean equals = str.equals("m");
            String str2 = (String) map.get("p");
            Object obj = map.get("d");
            Long c7 = T3.e.c(map.get("t"));
            if (!equals || !(obj instanceof Map) || ((Map) obj).size() != 0) {
                this.f6125a.c(T3.e.e(str2), obj, equals, c7);
                return;
            }
            if (this.f6149y.f()) {
                this.f6149y.b("ignoring empty merge for path " + str2, new Object[0]);
                return;
            }
            return;
        }
        if (!str.equals("rm")) {
            if (str.equals(C1373c.f15449d)) {
                l0(T3.e.e((String) map.get("p")));
                return;
            }
            if (str.equals("ac")) {
                j0((String) map.get("s"), (String) map.get("d"));
                return;
            }
            if (str.equals("apc")) {
                i0((String) map.get("s"), (String) map.get("d"));
                return;
            }
            if (str.equals("sd")) {
                m0(map);
                return;
            }
            if (this.f6149y.f()) {
                this.f6149y.b("Unrecognized action from server: " + str, new Object[0]);
                return;
            }
            return;
        }
        String str3 = (String) map.get("p");
        List e7 = T3.e.e(str3);
        Object obj2 = map.get("d");
        Long c8 = T3.e.c(map.get("t"));
        ArrayList arrayList = new ArrayList();
        for (Map map2 : (List) obj2) {
            String str4 = (String) map2.get("s");
            String str5 = (String) map2.get("e");
            List list = null;
            List e8 = str4 != null ? T3.e.e(str4) : null;
            if (str5 != null) {
                list = T3.e.e(str5);
            }
            arrayList.add(new T3.o(e8, list, map2.get("m")));
        }
        if (!arrayList.isEmpty()) {
            this.f6125a.f(e7, arrayList, c8);
            return;
        }
        if (this.f6149y.f()) {
            this.f6149y.b("Ignoring empty range merge for path " + str3, new Object[0]);
        }
    }

    @Override // T3.h
    public void l(List list, Map map) {
        p pVar = new p(list, map);
        if (this.f6149y.f()) {
            this.f6149y.b("unlistening on " + pVar, new Object[0]);
        }
        C0102n p02 = p0(pVar);
        if (p02 != null && T()) {
            E0(p02);
        }
        U();
    }

    public final void l0(List list) {
        Collection q02 = q0(list);
        if (q02 != null) {
            Iterator it = q02.iterator();
            while (it.hasNext()) {
                ((C0102n) it.next()).f6184a.a("permission_denied", null);
            }
        }
    }

    @Override // T3.h
    public void m(List list, T3.p pVar) {
        if (R()) {
            A0("oc", list, null, pVar);
        } else {
            this.f6137m.add(new l("oc", list, null, pVar, null));
        }
        U();
    }

    public final void m0(Map map) {
        this.f6149y.e((String) map.get("msg"));
    }

    @Override // T3.h
    public void n(List list, Object obj, String str, T3.p pVar) {
        o0("p", list, obj, str, pVar);
    }

    public void n0(String str, String str2) {
        k kVar = this.f6132h;
        T3.e.b(kVar == k.GettingToken, "Trying to open network connection while in the wrong state: %s", kVar);
        if (str == null) {
            this.f6125a.e(false);
        }
        this.f6141q = str;
        this.f6143s = str2;
        this.f6132h = k.Connecting;
        T3.b bVar = new T3.b(this.f6145u, this.f6126b, this.f6127c, this, this.f6118A, str2);
        this.f6131g = bVar;
        bVar.k();
    }

    @Override // T3.b.a
    public void o(String str) {
        this.f6127c = str;
    }

    public final void o0(String str, List list, Object obj, String str2, T3.p pVar) {
        Map X6 = X(list, obj, str2);
        long j7 = this.f6133i;
        this.f6133i = 1 + j7;
        this.f6138n.put(Long.valueOf(j7), new o(str, X6, pVar, null));
        if (R()) {
            B0(j7);
        }
        this.f6123F = System.currentTimeMillis();
        U();
    }

    @Override // T3.h
    public void p(String str) {
        if (this.f6149y.f()) {
            this.f6149y.b("Connection no longer interrupted for: " + str, new Object[0]);
        }
        this.f6128d.remove(str);
        if (F0() && this.f6132h == k.Disconnected) {
            G0();
        }
    }

    public final C0102n p0(p pVar) {
        if (this.f6149y.f()) {
            this.f6149y.b("removing query " + pVar, new Object[0]);
        }
        if (this.f6140p.containsKey(pVar)) {
            C0102n c0102n = (C0102n) this.f6140p.get(pVar);
            this.f6140p.remove(pVar);
            U();
            return c0102n;
        }
        if (!this.f6149y.f()) {
            return null;
        }
        this.f6149y.b("Trying to remove listener for QuerySpec " + pVar + " but no listener exists.", new Object[0]);
        return null;
    }

    @Override // T3.b.a
    public void q(String str) {
        if (str.equals("Invalid appcheck token")) {
            int i7 = this.f6121D;
            if (i7 < 3) {
                this.f6121D = i7 + 1;
                this.f6149y.i("Detected invalid AppCheck token. Reconnecting (" + (3 - this.f6121D) + " attempts remaining)");
                return;
            }
        }
        this.f6149y.i("Firebase Database connection was forcefully killed by the server. Will not attempt reconnect. Reason: " + str);
        j("server_kill");
    }

    public final Collection q0(List list) {
        if (this.f6149y.f()) {
            this.f6149y.b("removing all listens at path " + list, new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f6140p.entrySet()) {
            p pVar = (p) entry.getKey();
            C0102n c0102n = (C0102n) entry.getValue();
            if (pVar.f6192a.equals(list)) {
                arrayList.add(c0102n);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f6140p.remove(((C0102n) it.next()).d());
        }
        U();
        return arrayList;
    }

    @Override // T3.h
    public void r(List list, Object obj, T3.p pVar) {
        o0("p", list, obj, null, pVar);
    }

    public final void r0() {
        k kVar = this.f6132h;
        T3.e.b(kVar == k.Connected, "Should be connected if we're restoring state, but we are: %s", kVar);
        if (this.f6149y.f()) {
            this.f6149y.b("Restoring outstanding listens", new Object[0]);
        }
        for (C0102n c0102n : this.f6140p.values()) {
            if (this.f6149y.f()) {
                this.f6149y.b("Restoring listen " + c0102n.d(), new Object[0]);
            }
            z0(c0102n);
        }
        if (this.f6149y.f()) {
            this.f6149y.b("Restoring writes.", new Object[0]);
        }
        ArrayList arrayList = new ArrayList(this.f6138n.keySet());
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            B0(((Long) it.next()).longValue());
        }
        for (l lVar : this.f6137m) {
            A0(lVar.b(), lVar.e(), lVar.c(), lVar.d());
        }
        this.f6137m.clear();
        if (this.f6149y.f()) {
            this.f6149y.b("Restoring reads.", new Object[0]);
        }
        ArrayList arrayList2 = new ArrayList(this.f6139o.keySet());
        Collections.sort(arrayList2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            y0((Long) it2.next());
        }
    }

    public final void s0() {
        if (this.f6149y.f()) {
            this.f6149y.b("calling restore tokens", new Object[0]);
        }
        k kVar = this.f6132h;
        T3.e.b(kVar == k.Connecting, "Wanted to restore tokens, but was in wrong state: %s", kVar);
        if (this.f6141q != null) {
            if (this.f6149y.f()) {
                this.f6149y.b("Restoring auth.", new Object[0]);
            }
            this.f6132h = k.Authenticating;
            v0();
            return;
        }
        if (this.f6149y.f()) {
            this.f6149y.b("Not restoring auth because auth token is null.", new Object[0]);
        }
        this.f6132h = k.Connected;
        u0(true);
    }

    public final void t0(String str, Map map, j jVar) {
        C0(str, false, map, jVar);
    }

    public final void u0(final boolean z7) {
        if (this.f6143s == null) {
            r0();
            return;
        }
        T3.e.b(T(), "Must be connected to send auth, but was: %s", this.f6132h);
        if (this.f6149y.f()) {
            this.f6149y.b("Sending app check.", new Object[0]);
        }
        j jVar = new j() { // from class: T3.m
            @Override // T3.n.j
            public final void a(Map map) {
                n.this.d0(z7, map);
            }
        };
        HashMap hashMap = new HashMap();
        T3.e.b(this.f6143s != null, "App check token must be set!", new Object[0]);
        hashMap.put("token", this.f6143s);
        C0("appcheck", true, hashMap, jVar);
    }

    public final void v0() {
        w0(true);
    }

    public final void w0(boolean z7) {
        String str;
        T3.e.b(T(), "Must be connected to send auth, but was: %s", this.f6132h);
        if (this.f6149y.f()) {
            this.f6149y.b("Sending auth.", new Object[0]);
        }
        d dVar = new d(z7);
        HashMap hashMap = new HashMap();
        C1291a c7 = C1291a.c(this.f6141q);
        if (c7 != null) {
            hashMap.put("cred", c7.b());
            if (c7.a() != null) {
                hashMap.put("authvar", c7.a());
            }
            str = "gauth";
        } else {
            hashMap.put("cred", this.f6141q);
            str = "auth";
        }
        C0(str, true, hashMap, dVar);
    }

    public final void x0() {
        HashMap hashMap = new HashMap();
        if (this.f6145u.i()) {
            hashMap.put("persistence.android.enabled", 1);
        }
        hashMap.put("sdk.android." + this.f6145u.d().replace('.', '-'), 1);
        if (this.f6149y.f()) {
            this.f6149y.b("Sending first connection stats", new Object[0]);
        }
        D0(hashMap);
    }

    public final void y0(Long l7) {
        T3.e.b(Q(), "sendGet called when we can't send gets", new Object[0]);
        m mVar = (m) this.f6139o.get(l7);
        if (mVar.f() || !this.f6149y.f()) {
            t0("g", mVar.e(), new f(l7, mVar));
            return;
        }
        this.f6149y.b("get" + l7 + " cancelled, ignoring.", new Object[0]);
    }

    public final void z0(C0102n c0102n) {
        HashMap hashMap = new HashMap();
        hashMap.put("p", T3.e.d(c0102n.d().f6192a));
        Long e7 = c0102n.e();
        if (e7 != null) {
            hashMap.put("q", c0102n.f6185b.f6193b);
            hashMap.put("t", e7);
        }
        T3.g c7 = c0102n.c();
        hashMap.put("h", c7.d());
        if (c7.c()) {
            T3.a b7 = c7.b();
            ArrayList arrayList = new ArrayList();
            Iterator it = b7.b().iterator();
            while (it.hasNext()) {
                arrayList.add(T3.e.d((List) it.next()));
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("hs", b7.a());
            hashMap2.put("ps", arrayList);
            hashMap.put("ch", hashMap2);
        }
        t0("q", hashMap, new g(c0102n));
    }
}
