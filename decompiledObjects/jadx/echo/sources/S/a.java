package S;

import S.d;
import W5.w;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    public final Map f5802a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f5803b;

    /* renamed from: S.a$a, reason: collision with other inner class name */
    public static final class C0089a extends l implements g6.l {

        /* renamed from: o, reason: collision with root package name */
        public static final C0089a f5804o = new C0089a();

        public C0089a() {
            super(1);
        }

        @Override // g6.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            return "  " + ((d.a) entry.getKey()).a() + " = " + entry.getValue();
        }
    }

    public a(Map preferencesMap, boolean z7) {
        Intrinsics.checkNotNullParameter(preferencesMap, "preferencesMap");
        this.f5802a = preferencesMap;
        this.f5803b = new AtomicBoolean(z7);
    }

    @Override // S.d
    public Map a() {
        Map unmodifiableMap = Collections.unmodifiableMap(this.f5802a);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        return unmodifiableMap;
    }

    @Override // S.d
    public Object b(d.a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f5802a.get(key);
    }

    public final void e() {
        if (!(!this.f5803b.get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return Intrinsics.a(this.f5802a, ((a) obj).f5802a);
        }
        return false;
    }

    public final void f() {
        this.f5803b.set(true);
    }

    public final void g(d.b... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        e();
        if (pairs.length <= 0) {
            return;
        }
        d.b bVar = pairs[0];
        throw null;
    }

    public final Object h(d.a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        e();
        return this.f5802a.remove(key);
    }

    public int hashCode() {
        return this.f5802a.hashCode();
    }

    public final void i(d.a key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        j(key, obj);
    }

    public final void j(d.a key, Object obj) {
        Map map;
        Set J6;
        Intrinsics.checkNotNullParameter(key, "key");
        e();
        if (obj == null) {
            h(key);
            return;
        }
        if (obj instanceof Set) {
            map = this.f5802a;
            J6 = w.J((Iterable) obj);
            obj = Collections.unmodifiableSet(J6);
            Intrinsics.checkNotNullExpressionValue(obj, "unmodifiableSet(value.toSet())");
        } else {
            map = this.f5802a;
        }
        map.put(key, obj);
    }

    public String toString() {
        String x7;
        x7 = w.x(this.f5802a.entrySet(), ",\n", "{\n", "\n}", 0, null, C0089a.f5804o, 24, null);
        return x7;
    }

    public /* synthetic */ a(Map map, boolean z7, int i7, kotlin.jvm.internal.g gVar) {
        this((i7 & 1) != 0 ? new LinkedHashMap() : map, (i7 & 2) != 0 ? true : z7);
    }
}
