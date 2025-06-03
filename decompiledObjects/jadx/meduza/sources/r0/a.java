package r0;

import dc.l;
import ec.i;
import ec.j;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import r0.d;
import sb.q;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    public final Map<d.a<?>, Object> f13505a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f13506b;

    /* renamed from: r0.a$a, reason: collision with other inner class name */
    public static final class C0203a extends j implements l<Map.Entry<d.a<?>, Object>, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0203a f13507a = new C0203a();

        public C0203a() {
            super(1);
        }

        @Override // dc.l
        public final CharSequence invoke(Map.Entry<d.a<?>, Object> entry) {
            Map.Entry<d.a<?>, Object> entry2 = entry;
            i.e(entry2, "entry");
            return "  " + entry2.getKey().f13513a + " = " + entry2.getValue();
        }
    }

    public a() {
        this(false, 3);
    }

    public a(Map<d.a<?>, Object> map, boolean z10) {
        i.e(map, "preferencesMap");
        this.f13505a = map;
        this.f13506b = new AtomicBoolean(z10);
    }

    public /* synthetic */ a(boolean z10, int i10) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : null, (i10 & 2) != 0 ? true : z10);
    }

    @Override // r0.d
    public final Map<d.a<?>, Object> a() {
        Map<d.a<?>, Object> unmodifiableMap = Collections.unmodifiableMap(this.f13505a);
        i.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        return unmodifiableMap;
    }

    @Override // r0.d
    public final <T> T b(d.a<T> aVar) {
        i.e(aVar, Constants.KEY);
        return (T) this.f13505a.get(aVar);
    }

    public final void c() {
        if (!(!this.f13506b.get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public final <T> void d(d.a<T> aVar, T t) {
        i.e(aVar, Constants.KEY);
        e(aVar, t);
    }

    public final void e(d.a<?> aVar, Object obj) {
        Map<d.a<?>, Object> map;
        i.e(aVar, Constants.KEY);
        c();
        if (obj == null) {
            c();
            this.f13505a.remove(aVar);
            return;
        }
        if (obj instanceof Set) {
            map = this.f13505a;
            obj = Collections.unmodifiableSet(q.x((Iterable) obj));
            i.d(obj, "unmodifiableSet(value.toSet())");
        } else {
            map = this.f13505a;
        }
        map.put(aVar, obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return i.a(this.f13505a, ((a) obj).f13505a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13505a.hashCode();
    }

    public final String toString() {
        return q.p(this.f13505a.entrySet(), ",\n", "{\n", "\n}", C0203a.f13507a, 24);
    }
}
