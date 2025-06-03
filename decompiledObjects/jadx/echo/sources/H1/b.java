package H1;

import H1.f;
import V5.q;
import W5.F;
import W5.K;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: m, reason: collision with root package name */
    public static final a f2167m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    public static final Map f2168n;

    /* renamed from: a, reason: collision with root package name */
    public final H1.a f2169a;

    /* renamed from: b, reason: collision with root package name */
    public final H1.a f2170b;

    /* renamed from: c, reason: collision with root package name */
    public final H1.a f2171c;

    /* renamed from: d, reason: collision with root package name */
    public final H1.a f2172d;

    /* renamed from: e, reason: collision with root package name */
    public final H1.a f2173e;

    /* renamed from: f, reason: collision with root package name */
    public final H1.a f2174f;

    /* renamed from: g, reason: collision with root package name */
    public final H1.a f2175g;

    /* renamed from: h, reason: collision with root package name */
    public final H1.a f2176h;

    /* renamed from: i, reason: collision with root package name */
    public final H1.a f2177i;

    /* renamed from: j, reason: collision with root package name */
    public final H1.a f2178j;

    /* renamed from: k, reason: collision with root package name */
    public final H1.a f2179k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f2180l;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final b a(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            Map b7 = b(file);
            kotlin.jvm.internal.g gVar = null;
            if (b7 == null) {
                return null;
            }
            try {
                return new b(b7, gVar);
            } catch (Exception unused) {
                return null;
            }
        }

        public final Map b(File file) {
            Map c7 = j.c(file);
            if (c7 == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            Map a7 = b.a();
            for (Map.Entry entry : c7.entrySet()) {
                String str = (String) entry.getKey();
                if (a7.containsKey(entry.getKey()) && (str = (String) a7.get(entry.getKey())) == null) {
                    return null;
                }
                hashMap.put(str, entry.getValue());
            }
            return hashMap;
        }
    }

    static {
        HashMap e7;
        e7 = F.e(q.a("embedding.weight", "embed.weight"), q.a("dense1.weight", "fc1.weight"), q.a("dense2.weight", "fc2.weight"), q.a("dense3.weight", "fc3.weight"), q.a("dense1.bias", "fc1.bias"), q.a("dense2.bias", "fc2.bias"), q.a("dense3.bias", "fc3.bias"));
        f2168n = e7;
    }

    public b(Map map) {
        Set<String> f7;
        Object obj = map.get("embed.weight");
        if (obj == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f2169a = (H1.a) obj;
        i iVar = i.f2202a;
        Object obj2 = map.get("convs.0.weight");
        if (obj2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f2170b = i.l((H1.a) obj2);
        Object obj3 = map.get("convs.1.weight");
        if (obj3 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f2171c = i.l((H1.a) obj3);
        Object obj4 = map.get("convs.2.weight");
        if (obj4 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f2172d = i.l((H1.a) obj4);
        Object obj5 = map.get("convs.0.bias");
        if (obj5 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f2173e = (H1.a) obj5;
        Object obj6 = map.get("convs.1.bias");
        if (obj6 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f2174f = (H1.a) obj6;
        Object obj7 = map.get("convs.2.bias");
        if (obj7 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f2175g = (H1.a) obj7;
        Object obj8 = map.get("fc1.weight");
        if (obj8 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f2176h = i.k((H1.a) obj8);
        Object obj9 = map.get("fc2.weight");
        if (obj9 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f2177i = i.k((H1.a) obj9);
        Object obj10 = map.get("fc1.bias");
        if (obj10 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f2178j = (H1.a) obj10;
        Object obj11 = map.get("fc2.bias");
        if (obj11 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f2179k = (H1.a) obj11;
        this.f2180l = new HashMap();
        f7 = K.f(f.a.MTML_INTEGRITY_DETECT.e(), f.a.MTML_APP_EVENT_PREDICTION.e());
        for (String str : f7) {
            String i7 = Intrinsics.i(str, ".weight");
            String i8 = Intrinsics.i(str, ".bias");
            H1.a aVar = (H1.a) map.get(i7);
            H1.a aVar2 = (H1.a) map.get(i8);
            if (aVar != null) {
                this.f2180l.put(i7, i.k(aVar));
            }
            if (aVar2 != null) {
                this.f2180l.put(i8, aVar2);
            }
        }
    }

    public static final /* synthetic */ Map a() {
        if (T1.a.d(b.class)) {
            return null;
        }
        try {
            return f2168n;
        } catch (Throwable th) {
            T1.a.b(th, b.class);
            return null;
        }
    }

    public final H1.a b(H1.a dense, String[] texts, String task) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(dense, "dense");
            Intrinsics.checkNotNullParameter(texts, "texts");
            Intrinsics.checkNotNullParameter(task, "task");
            i iVar = i.f2202a;
            H1.a c7 = i.c(i.e(texts, 128, this.f2169a), this.f2170b);
            i.a(c7, this.f2173e);
            i.i(c7);
            H1.a c8 = i.c(c7, this.f2171c);
            i.a(c8, this.f2174f);
            i.i(c8);
            H1.a g7 = i.g(c8, 2);
            H1.a c9 = i.c(g7, this.f2172d);
            i.a(c9, this.f2175g);
            i.i(c9);
            H1.a g8 = i.g(c7, c7.b(1));
            H1.a g9 = i.g(g7, g7.b(1));
            H1.a g10 = i.g(c9, c9.b(1));
            i.f(g8, 1);
            i.f(g9, 1);
            i.f(g10, 1);
            H1.a d7 = i.d(i.b(new H1.a[]{g8, g9, g10, dense}), this.f2176h, this.f2178j);
            i.i(d7);
            H1.a d8 = i.d(d7, this.f2177i, this.f2179k);
            i.i(d8);
            H1.a aVar = (H1.a) this.f2180l.get(Intrinsics.i(task, ".weight"));
            H1.a aVar2 = (H1.a) this.f2180l.get(Intrinsics.i(task, ".bias"));
            if (aVar != null && aVar2 != null) {
                H1.a d9 = i.d(d8, aVar, aVar2);
                i.j(d9);
                return d9;
            }
            return null;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public /* synthetic */ b(Map map, kotlin.jvm.internal.g gVar) {
        this(map);
    }
}
