package j3;

import j3.p;

/* loaded from: classes.dex */
public final class f extends p {

    /* renamed from: a, reason: collision with root package name */
    public final s f8342a;

    /* renamed from: b, reason: collision with root package name */
    public final p.a f8343b;

    public f(s sVar, p.a aVar) {
        this.f8342a = sVar;
        this.f8343b = aVar;
    }

    @Override // j3.p
    public final s a() {
        return this.f8342a;
    }

    @Override // j3.p
    public final p.a b() {
        return this.f8343b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        s sVar = this.f8342a;
        if (sVar != null ? sVar.equals(pVar.a()) : pVar.a() == null) {
            p.a aVar = this.f8343b;
            p.a b10 = pVar.b();
            if (aVar == null) {
                if (b10 == null) {
                    return true;
                }
            } else if (aVar.equals(b10)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        s sVar = this.f8342a;
        int hashCode = ((sVar == null ? 0 : sVar.hashCode()) ^ 1000003) * 1000003;
        p.a aVar = this.f8343b;
        return hashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("ComplianceData{privacyContext=");
        l10.append(this.f8342a);
        l10.append(", productIdOrigin=");
        l10.append(this.f8343b);
        l10.append("}");
        return l10.toString();
    }
}
