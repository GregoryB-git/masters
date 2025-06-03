package d4;

import d4.k;
import d4.n;

/* renamed from: d4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1226a extends k {

    /* renamed from: q, reason: collision with root package name */
    public final boolean f13268q;

    public C1226a(Boolean bool, n nVar) {
        super(nVar);
        this.f13268q = bool.booleanValue();
    }

    @Override // d4.n
    public String O(n.b bVar) {
        return T(bVar) + "boolean:" + this.f13268q;
    }

    @Override // d4.k
    public k.b S() {
        return k.b.Boolean;
    }

    @Override // d4.k
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public int s(C1226a c1226a) {
        boolean z7 = this.f13268q;
        if (z7 == c1226a.f13268q) {
            return 0;
        }
        return z7 ? 1 : -1;
    }

    @Override // d4.n
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public C1226a J(n nVar) {
        return new C1226a(Boolean.valueOf(this.f13268q), nVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1226a)) {
            return false;
        }
        C1226a c1226a = (C1226a) obj;
        return this.f13268q == c1226a.f13268q && this.f13303o.equals(c1226a.f13303o);
    }

    @Override // d4.n
    public Object getValue() {
        return Boolean.valueOf(this.f13268q);
    }

    public int hashCode() {
        boolean z7 = this.f13268q;
        return (z7 ? 1 : 0) + this.f13303o.hashCode();
    }
}
