package t8;

import t8.h;

/* loaded from: classes.dex */
public final class f<K, V> extends j<K, V> {

    /* renamed from: e, reason: collision with root package name */
    public int f14654e;

    public f(K k10, V v10, h<K, V> hVar, h<K, V> hVar2) {
        super(k10, v10, hVar, hVar2);
        this.f14654e = -1;
    }

    @Override // t8.h
    public final boolean e() {
        return false;
    }

    @Override // t8.j
    public final j<K, V> j(K k10, V v10, h<K, V> hVar, h<K, V> hVar2) {
        if (k10 == null) {
            k10 = this.f14659a;
        }
        if (v10 == null) {
            v10 = this.f14660b;
        }
        if (hVar == null) {
            hVar = this.f14661c;
        }
        if (hVar2 == null) {
            hVar2 = this.f14662d;
        }
        return new f(k10, v10, hVar, hVar2);
    }

    @Override // t8.j
    public final h.a m() {
        return h.a.BLACK;
    }

    @Override // t8.j
    public final void r(j jVar) {
        if (this.f14654e != -1) {
            throw new IllegalStateException("Can't set left after using size");
        }
        this.f14661c = jVar;
    }

    @Override // t8.h
    public final int size() {
        if (this.f14654e == -1) {
            this.f14654e = this.f14662d.size() + this.f14661c.size() + 1;
        }
        return this.f14654e;
    }
}
