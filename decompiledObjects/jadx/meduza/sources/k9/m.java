package k9;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public static final m f9167c = new m(null, null);

    /* renamed from: a, reason: collision with root package name */
    public final j9.q f9168a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f9169b;

    public m(j9.q qVar, Boolean bool) {
        x6.b.Z("Precondition can specify \"exists\" or \"updateTime\" but not both", qVar == null || bool == null, new Object[0]);
        this.f9168a = qVar;
        this.f9169b = bool;
    }

    public static m a(boolean z10) {
        return new m(null, Boolean.valueOf(z10));
    }

    public final boolean b(j9.m mVar) {
        j9.q qVar = this.f9168a;
        if (qVar != null) {
            return mVar.b() && mVar.f8695d.equals(this.f9168a);
        }
        Boolean bool = this.f9169b;
        if (bool != null) {
            return bool.booleanValue() == mVar.b();
        }
        x6.b.Z("Precondition should be empty", qVar == null && bool == null, new Object[0]);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        j9.q qVar = this.f9168a;
        if (qVar == null ? mVar.f9168a != null : !qVar.equals(mVar.f9168a)) {
            return false;
        }
        Boolean bool = this.f9169b;
        Boolean bool2 = mVar.f9169b;
        return bool != null ? bool.equals(bool2) : bool2 == null;
    }

    public final int hashCode() {
        j9.q qVar = this.f9168a;
        int hashCode = (qVar != null ? qVar.hashCode() : 0) * 31;
        Boolean bool = this.f9169b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l10;
        Object obj;
        j9.q qVar = this.f9168a;
        if (qVar == null && this.f9169b == null) {
            return "Precondition{<none>}";
        }
        if (qVar != null) {
            l10 = defpackage.f.l("Precondition{updateTime=");
            obj = this.f9168a;
        } else {
            if (this.f9169b == null) {
                x6.b.T("Invalid Precondition", new Object[0]);
                throw null;
            }
            l10 = defpackage.f.l("Precondition{exists=");
            obj = this.f9169b;
        }
        l10.append(obj);
        l10.append("}");
        return l10.toString();
    }
}
