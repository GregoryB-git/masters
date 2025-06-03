package t8;

import t8.h;

/* loaded from: classes.dex */
public final class i<K, V> extends j<K, V> {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(K r2, V r3) {
        /*
            r1 = this;
            t8.g r0 = t8.g.f14655a
            r1.<init>(r2, r3, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t8.i.<init>(java.lang.Object, java.lang.Object):void");
    }

    public i(K k10, V v10, h<K, V> hVar, h<K, V> hVar2) {
        super(k10, v10, hVar, hVar2);
    }

    @Override // t8.h
    public final boolean e() {
        return true;
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
        return new i(k10, v10, hVar, hVar2);
    }

    @Override // t8.j
    public final h.a m() {
        return h.a.RED;
    }

    @Override // t8.h
    public final int size() {
        return this.f14662d.size() + this.f14661c.size() + 1;
    }
}
