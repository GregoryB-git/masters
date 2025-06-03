package b1;

import java.util.Iterator;
import java.util.Map;
import n.b;

/* loaded from: classes.dex */
public final class u<T> extends w<T> {

    /* renamed from: a, reason: collision with root package name */
    public n.b<t<?>, a<?>> f1797a = new n.b<>();

    public static class a<V> implements x<V> {

        /* renamed from: a, reason: collision with root package name */
        public final t<V> f1798a;

        /* renamed from: b, reason: collision with root package name */
        public final x<? super V> f1799b;

        /* renamed from: c, reason: collision with root package name */
        public int f1800c = -1;

        public a(t tVar, y2.k kVar) {
            this.f1798a = tVar;
            this.f1799b = kVar;
        }

        @Override // b1.x
        public final void a(V v10) {
            if (this.f1800c != this.f1798a.getVersion()) {
                this.f1800c = this.f1798a.getVersion();
                this.f1799b.a(v10);
            }
        }
    }

    @Override // b1.t
    public final void onActive() {
        Iterator<Map.Entry<t<?>, a<?>>> it = this.f1797a.iterator();
        while (true) {
            b.e eVar = (b.e) it;
            if (!eVar.hasNext()) {
                return;
            }
            a aVar = (a) ((Map.Entry) eVar.next()).getValue();
            aVar.f1798a.observeForever(aVar);
        }
    }

    @Override // b1.t
    public final void onInactive() {
        Iterator<Map.Entry<t<?>, a<?>>> it = this.f1797a.iterator();
        while (true) {
            b.e eVar = (b.e) it;
            if (!eVar.hasNext()) {
                return;
            }
            a aVar = (a) ((Map.Entry) eVar.next()).getValue();
            aVar.f1798a.removeObserver(aVar);
        }
    }
}
