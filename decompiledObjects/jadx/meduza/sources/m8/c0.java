package m8;

import m8.g0;

/* loaded from: classes.dex */
public final class c0 extends g0.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10556a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10557b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10558c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10559d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10560e;
    public final g8.c f;

    public c0(String str, String str2, String str3, String str4, int i10, g8.c cVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f10556a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f10557b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f10558c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f10559d = str4;
        this.f10560e = i10;
        if (cVar == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f = cVar;
    }

    @Override // m8.g0.a
    public final String a() {
        return this.f10556a;
    }

    @Override // m8.g0.a
    public final int b() {
        return this.f10560e;
    }

    @Override // m8.g0.a
    public final g8.c c() {
        return this.f;
    }

    @Override // m8.g0.a
    public final String d() {
        return this.f10559d;
    }

    @Override // m8.g0.a
    public final String e() {
        return this.f10557b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.a)) {
            return false;
        }
        g0.a aVar = (g0.a) obj;
        return this.f10556a.equals(aVar.a()) && this.f10557b.equals(aVar.e()) && this.f10558c.equals(aVar.f()) && this.f10559d.equals(aVar.d()) && this.f10560e == aVar.b() && this.f.equals(aVar.c());
    }

    @Override // m8.g0.a
    public final String f() {
        return this.f10558c;
    }

    public final int hashCode() {
        return ((((((((((this.f10556a.hashCode() ^ 1000003) * 1000003) ^ this.f10557b.hashCode()) * 1000003) ^ this.f10558c.hashCode()) * 1000003) ^ this.f10559d.hashCode()) * 1000003) ^ this.f10560e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("AppData{appIdentifier=");
        l10.append(this.f10556a);
        l10.append(", versionCode=");
        l10.append(this.f10557b);
        l10.append(", versionName=");
        l10.append(this.f10558c);
        l10.append(", installUuid=");
        l10.append(this.f10559d);
        l10.append(", deliveryMechanism=");
        l10.append(this.f10560e);
        l10.append(", developmentPlatformProvider=");
        l10.append(this.f);
        l10.append("}");
        return l10.toString();
    }
}
