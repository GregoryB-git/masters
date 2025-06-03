package m8;

import m8.f0;

/* loaded from: classes.dex */
public final class i extends f0.e.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10605a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10606b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10607c;

    /* renamed from: d, reason: collision with root package name */
    public final f0.e.a.AbstractC0151a f10608d = null;

    /* renamed from: e, reason: collision with root package name */
    public final String f10609e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10610g;

    public i(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f10605a = str;
        this.f10606b = str2;
        this.f10607c = str3;
        this.f10609e = str4;
        this.f = str5;
        this.f10610g = str6;
    }

    @Override // m8.f0.e.a
    public final String a() {
        return this.f;
    }

    @Override // m8.f0.e.a
    public final String b() {
        return this.f10610g;
    }

    @Override // m8.f0.e.a
    public final String c() {
        return this.f10607c;
    }

    @Override // m8.f0.e.a
    public final String d() {
        return this.f10605a;
    }

    @Override // m8.f0.e.a
    public final String e() {
        return this.f10609e;
    }

    public final boolean equals(Object obj) {
        String str;
        f0.e.a.AbstractC0151a abstractC0151a;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.a)) {
            return false;
        }
        f0.e.a aVar = (f0.e.a) obj;
        if (this.f10605a.equals(aVar.d()) && this.f10606b.equals(aVar.g()) && ((str = this.f10607c) != null ? str.equals(aVar.c()) : aVar.c() == null) && ((abstractC0151a = this.f10608d) != null ? abstractC0151a.equals(aVar.f()) : aVar.f() == null) && ((str2 = this.f10609e) != null ? str2.equals(aVar.e()) : aVar.e() == null) && ((str3 = this.f) != null ? str3.equals(aVar.a()) : aVar.a() == null)) {
            String str4 = this.f10610g;
            String b10 = aVar.b();
            if (str4 == null) {
                if (b10 == null) {
                    return true;
                }
            } else if (str4.equals(b10)) {
                return true;
            }
        }
        return false;
    }

    @Override // m8.f0.e.a
    public final f0.e.a.AbstractC0151a f() {
        return this.f10608d;
    }

    @Override // m8.f0.e.a
    public final String g() {
        return this.f10606b;
    }

    public final int hashCode() {
        int hashCode = (((this.f10605a.hashCode() ^ 1000003) * 1000003) ^ this.f10606b.hashCode()) * 1000003;
        String str = this.f10607c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        f0.e.a.AbstractC0151a abstractC0151a = this.f10608d;
        int hashCode3 = (hashCode2 ^ (abstractC0151a == null ? 0 : abstractC0151a.hashCode())) * 1000003;
        String str2 = this.f10609e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f10610g;
        return hashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("Application{identifier=");
        l10.append(this.f10605a);
        l10.append(", version=");
        l10.append(this.f10606b);
        l10.append(", displayVersion=");
        l10.append(this.f10607c);
        l10.append(", organization=");
        l10.append(this.f10608d);
        l10.append(", installationUuid=");
        l10.append(this.f10609e);
        l10.append(", developmentPlatform=");
        l10.append(this.f);
        l10.append(", developmentPlatformVersion=");
        return defpackage.g.f(l10, this.f10610g, "}");
    }
}
