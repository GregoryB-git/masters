package J3;

import J3.D;

/* loaded from: classes.dex */
public final class y extends D.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3028a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3029b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3030c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3031d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3032e;

    /* renamed from: f, reason: collision with root package name */
    public final E3.e f3033f;

    public y(String str, String str2, String str3, String str4, int i7, E3.e eVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f3028a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f3029b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f3030c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f3031d = str4;
        this.f3032e = i7;
        if (eVar == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f3033f = eVar;
    }

    @Override // J3.D.a
    public String a() {
        return this.f3028a;
    }

    @Override // J3.D.a
    public int c() {
        return this.f3032e;
    }

    @Override // J3.D.a
    public E3.e d() {
        return this.f3033f;
    }

    @Override // J3.D.a
    public String e() {
        return this.f3031d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D.a)) {
            return false;
        }
        D.a aVar = (D.a) obj;
        return this.f3028a.equals(aVar.a()) && this.f3029b.equals(aVar.f()) && this.f3030c.equals(aVar.g()) && this.f3031d.equals(aVar.e()) && this.f3032e == aVar.c() && this.f3033f.equals(aVar.d());
    }

    @Override // J3.D.a
    public String f() {
        return this.f3029b;
    }

    @Override // J3.D.a
    public String g() {
        return this.f3030c;
    }

    public int hashCode() {
        return ((((((((((this.f3028a.hashCode() ^ 1000003) * 1000003) ^ this.f3029b.hashCode()) * 1000003) ^ this.f3030c.hashCode()) * 1000003) ^ this.f3031d.hashCode()) * 1000003) ^ this.f3032e) * 1000003) ^ this.f3033f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f3028a + ", versionCode=" + this.f3029b + ", versionName=" + this.f3030c + ", installUuid=" + this.f3031d + ", deliveryMechanism=" + this.f3032e + ", developmentPlatformProvider=" + this.f3033f + "}";
    }
}
