package d4;

import d4.k;
import d4.n;

/* loaded from: classes.dex */
public class l extends k {

    /* renamed from: q, reason: collision with root package name */
    public final long f13311q;

    public l(Long l7, n nVar) {
        super(nVar);
        this.f13311q = l7.longValue();
    }

    @Override // d4.n
    public String O(n.b bVar) {
        return (T(bVar) + "number:") + Y3.m.c(this.f13311q);
    }

    @Override // d4.k
    public k.b S() {
        return k.b.Number;
    }

    @Override // d4.k
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public int s(l lVar) {
        return Y3.m.b(this.f13311q, lVar.f13311q);
    }

    @Override // d4.n
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public l J(n nVar) {
        return new l(Long.valueOf(this.f13311q), nVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f13311q == lVar.f13311q && this.f13303o.equals(lVar.f13303o);
    }

    @Override // d4.n
    public Object getValue() {
        return Long.valueOf(this.f13311q);
    }

    public int hashCode() {
        long j7 = this.f13311q;
        return ((int) (j7 ^ (j7 >>> 32))) + this.f13303o.hashCode();
    }
}
