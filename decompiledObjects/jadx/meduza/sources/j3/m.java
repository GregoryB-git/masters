package j3;

import j3.w;

/* loaded from: classes.dex */
public final class m extends w {

    /* renamed from: a, reason: collision with root package name */
    public final w.b f8371a;

    /* renamed from: b, reason: collision with root package name */
    public final w.a f8372b;

    public m(w.b bVar, w.a aVar) {
        this.f8371a = bVar;
        this.f8372b = aVar;
    }

    @Override // j3.w
    public final w.a a() {
        return this.f8372b;
    }

    @Override // j3.w
    public final w.b b() {
        return this.f8371a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        w.b bVar = this.f8371a;
        if (bVar != null ? bVar.equals(wVar.b()) : wVar.b() == null) {
            w.a aVar = this.f8372b;
            w.a a10 = wVar.a();
            if (aVar == null) {
                if (a10 == null) {
                    return true;
                }
            } else if (aVar.equals(a10)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        w.b bVar = this.f8371a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        w.a aVar = this.f8372b;
        return hashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("NetworkConnectionInfo{networkType=");
        l10.append(this.f8371a);
        l10.append(", mobileSubtype=");
        l10.append(this.f8372b);
        l10.append("}");
        return l10.toString();
    }
}
