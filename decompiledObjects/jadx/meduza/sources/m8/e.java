package m8;

import m8.f0;

/* loaded from: classes.dex */
public final class e extends f0.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f10572a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10573b;

    public e(String str, String str2) {
        this.f10572a = str;
        this.f10573b = str2;
    }

    @Override // m8.f0.c
    public final String a() {
        return this.f10572a;
    }

    @Override // m8.f0.c
    public final String b() {
        return this.f10573b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.c)) {
            return false;
        }
        f0.c cVar = (f0.c) obj;
        return this.f10572a.equals(cVar.a()) && this.f10573b.equals(cVar.b());
    }

    public final int hashCode() {
        return ((this.f10572a.hashCode() ^ 1000003) * 1000003) ^ this.f10573b.hashCode();
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("CustomAttribute{key=");
        l10.append(this.f10572a);
        l10.append(", value=");
        return defpackage.g.f(l10, this.f10573b, "}");
    }
}
