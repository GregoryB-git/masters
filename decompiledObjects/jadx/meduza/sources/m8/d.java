package m8;

import m8.f0;

/* loaded from: classes.dex */
public final class d extends f0.a.AbstractC0150a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10561a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10562b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10563c;

    public d(String str, String str2, String str3) {
        this.f10561a = str;
        this.f10562b = str2;
        this.f10563c = str3;
    }

    @Override // m8.f0.a.AbstractC0150a
    public final String a() {
        return this.f10561a;
    }

    @Override // m8.f0.a.AbstractC0150a
    public final String b() {
        return this.f10563c;
    }

    @Override // m8.f0.a.AbstractC0150a
    public final String c() {
        return this.f10562b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.a.AbstractC0150a)) {
            return false;
        }
        f0.a.AbstractC0150a abstractC0150a = (f0.a.AbstractC0150a) obj;
        return this.f10561a.equals(abstractC0150a.a()) && this.f10562b.equals(abstractC0150a.c()) && this.f10563c.equals(abstractC0150a.b());
    }

    public final int hashCode() {
        return ((((this.f10561a.hashCode() ^ 1000003) * 1000003) ^ this.f10562b.hashCode()) * 1000003) ^ this.f10563c.hashCode();
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("BuildIdMappingForArch{arch=");
        l10.append(this.f10561a);
        l10.append(", libraryName=");
        l10.append(this.f10562b);
        l10.append(", buildId=");
        return defpackage.g.f(l10, this.f10563c, "}");
    }
}
