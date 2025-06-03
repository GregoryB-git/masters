package ea;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f4860a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4861b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4862c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4863d;

    /* renamed from: e, reason: collision with root package name */
    public final r f4864e;
    public final a f;

    public b(String str, String str2, String str3, a aVar) {
        r rVar = r.LOG_ENVIRONMENT_PROD;
        this.f4860a = str;
        this.f4861b = str2;
        this.f4862c = "2.0.8";
        this.f4863d = str3;
        this.f4864e = rVar;
        this.f = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return ec.i.a(this.f4860a, bVar.f4860a) && ec.i.a(this.f4861b, bVar.f4861b) && ec.i.a(this.f4862c, bVar.f4862c) && ec.i.a(this.f4863d, bVar.f4863d) && this.f4864e == bVar.f4864e && ec.i.a(this.f, bVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.f4864e.hashCode() + a0.j.e(this.f4863d, a0.j.e(this.f4862c, a0.j.e(this.f4861b, this.f4860a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("ApplicationInfo(appId=");
        l10.append(this.f4860a);
        l10.append(", deviceModel=");
        l10.append(this.f4861b);
        l10.append(", sessionSdkVersion=");
        l10.append(this.f4862c);
        l10.append(", osVersion=");
        l10.append(this.f4863d);
        l10.append(", logEnvironment=");
        l10.append(this.f4864e);
        l10.append(", androidAppInfo=");
        l10.append(this.f);
        l10.append(')');
        return l10.toString();
    }
}
