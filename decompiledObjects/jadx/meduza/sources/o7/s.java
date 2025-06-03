package o7;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public final class s<K, V> extends e<K, V> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final K f12046a;

    /* renamed from: b, reason: collision with root package name */
    public final V f12047b;

    /* JADX WARN: Multi-variable type inference failed */
    public s(Object obj, List list) {
        this.f12046a = obj;
        this.f12047b = list;
    }

    @Override // o7.e, java.util.Map.Entry
    public final K getKey() {
        return this.f12046a;
    }

    @Override // o7.e, java.util.Map.Entry
    public final V getValue() {
        return this.f12047b;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }
}
