package o0;

import g0.M;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f18122a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18123b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18124c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18125d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18126e;

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f18122a = str;
        this.f18123b = str2;
        this.f18124c = str3;
        this.f18125d = str4;
        this.f18126e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return M.c(this.f18122a, hVar.f18122a) && M.c(this.f18123b, hVar.f18123b) && M.c(this.f18124c, hVar.f18124c) && M.c(this.f18125d, hVar.f18125d) && M.c(this.f18126e, hVar.f18126e);
    }

    public int hashCode() {
        String str = this.f18122a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18123b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f18124c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f18125d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f18126e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
