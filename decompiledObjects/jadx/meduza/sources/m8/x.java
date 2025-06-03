package m8;

import m8.f0;

/* loaded from: classes.dex */
public final class x extends f0.e.d.AbstractC0160e.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f10712a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10713b;

    public x(String str, String str2) {
        this.f10712a = str;
        this.f10713b = str2;
    }

    @Override // m8.f0.e.d.AbstractC0160e.b
    public final String a() {
        return this.f10712a;
    }

    @Override // m8.f0.e.d.AbstractC0160e.b
    public final String b() {
        return this.f10713b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.AbstractC0160e.b)) {
            return false;
        }
        f0.e.d.AbstractC0160e.b bVar = (f0.e.d.AbstractC0160e.b) obj;
        return this.f10712a.equals(bVar.a()) && this.f10713b.equals(bVar.b());
    }

    public final int hashCode() {
        return ((this.f10712a.hashCode() ^ 1000003) * 1000003) ^ this.f10713b.hashCode();
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("RolloutVariant{rolloutId=");
        l10.append(this.f10712a);
        l10.append(", variantId=");
        return defpackage.g.f(l10, this.f10713b, "}");
    }
}
