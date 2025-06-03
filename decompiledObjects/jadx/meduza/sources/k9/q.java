package k9;

/* loaded from: classes.dex */
public final class q extends f {
    public q(j9.i iVar, m mVar) {
        super(iVar, mVar);
    }

    @Override // k9.f
    public final d a(j9.m mVar, d dVar, u7.m mVar2) {
        x6.b.T("VerifyMutation should only be used in Transactions.", new Object[0]);
        throw null;
    }

    @Override // k9.f
    public final void b(j9.m mVar, i iVar) {
        x6.b.T("VerifyMutation should only be used in Transactions.", new Object[0]);
        throw null;
    }

    @Override // k9.f
    public final d d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        return e((q) obj);
    }

    public final int hashCode() {
        return f();
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("VerifyMutation{");
        l10.append(g());
        l10.append("}");
        return l10.toString();
    }
}
