package n;

import java.util.HashMap;
import n.b;

/* loaded from: classes.dex */
public final class a<K, V> extends b<K, V> {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap<K, b.c<K, V>> f11163e = new HashMap<>();

    @Override // n.b
    public final b.c<K, V> a(K k10) {
        return this.f11163e.get(k10);
    }

    @Override // n.b
    public final V h(K k10, V v10) {
        b.c<K, V> a10 = a(k10);
        if (a10 != null) {
            return a10.f11169b;
        }
        HashMap<K, b.c<K, V>> hashMap = this.f11163e;
        b.c<K, V> cVar = new b.c<>(k10, v10);
        this.f11167d++;
        b.c<K, V> cVar2 = this.f11165b;
        if (cVar2 == null) {
            this.f11164a = cVar;
        } else {
            cVar2.f11170c = cVar;
            cVar.f11171d = cVar2;
        }
        this.f11165b = cVar;
        hashMap.put(k10, cVar);
        return null;
    }

    @Override // n.b
    public final V i(K k10) {
        V v10 = (V) super.i(k10);
        this.f11163e.remove(k10);
        return v10;
    }
}
