package t8;

import java.util.Comparator;
import t8.h;

/* loaded from: classes.dex */
public final class g<K, V> implements h<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public static final g f14655a = new g();

    @Override // t8.h
    public final h<K, V> a() {
        return this;
    }

    @Override // t8.h
    public final h<K, V> b(K k10, V v10, Comparator<K> comparator) {
        return new i(k10, v10);
    }

    @Override // t8.h
    public final h<K, V> c(K k10, Comparator<K> comparator) {
        return this;
    }

    @Override // t8.h
    public final h d(h.a aVar, j jVar, j jVar2) {
        return this;
    }

    @Override // t8.h
    public final boolean e() {
        return false;
    }

    @Override // t8.h
    public final h<K, V> f() {
        return this;
    }

    @Override // t8.h
    public final h<K, V> g() {
        return this;
    }

    @Override // t8.h
    public final K getKey() {
        return null;
    }

    @Override // t8.h
    public final V getValue() {
        return null;
    }

    @Override // t8.h
    public final h<K, V> h() {
        return this;
    }

    @Override // t8.h
    public final boolean isEmpty() {
        return true;
    }

    @Override // t8.h
    public final int size() {
        return 0;
    }
}
