package D5;

import D5.q;
import E5.k;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import t5.AbstractC1995b;
import w5.C2105a;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final E5.k f1367a;

    /* renamed from: b, reason: collision with root package name */
    public g f1368b;

    /* renamed from: c, reason: collision with root package name */
    public final k.c f1369c;

    public class a implements k.c {
        public a() {
        }

        public static /* synthetic */ void e(k.d dVar, c cVar) {
            if (cVar == null) {
                dVar.b("error", "Failed to resize the platform view", null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("width", Double.valueOf(cVar.f1371a));
            hashMap.put("height", Double.valueOf(cVar.f1372b));
            dVar.a(hashMap);
        }

        public final void b(E5.j jVar, k.d dVar) {
            try {
                q.this.f1368b.f(((Integer) jVar.b()).intValue());
                dVar.a(null);
            } catch (IllegalStateException e7) {
                dVar.b("error", q.c(e7), null);
            }
        }

        public final void c(E5.j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            boolean z7 = false;
            boolean z8 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
            try {
                if (z8) {
                    q.this.f1368b.h(new d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), d.a.HYBRID_ONLY, wrap));
                } else {
                    if (map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue()) {
                        z7 = true;
                    }
                    long e7 = q.this.f1368b.e(new d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), z7 ? d.a.TEXTURE_WITH_HYBRID_FALLBACK : d.a.TEXTURE_WITH_VIRTUAL_FALLBACK, wrap));
                    if (e7 != -2) {
                        dVar.a(Long.valueOf(e7));
                        return;
                    } else if (!z7) {
                        throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                    }
                }
                dVar.a(null);
            } catch (IllegalStateException e8) {
                dVar.b("error", q.c(e8), null);
            }
        }

        public final void d(E5.j jVar, k.d dVar) {
            try {
                q.this.f1368b.g(((Integer) ((Map) jVar.b()).get("id")).intValue());
                dVar.a(null);
            } catch (IllegalStateException e7) {
                dVar.b("error", q.c(e7), null);
            }
        }

        public final void f(E5.j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                q.this.f1368b.b(((Integer) map.get("id")).intValue(), ((Double) map.get("top")).doubleValue(), ((Double) map.get("left")).doubleValue());
                dVar.a(null);
            } catch (IllegalStateException e7) {
                dVar.b("error", q.c(e7), null);
            }
        }

        public final void g(E5.j jVar, final k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                q.this.f1368b.i(new e(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new b() { // from class: D5.p
                    @Override // D5.q.b
                    public final void a(q.c cVar) {
                        q.a.e(k.d.this, cVar);
                    }
                });
            } catch (IllegalStateException e7) {
                dVar.b("error", q.c(e7), null);
            }
        }

        public final void h(E5.j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                q.this.f1368b.c(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                dVar.a(null);
            } catch (IllegalStateException e7) {
                dVar.b("error", q.c(e7), null);
            }
        }

        public final void i(E5.j jVar, k.d dVar) {
            try {
                q.this.f1368b.a(((Boolean) jVar.b()).booleanValue());
                dVar.a(null);
            } catch (IllegalStateException e7) {
                dVar.b("error", q.c(e7), null);
            }
        }

        public final void j(E5.j jVar, k.d dVar) {
            k.d dVar2;
            List list = (List) jVar.b();
            try {
                q.this.f1368b.d(new f(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                dVar2 = dVar;
                try {
                    dVar2.a(null);
                } catch (IllegalStateException e7) {
                    e = e7;
                    dVar2.b("error", q.c(e), null);
                }
            } catch (IllegalStateException e8) {
                e = e8;
                dVar2 = dVar;
            }
        }

        @Override // E5.k.c
        public void onMethodCall(E5.j jVar, k.d dVar) {
            if (q.this.f1368b == null) {
            }
            AbstractC1995b.f("PlatformViewsChannel", "Received '" + jVar.f1670a + "' message.");
            String str = jVar.f1670a;
            str.hashCode();
            switch (str) {
                case "create":
                    c(jVar, dVar);
                    break;
                case "offset":
                    f(jVar, dVar);
                    break;
                case "resize":
                    g(jVar, dVar);
                    break;
                case "clearFocus":
                    b(jVar, dVar);
                    break;
                case "synchronizeToNativeViewHierarchy":
                    i(jVar, dVar);
                    break;
                case "touch":
                    j(jVar, dVar);
                    break;
                case "setDirection":
                    h(jVar, dVar);
                    break;
                case "dispose":
                    d(jVar, dVar);
                    break;
                default:
                    dVar.c();
                    break;
            }
        }
    }

    public interface b {
        void a(c cVar);
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f1371a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1372b;

        public c(int i7, int i8) {
            this.f1371a = i7;
            this.f1372b = i8;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f1373a;

        /* renamed from: b, reason: collision with root package name */
        public final String f1374b;

        /* renamed from: c, reason: collision with root package name */
        public final double f1375c;

        /* renamed from: d, reason: collision with root package name */
        public final double f1376d;

        /* renamed from: e, reason: collision with root package name */
        public final double f1377e;

        /* renamed from: f, reason: collision with root package name */
        public final double f1378f;

        /* renamed from: g, reason: collision with root package name */
        public final int f1379g;

        /* renamed from: h, reason: collision with root package name */
        public final a f1380h;

        /* renamed from: i, reason: collision with root package name */
        public final ByteBuffer f1381i;

        public enum a {
            TEXTURE_WITH_VIRTUAL_FALLBACK,
            TEXTURE_WITH_HYBRID_FALLBACK,
            HYBRID_ONLY
        }

        public d(int i7, String str, double d7, double d8, double d9, double d10, int i8, a aVar, ByteBuffer byteBuffer) {
            this.f1373a = i7;
            this.f1374b = str;
            this.f1377e = d7;
            this.f1378f = d8;
            this.f1375c = d9;
            this.f1376d = d10;
            this.f1379g = i8;
            this.f1380h = aVar;
            this.f1381i = byteBuffer;
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f1386a;

        /* renamed from: b, reason: collision with root package name */
        public final double f1387b;

        /* renamed from: c, reason: collision with root package name */
        public final double f1388c;

        public e(int i7, double d7, double d8) {
            this.f1386a = i7;
            this.f1387b = d7;
            this.f1388c = d8;
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f1389a;

        /* renamed from: b, reason: collision with root package name */
        public final Number f1390b;

        /* renamed from: c, reason: collision with root package name */
        public final Number f1391c;

        /* renamed from: d, reason: collision with root package name */
        public final int f1392d;

        /* renamed from: e, reason: collision with root package name */
        public final int f1393e;

        /* renamed from: f, reason: collision with root package name */
        public final Object f1394f;

        /* renamed from: g, reason: collision with root package name */
        public final Object f1395g;

        /* renamed from: h, reason: collision with root package name */
        public final int f1396h;

        /* renamed from: i, reason: collision with root package name */
        public final int f1397i;

        /* renamed from: j, reason: collision with root package name */
        public final float f1398j;

        /* renamed from: k, reason: collision with root package name */
        public final float f1399k;

        /* renamed from: l, reason: collision with root package name */
        public final int f1400l;

        /* renamed from: m, reason: collision with root package name */
        public final int f1401m;

        /* renamed from: n, reason: collision with root package name */
        public final int f1402n;

        /* renamed from: o, reason: collision with root package name */
        public final int f1403o;

        /* renamed from: p, reason: collision with root package name */
        public final long f1404p;

        public f(int i7, Number number, Number number2, int i8, int i9, Object obj, Object obj2, int i10, int i11, float f7, float f8, int i12, int i13, int i14, int i15, long j7) {
            this.f1389a = i7;
            this.f1390b = number;
            this.f1391c = number2;
            this.f1392d = i8;
            this.f1393e = i9;
            this.f1394f = obj;
            this.f1395g = obj2;
            this.f1396h = i10;
            this.f1397i = i11;
            this.f1398j = f7;
            this.f1399k = f8;
            this.f1400l = i12;
            this.f1401m = i13;
            this.f1402n = i14;
            this.f1403o = i15;
            this.f1404p = j7;
        }
    }

    public interface g {
        void a(boolean z7);

        void b(int i7, double d7, double d8);

        void c(int i7, int i8);

        void d(f fVar);

        long e(d dVar);

        void f(int i7);

        void g(int i7);

        void h(d dVar);

        void i(e eVar, b bVar);
    }

    public q(C2105a c2105a) {
        a aVar = new a();
        this.f1369c = aVar;
        E5.k kVar = new E5.k(c2105a, "flutter/platform_views", E5.q.f1685b);
        this.f1367a = kVar;
        kVar.e(aVar);
    }

    public static String c(Exception exc) {
        return AbstractC1995b.d(exc);
    }

    public void d(g gVar) {
        this.f1368b = gVar;
    }
}
