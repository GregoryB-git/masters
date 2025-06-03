package j8;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final String f8665a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8666b;

    public z(String str, String str2) {
        this.f8665a = str;
        this.f8666b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return ec.i.a(this.f8665a, zVar.f8665a) && ec.i.a(this.f8666b, zVar.f8666b);
    }

    public final int hashCode() {
        String str = this.f8665a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f8666b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("FirebaseInstallationId(fid=");
        l10.append(this.f8665a);
        l10.append(", authToken=");
        l10.append(this.f8666b);
        l10.append(')');
        return l10.toString();
    }
}
