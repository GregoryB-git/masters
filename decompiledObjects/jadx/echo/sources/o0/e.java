package o0;

import g0.M;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f18109a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18110b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18111c;

    public e(String str, String str2, String str3) {
        this.f18109a = str;
        this.f18110b = str2;
        this.f18111c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return M.c(this.f18109a, eVar.f18109a) && M.c(this.f18110b, eVar.f18110b) && M.c(this.f18111c, eVar.f18111c);
    }

    public int hashCode() {
        int hashCode = this.f18109a.hashCode() * 31;
        String str = this.f18110b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18111c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
