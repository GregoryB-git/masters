package j3;

import j3.o;

/* loaded from: classes.dex */
public final class e extends o {

    /* renamed from: a, reason: collision with root package name */
    public final o.a f8340a;

    /* renamed from: b, reason: collision with root package name */
    public final a f8341b;

    public e(o.a aVar, a aVar2) {
        this.f8340a = aVar;
        this.f8341b = aVar2;
    }

    @Override // j3.o
    public final a a() {
        return this.f8341b;
    }

    @Override // j3.o
    public final o.a b() {
        return this.f8340a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.a aVar = this.f8340a;
        if (aVar != null ? aVar.equals(oVar.b()) : oVar.b() == null) {
            a aVar2 = this.f8341b;
            a a10 = oVar.a();
            if (aVar2 == null) {
                if (a10 == null) {
                    return true;
                }
            } else if (aVar2.equals(a10)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        o.a aVar = this.f8340a;
        int hashCode = ((aVar == null ? 0 : aVar.hashCode()) ^ 1000003) * 1000003;
        a aVar2 = this.f8341b;
        return hashCode ^ (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("ClientInfo{clientType=");
        l10.append(this.f8340a);
        l10.append(", androidClientInfo=");
        l10.append(this.f8341b);
        l10.append("}");
        return l10.toString();
    }
}
