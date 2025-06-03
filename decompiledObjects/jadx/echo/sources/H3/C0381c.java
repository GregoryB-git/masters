package H3;

import H3.D;

/* renamed from: H3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0381c extends D.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2252a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2253b;

    public C0381c(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f2252a = str;
        this.f2253b = str2;
    }

    @Override // H3.D.a
    public String c() {
        return this.f2252a;
    }

    @Override // H3.D.a
    public String d() {
        return this.f2253b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D.a)) {
            return false;
        }
        D.a aVar = (D.a) obj;
        if (this.f2252a.equals(aVar.c())) {
            String str = this.f2253b;
            String d7 = aVar.d();
            if (str == null) {
                if (d7 == null) {
                    return true;
                }
            } else if (str.equals(d7)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f2252a.hashCode() ^ 1000003) * 1000003;
        String str = this.f2253b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f2252a + ", firebaseInstallationId=" + this.f2253b + "}";
    }
}
