package j8;

import j8.b0;

/* loaded from: classes.dex */
public final class c extends b0.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f8559a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8560b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8561c;

    public c(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f8559a = str;
        this.f8560b = str2;
        this.f8561c = str3;
    }

    @Override // j8.b0.a
    public final String a() {
        return this.f8559a;
    }

    @Override // j8.b0.a
    public final String b() {
        return this.f8561c;
    }

    @Override // j8.b0.a
    public final String c() {
        return this.f8560b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.a)) {
            return false;
        }
        b0.a aVar = (b0.a) obj;
        if (this.f8559a.equals(aVar.a()) && ((str = this.f8560b) != null ? str.equals(aVar.c()) : aVar.c() == null)) {
            String str2 = this.f8561c;
            String b10 = aVar.b();
            if (str2 == null) {
                if (b10 == null) {
                    return true;
                }
            } else if (str2.equals(b10)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f8559a.hashCode() ^ 1000003) * 1000003;
        String str = this.f8560b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f8561c;
        return hashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("InstallIds{crashlyticsInstallId=");
        l10.append(this.f8559a);
        l10.append(", firebaseInstallationId=");
        l10.append(this.f8560b);
        l10.append(", firebaseAuthenticationToken=");
        return defpackage.g.f(l10, this.f8561c, "}");
    }
}
