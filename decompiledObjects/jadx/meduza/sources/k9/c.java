package k9;

/* loaded from: classes.dex */
public final class c extends f {
    public c(j9.i iVar, m mVar) {
        super(iVar, mVar);
    }

    @Override // k9.f
    public final d a(j9.m mVar, d dVar, u7.m mVar2) {
        j(mVar);
        if (!this.f9151b.b(mVar)) {
            return dVar;
        }
        mVar.l(mVar.f8695d);
        mVar.f8697g = 1;
        mVar.f8695d = j9.q.f8701b;
        return null;
    }

    @Override // k9.f
    public final void b(j9.m mVar, i iVar) {
        j(mVar);
        x6.b.Z("Transform results received by DeleteMutation.", iVar.f9163b.isEmpty(), new Object[0]);
        mVar.l(iVar.f9162a);
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
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return e((c) obj);
    }

    public final int hashCode() {
        return f();
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("DeleteMutation{");
        l10.append(g());
        l10.append("}");
        return l10.toString();
    }
}
