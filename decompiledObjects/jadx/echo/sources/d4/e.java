package d4;

import d4.k;
import d4.n;
import java.util.Map;

/* loaded from: classes.dex */
public class e extends k {

    /* renamed from: q, reason: collision with root package name */
    public Map f13295q;

    public e(Map map, n nVar) {
        super(nVar);
        this.f13295q = map;
    }

    @Override // d4.n
    public String O(n.b bVar) {
        return T(bVar) + "deferredValue:" + this.f13295q;
    }

    @Override // d4.k
    public k.b S() {
        return k.b.DeferredValue;
    }

    @Override // d4.k
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public int s(e eVar) {
        return 0;
    }

    @Override // d4.n
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public e J(n nVar) {
        Y3.m.f(r.b(nVar));
        return new e(this.f13295q, nVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f13295q.equals(eVar.f13295q) && this.f13303o.equals(eVar.f13303o);
    }

    @Override // d4.n
    public Object getValue() {
        return this.f13295q;
    }

    public int hashCode() {
        return this.f13295q.hashCode() + this.f13303o.hashCode();
    }
}
