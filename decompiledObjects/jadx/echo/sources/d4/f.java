package d4;

import d4.k;
import d4.n;

/* loaded from: classes.dex */
public class f extends k {

    /* renamed from: q, reason: collision with root package name */
    public final Double f13296q;

    public f(Double d7, n nVar) {
        super(nVar);
        this.f13296q = d7;
    }

    @Override // d4.n
    public String O(n.b bVar) {
        return (T(bVar) + "number:") + Y3.m.c(this.f13296q.doubleValue());
    }

    @Override // d4.k
    public k.b S() {
        return k.b.Number;
    }

    @Override // d4.k
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public int s(f fVar) {
        return this.f13296q.compareTo(fVar.f13296q);
    }

    @Override // d4.n
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public f J(n nVar) {
        Y3.m.f(r.b(nVar));
        return new f(this.f13296q, nVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f13296q.equals(fVar.f13296q) && this.f13303o.equals(fVar.f13303o);
    }

    @Override // d4.n
    public Object getValue() {
        return this.f13296q;
    }

    public int hashCode() {
        return this.f13296q.hashCode() + this.f13303o.hashCode();
    }
}
