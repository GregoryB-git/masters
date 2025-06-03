package j3;

/* loaded from: classes.dex */
public final class i extends s {

    /* renamed from: a, reason: collision with root package name */
    public final r f8347a;

    public i(r rVar) {
        this.f8347a = rVar;
    }

    @Override // j3.s
    public final r a() {
        return this.f8347a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        r rVar = this.f8347a;
        r a10 = ((s) obj).a();
        return rVar == null ? a10 == null : rVar.equals(a10);
    }

    public final int hashCode() {
        r rVar = this.f8347a;
        return (rVar == null ? 0 : rVar.hashCode()) ^ 1000003;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("ExternalPrivacyContext{prequest=");
        l10.append(this.f8347a);
        l10.append("}");
        return l10.toString();
    }
}
