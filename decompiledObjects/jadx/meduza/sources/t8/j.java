package t8;

import java.util.Comparator;
import t8.h;

/* loaded from: classes.dex */
public abstract class j<K, V> implements h<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final K f14659a;

    /* renamed from: b, reason: collision with root package name */
    public final V f14660b;

    /* renamed from: c, reason: collision with root package name */
    public h<K, V> f14661c;

    /* renamed from: d, reason: collision with root package name */
    public final h<K, V> f14662d;

    public j(K k10, V v10, h<K, V> hVar, h<K, V> hVar2) {
        this.f14659a = k10;
        this.f14660b = v10;
        this.f14661c = hVar == null ? g.f14655a : hVar;
        this.f14662d = hVar2 == null ? g.f14655a : hVar2;
    }

    @Override // t8.h
    public final h<K, V> a() {
        return this.f14661c;
    }

    @Override // t8.h
    public final h<K, V> b(K k10, V v10, Comparator<K> comparator) {
        int compare = comparator.compare(k10, this.f14659a);
        return (compare < 0 ? j(null, null, this.f14661c.b(k10, v10, comparator), null) : compare == 0 ? j(k10, v10, null, null) : j(null, null, null, this.f14662d.b(k10, v10, comparator))).l();
    }

    @Override // t8.h
    public final h<K, V> c(K k10, Comparator<K> comparator) {
        j<K, V> j10;
        if (comparator.compare(k10, this.f14659a) < 0) {
            j<K, V> n2 = (this.f14661c.isEmpty() || this.f14661c.e() || ((j) this.f14661c).f14661c.e()) ? this : n();
            j10 = n2.j(null, null, n2.f14661c.c(k10, comparator), null);
        } else {
            j<K, V> q10 = this.f14661c.e() ? q() : this;
            if (!q10.f14662d.isEmpty() && !q10.f14662d.e() && !((j) q10.f14662d).f14661c.e()) {
                q10 = q10.i();
                if (q10.f14661c.a().e()) {
                    q10 = q10.q().i();
                }
            }
            if (comparator.compare(k10, q10.f14659a) == 0) {
                if (q10.f14662d.isEmpty()) {
                    return g.f14655a;
                }
                h<K, V> g10 = q10.f14662d.g();
                q10 = q10.j(g10.getKey(), g10.getValue(), null, ((j) q10.f14662d).o());
            }
            j10 = q10.j(null, null, null, q10.f14662d.c(k10, comparator));
        }
        return j10.l();
    }

    @Override // t8.h
    public final h<K, V> f() {
        return this.f14662d;
    }

    @Override // t8.h
    public final h<K, V> g() {
        return this.f14661c.isEmpty() ? this : this.f14661c.g();
    }

    @Override // t8.h
    public final K getKey() {
        return this.f14659a;
    }

    @Override // t8.h
    public final V getValue() {
        return this.f14660b;
    }

    @Override // t8.h
    public final h<K, V> h() {
        return this.f14662d.isEmpty() ? this : this.f14662d.h();
    }

    public final j<K, V> i() {
        h.a aVar = h.a.BLACK;
        h.a aVar2 = h.a.RED;
        h<K, V> hVar = this.f14661c;
        h d10 = hVar.d(hVar.e() ? aVar : aVar2, null, null);
        h<K, V> hVar2 = this.f14662d;
        h d11 = hVar2.d(hVar2.e() ? aVar : aVar2, null, null);
        if (!e()) {
            aVar = aVar2;
        }
        return d(aVar, d10, d11);
    }

    @Override // t8.h
    public final boolean isEmpty() {
        return false;
    }

    public abstract j<K, V> j(K k10, V v10, h<K, V> hVar, h<K, V> hVar2);

    @Override // t8.h
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final j d(h.a aVar, h hVar, h hVar2) {
        K k10 = this.f14659a;
        V v10 = this.f14660b;
        if (hVar == null) {
            hVar = this.f14661c;
        }
        if (hVar2 == null) {
            hVar2 = this.f14662d;
        }
        return aVar == h.a.RED ? new i(k10, v10, hVar, hVar2) : new f(k10, v10, hVar, hVar2);
    }

    public final j<K, V> l() {
        j<K, V> p10 = (!this.f14662d.e() || this.f14661c.e()) ? this : p();
        if (p10.f14661c.e() && ((j) p10.f14661c).f14661c.e()) {
            p10 = p10.q();
        }
        return (p10.f14661c.e() && p10.f14662d.e()) ? p10.i() : p10;
    }

    public abstract h.a m();

    public final j<K, V> n() {
        j<K, V> i10 = i();
        return i10.f14662d.a().e() ? i10.j(null, null, null, ((j) i10.f14662d).q()).p().i() : i10;
    }

    public final h<K, V> o() {
        if (this.f14661c.isEmpty()) {
            return g.f14655a;
        }
        j<K, V> n2 = (this.f14661c.e() || this.f14661c.a().e()) ? this : n();
        return n2.j(null, null, ((j) n2.f14661c).o(), null).l();
    }

    public final j<K, V> p() {
        return (j) this.f14662d.d(m(), d(h.a.RED, null, ((j) this.f14662d).f14661c), null);
    }

    public final j<K, V> q() {
        return (j) this.f14661c.d(m(), null, d(h.a.RED, ((j) this.f14661c).f14662d, null));
    }

    public void r(j jVar) {
        this.f14661c = jVar;
    }
}
