package k9;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class o extends f {

    /* renamed from: d, reason: collision with root package name */
    public final j9.n f9171d;

    public o(j9.i iVar, j9.n nVar, m mVar, List<e> list) {
        super(iVar, mVar, list);
        this.f9171d = nVar;
    }

    @Override // k9.f
    public final d a(j9.m mVar, d dVar, u7.m mVar2) {
        j(mVar);
        if (!this.f9151b.b(mVar)) {
            return dVar;
        }
        HashMap h10 = h(mVar2, mVar);
        j9.n nVar = new j9.n(this.f9171d.b());
        nVar.g(h10);
        mVar.k(mVar.f8695d, nVar);
        mVar.f8697g = 1;
        mVar.f8695d = j9.q.f8701b;
        return null;
    }

    @Override // k9.f
    public final void b(j9.m mVar, i iVar) {
        j(mVar);
        j9.n nVar = new j9.n(this.f9171d.b());
        nVar.g(i(mVar, iVar.f9163b));
        mVar.k(iVar.f9162a, nVar);
        mVar.f8697g = 2;
    }

    @Override // k9.f
    public final d d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return e(oVar) && this.f9171d.equals(oVar.f9171d) && this.f9152c.equals(oVar.f9152c);
    }

    public final int hashCode() {
        return this.f9171d.hashCode() + (f() * 31);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("SetMutation{");
        l10.append(g());
        l10.append(", value=");
        l10.append(this.f9171d);
        l10.append("}");
        return l10.toString();
    }
}
